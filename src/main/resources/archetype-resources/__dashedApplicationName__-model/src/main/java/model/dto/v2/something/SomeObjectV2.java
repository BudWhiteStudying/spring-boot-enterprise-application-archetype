#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v2.something;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import ${groupId}.${applicationPackage}.framework.dto.BaseDTO;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SomeObjectV2 implements BaseDTO{
    private String anotherProperty;
    @JsonProperty("isCool")
    private boolean cool;
    @JsonProperty("isWorking")
    @Getter(AccessLevel.NONE)
    private Boolean working;
}
