package com.example.springboardproject.dto.response;

import com.example.springboardproject.domain.ArticleComment;
import com.example.springboardproject.dto.ArticleCommentDto;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link ArticleComment} entity
 */
public record ArticleCommentResponse(
        Long id,
        String content,
        LocalDateTime createdAt,
        String email,
        String nickname,
        String userId
){
    public static ArticleCommentResponse of(Long id, String content, LocalDateTime createdAt, String email, String nickname, String userId) {
        return new ArticleCommentResponse(id, content, createdAt, email, nickname, userId);
    }

    public static ArticleCommentResponse from(ArticleCommentDto dto) {
        String nickname = dto.userAccountDto().nickname();
        if (nickname == null || nickname.isBlank()) {
            nickname = dto.userAccountDto().userId();
        }

        return new ArticleCommentResponse(
                dto.id(),
                dto.content(),
                dto.createdAt(),
                dto.userAccountDto().email(),
                nickname,
                dto.userAccountDto().userId()
        );
    }
}
