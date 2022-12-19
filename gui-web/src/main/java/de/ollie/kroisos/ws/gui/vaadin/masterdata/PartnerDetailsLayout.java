package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.textfield.TextField;

import de.ollie.kroisos.ws.core.model.Partner;
import de.ollie.kroisos.ws.core.service.localization.ResourceManager;
import de.ollie.kroisos.ws.core.service.PartnerService;
import de.ollie.kroisos.ws.gui.session.SessionData;
import de.ollie.kroisos.ws.gui.vaadin.component.AbstractMasterDataBaseLayout;
import de.ollie.kroisos.ws.gui.vaadin.component.ButtonFactory;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@RequiredArgsConstructor
public class PartnerDetailsLayout extends AbstractMasterDataBaseLayout {

	private final ButtonFactory buttonFactory;
	private final Partner model;
	private final PartnerService service;
	private final ResourceManager resourceManager;
	private final SessionData session;
	private final Observer observer;
	private final DetailsLayoutComboBoxItemLabelGenerator<Partner> comboBoxItemLabelGenerator;

	private TextField textFieldBezeichnung;

	@Override
	public void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);
		createButtons();
		textFieldBezeichnung = createTextField("PartnerDetailsLayout.field.bezeichnung.label", model.getBezeichnung());
		getStyle().set("-moz-border-radius", "4px");
		getStyle().set("-webkit-border-radius", "4px");
		getStyle().set("border-radius", "4px");
		getStyle().set("border", "1px solid #A9A9A9");
		getStyle()
				.set(
						"box-shadow",
						"10px 10px 20px #e4e4e4, -10px 10px 20px #e4e4e4, -10px -10px 20px #e4e4e4, 10px -10px 20px #e4e4e4");
		setMargin(false);
		setWidthFull();
		add(
				textFieldBezeichnung,
				getMasterDataButtonLayout(model.getId() > 0));
		textFieldBezeichnung.focus();
	}

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
	protected void remove() {
		service.delete(model);
		observer.remove();
	}

	@Override
	protected void save() {
		model.setBezeichnung(textFieldBezeichnung.getValue());
		observer.save(service.update(model));
	}

}