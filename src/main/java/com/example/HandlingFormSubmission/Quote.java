package com.example.HandlingFormSubmission;

public class Quote {
    private String pickup_postcode;
    private String delivery_postcode;
    private String vehicle;
    private Long price;

    public Quote() {}

    public Quote(String pickupPostcode, String deliveryPostcode) {
        this.pickup_postcode = pickupPostcode;
        this.delivery_postcode = deliveryPostcode;
    }
    
    public Quote(String pickupPostcode, String deliveryPostcode, Long price) {
    	this.pickup_postcode = pickupPostcode;
    	this.delivery_postcode = deliveryPostcode;
    	this.price = price;
    }
    
    public Quote(String pickupPostcode, String deliveryPostcode, String vehicle) {
    	 this.pickup_postcode = pickupPostcode;
         this.delivery_postcode = deliveryPostcode;
         this.vehicle = vehicle;
    }

    public Quote(String pickupPostcode, String deliveryPostcode, String vehicle, Long price) {
        this.pickup_postcode = pickupPostcode;
        this.delivery_postcode = deliveryPostcode;
        this.price = price;
        this.vehicle = vehicle;
    }
    
    public String getvehicle() {
		return vehicle;
	}

	public void setvehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getpickup_postcode() {
        return pickup_postcode;
    }

    public void setpickup_postcode(String pickup_postcode) {
        this.pickup_postcode = pickup_postcode;
    }

    public String getdelivery_postcode() {
        return delivery_postcode;
    }

    public void setdelivery_postcode(String delivery_postcode) {
        this.delivery_postcode = delivery_postcode;
    }
    
    public String toString() {
        return "Quote - Pickup Postcode: " +   pickup_postcode + ", Delivery postcode: " + delivery_postcode
        		+ ", Price: " + price;
    }

    public Long getprice() {
        return price;
    }

    public void setprice(Long price) {
        this.price = price;
    }
    
    
}
