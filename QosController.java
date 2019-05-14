import javax.inject.Named;
import javax.ws.rs.core.Response;

@Named
public class QosController implements Qos {

    @Override
    public Response get() {
        return Response.ok().build();
    }

    @Override
    public Response httpsGet() {
        return Response.ok().build();
    }
}
