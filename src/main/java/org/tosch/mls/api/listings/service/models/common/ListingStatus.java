package org.tosch.mls.api.listings.service.models.common;

import org.joda.time.DateTime;
import org.tosch.neverrest.service.models.common.DataConvertible;

public class ListingStatus implements DataConvertible<org.tosch.mls.api.listings.data.models.ListingStatus> {
    public ListingStatus() {

    }

    public ListingStatus(org.tosch.mls.api.listings.data.models.ListingStatus dataEntity) {
        this.status = dataEntity.getStatus();
        this.date = dataEntity.getDate();
    }

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

    @Override
    public org.tosch.mls.api.listings.data.models.ListingStatus toData() {
        org.tosch.mls.api.listings.data.models.ListingStatus listingStatus = new org.tosch.mls.api.listings.data.models.ListingStatus();
        listingStatus.setStatus(status);
        listingStatus.setDate(date);
        return listingStatus;
    }
}
