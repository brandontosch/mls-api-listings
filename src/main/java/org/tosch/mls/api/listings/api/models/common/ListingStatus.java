package org.tosch.mls.api.listings.api.models.common;

import org.joda.time.DateTime;
import org.tosch.neverrest.api.models.ServiceConvertible;

public class ListingStatus implements ServiceConvertible<org.tosch.mls.api.listings.service.models.common.ListingStatus> {
    public ListingStatus() {

    }

    public ListingStatus(org.tosch.mls.api.listings.service.models.common.ListingStatus serviceEntity) {
        status = serviceEntity.getStatus();
        date = serviceEntity.getDate();
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
    public org.tosch.mls.api.listings.service.models.common.ListingStatus toService() {
        org.tosch.mls.api.listings.service.models.common.ListingStatus listingStatus = new org.tosch.mls.api.listings.service.models.common.ListingStatus();
        listingStatus.setStatus(status);
        listingStatus.setDate(date);
        return listingStatus;
    }
}
