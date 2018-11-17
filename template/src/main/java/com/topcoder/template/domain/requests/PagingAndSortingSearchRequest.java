package com.topcoder.template.domain.requests;

import javax.validation.constraints.Min;

import lombok.Data;

/**
 * The search request with paging and sorting criteria.
 */
@Data
public class PagingAndSortingSearchRequest {

  /**
   * The offset.
   */
  @Min(0)
  private Integer offset;

  /**
   * The limit.
   */
  @Min(1)
  private Integer limit;

  /**
   * The sort by.
   */
  private String sortBy;

  /**
   * The sort direction.
   */
  private String sortDirection;
}
