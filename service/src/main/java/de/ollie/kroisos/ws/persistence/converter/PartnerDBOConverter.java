package de.ollie.kroisos.ws.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;

import de.ollie.kroisos.ws.persistence.entity.PartnerDBO;
import de.ollie.kroisos.ws.core.model.Partner;

/**
 * A DBO converter for partners.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class PartnerDBOConverter implements ToModelConverter<Partner, PartnerDBO> {

	public PartnerDBO toDBO(Partner model) {
		if (model == null) {
			return null;
		}
		return new PartnerDBO()
				.setId(model.getId())
				.setBezeichnung(model.getBezeichnung());
	}

	@Override
	public Partner toModel(PartnerDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new Partner()
				.setId(dbo.getId())
				.setBezeichnung(dbo.getBezeichnung());
	}

	@Override
	public List<Partner> toModel(List<PartnerDBO> dbos) {
		if (dbos == null) {
			return null;
		}
		return dbos.stream().map(this::toModel).collect(Collectors.toList());
	}

}