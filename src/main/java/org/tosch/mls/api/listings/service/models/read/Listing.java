package org.tosch.mls.api.listings.service.models.read;

import org.tosch.neverrest.service.models.read.CoreServiceEntity;
import org.tosch.mls.api.listings.service.models.common.ListingAddress;
import org.tosch.mls.api.listings.service.models.common.ListingStatus;
import org.tosch.mls.api.listings.service.models.common.ListingValue;
import org.tosch.mls.api.listings.service.models.create.CreateListing;
import org.tosch.mls.api.listings.service.models.update.UpdateListing;

import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Listing extends CoreServiceEntity<Listing, CreateListing, UpdateListing, org.tosch.mls.api.listings.data.models.Listing, String> {
    public Listing(org.tosch.mls.api.listings.data.models.Listing dataEntity) {
        super(dataEntity);
        this.identifiers = dataEntity.getIdentifiers();
        this.statuses = dataEntity.getStatuses().stream().map(ListingStatus::new).collect(Collectors.toSet());
        this.address = new ListingAddress(dataEntity.getAddress());
        this.values = dataEntity.getValues().stream().map(ListingValue::new).collect(Collectors.toSet());
    }

    @Override
    public UUID parseId(String id) {
        return UUID.fromString(id);
    }

    private final Map<String, String> identifiers;
    private final Set<ListingStatus> statuses;
    private final ListingAddress address;
    private final Set<ListingValue> values;

    public Map<String, String> getIdentifiers() {
        return identifiers;
    }

    public Set<ListingStatus> getStatuses() {
        return statuses;
    }

    public ListingAddress getAddress() {
        return address;
    }

    public Set<ListingValue> getValues() {
        return values;
    }
}
