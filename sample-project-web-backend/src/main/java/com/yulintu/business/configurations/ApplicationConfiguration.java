package com.yulintu.business.configurations;

import com.yulintu.thematic.data.redis.ProviderRedisImpl;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:spring.application.xml"})
@ServletComponentScan
public class ApplicationConfiguration {

}