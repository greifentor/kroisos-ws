package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * A model for kontos.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@Generated
@ToString(callSuper = true)
public class Konto extends GeneratedKonto {

	@Override
	public Konto setId(Long id) {
		super.setId(id);
		return this;
	}

	@Override
	public Konto setKuerzel(String kuerzel) {
		super.setKuerzel(kuerzel);
		return this;
	}

}