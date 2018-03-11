package org.tosch.mls.api.listings.service.models.common;

import org.tosch.neverrest.service.models.common.DataConvertible;

public class ListingAddress implements DataConvertible<org.tosch.mls.api.listings.data.models.ListingAddress> {
    public ListingAddress() {

    }

    public ListingAddress(org.tosch.mls.api.listings.data.models.ListingAddress dataEntity) {
        this.address1 = dataEntity.getAddress1();
        this.address2 = dataEntity.getAddress2();
        this.city = dataEntity.getCity();
        this.state = dataEntity.getState();
        this.zip = dataEntity.getZip();
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
    public org.tosch.mls.api.listings.data.models.ListingAddress toData() {
        org.tosch.mls.api.listings.data.models.ListingAddress listingAddress = new org.tosch.mls.api.listings.data.models.ListingAddress();
        listingAddress.setAddress1(address1);
        listingAddress.setAddress2(address2);
        listingAddress.setCity(city);
        listingAddress.setState(state);
        listingAddress.setZip(zip);
        return listingAddress;
    }
}
