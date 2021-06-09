package com.epurchasing.searchEngine.Service;

import com.epurchasing.searchEngine.Repository.SearchEngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchEngineService {
    @Autowired
    private SearchEngineRepository searchEngineRepository;
}
