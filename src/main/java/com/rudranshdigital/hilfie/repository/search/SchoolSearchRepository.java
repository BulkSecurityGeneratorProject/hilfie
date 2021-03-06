package com.rudranshdigital.hilfie.repository.search;

import com.rudranshdigital.hilfie.domain.School;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the School entity.
 */
public interface SchoolSearchRepository extends ElasticsearchRepository<School, Long> {
}
