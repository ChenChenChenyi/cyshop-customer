package com.cyshop.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

/**
 * @author 陈义
 */
@SpringBootApplication
//@Slf4j
//@EnableAsync
//@EnableFeignClients(basePackages = {"com.chenyi.yanhuohui.*.api","com.chenyi.yanhuohui.*.provider"})
//@EnableDiscoveryClient
public class CustomerServiceApplication {
    public static void main(String[] args) throws Exception {
        Environment environment = SpringApplication.run(CustomerServiceApplication.class,args).getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = environment.getProperty("server.port");
        String property = environment.getProperty("server.servlet.context-path");
        String path = property == null ? "" :  property;
        System.out.println(
                "\n\t" +
                        "----------------------------------------------------------\n\t" +
                        "Application CUSTOMER is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                        "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                        "------------------------------------------------------------");
    }
}
