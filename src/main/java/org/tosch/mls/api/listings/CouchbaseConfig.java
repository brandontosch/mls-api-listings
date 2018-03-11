package org.tosch.mls.api.listings;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.tosch.neverrest.BaseCouchbaseConfig;
import org.tosch.neverrest.data.repositories.CouchbaseCoreEntityRepository;

@Configuration
@EnableCouchbaseRepositories(includeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE, classes = CouchbaseCoreEntityRepository.class))
public class CouchbaseConfig extends BaseCouchbaseConfig {
}
