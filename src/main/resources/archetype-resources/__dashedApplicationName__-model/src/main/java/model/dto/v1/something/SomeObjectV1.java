#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v1.something;

import ${groupId}.${applicationPackage}.framework.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SomeObjectV1 implements BaseDTO {
    private String someProperty;
}
