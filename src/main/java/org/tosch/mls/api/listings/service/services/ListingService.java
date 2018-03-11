package org.tosch.mls.api.listings.service.services;

import org.tosch.neverrest.service.services.CoreEntityService;
import org.tosch.mls.api.listings.service.models.read.Listing;
import org.tosch.mls.api.listings.service.models.create.CreateListing;
import org.tosch.mls.api.listings.service.models.update.UpdateListing;

public interface ListingService extends CoreEntityService<Listing, CreateListing, UpdateListing, org.tosch.mls.api.listings.data.models.Listing, String> {
}
