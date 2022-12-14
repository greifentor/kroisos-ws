package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * A model for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
public class GeneratedBuchung {

	public static final String ID = "ID";
	public static final String KONTOQUELLE = "KONTOQUELLE";
	public static final String KONTOZIEL = "KONTOZIEL";
	public static final String PARTNER = "PARTNER";
	public static final String BETRAG = "BETRAG";
	public static final String BEZEICHNUNG = "BEZEICHNUNG";

	private Long id;
	private Konto kontoQuelle;
	private Konto kontoZiel;
	private Partner partner;
	private double betrag;
	private String bezeichnung;

}