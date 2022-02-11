#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v1.something.response;

import ${groupId}.${applicationPackage}.framework.dto.BaseResponse;
import ${groupId}.${applicationPackage}.model.dto.v1.something.SomeObjectV1;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class GetSomeResourceResponseV1 extends BaseResponse {
    private SomeObjectV1 someObject;
}
