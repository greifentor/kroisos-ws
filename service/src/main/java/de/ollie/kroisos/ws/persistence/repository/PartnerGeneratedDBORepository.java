package de.ollie.kroisos.ws.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.ollie.kroisos.ws.persistence.entity.PartnerDBO;
import lombok.Generated;
import java.util.List;

/**
 * A generated JPA repository for partners.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Repository
public interface PartnerGeneratedDBORepository extends JpaRepository<PartnerDBO, Long> {

	List<PartnerDBO> findAllByBezeichnung(String bezeichnung);

}