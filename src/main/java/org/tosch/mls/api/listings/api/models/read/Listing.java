package org.tosch.mls.api.listings.api.models.read;

import org.tosch.neverrest.api.models.read.CoreApiEntity;
import org.tosch.mls.api.listings.api.models.common.ListingAddress;
import org.tosch.mls.api.listings.api.models.common.ListingStatus;
import org.tosch.mls.api.listings.api.models.common.ListingValue;
import org.tosch.mls.api.listings.api.models.create.CreateListing;
import org.tosch.mls.api.listings.api.models.update.UpdateListing;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Listing extends CoreApiEntity<Listing, CreateListing, UpdateListing, org.tosch.mls.api.listings.service.models.read.Listing> {
    public static final String API_ENTITY_PATH = "listings";

    public Listing(String baseUrl, org.tosch.mls.api.listings.service.models.read.Listing serviceEntity) {
        super(baseUrl, serviceEntity);
        identifiers = serviceEntity.getIdentifiers();
        statuses = serviceEntity.getStatuses().stream().map(ListingStatus::new).collect(Collectors.toSet());
        address = new ListingAddress(serviceEntity.getAddress());
        values = serviceEntity.getValues().stream().map(ListingValue::new).collect(Collectors.toSet());
    }

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
    public String getApiEntityPath() {
        return API_ENTITY_PATH;
    }

    @Override
    protected Class<Listing> getApiEntityClass() {
        return Listing.class;
    }
}
