#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.feature.something.service;

import ${groupId}.${applicationPackage}.factory.SomeObjectFactory;
import ${groupId}.${applicationPackage}.model.dto.v2.something.response.GetSomeResourceResponseV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomethingServiceV2 {

    private final SomeObjectFactory someObjectFactory;

    public GetSomeResourceResponseV2 getSomeResourceResponse() {
        return new GetSomeResourceResponseV2(someObjectFactory.getSomeObjectV2("another value", true, false));
    }
}
