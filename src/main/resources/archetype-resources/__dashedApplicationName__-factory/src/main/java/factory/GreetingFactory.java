#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.factory;

import ${groupId}.${applicationPackage}.model.dto.v1.hello.world.GreetingTitle;
import ${groupId}.${applicationPackage}.model.dto.v1.hello.world.GreetingV1;
import org.springframework.stereotype.Component;

@Component
public class GreetingFactory extends BaseFactory {

    private final GreetingTitle defaultGreetingTitle = GreetingTitle.DEFAULT;

    public GreetingV1 getGreetingV1(String text, String greetingTitle) {
        try {
            return new GreetingV1(text, GreetingTitle.valueOf(greetingTitle));
        }
        catch (IllegalArgumentException e) {
            logger.warn("Problems building greeting, invalid title {}, defaulting to {}", greetingTitle, defaultGreetingTitle);
            return new GreetingV1(text, defaultGreetingTitle);
        }
    }
}
