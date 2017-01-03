package tech.washmore.gold.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author washmore
 * @version v1
 * @since 2016-11-30
 */
@Configuration
@ConditionalOnWebApplication
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //  CacheControl cacheControl = CacheControl.maxAge(15, TimeUnit.HOURS);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/pages/");
    }

    /**
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(routerInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/welcome", "", "/static/**");
    }


//
//    /**
//     * @return ResourceConfig
//     */
//    @Bean
//    public ResourceConfig resourceConfig() {
//        return new ResourceConfig();
//    }

//    /**
//     * @return LoginInterceptor
//     */
//    @Bean
//    public LoginInterceptor loginInterceptor() {
//        return new LoginInterceptor();
//    }

//    /**
//     * ConfigurationProperties标注的类提供Setter方法的字段才会被处理
//     */
//    @ConfigurationProperties(prefix = "resource")
//    public static class ResourceConfig {
//        private String duiHost;
//        private String version;
//        private String apiRouteHost;
//
//        @Value("${spring.profiles.active}")
//        private String env;
//
//        public String getApiRouteHost() {
//            return apiRouteHost;
//        }
//
//        public void setApiRouteHost(String apiRouteHost) {
//            this.apiRouteHost = apiRouteHost;
//        }
//
//        public void setDuiHost(String duiHost) {
//            this.duiHost = duiHost;
//        }
//
//        public String getDuiHost() {
//            return duiHost;
//        }
//
//        public String getVersion() {
//            return version;
//        }
//
//        public void setVersion(String version) {
//            this.version = version;
//        }
//
//        public String getYear() {
//            return String.valueOf(LocalDate.now().getYear());
//        }
//
//    }

}
