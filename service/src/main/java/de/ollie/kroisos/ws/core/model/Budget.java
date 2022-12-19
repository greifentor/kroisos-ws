package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * A model for budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@Generated
@ToString(callSuper = true)
public class Budget extends GeneratedBudget {

	@Override
	public Budget setId(long id) {
		super.setId(id);
		return this;
	}

	@Override
	public Budget setKuerzel(String kuerzel) {
		super.setKuerzel(kuerzel);
		return this;
	}

}