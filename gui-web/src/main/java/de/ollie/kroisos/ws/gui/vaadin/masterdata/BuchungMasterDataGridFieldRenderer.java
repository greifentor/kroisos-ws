package de.ollie.kroisos.ws.gui.vaadin.masterdata;

import javax.inject.Named;

import de.ollie.kroisos.ws.core.model.Buchung;

import lombok.Generated;

/**
 * An implementation of the MasterDataGridFieldRenderer interface for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class BuchungMasterDataGridFieldRenderer implements MasterDataGridFieldRenderer<Buchung> {

	@Override
	public Object getHeaderString(String fieldName, Buchung model) {
		if (Buchung.KONTOQUELLE.equals(fieldName)) {
			return model.getKontoQuelle() != null ? model.getKontoQuelle().getKuerzel() : "-";
		}
		if (Buchung.PARTNER.equals(fieldName)) {
			return model.getPartner() != null ? model.getPartner().getBezeichnung() : "-";
		}
		if (Buchung.KONTOZIEL.equals(fieldName)) {
			return model.getKontoZiel() != null ? model.getKontoZiel().getKuerzel() : "-";
		}
		return null;
	}

	@Override
	public boolean hasRenderingFor(String fieldName) {
		if (Buchung.KONTOQUELLE.equals(fieldName)) {
			return true;
		}
		if (Buchung.PARTNER.equals(fieldName)) {
			return true;
		}
		if (Buchung.KONTOZIEL.equals(fieldName)) {
			return true;
		}
		return false;
	}

}