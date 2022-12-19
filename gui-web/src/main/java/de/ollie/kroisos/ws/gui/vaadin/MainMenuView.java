package de.ollie.kroisos.ws.gui.vaadin;

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
import de.ollie.kroisos.ws.gui.vaadin.component.Button;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonFactory;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonGrid;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout;
import de.ollie.kroisos.ws.gui.vaadin.component.HeaderLayout.HeaderLayoutMode;

@Route(MainMenuView.URL)

public class MainMenuView extends VerticalLayout implements BeforeEnterObserver, HasUrlParameter<String> {

	public static final String URL = "kroisos-ws/menu";

	private static final Logger logger = LogManager.getLogger(MainMenuView.class);

	private final ButtonFactory buttonFactory;
	private final ResourceManager resourceManager;
	private final SessionData session;

	@Override
	public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
		logger.debug("setParameter");
	}

	@Override
	public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
		// UserAuthorizationChecker.forwardToLoginOnNoUserSetForSession(session, beforeEnterEvent);
		logger.info("created");
		setMargin(false);
		setWidthFull();
		getStyle().set("background-image", "url('dnd-main.png')");
		getStyle().set("background-size", "cover");
		Button buttonMasterData =
				buttonFactory
						.createButton(
								resourceManager
										.getLocalizedString(
												"main-menu.button.master-data.text",
												session.getLocalization()));
		buttonMasterData.addClickListener(event -> switchToMasterData());
		buttonMasterData.setWidthFull();
		ButtonGrid buttonGridMasterData = new ButtonGrid(4, buttonMasterData);
		buttonGridMasterData.setMargin(false);
		buttonGridMasterData.setWidthFull();
		add(
				new HeaderLayout(
						buttonFactory.createLogoutButton(resourceManager, this::getUI, session, logger),
						resourceManager.getLocalizedString("commons.header.main-menu.label", session.getLocalization()),
						HeaderLayoutMode.PLAIN),
				buttonGridMasterData);
		logger.info("main menu view opened for user '{}'.", session.getUserName());
	}

	private void switchToMasterData() {
		getUI().ifPresent(ui -> ui.navigate(MasterDataView.URL));
	}

}