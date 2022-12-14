package de.ollie.kroisos.ws.core.model;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * A model for buchung_budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
public class GeneratedBuchungBudget {

	public static final String ID = "ID";
	public static final String BUCHUNG = "BUCHUNG";
	public static final String BUDGET = "BUDGET";
	public static final String BETRAG = "BETRAG";

	private Long id;
	private Buchung buchung;
	private Budget budget;
	private double betrag;

}