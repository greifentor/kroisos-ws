package de.ollie.kroisos.ws.core.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Buchung;
import de.ollie.kroisos.ws.core.service.port.persistence.BuchungPersistencePort;
import de.ollie.kroisos.ws.core.service.BuchungService;
import lombok.Generated;

/**
 * A generated service interface implementation for Buchung management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public abstract class BuchungGeneratedServiceImpl implements BuchungService {

	@Inject
	protected BuchungPersistencePort persistencePort;

	@Override
	public Buchung create(Buchung model) {
		return persistencePort.create(model);
	}

	@Override
	public List<Buchung> findAll() {
		return persistencePort.findAll();
	}

	@Override
	public Page<Buchung> findAll(PageParameters pageParameters) {
		return persistencePort.findAll(pageParameters);
	}

	@Override
	public Optional<Buchung> findById(Long id) {
		return persistencePort.findById(id);
	}

	@Override
	public Buchung update(Buchung model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(Buchung model) {
		persistencePort.delete(model);
	}

}