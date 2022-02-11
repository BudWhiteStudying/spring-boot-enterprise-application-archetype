#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.model.dto.v1.hello.world;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ${groupId}.${applicationPackage}.framework.dto.BaseDTO;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GreetingV1 implements BaseDTO{
    private String text;
    private GreetingTitle recipientTitle;
}
