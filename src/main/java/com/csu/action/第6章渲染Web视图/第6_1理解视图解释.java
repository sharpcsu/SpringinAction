package com.csu.action.第6章渲染Web视图;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sharp on 2018/3/4 0004 - 21:11
 */
public class 第6_1理解视图解释 {
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return (ViewResolver) resolver;
    }
    
}

interface ViewResolver {
    View resolveViewName(String viewName, Locale locale) throws Exception;
}

interface View {
    String getContentType();
    
    void render(Map<String, ?> model, HttpServletRequest request,
                HttpServletResponse response) throws Exception;
}

