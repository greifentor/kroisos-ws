package de.ollie.kroisos.ws.core.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.BuchungBudget;
import de.ollie.kroisos.ws.core.service.port.persistence.BuchungBudgetPersistencePort;
import de.ollie.kroisos.ws.core.service.BuchungBudgetService;
import lombok.Generated;

/**
 * A generated service interface implementation for BuchungBudget management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BuchungBudgetGeneratedServiceImpl implements BuchungBudgetService {

	@Inject
	protected BuchungBudgetPersistencePort persistencePort;

	@Override
	public BuchungBudget create(BuchungBudget model) {
		return persistencePort.create(model);
	}

	@Override
	public List<BuchungBudget> findAll() {
		return persistencePort.findAll();
	}

	@Override
	public Page<BuchungBudget> findAll(PageParameters pageParameters) {
		return persistencePort.findAll(pageParameters);
	}

	@Override
	public Optional<BuchungBudget> findById(Long id) {
		return persistencePort.findById(id);
	}

	@Override
	public BuchungBudget update(BuchungBudget model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(BuchungBudget model) {
		persistencePort.delete(model);
	}

}