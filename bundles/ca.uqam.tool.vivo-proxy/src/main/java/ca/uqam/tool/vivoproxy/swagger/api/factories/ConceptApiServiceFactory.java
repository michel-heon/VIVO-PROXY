package ca.uqam.tool.vivoproxy.swagger.api.factories;

import ca.uqam.tool.vivoproxy.swagger.api.ConceptApiService;
import ca.uqam.tool.vivoproxy.swagger.api.impl.ConceptApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-09-20T09:04:16.317-04:00[America/New_York]")public class ConceptApiServiceFactory {
    private final static ConceptApiService service = new ConceptApiServiceImpl();

    public static ConceptApiService getConceptApi() {
        return service;
    }
}
