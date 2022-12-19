package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.textfield.TextField;

import de.ollie.kroisos.ws.core.model.Konto;
import de.ollie.kroisos.ws.core.service.KontoService;
import de.ollie.kroisos.ws.core.service.localization.ResourceManager;
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
public class KontoDetailsLayout extends AbstractMasterDataBaseLayout {

	private final ButtonFactory buttonFactory;
	private final Konto model;
	private final KontoService service;
	private final ResourceManager resourceManager;
	private final SessionData session;
	private final Observer observer;
	private final DetailsLayoutComboBoxItemLabelGenerator<Konto> comboBoxItemLabelGenerator;

	private TextField textFieldKuerzel;

	@Override
	public void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);
		createButtons();
		textFieldKuerzel = createTextField("KontoDetailsLayout.field.kuerzel.label", model.getKuerzel());
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
				textFieldKuerzel,
				getMasterDataButtonLayout(model.getId() > 0));
		textFieldKuerzel.focus();
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
		model.setKuerzel(textFieldKuerzel.getValue());
		observer.save(service.update(model));
	}

}