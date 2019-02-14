package it.pkg;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@NacosPropertySource(dataId = "basic", autoRefreshed = true)
@EnableSwagger2
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class);
    }
}