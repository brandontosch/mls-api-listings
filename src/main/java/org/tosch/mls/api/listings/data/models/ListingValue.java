package org.tosch.mls.api.listings.data.models;

import org.joda.time.DateTime;
import org.tosch.neverrest.data.models.DataEntity;

public class ListingValue extends DataEntity {
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
}
