package com.topcoder.template.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.topcoder.template.domain.Header;

/**
 * Provides operations on Header entity
 */

// @Repository
@RepositoryRestResource(collectionResourceRel = "headers", path = "headers")
public interface HeaderRepository extends BaseRepository<Header> {
    public Header getByCode(String code);
}
