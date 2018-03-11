package org.tosch.mls.api.listings.service.models.common;

import org.joda.time.DateTime;
import org.tosch.neverrest.service.models.common.DataConvertible;

public class ListingValue implements DataConvertible<org.tosch.mls.api.listings.data.models.ListingValue> {
    public ListingValue() {

    }

    public ListingValue(org.tosch.mls.api.listings.data.models.ListingValue dataEntity) {
        this.type = dataEntity.getType();
        this.value = dataEntity.getValue();
        this.date = dataEntity.getDate();
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
    public org.tosch.mls.api.listings.data.models.ListingValue toData() {
        org.tosch.mls.api.listings.data.models.ListingValue listingValue = new org.tosch.mls.api.listings.data.models.ListingValue();
        listingValue.setType(type);
        listingValue.setValue(value);
        listingValue.setDate(date);
        return listingValue;
    }
}
