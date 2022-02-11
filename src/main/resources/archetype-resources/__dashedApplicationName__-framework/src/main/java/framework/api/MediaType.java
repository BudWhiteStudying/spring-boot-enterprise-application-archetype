#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${applicationPackage}.framework.api;

public class MediaType {
    private MediaType(){}

    private static final String APPLICATION_MEDIATYPE_PREFIX = "application/";
    private static final String REQUEST_PREFIX = "i";
    private static final String RESPONSE_PREFIX = "o";
    private static final String JSON_SUFFIX = "+json";
    private static final String V1_MARKER = "v1";
    private static final String V2_MARKER = "v2";
    private static final String GET_MARKER = "get";
    private static final String POST_MARKER = "post";
    private static final String PUT_MARKER = "put";
    private static final String DELETE_MARKER = "delete";

    public static class HelloWorld {
        public static final String POST_GREETING_REQUEST_V1 = APPLICATION_MEDIATYPE_PREFIX+REQUEST_PREFIX+"."+POST_MARKER+".hello.world.greeting."+V1_MARKER+JSON_SUFFIX;
        public static final String POST_GREETING_RESPONSE_V1 = APPLICATION_MEDIATYPE_PREFIX+RESPONSE_PREFIX+"."+POST_MARKER+".hello.world.greeting."+V1_MARKER+JSON_SUFFIX;
        public static final String GET_GREETING_RESPONSE_V1 = APPLICATION_MEDIATYPE_PREFIX+RESPONSE_PREFIX+"."+GET_MARKER+".hello.world.greeting."+V1_MARKER+JSON_SUFFIX;
    }

    public static class Something {
        public static final String GET_SOME_RESOURCE_RESPONSE_V1 = APPLICATION_MEDIATYPE_PREFIX+RESPONSE_PREFIX+"."+GET_MARKER+".something.some.resource."+V1_MARKER+JSON_SUFFIX;
        public static final String GET_SOME_RESOURCE_RESPONSE_V2 = APPLICATION_MEDIATYPE_PREFIX+RESPONSE_PREFIX+"."+GET_MARKER+".something.some.resource."+V2_MARKER+JSON_SUFFIX;
    }
}
