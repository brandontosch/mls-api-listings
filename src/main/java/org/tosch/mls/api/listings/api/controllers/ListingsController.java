package org.tosch.mls.api.listings.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tosch.neverrest.api.controllers.CoreEntityController;
import org.tosch.mls.api.listings.api.models.create.CreateListing;
import org.tosch.mls.api.listings.api.models.read.Listing;
import org.tosch.mls.api.listings.api.models.update.UpdateListing;
import org.tosch.mls.api.listings.service.services.ListingService;

@RestController
@RequestMapping(value = Listing.API_ENTITY_PATH)
public class ListingsController extends CoreEntityController<Listing, CreateListing, UpdateListing,
        org.tosch.mls.api.listings.service.models.read.Listing,
        org.tosch.mls.api.listings.service.models.create.CreateListing,
        org.tosch.mls.api.listings.service.models.update.UpdateListing> {
    @Autowired
    public ListingsController(ListingService listingService) {
        super(listingService);
    }

    @Override
    protected Class<Listing> getApiEntityClass() {
        return Listing.class;
    }
}
