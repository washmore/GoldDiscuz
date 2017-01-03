package tech.washmore.gold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author washmore
 * @version v1
 * @since 2016-11-30
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DiscuzStarter {

    public static void main(String[] args) {
        System.out.println("---------------启动开始--^_^------------#####################################");
        SpringApplication.run(DiscuzStarter.class, args);
        System.out.println("---------------启动结束--^_^------------#####################################");
    }
}