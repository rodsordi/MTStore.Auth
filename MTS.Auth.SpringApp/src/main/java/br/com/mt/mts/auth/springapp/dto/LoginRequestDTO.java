package br.com.mt.mts.auth.springapp.dto;

public record LoginRequestDTO (
        String username,
        String password
) {}
