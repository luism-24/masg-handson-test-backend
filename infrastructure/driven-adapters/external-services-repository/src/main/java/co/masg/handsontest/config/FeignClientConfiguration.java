package co.masg.handsontest.config;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return interceptor -> {
            interceptor.header("Content-Type", "application/json");
            interceptor.header("Accept", "application/json");
        };
    }
}
