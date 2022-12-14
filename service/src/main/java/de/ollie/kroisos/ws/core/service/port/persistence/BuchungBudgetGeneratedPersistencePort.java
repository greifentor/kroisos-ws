package de.ollie.kroisos.ws.core.service.port.persistence;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.BuchungBudget;
import lombok.Generated;

/**
 * A generated persistence port interface for BuchungBudget CRUD operations.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface BuchungBudgetGeneratedPersistencePort {

	BuchungBudget create(BuchungBudget model);

	List<BuchungBudget> findAll();

	Page<BuchungBudget> findAll(PageParameters pageParameters);

	Optional<BuchungBudget> findById(Long id);

	BuchungBudget update(BuchungBudget model);

	void delete(BuchungBudget model);

}