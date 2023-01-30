package com.example.springboardproject.repository;

import com.example.springboardproject.domain.Hashtag;
import com.example.springboardproject.repository.querydsl.HashtagRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RepositoryRestResource
public interface HashtagRepository extends
        JpaRepository<Hashtag, Long >,
        HashtagRepositoryCustom,
        QuerydslPredicateExecutor<Hashtag> {

    Optional<Hashtag> findByHashtagName(String hashtagName);
    List<Hashtag> findByHashtagNameIn(Set<String> hashtagNames);
}
