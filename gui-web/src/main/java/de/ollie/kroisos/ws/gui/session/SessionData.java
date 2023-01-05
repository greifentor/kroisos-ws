package de.ollie.kroisos.ws.gui.session;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.vaadin.flow.spring.annotation.VaadinSessionScope;

import de.ollie.kroisos.ws.core.model.localization.LocalizationSO;
import de.ollie.kroisos.ws.core.service.JWTService.AuthorizationData;
import de.ollie.kroisos.ws.gui.AccessChecker;

import lombok.Data;
import lombok.Generated;

/**
 * An object to hold data during the session.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Component
@Data
@Generated
@VaadinSessionScope
public class SessionData {

	private static int counter = 0;

	private AccessChecker accessChecker;
	private AuthorizationData authorizationData;
	private SessionId id = new SessionId("kroisosws-" + (counter++));
	private LocalizationSO localization = LocalizationSO.DE;
	private Map<String, Object> parameters = new HashMap<>();
	private LocalDateTime validUntil;

	public String getUserName() {
		return authorizationData.getUser().getName();
	}

	public Optional<Object> findParameter(String id) {
		return Optional.ofNullable(parameters.get(id));
	}

	public void setParameter(String id, Object obj) {
		parameters.put(id, obj);
	}

}