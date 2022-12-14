package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * A model for buchung_budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@Generated
@ToString(callSuper = true)
public class BuchungBudget extends GeneratedBuchungBudget {

	@Override
	public BuchungBudget setId(Long id) {
		super.setId(id);
		return this;
	}

	@Override
	public BuchungBudget setBuchung(Buchung buchung) {
		super.setBuchung(buchung);
		return this;
	}

	@Override
	public BuchungBudget setBudget(Budget budget) {
		super.setBudget(budget);
		return this;
	}

	@Override
	public BuchungBudget setBetrag(double betrag) {
		super.setBetrag(betrag);
		return this;
	}

}