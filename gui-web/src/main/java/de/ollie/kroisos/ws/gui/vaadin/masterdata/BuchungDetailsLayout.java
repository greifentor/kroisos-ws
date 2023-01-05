package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;

import de.ollie.kroisos.ws.core.model.Buchung;
import de.ollie.kroisos.ws.core.model.Konto;
import de.ollie.kroisos.ws.core.model.Partner;
import de.ollie.kroisos.ws.core.service.BuchungService;
import de.ollie.kroisos.ws.core.service.KontoService;
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
public class BuchungDetailsLayout extends AbstractMasterDataBaseLayout {

	private final ButtonFactory buttonFactory;
	private final Buchung model;
	private final BuchungService service;
	private final KontoService kontoService;
	private final PartnerService partnerService;
	private final ResourceManager resourceManager;
	private final SessionData session;
	private final Observer observer;
	private final DetailsLayoutComboBoxItemLabelGenerator<Buchung> comboBoxItemLabelGenerator;

	private ComboBox<Konto> comboBoxKontoQuelle;
	private ComboBox<Partner> comboBoxPartner;
	private ComboBox<Konto> comboBoxKontoZiel;
	private TextField textFieldBezeichnung;
	private NumberField numberFieldBetrag;

	@Override
	public void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);
		createButtons();
		comboBoxKontoQuelle = createComboBox("BuchungDetailsLayout.field.kontoquelle.label", model.getKontoQuelle(), kontoService.findAll().toArray(new Konto[0]));
		comboBoxKontoQuelle
				.setItemLabelGenerator(
						konto  -> comboBoxItemLabelGenerator != null
								? comboBoxItemLabelGenerator.getLabel(Buchung.KONTOQUELLE, konto)
								: "" + konto.getKuerzel());
		comboBoxPartner = createComboBox("BuchungDetailsLayout.field.partner.label", model.getPartner(), partnerService.findAll().toArray(new Partner[0]));
		comboBoxPartner
				.setItemLabelGenerator(
						partner  -> comboBoxItemLabelGenerator != null
								? comboBoxItemLabelGenerator.getLabel(Buchung.PARTNER, partner)
								: "" + partner.getBezeichnung());
		comboBoxKontoZiel = createComboBox("BuchungDetailsLayout.field.kontoziel.label", model.getKontoZiel(), kontoService.findAll().toArray(new Konto[0]));
		comboBoxKontoZiel
				.setItemLabelGenerator(
						konto  -> comboBoxItemLabelGenerator != null
								? comboBoxItemLabelGenerator.getLabel(Buchung.KONTOZIEL, konto)
								: "" + konto.getKuerzel());
		textFieldBezeichnung = createTextField("BuchungDetailsLayout.field.bezeichnung.label", model.getBezeichnung());
		numberFieldBetrag = createNumberField("BuchungDetailsLayout.field.betrag.label", model.getBetrag(), 0D, 999D, 0.01D);
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
				numberFieldBetrag,
				comboBoxPartner,
				comboBoxKontoQuelle,
				comboBoxKontoZiel,
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
		model.setBetrag(numberFieldBetrag.getValue());
		model.setPartner(comboBoxPartner.getValue());
		model.setKontoQuelle(comboBoxKontoQuelle.getValue());
		model.setKontoZiel(comboBoxKontoZiel.getValue());
		observer.save(service.update(model));
	}

}