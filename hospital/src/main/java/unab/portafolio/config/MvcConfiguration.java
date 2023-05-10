package unab.portafolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "unab.portafolio")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {

    // Este metodo setea las URL con las vistas JSP creadas.

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/createaccount").setViewName("createaccount");
        registry.addViewController("/agregarpaciente").setViewName("agregarpaciente");
        registry.addViewController("/buscarmodificarpaciente").setViewName("buscarmodificarpaciente");
        registry.addViewController("/eliminarpaciente").setViewName("eliminarpaciente");
        registry.addViewController("/inicioreporte").setViewName("inicioreporte");
        registry.addViewController("/finreporte").setViewName("reporte");
   }

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

}
