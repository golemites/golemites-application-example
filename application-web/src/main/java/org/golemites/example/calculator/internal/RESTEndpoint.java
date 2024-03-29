package org.golemites.example.calculator.internal;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT;
import static org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants.JAX_RS_RESOURCE;

@Component(
        property = {
                JAX_RS_APPLICATION_SELECT + "=(osgi.jaxrs.name=.default)",
                JAX_RS_RESOURCE + "=true",
        },
        scope = ServiceScope.PROTOTYPE,
        service = RESTEndpoint.class
)
@Path( "/" )
public class RESTEndpoint {

    @GET
    @Path("/foo")
    @Produces( MediaType.APPLICATION_JSON )
    public String sayHello() {
        return "{\"message\" : \"Toni4\"}";
    }
}
