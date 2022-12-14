package de.ollie.kroisos.ws.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;

import de.ollie.kroisos.ws.persistence.entity.BudgetDBO;
import de.ollie.kroisos.ws.core.model.Budget;

/**
 * A DBO converter for budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class BudgetDBOConverter implements ToModelConverter<Budget, BudgetDBO> {

	public BudgetDBO toDBO(Budget model) {
		if (model == null) {
			return null;
		}
		return new BudgetDBO()
				.setId(model.getId())
				.setKuerzel(model.getKuerzel());
	}

	@Override
	public Budget toModel(BudgetDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new Budget()
				.setId(dbo.getId())
				.setKuerzel(dbo.getKuerzel());
	}

	@Override
	public List<Budget> toModel(List<BudgetDBO> dbos) {
		if (dbos == null) {
			return null;
		}
		return dbos.stream().map(this::toModel).collect(Collectors.toList());
	}

}