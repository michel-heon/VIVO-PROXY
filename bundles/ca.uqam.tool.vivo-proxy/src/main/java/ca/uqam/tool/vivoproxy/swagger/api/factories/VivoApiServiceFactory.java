package ca.uqam.tool.vivoproxy.swagger.api.factories;

import ca.uqam.tool.vivoproxy.swagger.api.VivoApiService;
import ca.uqam.tool.vivoproxy.swagger.api.impl.VivoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-07-29T16:22:48.953-04:00[America/New_York]")public class VivoApiServiceFactory {
    private final static VivoApiService service = new VivoApiServiceImpl();

    public static VivoApiService getVivoApi() {
        return service;
    }
}
