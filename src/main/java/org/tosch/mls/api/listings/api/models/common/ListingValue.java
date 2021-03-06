package org.tosch.mls.api.listings.api.models.common;

import org.joda.time.DateTime;
import org.tosch.neverrest.api.models.ServiceConvertible;

public class ListingValue implements ServiceConvertible<org.tosch.mls.api.listings.service.models.common.ListingValue> {
    public ListingValue() {

    }

    public ListingValue(org.tosch.mls.api.listings.service.models.common.ListingValue serviceEntity) {
        type = serviceEntity.getType();
        value = serviceEntity.getValue();
        date = serviceEntity.getDate();
    }

    private String type;
    private Double value;
    private DateTime date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    @Override
    public org.tosch.mls.api.listings.service.models.common.ListingValue toService() {
        org.tosch.mls.api.listings.service.models.common.ListingValue listingValue = new org.tosch.mls.api.listings.service.models.common.ListingValue();
        listingValue.setType(type);
        listingValue.setValue(value);
        listingValue.setDate(date);
        return listingValue;
    }
}
