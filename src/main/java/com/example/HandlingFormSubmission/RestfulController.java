package com.example.HandlingFormSubmission;

import org.springframework.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulController {

	@PostMapping(path = "/quotes", produces = "application/json")
	public Quote getData2(@RequestBody Quote quote) {

		Long price = Math.abs((Long.valueOf(quote.getdelivery_postcode(), 36) - Long.valueOf(quote.getpickup_postcode(), 36))/100000000);

		if(quote.getvehicle() != null) {        	
        	price = calculateNewPrice(quote.getvehicle(), price);
        	return new Quote(quote.getpickup_postcode(), quote.getdelivery_postcode(), quote.getvehicle(), price);        	
        }
        else
        	return new Quote(quote.getpickup_postcode(), quote.getdelivery_postcode(), price);
	}
	
	public long calculateNewPrice(String vehicle, long price) {

		  switch(vehicle) {

		  case "bicycle": 
			  price = (long)Math.round(price * 1.1);
			  break;

		  case "motorbike": 
			  price = (long)Math.round(price * 1.15);
			  break;

		  case "parcel_car": 
			  price = (long)Math.round(price * 1.2);
			  break;

		  case "small_van": 
			  price = (long)Math.round(price * 1.30);
			  break;

		  case "large_van": 
			  price = (long)Math.round(price * 1.40);
			  break;

		  default:
			  price = (long)0.0;

		  }

		  return price;
	  }
	
	
}
