package com.topcoder.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.topcoder.template.domain.IdentifiableEntity;

/**
 * The base repository for all repositories in the application.
 *
 * @param <T> the entity type
 */
@NoRepositoryBean
public interface BaseRepository<T extends IdentifiableEntity> extends JpaRepository<T, Long> {
}
