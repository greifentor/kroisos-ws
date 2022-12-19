package de.ollie.kroisos.ws.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * A DBO for buchung_budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
@Entity(name = "BuchungBudget")
@Table(name = "BUCHUNG_BUDGET")
public class BuchungBudgetDBO {

	@Id
	@Column(name = "ID", nullable = false)
	private long id;
	@JoinColumn(name = "BUCHUNG", nullable = false, referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private BuchungDBO buchung;
	@JoinColumn(name = "BUDGET", nullable = false, referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private BudgetDBO budget;
	@Column(name = "BETRAG", nullable = false)
	private double betrag;

}