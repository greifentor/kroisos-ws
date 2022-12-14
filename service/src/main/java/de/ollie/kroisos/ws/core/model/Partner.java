package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * A model for partners.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@Generated
@ToString(callSuper = true)
public class Partner extends GeneratedPartner {

	@Override
	public Partner setId(Long id) {
		super.setId(id);
		return this;
	}

	@Override
	public Partner setBezeichnung(String bezeichnung) {
		super.setBezeichnung(bezeichnung);
		return this;
	}

}