package com.github.pramodkuth.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Open API config
 *
 * @author pramodkuth
 */
@Configuration
public class OpenApiConfig {
    private Info commonInfo(String version) {
        return new Info()
                .title("Order Management Service API Definitions")
                .version(version)
                .description("An OpenAPI template for simple order management service")
                .contact(new Contact()
                        .name("pramodkuth")
                        .url("https://github.com/pramodkuth"))
                .license(new License()
                        .name("MIT License")
                        .url("https://opensource.org/licenses/MIT"));
    }

    @Bean
    public GroupedOpenApi v1Api() {
        return GroupedOpenApi.builder().group("v1").pathsToMatch("/api/v1/**")
                .addOpenApiCustomizer(openApi -> openApi.info(commonInfo("1.0")))
                .addOpenApiCustomizer(customHeaderCustomizer())
                .build();
    }

    @Bean
    public GroupedOpenApi v2Api() {
        return GroupedOpenApi.builder().group("v2").pathsToMatch("/api/v2/**")
                .addOpenApiCustomizer(openApi -> openApi.info(commonInfo("2.0")))
                .addOpenApiCustomizer(customHeaderCustomizer())
                .build();
    }

    private OpenApiCustomizer customHeaderCustomizer() {
        return openApi -> openApi.getPaths().values().forEach(pathItem -> {
            pathItem.readOperations().forEach(operation -> {
                operation.addParametersItem(new Parameter().in("header").name("X-B3-Span-Id").description("Span Id for tracing")
                        .required(false).schema(new StringSchema()));
            });
        });
    }
}
