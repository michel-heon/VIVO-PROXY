package ca.uqam.tool.vivoproxy.swagger.api.factories;

import ca.uqam.tool.vivoproxy.swagger.api.PersonApiService;
import ca.uqam.tool.vivoproxy.swagger.api.impl.PersonApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-12-03T05:51:13.026-05:00[America/New_York]")public class PersonApiServiceFactory {
    private final static PersonApiService service = new PersonApiServiceImpl();

    public static PersonApiService getPersonApi() {
        return service;
    }
}
