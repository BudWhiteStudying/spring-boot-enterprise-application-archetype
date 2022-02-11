#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v1.hello.world.response;

import ${groupId}.${applicationPackage}.framework.dto.BaseResponse;
import ${groupId}.${applicationPackage}.model.dto.v1.hello.world.GreetingV1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetGreetingResponseV1 extends BaseResponse {
    private GreetingV1 greeting;
}
