package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is responsible for handling Payment method activities like
 * add/list/update/delete payment cards for mlife user profile.
 * 
 * @author sappraja
 *
 */

@RestController
@RequestMapping(value = "/account/{locale}/v1/payment", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE,
		MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
public class PaymentManagementController {

    

	@RequestMapping(method = RequestMethod.DELETE)
	public String deletePaymentCard(@RequestBody(required=false)
	PaymentCardRequest paymentCardRequest, BindingResult result,
			HttpServletRequest httpServletRequest) {
		
		return "response";
	}
	
}
