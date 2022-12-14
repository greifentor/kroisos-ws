package de.ollie.kroisos.ws.core.service;

import java.util.List;
import java.util.Optional;

import de.ollie.kroisos.ws.core.model.Page;
import de.ollie.kroisos.ws.core.model.PageParameters;
import de.ollie.kroisos.ws.core.model.Budget;
import lombok.Generated;

/**
 * A generated service interface for Budget management.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface BudgetGeneratedService {

	Budget create(Budget model);

	List<Budget> findAll();

	Page<Budget> findAll(PageParameters pageParameters);

	Optional<Budget> findById(Long id);

	Budget update(Budget model);

	void delete(Budget model);

}