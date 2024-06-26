package com.taoshao.taoclientsdk;

import com.taoshao.taoclientsdk.client.TaoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * taoshao API 客户端配置类
 * @author taoshao

 */
@Data
@Configuration
@ConfigurationProperties("tao.client")
@ComponentScan
public class TaoApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public TaoApiClient getApiClient() {
        return new TaoApiClient(accessKey, secretKey);
    }
}
