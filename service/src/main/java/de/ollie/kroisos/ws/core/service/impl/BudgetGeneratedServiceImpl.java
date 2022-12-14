package de.ollie.kroisos.ws.core.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Budget;
import de.ollie.kroisos.ws.core.service.port.persistence.BudgetPersistencePort;
import de.ollie.kroisos.ws.core.service.BudgetService;
import lombok.Generated;

/**
 * A generated service interface implementation for Budget management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BudgetGeneratedServiceImpl implements BudgetService {

	@Inject
	protected BudgetPersistencePort persistencePort;

	@Override
	public Budget create(Budget model) {
		return persistencePort.create(model);
	}

	@Override
	public List<Budget> findAll() {
		return persistencePort.findAll();
	}

	@Override
	public Page<Budget> findAll(PageParameters pageParameters) {
		return persistencePort.findAll(pageParameters);
	}

	@Override
	public Optional<Budget> findById(Long id) {
		return persistencePort.findById(id);
	}

	@Override
	public Budget update(Budget model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(Budget model) {
		persistencePort.delete(model);
	}

}