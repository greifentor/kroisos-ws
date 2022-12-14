package de.ollie.kroisos.ws.persistence;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Budget;
import de.ollie.kroisos.ws.core.service.port.persistence.BudgetPersistencePort;
import de.ollie.kroisos.ws.persistence.converter.PageConverter;
import de.ollie.kroisos.ws.persistence.converter.PageParametersToPageableConverter;
import de.ollie.kroisos.ws.persistence.converter.BudgetDBOConverter;
import de.ollie.kroisos.ws.persistence.entity.BudgetDBO;
import de.ollie.kroisos.ws.persistence.repository.BudgetDBORepository;
import lombok.Generated;

/**
 * A generated JPA persistence adapter for budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BudgetGeneratedJPAPersistenceAdapter implements BudgetPersistencePort {

	@Inject
	protected BudgetDBOConverter converter;
	@Inject
	protected BudgetDBORepository repository;

	@Inject
	protected PageParametersToPageableConverter pageParametersToPageableConverter;

	protected PageConverter<Budget, BudgetDBO> pageConverter;

	@PostConstruct
	public void postConstruct() {
		pageConverter = new PageConverter<>(converter);
	}

	@Override
	public Budget create(Budget model) {
		model.setId(null);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public List<Budget> findAll() {
		return converter.toModel(repository.findAll());
	}

	@Override
	public Page<Budget> findAll(PageParameters pageParameters) {
		return pageConverter.convert(repository.findAll(pageParametersToPageableConverter.convert(pageParameters)));
	}

	@Override
	public Optional<Budget> findById(Long id) {
		return repository.findById(id).map(dbo -> converter.toModel(dbo));
	}

	@Override
	public Budget update(Budget model) {
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public void delete(Budget model) {
		repository.deleteById(model.getId());
	}

}