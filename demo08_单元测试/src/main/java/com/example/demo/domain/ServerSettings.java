package com.example.demo.domain;


//服务器配置

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties
public class ServerSettings {

	//名称
	
	@Value("${test.name}")
	private String name;
	
	@Value("${test.domain}")
	private String domain;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "ServerSettings{" +
				"name='" + name + '\'' +
				", domain='" + domain + '\'' +
				'}';
	}
}
