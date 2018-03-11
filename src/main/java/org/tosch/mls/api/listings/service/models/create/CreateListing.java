package org.tosch.mls.api.listings.service.models.create;

import org.tosch.neverrest.service.models.create.CoreServiceCreateEntity;
import org.tosch.mls.api.listings.service.models.common.ListingAddress;
import org.tosch.mls.api.listings.service.models.common.ListingStatus;
import org.tosch.mls.api.listings.service.models.common.ListingValue;
import org.tosch.mls.api.listings.service.models.read.Listing;

import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class CreateListing extends CoreServiceCreateEntity<Listing, org.tosch.mls.api.listings.data.models.Listing, String> {
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
    public org.tosch.mls.api.listings.data.models.Listing toData() {
        org.tosch.mls.api.listings.data.models.Listing listing = new org.tosch.mls.api.listings.data.models.Listing();
        listing.setId(UUID.randomUUID().toString());
        listing.setIdentifiers(identifiers);
        listing.setStatuses(statuses.stream().map(ListingStatus::toData).collect(Collectors.toSet()));
        listing.setAddress(address.toData());
        listing.setValues(values.stream().map(ListingValue::toData).collect(Collectors.toSet()));
        return listing;
    }
}
