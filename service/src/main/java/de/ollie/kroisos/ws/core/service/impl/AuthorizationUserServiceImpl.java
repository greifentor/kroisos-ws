package de.ollie.kroisos.ws.core.service.impl;

import javax.inject.Named;

import com.auth0.jwt.interfaces.DecodedJWT;

import de.ollie.kroisos.ws.core.model.AuthorizationUser;
import de.ollie.kroisos.ws.core.service.AuthorizationUserService;

import lombok.RequiredArgsConstructor;

/**
 * Implementation for the AuthorizationUserService interface.
 * 
 * FEEL FREE TO OVERRIDE !!!
 */
@Named
@RequiredArgsConstructor
public class AuthorizationUserServiceImpl implements AuthorizationUserService {

//	private final UserService userService;

	@Override
	public AuthorizationUser findByGlobalIdOrCreate(DecodedJWT decodedJWT) {
//		return userService
//				.findByGlobalId(getClaimAsString(decodedJWT, JWTService.CLAIM_NAME_USER_GLOBAL_ID))
//				.orElseGet(() -> createUser(decodedJWT));
		return null;
	}

	private String getClaimAsString(DecodedJWT decodedJWT, String claimIdentifier) {
		return decodedJWT.getClaims().get(claimIdentifier).asString();
	}

//	private User createUser(DecodedJWT decodedJWT) {
//		return userService
//				.update(
//						userService
//								.create(
//										new User()
//												.setGlobalId(
//														getClaimAsString(
//																decodedJWT,
//																JWTService.CLAIM_NAME_USER_GLOBAL_ID))
//												.setName(getClaimAsString(decodedJWT, JWTService.CLAIM_NAME_USER_NAME))
//												.setToken(
//														getClaimAsString(
//																decodedJWT,
//																JWTService.CLAIM_NAME_USER_TOKEN))));
//	}

}