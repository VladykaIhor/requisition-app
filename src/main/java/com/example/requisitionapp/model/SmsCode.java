package com.example.requisitionapp.model;

import java.time.LocalDateTime;

public class SmsCode {
    private String code;
    private LocalDateTime expirationTime;

    public SmsCode(String code, int expireIn) {
        this.code = code;
        this.expirationTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public SmsCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expirationTime = expireTime;
    }
    public boolean isExpire() {
        return LocalDateTime.now().isAfter(expirationTime);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expirationTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expirationTime = expireTime;
    }
}
