package de.ollie.kroisos.ws.core.service.port.persistence;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Partner;
import lombok.Generated;

/**
 * A generated persistence port interface for Partner CRUD operations.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface PartnerGeneratedPersistencePort {

	Partner create(Partner model);

	List<Partner> findAll();

	Page<Partner> findAll(PageParameters pageParameters);

	Optional<Partner> findById(Long id);

	Partner update(Partner model);

	void delete(Partner model);

}