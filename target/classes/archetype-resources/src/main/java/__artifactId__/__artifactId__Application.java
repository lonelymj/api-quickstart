#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@NacosPropertySource(dataId = "LgmnAdminApi", autoRefreshed = true)
@EnableSwagger2
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApiTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTemplateApplication.class, args);
    }

}
