package de.ollie.kroisos.ws.core.service.port.persistence;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Konto;
import lombok.Generated;

/**
 * A generated persistence port interface for Konto CRUD operations.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface KontoGeneratedPersistencePort {

	Konto create(Konto model);

	List<Konto> findAll();

	Page<Konto> findAll(PageParameters pageParameters);

	Optional<Konto> findById(Long id);

	Konto update(Konto model);

	void delete(Konto model);

}