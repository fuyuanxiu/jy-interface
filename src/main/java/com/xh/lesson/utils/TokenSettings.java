package com.xh.lesson.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * @ClassName: TokenSettings
 * TODO:类文件简单描述
 * @Author: 小霍
 * @CreateDate: 2019/9/7 20:46
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/7 20:46
 * @Version: 0.0.1
 */
@Configuration
@ConfigurationProperties(prefix = "jwt")
@Data
public class TokenSettings {
    private String secretKey;
    private Duration accessTokenExpireTime;
    private Duration refreshTokenExpireTime;
    private Duration refreshTokenExpireAppTime;
    private String  issuer;
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public Duration getAccessTokenExpireTime() {
		return accessTokenExpireTime;
	}
	public void setAccessTokenExpireTime(Duration accessTokenExpireTime) {
		this.accessTokenExpireTime = accessTokenExpireTime;
	}
	public Duration getRefreshTokenExpireTime() {
		return refreshTokenExpireTime;
	}
	public void setRefreshTokenExpireTime(Duration refreshTokenExpireTime) {
		this.refreshTokenExpireTime = refreshTokenExpireTime;
	}
	public Duration getRefreshTokenExpireAppTime() {
		return refreshTokenExpireAppTime;
	}
	public void setRefreshTokenExpireAppTime(Duration refreshTokenExpireAppTime) {
		this.refreshTokenExpireAppTime = refreshTokenExpireAppTime;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
    
    
}
