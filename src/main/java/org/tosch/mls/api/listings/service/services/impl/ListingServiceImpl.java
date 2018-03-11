package org.tosch.mls.api.listings.service.services.impl;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tosch.neverrest.data.models.CoreDataEntityPage;
import org.tosch.neverrest.service.models.read.CoreServiceEntityPage;
import org.tosch.neverrest.service.services.impl.CoreEntityServiceImpl;
import org.tosch.mls.api.listings.data.repositories.ListingRepository;
import org.tosch.mls.api.listings.service.models.create.CreateListing;
import org.tosch.mls.api.listings.service.models.read.Listing;
import org.tosch.mls.api.listings.service.models.update.UpdateListing;
import org.tosch.mls.api.listings.service.services.ListingService;

@Service
public class ListingServiceImpl
        extends CoreEntityServiceImpl<Listing, CreateListing, UpdateListing, org.tosch.mls.api.listings.data.models.Listing, String>
        implements ListingService {
    @Autowired
    public ListingServiceImpl(ListingRepository listingRepository, Client client) {
        super(listingRepository);
        this.listingRepository = listingRepository;
        this.client = client;
    }

    private final ListingRepository listingRepository;
    private final Client client;

    @Override
    public CoreServiceEntityPage<Listing> getPage(Integer offset, Integer limit) {
        CoreDataEntityPage<org.tosch.mls.api.listings.data.models.Listing, String> listingsData =
                listingRepository.getPage(client, "listings", offset, limit);
        return getServiceEntityPage(listingsData);
    }

    @Override
    protected Class<Listing> getServiceEntityClass() {
        return Listing.class;
    }

    @Override
    protected void updateEntity(org.tosch.mls.api.listings.data.models.Listing entityToUpdate, org.tosch.mls.api.listings.data.models.Listing updateEntity) {
        super.updateEntity(entityToUpdate, updateEntity);
        entityToUpdate.setIdentifiers(updateEntity.getIdentifiers());
        entityToUpdate.setStatuses(updateEntity.getStatuses());
        entityToUpdate.setAddress(updateEntity.getAddress());
        entityToUpdate.setValues(updateEntity.getValues());
    }

    @Override
    protected void resolveRelationships(CreateListing serviceCreateEntity, org.tosch.mls.api.listings.data.models.Listing dataEntity) {

    }

    @Override
    protected void resolveRelationships(UpdateListing serviceUpdateEntity, org.tosch.mls.api.listings.data.models.Listing dataEntity) {

    }
}
