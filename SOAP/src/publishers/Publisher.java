package publishers;

import javax.xml.ws.Endpoint;

import endpoints.ConvertService;

public class Publisher {
	public static void main(String[] args){
		final String url = "http://localhost:8888/cs";
		System.out.println("Publishing ConvertService at endpoint "+ url);
		Endpoint.publish(url, new ConvertService());
}
}
