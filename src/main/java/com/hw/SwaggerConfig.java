package com.hw;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hw.domain.UserInfo;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	Logger logger = Logger.getLogger(SwaggerConfig.class);
	@Bean
    public Docket testApi() {
		//logger.info("http://localhost:8080/swagger-ui.html");
        return new Docket(DocumentationType.SWAGGER_2)
        		 .apiInfo(apiInfo()).ignoredParameterTypes(UserInfo.class)
                 .select()
                 .apis(RequestHandlerSelectors.basePackage("com.hw.controller"))
                 .paths(PathSelectors.any())
                 .build();
        }
	private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("浙江宏伟供应链集团股份有限公司 ",//大标题
                "银企直连接口文档",//小标题
                "1.0",//版本
                "",
                "",//作者
                "",//链接显示文字
                ""//网站链接
        );

        return apiInfo;
    }
}
