#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.framework.dto;

import ${groupId}.${applicationPackage}.framework.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BaseResponse implements BaseDTO {
    private String message;

    public BaseResponse() {
        this.message = Message.Info.GENERIC_CONFIRMATION_MESSAGE;
    }
}
