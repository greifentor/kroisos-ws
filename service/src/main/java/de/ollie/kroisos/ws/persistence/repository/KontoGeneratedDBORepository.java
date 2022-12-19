package de.ollie.kroisos.ws.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.ollie.kroisos.ws.persistence.entity.KontoDBO;
import lombok.Generated;
import java.util.List;

/**
 * A generated JPA repository for kontos.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Repository
public interface KontoGeneratedDBORepository extends JpaRepository<KontoDBO, Long> {

	List<KontoDBO> findAllByKuerzel(String kuerzel);

}