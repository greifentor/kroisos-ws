package de.ollie.kroisos.ws.persistence;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Partner;
import de.ollie.kroisos.ws.core.service.port.persistence.PartnerPersistencePort;
import de.ollie.kroisos.ws.persistence.converter.PageConverter;
import de.ollie.kroisos.ws.persistence.converter.PageParametersToPageableConverter;
import de.ollie.kroisos.ws.persistence.converter.PartnerDBOConverter;
import de.ollie.kroisos.ws.persistence.entity.PartnerDBO;
import de.ollie.kroisos.ws.persistence.repository.PartnerDBORepository;
import lombok.Generated;

/**
 * A generated JPA persistence adapter for partners.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class PartnerGeneratedJPAPersistenceAdapter implements PartnerPersistencePort {

	@Inject
	protected PartnerDBOConverter converter;
	@Inject
	protected PartnerDBORepository repository;

	@Inject
	protected PageParametersToPageableConverter pageParametersToPageableConverter;

	protected PageConverter<Partner, PartnerDBO> pageConverter;

	@PostConstruct
	public void postConstruct() {
		pageConverter = new PageConverter<>(converter);
	}

	@Override
	public Partner create(Partner model) {
		model.setId(null);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public List<Partner> findAll() {
		return converter.toModel(repository.findAll());
	}

	@Override
	public Page<Partner> findAll(PageParameters pageParameters) {
		return pageConverter.convert(repository.findAll(pageParametersToPageableConverter.convert(pageParameters)));
	}

	@Override
	public Optional<Partner> findById(Long id) {
		return repository.findById(id).map(dbo -> converter.toModel(dbo));
	}

	@Override
	public Partner update(Partner model) {
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	@Override
	public void delete(Partner model) {
		repository.deleteById(model.getId());
	}

}