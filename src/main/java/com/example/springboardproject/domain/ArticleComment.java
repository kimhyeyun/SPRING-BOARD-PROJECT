package com.example.springboardproject.domain;

import java.time.LocalDate;

public class ArticleComment {
    private Long id;
    private Article article; // 게시글 (ID)
    private String content; // 본문

    private LocalDate createdAt; // 생성일지
    private String createdBy; // 생성자
    private LocalDate modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
