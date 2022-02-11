#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.feature.hello.world.service;

import ${groupId}.${applicationPackage}.factory.GreetingFactory;
import ${groupId}.${applicationPackage}.model.dto.v1.hello.world.response.GetGreetingResponseV1;
import ${groupId}.${applicationPackage}.model.dto.v1.hello.world.response.PostGreetingResponseV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldServiceV1 {

    private final GreetingFactory greetingFactory;

    public GetGreetingResponseV1 getGreeting() {
        return new GetGreetingResponseV1(greetingFactory.getGreetingV1("Here is a generic greeting", "MR"));
    }

    public PostGreetingResponseV1 postGreeting(String greeterName) {
        return new PostGreetingResponseV1(greetingFactory.getGreetingV1(String.format("%s said hello!", greeterName), "XD"));
    }
}
