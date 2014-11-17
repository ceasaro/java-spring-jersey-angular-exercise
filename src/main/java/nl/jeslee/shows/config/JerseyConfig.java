package nl.jeslee.shows.config;


import nl.jeslee.shows.Application;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ApplicationPath("/v1.0")
//@ComponentScan(basePackageClasses = Application.class, includeFilters = @ComponentScan.Filter({Controller.class, Component.class}), useDefaultFilters = false)
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        packages("nl.jeslee.shows");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.JSON_PROCESSING_FEATURE_DISABLE, false);
        property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
        property(ServerProperties.WADL_FEATURE_DISABLE, true);
        register(LoggingFilter.class);
        register(JacksonFeature.class);
    }
}
