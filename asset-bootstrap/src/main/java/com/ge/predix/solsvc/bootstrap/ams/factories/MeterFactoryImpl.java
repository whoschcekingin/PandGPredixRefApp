package com.ge.predix.solsvc.bootstrap.ams.factories;


import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.bootstrap.ams.dto.Meter;
/**
 * 
 * 
 * @author 212421693
 */
@Component(value="meterFactory")
public class MeterFactoryImpl extends FixtureFactory implements MeterFactory {
	

	@Override
	public  HttpResponse createMeter(Meter meter, List<Header> headers){
		CloseableHttpResponse response = null;
		try { 
			response = create(meter, headers);
			boolean expected = (response==null || response.getStatusLine()==null || response.getStatusLine().getStatusCode() != HttpStatus.SC_NO_CONTENT )?false:true;
			if ( !expected ) 
				handleException(meter, headers, response);
		}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
		return response;

	}
	
	
	//Update Meter happens with a post call exactly like create
	@Override
	public HttpResponse updateMeter(Meter meter, List<Header> headers){
		return createMeter(meter, headers);
	}
	

	@SuppressWarnings("nls")
    @Override
	public Meter getMeter(String uuid, List<Header> headers){
		CloseableHttpResponse response = null;
		try {
		response =get(Meter.class, uuid, headers);
		if(response==null || response.getStatusLine()==null || response.getStatusLine().getStatusCode() != HttpStatus.SC_OK  ) {
			return null;
		}
		try
        {
            return (Meter) getObjectFromJson(Meter.class, response).get(0);
        }
        catch (ParseException | IOException e)
        {
            throw new RuntimeException("uuid="+uuid + " " + e.getMessage(), e);

        }
		}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
	}
	
	//usage filter=<filter>=<value>
	@SuppressWarnings("nls")
    @Override
	public List<Meter> getMetersByFilter(String uuid, String filter, String value, List<Header> headers){
		CloseableHttpResponse response = null; 
		List<Meter> list = null;
		try { 
		response =get(Meter.class, uuid, filter, value, headers);
		if(response==null || response.getStatusLine()==null){
			return list;
		}
		if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK || 
				response.getStatusLine().getStatusCode() == HttpStatus.SC_PARTIAL_CONTENT) {
			try
            {
                list = getObjectFromJson(Meter.class, response);
            }
            catch (ParseException | IOException e)
            {
                throw new RuntimeException("uuid="+uuid + " filter=" + filter + " " + e.getMessage(), e);
            }
		}
		}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
		return list;
	}
	
	@Override
	public  List<Meter> getAllMeters(List<Header> headers){
		CloseableHttpResponse response = null;  
		try { 
		 response =get(Meter.class, headers);
		if(response==null || response.getStatusLine()==null || response.getStatusLine().getStatusCode() != HttpStatus.SC_OK ) {
			return null;
		}
		try
        {
            return getObjectFromJson(Meter.class, response);
        }
        catch (ParseException | IOException e)
        {
            throw new RuntimeException(e);

        }
		}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
	}
			
	@Override
	public HttpResponse deleteMeter(String uuid, List<Header> headers){
		CloseableHttpResponse response = null;   
		try { 
			response =delete(Meter.class, uuid, headers);
			boolean expected = (response==null || response.getStatusLine()==null || response.getStatusLine().getStatusCode() != HttpStatus.SC_NO_CONTENT)?false:true;
			if ( !expected ) 
				handleException(uuid, headers, response);
		}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
		return response;

	}
	

}
