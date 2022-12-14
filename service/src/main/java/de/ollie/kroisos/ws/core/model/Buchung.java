package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * A model for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@Generated
@ToString(callSuper = true)
public class Buchung extends GeneratedBuchung {

	@Override
	public Buchung setId(Long id) {
		super.setId(id);
		return this;
	}

	@Override
	public Buchung setKontoQuelle(Konto kontoQuelle) {
		super.setKontoQuelle(kontoQuelle);
		return this;
	}

	@Override
	public Buchung setKontoZiel(Konto kontoZiel) {
		super.setKontoZiel(kontoZiel);
		return this;
	}

	@Override
	public Buchung setPartner(Partner partner) {
		super.setPartner(partner);
		return this;
	}

	@Override
	public Buchung setBetrag(double betrag) {
		super.setBetrag(betrag);
		return this;
	}

	@Override
	public Buchung setBezeichnung(String bezeichnung) {
		super.setBezeichnung(bezeichnung);
		return this;
	}

}