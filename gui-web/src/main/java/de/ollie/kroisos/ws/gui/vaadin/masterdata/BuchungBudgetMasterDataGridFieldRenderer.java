package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import javax.inject.Named;

import de.ollie.kroisos.ws.core.model.BuchungBudget;

import lombok.Generated;

/**
 * An implementation of the MasterDataGridFieldRenderer interface for buchung budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class BuchungBudgetMasterDataGridFieldRenderer implements MasterDataGridFieldRenderer<BuchungBudget> {

	@Override
	public Object getHeaderString(String fieldName, BuchungBudget model) {
		if (BuchungBudget.BUDGET.equals(fieldName)) {
			return model.getBudget() != null ? model.getBudget().getKuerzel() : "-";
		}
		if (BuchungBudget.BUCHUNG.equals(fieldName)) {
			return model.getBuchung() != null ? model.getBuchung().getBezeichnung() : "-";
		}
		return null;
	}

	@Override
	public boolean hasRenderingFor(String fieldName) {
		if (BuchungBudget.BUDGET.equals(fieldName)) {
			return true;
		}
		if (BuchungBudget.BUCHUNG.equals(fieldName)) {
			return true;
		}
		return false;
	}

}