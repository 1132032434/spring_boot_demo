package com.example.demo.comm;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 端口帮助类
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
public class PortUtil implements EmbeddedServletContainerCustomizer {

        @Override
        public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

           // configurableEmbeddedServletContainer.setPort(8003);
        }
}
