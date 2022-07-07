package br.com.mt.store.auth.app.dto;

public record LoginRequestDTO (
        String username,
        String password
) {}
