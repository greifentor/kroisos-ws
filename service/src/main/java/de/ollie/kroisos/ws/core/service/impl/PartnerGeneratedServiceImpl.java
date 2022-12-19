package de.ollie.kroisos.ws.core.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Partner;
import de.ollie.kroisos.ws.core.service.port.persistence.PartnerPersistencePort;
import de.ollie.kroisos.ws.core.service.PartnerService;
import lombok.Generated;

/**
 * A generated service interface implementation for Partner management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class PartnerGeneratedServiceImpl implements PartnerService {

	@Inject
	protected PartnerPersistencePort persistencePort;

	@Override
	public Partner create(Partner model) {
		return persistencePort.create(model);
	}

	@Override
	public List<Partner> findAll() {
		return persistencePort.findAll();
	}

	@Override
	public Page<Partner> findAll(PageParameters pageParameters) {
		return persistencePort.findAll(pageParameters);
	}

	@Override
	public Optional<Partner> findById(Long id) {
		return persistencePort.findById(id);
	}

	@Override
	public Partner update(Partner model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(Partner model) {
		persistencePort.delete(model);
	}

	@Override
	public List<Partner> findAllByBezeichnung(String bezeichnung) {
		return persistencePort.findAllByBezeichnung(bezeichnung);
	}

}