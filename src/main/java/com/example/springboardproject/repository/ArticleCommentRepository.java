package com.example.springboardproject.repository;

import com.example.springboardproject.domain.Article;
import com.example.springboardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
