package ca.uqam.tool.vivoproxy.swagger.api;

import ca.uqam.tool.vivoproxy.swagger.model.*;
import ca.uqam.tool.vivoproxy.swagger.api.VivoApiService;
import ca.uqam.tool.vivoproxy.swagger.api.factories.VivoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import ca.uqam.tool.vivoproxy.swagger.model.Vivo;

import java.util.Map;
import java.util.List;
import ca.uqam.tool.vivoproxy.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/vivo")


@io.swagger.annotations.Api(description = "the vivo API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-07-15T06:02:28.027-04:00")
public class VivoApi  {
   private final VivoApiService delegate;

   public VivoApi(@Context ServletConfig servletContext) {
      VivoApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VivoApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VivoApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = VivoApiServiceFactory.getVivoApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json", "text/plain", "application/rdf+xml", "text/n3", "text/turtle", "text/funtional", "text/manchester", "application/owl+xml" })
    @io.swagger.annotations.ApiOperation(value = "Get an individual by IRI", notes = "", response = Vivo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "vivo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vivo.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid personname supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication information is missing or invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "person not found", response = Void.class) })
    public Response getindividualByIRI(@ApiParam(value = "Used to obtain information from a VIVO individual by the IRI",required=true) @QueryParam("IRI") String IRI
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getindividualByIRI(IRI,securityContext);
    }
}
