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
 * A DBO for buchungs.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
@Entity(name = "Buchung")
@Table(name = "BUCHUNG")
public class BuchungDBO {

	@Id
	@Column(name = "ID", nullable = false)
	private long id;
	@JoinColumn(name = "KONTO_QUELLE", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private KontoDBO kontoQuelle;
	@JoinColumn(name = "KONTO_ZIEL", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private KontoDBO kontoZiel;
	@JoinColumn(name = "PARTNER", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private PartnerDBO partner;
	@Column(name = "BETRAG", nullable = false)
	private double betrag;
	@Column(name = "BEZEICHNUNG")
	private String bezeichnung;

}