package com.example.springboardproject.config;

import com.example.springboardproject.domain.UserAccount;
import com.example.springboardproject.repository.UserAccountRepository;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockBean private UserAccountRepository userAccountRepository;

    @BeforeTestMethod
    public void securitySetUp() {
        given(userAccountRepository.findById(anyString())).willReturn(Optional.of(
                UserAccount.of(
                        "yunTest",
                        "pw",
                        "yun-test@mail.com",
                        "yun-test",
                        "test memo"
                )
        ));
    }
}
