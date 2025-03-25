package pe.edu.idat.demo_sprint_feign_client.restclient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.idat.demo_sprint_feign_client.restclient.errorhandler.CustomErrorDecoder;

@Configuration
public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }
}