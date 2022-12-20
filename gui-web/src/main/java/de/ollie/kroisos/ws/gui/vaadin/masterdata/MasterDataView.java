package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

import de.ollie.kroisos.ws.core.service.localization.ResourceManager;
import de.ollie.kroisos.ws.gui.session.SessionData;
import de.ollie.kroisos.ws.gui.vaadin.UserAuthorizationChecker;
import de.ollie.kroisos.ws.gui.vaadin.MainMenuView;
import de.ollie.kroisos.ws.gui.vaadin.component.Button;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonFactory;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonGrid;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout.HeaderLayoutMode;
import de.ollie.kroisos.ws.gui.vaadin.masterdata.MasterDataGUIConfiguration;

import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * A layout with buttons to select a master data page.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Route(MasterDataView.URL)
@RequiredArgsConstructor
public class MasterDataView extends VerticalLayout implements BeforeEnterObserver, HasUrlParameter<String> {

	public static final String URL = "${BaseURL}/masterdata/menu";

	private static final Logger LOG = LogManager.getLogger(MasterDataView.class);

	private final ButtonFactory buttonFactory;
	private final MasterDataGUIConfiguration guiConfiguration;
	private final ResourceManager resourceManager;
	private final SessionData session;

	@Override
	public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
		LOG.debug("setParameter");
	}

	@Override
	public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
		UserAuthorizationChecker.forwardToLoginOnNoUserSetForSession(session, beforeEnterEvent);
		LOG.info("created");
		setMargin(false);
		setWidthFull();
		getStyle().set("background-image", "url('" + guiConfiguration.getBackgroundFileName() + "')");
		getStyle().set("background-size", "cover");
		Button buttonMasterDataKonto =
				buttonFactory
						.createButton(
								resourceManager
										.getLocalizedString(
												"master-data.button.konto.text",
												session.getLocalization()));
		buttonMasterDataKonto.addClickListener(event -> switchToSourceKonto());
		buttonMasterDataKonto.setWidthFull();
		Button buttonMasterDataPartner =
				buttonFactory
						.createButton(
								resourceManager
										.getLocalizedString(
												"master-data.button.partner.text",
												session.getLocalization()));
		buttonMasterDataPartner.addClickListener(event -> switchToSourcePartner());
		buttonMasterDataPartner.setWidthFull();
		ButtonGrid buttonGrid =
				new ButtonGrid(
						4,
						buttonMasterDataKonto,
						buttonMasterDataPartner
				);
		buttonGrid.setMargin(false);
		buttonGrid.setWidthFull();
		add(
				new HeaderLayout(
						buttonFactory.createBackButton(resourceManager, this::getUI, MainMenuView.URL, session),
						buttonFactory.createLogoutButton(resourceManager, this::getUI, session, LOG),
						resourceManager.getLocalizedString("master-data.header.menu.label", session.getLocalization()),
						HeaderLayoutMode.PLAIN),
				buttonGrid);
		LOG.info("main menu view opened for user '{}'.", session.getUserName());
	}

	private void switchToSourceKonto() {
		getUI().ifPresent(ui -> ui.navigate(KontoPageView.URL));
	}
	private void switchToSourcePartner() {
		getUI().ifPresent(ui -> ui.navigate(PartnerPageView.URL));
	}

}