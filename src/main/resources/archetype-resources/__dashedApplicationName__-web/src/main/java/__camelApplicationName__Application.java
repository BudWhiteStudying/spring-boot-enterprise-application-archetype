#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("${groupId}.${applicationPackage}")
public class ${camelApplicationName}Application {

    public static void main(String[] args) {
        SpringApplication.run(${camelApplicationName}Application.class, args);
    }

}
