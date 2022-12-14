package de.ollie.kroisos.ws.persistence;

import static de.ollie.kroisos.ws.util.Check.ensure;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.BuchungBudget;
import de.ollie.kroisos.ws.core.service.exception.NotNullConstraintViolationException;
import de.ollie.kroisos.ws.core.service.port.persistence.BuchungBudgetPersistencePort;
import de.ollie.kroisos.ws.persistence.converter.PageConverter;
import de.ollie.kroisos.ws.persistence.converter.PageParametersToPageableConverter;
import de.ollie.kroisos.ws.persistence.converter.BuchungBudgetDBOConverter;
import de.ollie.kroisos.ws.persistence.entity.BuchungBudgetDBO;
import de.ollie.kroisos.ws.persistence.repository.BuchungBudgetDBORepository;
import lombok.Generated;

/**
 * A generated JPA persistence adapter for buchung_budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BuchungBudgetGeneratedJPAPersistenceAdapter implements BuchungBudgetPersistencePort {

	@Inject
	protected BuchungBudgetDBOConverter converter;
	@Inject
	protected BuchungBudgetDBORepository repository;

	@Inject
	protected PageParametersToPageableConverter pageParametersToPageableConverter;

	protected PageConverter<BuchungBudget, BuchungBudgetDBO> pageConverter;

	@PostConstruct
	public void postConstruct() {
		pageConverter = new PageConverter<>(converter);
	}

	@Override
	public BuchungBudget create(BuchungBudget model) {
		model.setId(null);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public List<BuchungBudget> findAll() {
		return converter.toModel(repository.findAll());
	}

	@Override
	public Page<BuchungBudget> findAll(PageParameters pageParameters) {
		return pageConverter.convert(repository.findAll(pageParametersToPageableConverter.convert(pageParameters)));
	}

	@Override
	public Optional<BuchungBudget> findById(Long id) {
		return repository.findById(id).map(dbo -> converter.toModel(dbo));
	}

	@Override
	public BuchungBudget update(BuchungBudget model) {
		ensure(
				model.getBuchung() != null,
				() -> new NotNullConstraintViolationException("BuchungBudget field buchung cannot be null.", "BuchungBudget", "buchung"));
		ensure(
				model.getBudget() != null,
				() -> new NotNullConstraintViolationException("BuchungBudget field budget cannot be null.", "BuchungBudget", "budget"));
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public void delete(BuchungBudget model) {
		repository.deleteById(model.getId());
	}

}