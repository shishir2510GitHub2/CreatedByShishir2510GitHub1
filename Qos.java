import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public interface Qos {
    /**
     * Defines a bare-minimum service health check, proving connections can be made over http.
     *
     * @return A 200 response if a valid HTTP GET request has been received, any other status code
     *         otherwise.
     */
    @GET
    @Path("ping")
    public Response get();

    /**
     * Defines a bare-minimum service health check, proving connections can be made over https.
     *
     * @return A 200 response if a valid HTTP GET request has been received, any other status code
     *         otherwise.
     */
    @GET
    @Path("sping")
    public Response httpsGet();
}
