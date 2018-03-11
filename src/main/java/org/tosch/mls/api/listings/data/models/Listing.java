package org.tosch.mls.api.listings.data.models;

import org.tosch.neverrest.data.models.CoreDataEntity;

import java.util.Map;
import java.util.Set;

public class Listing extends CoreDataEntity<String> {
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
}

