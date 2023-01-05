package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.Route;

import de.ollie.kroisos.ws.core.model.Budget;
import de.ollie.kroisos.ws.core.service.BudgetService;
import de.ollie.kroisos.ws.core.service.localization.ResourceManager;
import de.ollie.kroisos.ws.gui.session.SessionData;
import de.ollie.kroisos.ws.gui.vaadin.UserAuthorizationChecker;
import de.ollie.kroisos.ws.gui.vaadin.component.AbstractMasterDataBaseLayout;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonFactory;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout.HeaderLayoutMode;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * A dialog to edit Budget details.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Route(BudgetMaintenanceView.URL)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@CssImport(value = "./styles/vaadin-text-area-styles.css", themeFor = "vaadin-text-area")
@CssImport(value = "./styles/vaadin-combo-box-styles.css", themeFor = "vaadin-combo-box")
@CssImport(value = "./styles/vaadin-checkbox-styles.css", themeFor = "vaadin-checkbox")
@RequiredArgsConstructor
public class BudgetMaintenanceView extends AbstractMasterDataBaseLayout implements BudgetDetailsLayout.Observer {

	public static final String URL = "kroisos-ws/masterdata/budgets/details";

	private static final Logger logger = LogManager.getLogger(BudgetMaintenanceView.class);

	@Autowired(required = false)
	private MaintenanceViewRenderer<Budget> maintenanceViewRenderer;
	@Autowired(required = false)
	private DetailsLayoutComboBoxItemLabelGenerator<Budget> comboBoxItemLabelGenerator;

	private final ButtonFactory buttonFactory;
	private final ResourceManager resourceManager;
	private final MasterDataGUIConfiguration guiConfiguration;
	private final BudgetService service;
	private final SessionData session;

	private Budget model;

	@Override
	protected ButtonFactory getButtonFactory() {
		return buttonFactory;
	}

	@Override
	protected ResourceManager getResourceManager() {
		return resourceManager;
	}

	@Override
	protected SessionData getSessionData() {
		return session;
	}

	@Override
	public void doSetParameter(BeforeEvent event) {
		long id = parametersMap.containsKey("id") && (parametersMap.get("id").size() > 0)
				? Long.parseLong(parametersMap.get("id").get(0))
				: -1;
		model = service.findById(id).orElse(createNewModel());
		if (parametersMap.containsKey("duplicate") && "true".equals(parametersMap.get("duplicate").get(0))) {
			model.setId(-1);
		}
	}

	private Budget createNewModel() {
		return new Budget();
	}

	@Override
	public void doBeforeEnter(BeforeEnterEvent beforeEnterEvent) {
		UserAuthorizationChecker.forwardToLoginOnNoUserSetForSession(getSessionData(), beforeEnterEvent);
		getStyle().set("background-image", "url('" + guiConfiguration.getBackgroundFileName() + "')");
		getStyle().set("background-size", "cover");
		setMargin(false);
		setWidthFull();
		add(
				new HeaderLayout(
						buttonFactory
										.createBackButton(
												resourceManager,
												this::getUI,
												BudgetPageView.URL,
												session),
						buttonFactory.createLogoutButton(resourceManager, this::getUI, session, logger),
								resourceManager.getLocalizedString("BudgetMaintenanceView.header.prefix.label", session.getLocalization()) + getHeaderSuffix(model),
								HeaderLayoutMode.PLAIN),
				getDetailsLayout(model));
	}

	private String getHeaderSuffix(Budget model) {
		return maintenanceViewRenderer != null
				? maintenanceViewRenderer.getHeaderSuffix(model)
				: "" + model.getKuerzel();
	}

	private AbstractMasterDataBaseLayout getDetailsLayout(Budget model) {
		return new BudgetDetailsLayout(buttonFactory, model, service, resourceManager, session, this, comboBoxItemLabelGenerator);
	}

	@Override
	protected void onAttach(AttachEvent attachEvent) {
		logger.info("onAttach");
		super.onAttach(attachEvent);
	}

	@Override
	protected void onDetach(DetachEvent detachEvent) {
		logger.info("onDetach");
		super.onDetach(detachEvent);
		getElement().removeFromTree();
	}

	@Override
	public void save(Object model) {
		getUI().ifPresent(ui -> ui.navigate(BudgetPageView.URL));
	}

	@Override
	public void save() {
		save(model);
	}

	@Override
	public void remove() {
		service.delete(model);
		getUI().ifPresent(ui -> ui.navigate(BudgetPageView.URL));
	}

}