package com.aagu.mms.utils;

public class CaptchaInfo {
    private String sender;
    private String code;

    public CaptchaInfo(String sender, String code) {
        this.sender = sender;
        this.code = code;
    }

    public String getProvider() {
        return this.sender;
    }

    public String getCaptcha() {
        return this.code;
    }
}