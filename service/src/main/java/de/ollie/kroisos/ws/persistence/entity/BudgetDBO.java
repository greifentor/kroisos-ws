package de.ollie.kroisos.ws.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * A DBO for budgets.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
@Entity(name = "Budget")
@Table(name = "BUDGET")
public class BudgetDBO {

	@Id
	@Column(name = "ID", nullable = false)
	private long id;
	@Column(name = "KUERZEL")
	private String kuerzel;

}