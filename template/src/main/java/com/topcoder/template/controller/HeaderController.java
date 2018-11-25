package com.topcoder.template.controller;

import com.topcoder.template.services.HeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.topcoder.template.domain.*;

@RestController
@RequestMapping("/header")
public class HeaderController {

    @Autowired
    HeaderService headerService;

    @GetMapping("/code/{code}")
    public Header getHeaderByCode(@PathVariable("code") String code) {
        return headerService.getbyCode(code);
    }

}