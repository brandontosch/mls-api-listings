package org.tosch.mls.api.listings.api.models.common;

import org.tosch.neverrest.api.models.ServiceConvertible;

public class ListingAddress implements ServiceConvertible<org.tosch.mls.api.listings.service.models.common.ListingAddress> {
    public ListingAddress() {

    }

    public ListingAddress(org.tosch.mls.api.listings.service.models.common.ListingAddress serviceEntity) {
        address1 = serviceEntity.getAddress1();
        address2 = serviceEntity.getAddress2();
        city = serviceEntity.getCity();
        state = serviceEntity.getState();
        zip = serviceEntity.getZip();
    }

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public org.tosch.mls.api.listings.service.models.common.ListingAddress toService() {
        org.tosch.mls.api.listings.service.models.common.ListingAddress listingAddress = new org.tosch.mls.api.listings.service.models.common.ListingAddress();
        listingAddress.setAddress1(address1);
        listingAddress.setAddress2(address2);
        listingAddress.setCity(city);
        listingAddress.setState(state);
        listingAddress.setZip(zip);
        return listingAddress;
    }
}
