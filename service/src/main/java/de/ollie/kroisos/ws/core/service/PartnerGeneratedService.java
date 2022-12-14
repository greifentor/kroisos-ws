package de.ollie.kroisos.ws.core.service;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Partner;
import lombok.Generated;

/**
 * A generated service interface for Partner management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface PartnerGeneratedService {

	Partner create(Partner model);

	List<Partner> findAll();

	Page<Partner> findAll(PageParameters pageParameters);

	Optional<Partner> findById(Long id);

	Partner update(Partner model);

	void delete(Partner model);

}