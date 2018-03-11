package org.tosch.mls.api.listings.api.models.update;

import org.tosch.neverrest.api.models.update.CoreApiUpdateEntity;
import org.tosch.mls.api.listings.api.models.common.ListingAddress;
import org.tosch.mls.api.listings.api.models.common.ListingStatus;
import org.tosch.mls.api.listings.api.models.common.ListingValue;
import org.tosch.mls.api.listings.api.models.read.Listing;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UpdateListing extends CoreApiUpdateEntity<
        Listing, org.tosch.mls.api.listings.service.models.read.Listing,
        org.tosch.mls.api.listings.service.models.update.UpdateListing> {
    private Map<String, String> identifiers;
    private Set<ListingStatus> statuses;
    private ListingAddress address;
    private Set<ListingValue> values;

    public Map<String, String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
    }

    public Set<ListingStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<ListingStatus> statuses) {
        this.statuses = statuses;
    }

    public ListingAddress getAddress() {
        return address;
    }

    public void setAddress(ListingAddress address) {
        this.address = address;
    }

    public Set<ListingValue> getValues() {
        return values;
    }

    public void setValues(Set<ListingValue> values) {
        this.values = values;
    }

    @Override
    public org.tosch.mls.api.listings.service.models.update.UpdateListing toService() {
        org.tosch.mls.api.listings.service.models.update.UpdateListing updateListing = new org.tosch.mls.api.listings.service.models.update.UpdateListing();
        updateListing.setIdentifiers(identifiers);
        updateListing.setStatuses(statuses.stream().map(s -> s.toService()).collect(Collectors.toSet()));
        updateListing.setAddress(address.toService());
        updateListing.setValues(values.stream().map(v -> v.toService()).collect(Collectors.toSet()));
        return updateListing;
    }
}
