package com.epurchasing.searchEngine.Repository;

import com.epurchasing.searchEngine.Entity.SearchEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchEngineRepository extends JpaRepository<SearchEngine,Integer> {
}
