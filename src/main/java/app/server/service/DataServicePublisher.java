package app.server.service;

// https://jakarta.ee/specifications/xml-web-services/4.0/apidocs/jakarta.xml.ws/jakarta/xml/ws/endpoint
import jakarta.xml.ws.Endpoint;
import app.server.utils.Constants;

// Publisher кінцевої точки
public class DataServicePublisher {

    public void publish() {
        Endpoint.publish(Constants.BASE_URL, new DataServiceImpl());
    }
}
