package com.epurchasing.searchEngine.Controller;

import com.epurchasing.searchEngine.Service.SearchEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
public class SearchEngineController {
    @Autowired
    private SearchEngineService searchEngineService;
}
