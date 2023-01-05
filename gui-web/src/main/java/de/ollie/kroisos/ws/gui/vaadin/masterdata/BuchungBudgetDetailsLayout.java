package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.NumberField;

import de.ollie.kroisos.ws.core.model.Buchung;
import de.ollie.kroisos.ws.core.model.BuchungBudget;
import de.ollie.kroisos.ws.core.model.Budget;
import de.ollie.kroisos.ws.core.service.BuchungBudgetService;
import de.ollie.kroisos.ws.core.service.BuchungService;
import de.ollie.kroisos.ws.core.service.BudgetService;
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
public class BuchungBudgetDetailsLayout extends AbstractMasterDataBaseLayout {

	private final ButtonFactory buttonFactory;
	private final BuchungBudget model;
	private final BuchungBudgetService service;
	private final BuchungService buchungService;
	private final BudgetService budgetService;
	private final ResourceManager resourceManager;
	private final SessionData session;
	private final Observer observer;
	private final DetailsLayoutComboBoxItemLabelGenerator<BuchungBudget> comboBoxItemLabelGenerator;

	private ComboBox<Budget> comboBoxBudget;
	private ComboBox<Buchung> comboBoxBuchung;
	private NumberField numberFieldBetrag;

	@Override
	public void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);
		createButtons();
		comboBoxBudget = createComboBox("BuchungBudgetDetailsLayout.field.budget.label", model.getBudget(), budgetService.findAll().toArray(new Budget[0]));
		comboBoxBudget
				.setItemLabelGenerator(
						budget  -> comboBoxItemLabelGenerator != null
								? comboBoxItemLabelGenerator.getLabel(BuchungBudget.BUDGET, budget)
								: "" + budget.getKuerzel());
		comboBoxBuchung = createComboBox("BuchungBudgetDetailsLayout.field.buchung.label", model.getBuchung(), buchungService.findAll().toArray(new Buchung[0]));
		comboBoxBuchung
				.setItemLabelGenerator(
						buchung  -> comboBoxItemLabelGenerator != null
								? comboBoxItemLabelGenerator.getLabel(BuchungBudget.BUCHUNG, buchung)
								: "" + buchung.getBezeichnung());
		numberFieldBetrag = createNumberField("BuchungBudgetDetailsLayout.field.betrag.label", model.getBetrag(), 0D, 999D, 0.01D);
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
				comboBoxBuchung,
				comboBoxBudget,
				numberFieldBetrag,
				getMasterDataButtonLayout(model.getId() > 0));
		comboBoxBuchung.focus();
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
		model.setBuchung(comboBoxBuchung.getValue());
		model.setBudget(comboBoxBudget.getValue());
		model.setBetrag(numberFieldBetrag.getValue());
		observer.save(service.update(model));
	}

}