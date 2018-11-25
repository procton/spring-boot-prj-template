package com.topcoder.template.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The event entity.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Row extends IdentifiableEntity<Long> {

  /**
   * The row number
   */
  private int rowNumber;

  /**
   * The description.
   */
  private String description;

  /**
   * The owning header
   */
  @ManyToOne
  private Header header;
}
