package de.ollie.kroisos.ws.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;

import de.ollie.kroisos.ws.persistence.entity.KontoDBO;
import de.ollie.kroisos.ws.core.model.Konto;

/**
 * A DBO converter for kontos.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class KontoDBOConverter implements ToModelConverter<Konto, KontoDBO> {

	public KontoDBO toDBO(Konto model) {
		if (model == null) {
			return null;
		}
		return new KontoDBO()
				.setId(model.getId())
				.setKuerzel(model.getKuerzel());
	}

	@Override
	public Konto toModel(KontoDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new Konto()
				.setId(dbo.getId())
				.setKuerzel(dbo.getKuerzel());
	}

	@Override
	public List<Konto> toModel(List<KontoDBO> dbos) {
		if (dbos == null) {
			return null;
		}
		return dbos.stream().map(this::toModel).collect(Collectors.toList());
	}

}