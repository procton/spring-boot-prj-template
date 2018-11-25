package com.topcoder.template.domain;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The base class for all entities with Long primary key.
 */
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class IdentifiableEntity<U> {

  /**
   * The entity id.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /**
   * Entity creation date
   */
  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  protected Date createdAt;

  /**
   * Id of the entity's creator
   */
  @CreatedBy
  protected U createdById;

  /**
   * Entity last modified date
   */
  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  protected Date lastModifiedAt;

  /**
   * Id of the entity's last modifier
   */
  @LastModifiedBy
  protected U lastModifiedById;

}
