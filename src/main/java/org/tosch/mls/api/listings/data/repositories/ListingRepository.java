package org.tosch.mls.api.listings.data.repositories;

import org.springframework.stereotype.Repository;
import org.tosch.mls.api.listings.data.models.Listing;
import org.tosch.neverrest.data.repositories.CouchbaseElasticsearchCoreEntityRepository;

@Repository
public interface ListingRepository extends CouchbaseElasticsearchCoreEntityRepository<Listing> {
}
