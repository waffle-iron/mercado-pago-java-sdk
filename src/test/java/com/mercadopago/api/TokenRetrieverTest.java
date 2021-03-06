package com.mercadopago.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mercadopago.token.MercadoPagoTokenGenerator;

public class TokenRetrieverTest {

	@Test
	public void shouldGetANewTokenWhenCredentialsAreCorrect() throws Exception {
		TokenClientCredentials credentials = new TokenClientCredentialsReader().getCredentials();

		MercadoPagoTokenGenerator tokenGenerator = new MercadoPagoTokenGenerator();
		MercadoPagoToken token = tokenGenerator.generateUsing(credentials);
		
		assertNotNull(token.getAccessToken());
	}
	
}
