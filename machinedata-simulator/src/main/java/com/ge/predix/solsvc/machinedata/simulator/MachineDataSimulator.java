package com.ge.predix.solsvc.machinedata.simulator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionBody;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetric;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetricBuilder;
import com.ge.predix.solsvc.machinedata.websocket.WebSocketClient;
import com.ge.predix.solsvc.machinedata.websocket.WebSocketConfig;

/**
 * 
 * @author predix -
 */
@Component
public class MachineDataSimulator
{
	/**
	 * 
	 */
	static final Logger log = LoggerFactory.getLogger(MachineDataSimulator.class);
	static String accessToken;

	@Autowired
	private WebSocketConfig wsConfig;

	@Autowired
	private WebSocketClient wsClient;

	/**
	 * 
	 */
	@Autowired
	ApplicationProperties applicationProperties;


	/**
	 *  -
	 */
	@Scheduled(fixedDelay=3000)
	public void run()
	{
		if (accessToken.equals(null))
		{
			getHeader();
		}
		try
		{
			runTest();
		}
		catch (Throwable e)
		{
			log.error("unable to run Machine DataSimulator Thread", e); //$NON-NLS-1$
		}
	}

	/**
	 * @return String  Response string
	 * @throws Exception -
	 */
	public String runTest() throws Exception
	{
		// List<JSONData> list = generateMockDataMap_RT();
		List<SensorDetails> list = generateMockDataMap_RT();
		ObjectMapper mapper = new ObjectMapper();
		StringWriter writer = new StringWriter();

		mapper.writeValue(writer, list);
		postDataToWS(list);
		return "Success";
//		return postDataToTS(writer.toString());

	}
	/**
	 * @return -
	 */
	/**
	 * @return
	 */
	List<SensorDetails> generateMockDataMap_RT()
	{
		/*String machineControllerId = this.applicationProperties.getMachineControllerId();
        List<JSONData> list = new ArrayList<JSONData>();
        JSONData data = new JSONData();
        data.setName("Compressor-2015:CompressionRatio"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(2.5, 3.0) - 1) * 65535.0 / 9.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:DischargePressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 23.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:SuctionPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.21) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MaximumPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(22.0, 26.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MinimumPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue(0.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Temperature"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(65.0, 80.0) * 65535.0) / 200.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Velocity"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.1) * 65535.0) / 0.5);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        return list;*/ 

		List<SensorDetails> list = new ArrayList<SensorDetails>();    	
		ArrayList<SensorReading> readingList = new ArrayList<SensorReading>();

		SensorReading reading = new SensorReading();
		reading.setEpoch(getCurrentTimestamp().toString());
		reading.setValue(String.valueOf(generateRandomUsageValue(0.001, 2.999)));
		readingList.clear();
		readingList.add(reading);

		SensorDetails data = new SensorDetails();
		data.setSensorName("Tst8");
		data.setMaxValue("1025");
		data.setMinValue("15");
		data.setSensorID("IJK125");
		data.setSensorReadings(readingList);    	
		list.add(data);

		reading.setEpoch(getCurrentTimestamp().toString());
		reading.setValue(String.valueOf(generateRandomUsageValue(0.001, 2.999)));
		readingList.clear();
		readingList.add(reading);

		data = new SensorDetails();
		data.setSensorName("Tst9");
		data.setMaxValue("1025");
		data.setMinValue("15");
		data.setSensorID("IJK126");
		data.setSensorReadings(readingList);    	
		list.add(data);

		reading.setEpoch(getCurrentTimestamp().toString());
		reading.setValue(String.valueOf(generateRandomUsageValue(0.001, 2.999)));
		readingList.clear();
		readingList.add(reading);

		data = new SensorDetails();
		data.setSensorName("Tst10");
		data.setMaxValue("1025");
		data.setMinValue("15");
		data.setSensorID("IJK127");
		data.setSensorReadings(readingList);    	
		list.add(data);

		reading.setEpoch(getCurrentTimestamp().toString());
		reading.setValue(String.valueOf(generateRandomUsageValue(0.001, 2.999)));
		readingList.clear();
		readingList.add(reading);

		data = new SensorDetails();
		data.setSensorName("Tst11");
		data.setMaxValue("1025");
		data.setMinValue("15");
		data.setSensorID("IJK128");
		data.setSensorReadings(readingList);    	
		list.add(data);

		reading.setEpoch(getCurrentTimestamp().toString());
		reading.setValue(String.valueOf(generateRandomUsageValue(0.001, 2.999)));
		readingList.clear();
		readingList.add(reading);

		data = new SensorDetails();
		data.setSensorName("Tst12");
		data.setMaxValue("1025");
		data.setMinValue("15");
		data.setSensorID("IJK129");
		data.setSensorReadings(readingList);    	
		list.add(data);

		return list;

	}

	private Timestamp getCurrentTimestamp()
	{
		java.util.Date date = new java.util.Date();
		Timestamp ts = new Timestamp(date.getTime());
		return ts;
	}

	private static double generateRandomUsageValue(double low, double high)
	{
		return low + Math.random() * (high - low);
	}

	/**
	 * Posts the Data to Time Series Service.
	 * @param content
	 * @return
	 */
	@SuppressWarnings("resource")
	private String postDataToTS(String content)
	{   
		HttpClient client = null;
		try
		{
			HttpClientBuilder builder = HttpClientBuilder.create();
			if ( this.applicationProperties.getDiServiceProxyHost() != null
					&& !"".equals(this.applicationProperties.getDiServiceProxyHost()) //$NON-NLS-1$
					&& this.applicationProperties.getDiServiceProxyPort() != null
					&& !"".equals(this.applicationProperties.getDiServiceProxyPort()) ) //$NON-NLS-1$
			{
				HttpHost proxy = new HttpHost(this.applicationProperties.getDiServiceProxyHost(),
						Integer.parseInt(this.applicationProperties.getDiServiceProxyPort()));
				builder.setProxy(proxy);
			}
			client = builder.build();
			String serviceURL = null;
			if ( this.applicationProperties.getPredixDataIngestionURL() == null )
			{
				serviceURL = "http://" + this.applicationProperties.getDiServiceHost() + ":" //$NON-NLS-1$ //$NON-NLS-2$
						+ this.applicationProperties.getDiServicePort() + "/SaveTimeSeriesData"; //$NON-NLS-1$
			}
			else
			{
				serviceURL = this.applicationProperties.getPredixDataIngestionURL() + "/SaveTimeSeriesData"; //$NON-NLS-1$

			}
			log.info("Service URL : " + serviceURL); //$NON-NLS-1$
			HttpPost request = new HttpPost(serviceURL);
			request.setHeader(new BasicHeader("Authorization", "Bearer " + accessToken));
			HttpEntity reqEntity = MultipartEntityBuilder.create().addTextBody("content", content) //$NON-NLS-1$
					.addTextBody("clientId", "infyOAuth") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					.addTextBody("tenantId", this.applicationProperties.getTenantId()).build(); //$NON-NLS-1$
			request.setEntity(reqEntity);
			HttpResponse response = client.execute(request);
			log.debug("Send Data to Ingestion Service : Response Code : " + response.getStatusLine().getStatusCode()); //$NON-NLS-1$
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = ""; //$NON-NLS-1$
			while ((line = rd.readLine()) != null)
			{
				result.append(line);
			}
			log.debug("Response : "+result.toString());
			if (result.toString().startsWith("You successfully posted")) { //$NON-NLS-1$
				return "SUCCESS : "+result.toString(); //$NON-NLS-1$
			}
			return "FAILED : "+result.toString(); //$NON-NLS-1$

		}
		catch (Throwable e)
		{
			log.error("unable to post data ", e); //$NON-NLS-1$
			return "FAILED : "+e.getLocalizedMessage(); //$NON-NLS-1$
		}
	}

	/**
	 * Fetches the Access Token from the OAuth URL and assigns to the static variable
	 * Author : Anoop
	 */
	private void getHeader(){
		try
		{
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
			nameValuePairs.add(new BasicNameValuePair("grant_type", this.applicationProperties.getGrantType()));
			nameValuePairs.add(new BasicNameValuePair("username", this.applicationProperties.getUserName()));
			nameValuePairs.add(new BasicNameValuePair("password", this.applicationProperties.getPassword()));

			HttpClient httpClient = null;
			String paramsString = URLEncodedUtils.format(nameValuePairs, "UTF-8");
			HttpGet httpGet = new HttpGet(this.applicationProperties.getoAuthUrl() + "?" + paramsString);
			httpGet.setHeader("Authorization", "Basic aW5meU9BdXRoOnBhc3N3b3Jk");
			HttpResponse response = httpClient.execute(httpGet);

			ObjectMapper mapper = new ObjectMapper();
			UAAResponse queryResponse = mapper.readValue(response.getEntity().getContent(), UAAResponse.class);

			accessToken = queryResponse.getAccessToken();
		}
		catch (Exception e)
		{
			log.error("Unable to Fetch Token ", e); //$NON-NLS-1$            
		}		
	}

	/**
	 * Posts the Data to Web Socket Server.
	 * @param data
	 * Author : Anoop
	 */
	private void postDataToWS(List<SensorDetails> list)
	{
		try
		{
			InjectionMetricBuilder builder = InjectionMetricBuilder.getInstance();
			
			for (SensorDetails details : list)
			{
				InjectionMetric metric = new InjectionMetric(new Long(System.currentTimeMillis()));
				InjectionBody body = new InjectionBody(details.getSensorName());
				
				body.addAttributes("sourceTagName",details.getSensorName());
                body.addAttributes("sourceTagID",details.getSensorID());
                body.addAttributes("MaxValue",details.getMaxValue());
                body.addAttributes("MinValue",details.getMinValue());
                
                int count = details.getSensorReadings().size();
                for (int i = 0 ; i <count; i++)
                {
                	// log.info(details.SensorReadings.get(i).epoch);
                	// log.info(details.SensorReadings.get(i).value);
                    body.addDataPoint(Long.parseLong(details.getSensorReadings().get(i).getEpoch()),Double.parseDouble(details.getSensorReadings().get(i).getValue()));
                }
                
                metric.getBody().add(body);
                builder.addMetrics(metric);
			}
			
			log.info(builder.build());

			wsClient.postToWebSocketServer(builder.build());
			log.info("Posted Data to Websocket"); //$NON-NLS-1$
		}
		catch (Throwable e)
		{
			log.error("Unable to post data to Websocket", e.getLocalizedMessage()); //$NON-NLS-1$
		}

	}
}
