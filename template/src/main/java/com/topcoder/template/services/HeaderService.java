package com.topcoder.template.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.topcoder.template.domain.Header;
import com.topcoder.template.repositories.HeaderRepository;

@Transactional(readOnly = true)
public class HeaderService extends BaseService {

  @Autowired
  HeaderRepository headerRepository;

  public Header save(Header header) {
    return headerRepository.save(header);
  }

}
