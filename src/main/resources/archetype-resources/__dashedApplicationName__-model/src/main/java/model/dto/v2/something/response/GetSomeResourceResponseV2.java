#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v2.something.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import ${groupId}.${applicationPackage}.framework.dto.BaseResponse;
import ${groupId}.${applicationPackage}.model.dto.v2.something.SomeObjectV2;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class GetSomeResourceResponseV2 extends BaseResponse {
    private SomeObjectV2 someObject;
}
