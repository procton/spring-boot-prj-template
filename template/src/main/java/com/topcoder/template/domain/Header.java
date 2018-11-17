package com.topcoder.template.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The event entity.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Header extends IdentifiableEntity<Long> {

  /**
   * The title.
   */
  @NotNull
  private String code;

  /**
   * The description.
   */
  private String description;

  /**
   * The collection of rows
   */
  @OneToMany(orphanRemoval = true)
  private List<Row> rows;

  @PrePersist
  protected void saveCommonData() {
    createdById = Long.parseLong("1234567890");
    lastModifiedById = Long.parseLong("1234567890");
    createdAt = new Date();
    lastModifiedAt = new Date();
  }

  @PreUpdate
  protected void updateCommonData() {
    lastModifiedById = Long.parseLong("99999999999");
    lastModifiedAt = new Date();
  }
}
