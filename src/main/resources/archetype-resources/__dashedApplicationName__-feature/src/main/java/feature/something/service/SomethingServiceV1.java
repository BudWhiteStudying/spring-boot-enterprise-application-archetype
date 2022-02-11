#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.feature.something.service;

import ${groupId}.${applicationPackage}.factory.SomeObjectFactory;
import ${groupId}.${applicationPackage}.model.dto.v1.something.response.GetSomeResourceResponseV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomethingServiceV1 {

    private final SomeObjectFactory someObjectFactory;

    public GetSomeResourceResponseV1 getSomeResourceResponse() {
        return new GetSomeResourceResponseV1(someObjectFactory.getSomeObjectV1("a string value"));
    }
}
