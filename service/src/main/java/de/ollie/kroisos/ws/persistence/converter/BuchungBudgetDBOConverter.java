package de.ollie.kroisos.ws.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;
import lombok.RequiredArgsConstructor;

import de.ollie.kroisos.ws.persistence.entity.BuchungBudgetDBO;
import de.ollie.kroisos.ws.core.model.BuchungBudget;

/**
 * A DBO converter for buchung_budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
@RequiredArgsConstructor
public class BuchungBudgetDBOConverter implements ToModelConverter<BuchungBudget, BuchungBudgetDBO> {

	private final BuchungDBOConverter buchungDBOConverter;
	private final BudgetDBOConverter budgetDBOConverter;

	public BuchungBudgetDBO toDBO(BuchungBudget model) {
		if (model == null) {
			return null;
		}
		return new BuchungBudgetDBO()
				.setId(model.getId())
				.setBuchung(buchungDBOConverter.toDBO(model.getBuchung()))
				.setBudget(budgetDBOConverter.toDBO(model.getBudget()))
				.setBetrag(model.getBetrag());
	}

	@Override
	public BuchungBudget toModel(BuchungBudgetDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new BuchungBudget()
				.setId(dbo.getId())
				.setBuchung(buchungDBOConverter.toModel(dbo.getBuchung()))
				.setBudget(budgetDBOConverter.toModel(dbo.getBudget()))
				.setBetrag(dbo.getBetrag());
	}

	@Override
	public List<BuchungBudget> toModel(List<BuchungBudgetDBO> dbos) {
		if (dbos == null) {
			return null;
		}
		return dbos.stream().map(this::toModel).collect(Collectors.toList());
	}

}