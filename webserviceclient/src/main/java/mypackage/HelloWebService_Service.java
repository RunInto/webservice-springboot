
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWebService", targetNamespace = "http://impl.webservice.example.com", wsdlLocation = "file:/C:/Users/lWX795780/Desktop/webserviceclient/src/main/java/com/example/webservice/client/webserviceclient/webservice/test.wsdl")
public class HelloWebService_Service
    extends Service
{

    private final static URL HELLOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWEBSERVICE_EXCEPTION;
    private final static QName HELLOWEBSERVICE_QNAME = new QName("http://impl.webservice.example.com", "HelloWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/lWX795780/Desktop/webserviceclient/src/main/java/com/example/webservice/client/webserviceclient/webservice/test.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWEBSERVICE_WSDL_LOCATION = url;
        HELLOWEBSERVICE_EXCEPTION = e;
    }

    public HelloWebService_Service() {
        super(__getWsdlLocation(), HELLOWEBSERVICE_QNAME);
    }

    public HelloWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWEBSERVICE_QNAME, features);
    }

    public HelloWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, HELLOWEBSERVICE_QNAME);
    }

    public HelloWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWEBSERVICE_QNAME, features);
    }

    public HelloWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public HelloWebService getHelloWorldServiceImplPort() {
        return super.getPort(new QName("http://impl.webservice.example.com", "HelloWorldServiceImplPort"), HelloWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public HelloWebService getHelloWorldServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.example.com", "HelloWorldServiceImplPort"), HelloWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWEBSERVICE_EXCEPTION!= null) {
            throw HELLOWEBSERVICE_EXCEPTION;
        }
        return HELLOWEBSERVICE_WSDL_LOCATION;
    }

}
