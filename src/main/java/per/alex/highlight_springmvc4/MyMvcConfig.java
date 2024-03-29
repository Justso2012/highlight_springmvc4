package per.alex.highlight_springmvc4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc  //该注解会开启一些默认配置
@ComponentScan("per.alex.highlight_springmvc4")
public class MyMvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){


        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //配置路径为运行时路径
        viewResolver.setPrefix("/WEB-INF/classes/views");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
