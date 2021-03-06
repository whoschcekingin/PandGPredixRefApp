package com.ge.predix.solsvc.fdh.router.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.MessageContext;

import com.ge.dsp.pm.fielddatahandler.entity.createfields.CreateFieldsRequest;
import com.ge.dsp.pm.fielddatahandler.entity.createfields.CreateFieldsResult;
import com.ge.dsp.pm.fielddatahandler.entity.getfielddata.GetFieldDataRequest;
import com.ge.dsp.pm.fielddatahandler.entity.getfielddata.GetFieldDataResult;
import com.ge.dsp.pm.fielddatahandler.entity.putfielddata.PutFieldDataRequest;
import com.ge.dsp.pm.fielddatahandler.entity.putfielddata.PutFieldDataResult;

/**
 * This differs from the auto generated interface because we also get the MessageContext in order to receive the SAML token et al from any upstream systems
 * @author predix
 */
@Consumes({ "application/json", "application/xml" })
@Produces({ "application/json", "application/xml" })
@Path("/fdhrouter/fielddatahandler")
public interface FieldDataHandlerRest {

    /**
     * Rest implementation for the service to act as a GET heart beat: /heartbeat
     * @param id - the id to reflect back
     * 
     *
     * @return JAXBElement<Response>
     * @Path("/fields")
     */
    @GET
    @Path("/heartbeat")
    public Response heartbeat(@QueryParam("id") String id);
    
	/**
	 * @param context -
	 * @param request -
	 * @return -
	 */
    @POST
    @Path("/createfields")
	public CreateFieldsResult createFields(@Context MessageContext context,
			CreateFieldsRequest request);

	/**
	 * @param context -
	 * @param request -
	 * @return -
	 */
    @POST
    @Path("/getfielddata")
    public GetFieldDataResult getFieldData(@Context MessageContext context,
			GetFieldDataRequest request);

	/**
	 * @param context -
	 * @param request -
	 * @return -
	 */
    @POST
    @Path("/putfielddata")
    public PutFieldDataResult putFieldData(@Context MessageContext context, PutFieldDataRequest request);


}
