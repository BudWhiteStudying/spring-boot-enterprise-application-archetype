#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.factory;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseFactory {
    final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
}
