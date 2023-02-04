package com.example.springboardproject.controller;

import com.example.springboardproject.dto.response.ArticleCommentResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * <p>
 * 메인 컨트롤러
 * </p>
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "forward:/articles";
    }

    /**
    * 댓글 정보를 열람한다.
    *
    * @param id 댓글 ID
    * @return 댓글 응답
    *
    * */
    @ResponseBody
    @GetMapping("/test-rest")
    public ArticleCommentResponse test(Long id) {
        return ArticleCommentResponse.of(
                id,
                "content",
                LocalDateTime.now(),
                "t@mail.com",
                "test",
                "test"
        );
    }
}
