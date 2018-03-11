package org.tosch.mls.api.listings.data.models;

import org.joda.time.DateTime;
import org.tosch.neverrest.data.models.DataEntity;

public class ListingStatus extends DataEntity {
    private String status;
    private DateTime date;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}
