package de.ollie.kroisos.ws.persistence;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Konto;
import de.ollie.kroisos.ws.core.service.port.persistence.KontoPersistencePort;
import de.ollie.kroisos.ws.persistence.converter.PageConverter;
import de.ollie.kroisos.ws.persistence.converter.PageParametersToPageableConverter;
import de.ollie.kroisos.ws.persistence.converter.KontoDBOConverter;
import de.ollie.kroisos.ws.persistence.entity.KontoDBO;
import de.ollie.kroisos.ws.persistence.repository.KontoDBORepository;
import lombok.Generated;

/**
 * A generated JPA persistence adapter for kontos.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class KontoGeneratedJPAPersistenceAdapter implements KontoPersistencePort {

	@Inject
	protected KontoDBOConverter converter;
	@Inject
	protected KontoDBORepository repository;

	@Inject
	protected PageParametersToPageableConverter pageParametersToPageableConverter;

	protected PageConverter<Konto, KontoDBO> pageConverter;

	@PostConstruct
	public void postConstruct() {
		pageConverter = new PageConverter<>(converter);
	}

	@Override
	public Konto create(Konto model) {
		model.setId(-1);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public List<Konto> findAll() {
		return converter.toModel(repository.findAll());
	}

	@Override
	public Page<Konto> findAll(PageParameters pageParameters) {
		return pageConverter.convert(repository.findAll(pageParametersToPageableConverter.convert(pageParameters)));
	}

	@Override
	public Optional<Konto> findById(Long id) {
		return repository.findById(id).map(dbo -> converter.toModel(dbo));
	}

	@Override
	public Konto update(Konto model) {
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public void delete(Konto model) {
		repository.deleteById(model.getId());
	}

	@Override
	public List<Konto> findAllByKuerzel(String kuerzel) {
		return converter.toModel(repository.findAllByKuerzel(kuerzel));
	}

}