package de.ollie.kroisos.ws.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;
import lombok.RequiredArgsConstructor;

import de.ollie.kroisos.ws.persistence.entity.BuchungDBO;
import de.ollie.kroisos.ws.core.model.Buchung;

/**
 * A DBO converter for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
@RequiredArgsConstructor
public class BuchungDBOConverter implements ToModelConverter<Buchung, BuchungDBO> {

	private final PartnerDBOConverter partnerDBOConverter;
	private final KontoDBOConverter kontoDBOConverter;

	public BuchungDBO toDBO(Buchung model) {
		if (model == null) {
			return null;
		}
		return new BuchungDBO()
				.setId(model.getId())
				.setKontoQuelle(kontoDBOConverter.toDBO(model.getKontoQuelle()))
				.setKontoZiel(kontoDBOConverter.toDBO(model.getKontoZiel()))
				.setPartner(partnerDBOConverter.toDBO(model.getPartner()))
				.setBetrag(model.getBetrag())
				.setBezeichnung(model.getBezeichnung());
	}

	@Override
	public Buchung toModel(BuchungDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new Buchung()
				.setId(dbo.getId())
				.setKontoQuelle(kontoDBOConverter.toModel(dbo.getKontoQuelle()))
				.setKontoZiel(kontoDBOConverter.toModel(dbo.getKontoZiel()))
				.setPartner(partnerDBOConverter.toModel(dbo.getPartner()))
				.setBetrag(dbo.getBetrag())
				.setBezeichnung(dbo.getBezeichnung());
	}

	@Override
	public List<Buchung> toModel(List<BuchungDBO> dbos) {
		if (dbos == null) {
			return null;
		}
		return dbos.stream().map(this::toModel).collect(Collectors.toList());
	}

}