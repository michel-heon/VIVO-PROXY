package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrganizationApiService;
import io.swagger.api.factories.OrganizationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Organization;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/organization")


@io.swagger.annotations.Api(description = "the organization API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-05-31T17:14:53.469-04:00")
public class OrganizationApi  {
   private final OrganizationApiService delegate;

   public OrganizationApi(@Context ServletConfig servletContext) {
      OrganizationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrganizationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrganizationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = OrganizationApiServiceFactory.getOrganizationApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an organization in VIVO", notes = "This can only be done by the logged in VIVO.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "organization", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK (successfully authenticated)", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication information is missing or invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createOrganization(@ApiParam(value = "Created organization object" ,required=true) Organization body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrganization(body,securityContext);
    }
}