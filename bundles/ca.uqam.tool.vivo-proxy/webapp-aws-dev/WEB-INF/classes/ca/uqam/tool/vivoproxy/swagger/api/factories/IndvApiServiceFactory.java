package ca.uqam.tool.vivoproxy.swagger.api.factories;

import ca.uqam.tool.vivoproxy.swagger.api.IndvApiService;
import ca.uqam.tool.vivoproxy.swagger.api.impl.IndvApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-12-03T05:51:13.026-05:00[America/New_York]")public class IndvApiServiceFactory {
    private final static IndvApiService service = new IndvApiServiceImpl();

    public static IndvApiService getIndvApi() {
        return service;
    }
}