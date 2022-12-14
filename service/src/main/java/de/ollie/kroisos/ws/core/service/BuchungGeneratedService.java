package de.ollie.kroisos.ws.core.service;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Buchung;
import lombok.Generated;

/**
 * A generated service interface for Buchung management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface BuchungGeneratedService {

	Buchung create(Buchung model);

	List<Buchung> findAll();

	Page<Buchung> findAll(PageParameters pageParameters);

	Optional<Buchung> findById(Long id);

	Buchung update(Buchung model);

	void delete(Buchung model);

}