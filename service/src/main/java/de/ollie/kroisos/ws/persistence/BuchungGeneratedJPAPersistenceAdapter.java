package de.ollie.kroisos.ws.persistence;

import static de.ollie.kroisos.ws.util.Check.ensure;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Buchung;
import de.ollie.kroisos.ws.core.service.exception.NotNullConstraintViolationException;
import de.ollie.kroisos.ws.core.service.port.persistence.BuchungPersistencePort;
import de.ollie.kroisos.ws.persistence.converter.PageConverter;
import de.ollie.kroisos.ws.persistence.converter.PageParametersToPageableConverter;
import de.ollie.kroisos.ws.persistence.converter.BuchungDBOConverter;
import de.ollie.kroisos.ws.persistence.entity.BuchungDBO;
import de.ollie.kroisos.ws.persistence.repository.BuchungDBORepository;
import lombok.Generated;

/**
 * A generated JPA persistence adapter for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BuchungGeneratedJPAPersistenceAdapter implements BuchungPersistencePort {

	@Inject
	protected BuchungDBOConverter converter;
	@Inject
	protected BuchungDBORepository repository;

	@Inject
	protected PageParametersToPageableConverter pageParametersToPageableConverter;

	protected PageConverter<Buchung, BuchungDBO> pageConverter;

	@PostConstruct
	public void postConstruct() {
		pageConverter = new PageConverter<>(converter);
	}

	@Override
	public Buchung create(Buchung model) {
		model.setId(null);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public List<Buchung> findAll() {
		return converter.toModel(repository.findAll());
	}

	@Override
	public Page<Buchung> findAll(PageParameters pageParameters) {
		return pageConverter.convert(repository.findAll(pageParametersToPageableConverter.convert(pageParameters)));
	}

	@Override
	public Optional<Buchung> findById(Long id) {
		return repository.findById(id).map(dbo -> converter.toModel(dbo));
	}

	@Override
	public Buchung update(Buchung model) {
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public void delete(Buchung model) {
		repository.deleteById(model.getId());
	}

}