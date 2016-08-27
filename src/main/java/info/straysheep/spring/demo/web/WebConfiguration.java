package info.straysheep.spring.demo.web;

import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@Profile("web")
@EnableWebMvc
@Import(EmbeddedServletContainerAutoConfiguration.class)
public class WebConfiguration {
}
