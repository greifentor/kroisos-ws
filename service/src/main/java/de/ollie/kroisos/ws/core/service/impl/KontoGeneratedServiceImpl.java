package de.ollie.kroisos.ws.core.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Konto;
import de.ollie.kroisos.ws.core.service.port.persistence.KontoPersistencePort;
import de.ollie.kroisos.ws.core.service.KontoService;
import lombok.Generated;

/**
 * A generated service interface implementation for Konto management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class KontoGeneratedServiceImpl implements KontoService {

	@Inject
	protected KontoPersistencePort persistencePort;

	@Override
	public Konto create(Konto model) {
		return persistencePort.create(model);
	}

	@Override
	public List<Konto> findAll() {
		return persistencePort.findAll();
	}

	@Override
	public Page<Konto> findAll(PageParameters pageParameters) {
		return persistencePort.findAll(pageParameters);
	}

	@Override
	public Optional<Konto> findById(Long id) {
		return persistencePort.findById(id);
	}

	@Override
	public Konto update(Konto model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(Konto model) {
		persistencePort.delete(model);
	}

}