package com.rubrica.b6r5.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.rubrica.b6r5.generated.SurchargeRequest;
import com.rubrica.b6r5.generated.SurchargeResponse;
import com.rubrica.b6r5.service.SurchargeService;

@Endpoint
public class SurchargeEndpoint {
    @Autowired
	SurchargeService service;

	@PayloadRoot(namespace = "http://www.javacodegeeks.org/webservices/soap/surcharge/generated", localPart = "SurchargeRequest")
	@ResponsePayload
	public SurchargeResponse processCourseDetailsRequest(@RequestPayload SurchargeRequest request) {
		SurchargeResponse response = new SurchargeResponse();
		int surcharge = service.calculateSurcharge(request.getOrder());
		response.setSurcharge(surcharge);
		return response;
	}
}
