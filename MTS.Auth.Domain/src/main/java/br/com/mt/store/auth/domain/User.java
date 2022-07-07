package br.com.mt.store.auth.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class User {
    private Long id;
    private String nickname;
    private String password;
    private String name;
    private String email;
    private LocalDateTime lastAccess;
}
