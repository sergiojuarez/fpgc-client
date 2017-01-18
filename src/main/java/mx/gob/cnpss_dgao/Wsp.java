package mx.gob.cnpss_dgao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2017-01-16T11:32:08.565-06:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "wsp", 
                  wsdlLocation = "file:/C:/Users/ETI2JUGS/Documents/ProyectoSaludWorkSpace/consultafpgc-cliente/src/main/resources/wsdl/wsp.wsdl",
                  targetNamespace = "http://www.cnpss-dgao.gob.mx/") 
public class Wsp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.cnpss-dgao.gob.mx/", "wsp");
    public final static QName WspSoap12 = new QName("http://www.cnpss-dgao.gob.mx/", "wspSoap12");
    public final static QName WspSoap = new QName("http://www.cnpss-dgao.gob.mx/", "wspSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/ETI2JUGS/Documents/ProyectoSaludWorkSpace/consultafpgc-cliente/src/main/resources/wsdl/wsp.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Wsp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/ETI2JUGS/Documents/ProyectoSaludWorkSpace/consultafpgc-cliente/src/main/resources/wsdl/wsp.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Wsp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Wsp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wsp() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Wsp(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Wsp(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Wsp(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns WspSoap
     */
    @WebEndpoint(name = "wspSoap12")
    public WspSoap getWspSoap12() {
        return super.getPort(WspSoap12, WspSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WspSoap
     */
    @WebEndpoint(name = "wspSoap12")
    public WspSoap getWspSoap12(WebServiceFeature... features) {
        return super.getPort(WspSoap12, WspSoap.class, features);
    }
    /**
     *
     * @return
     *     returns WspSoap
     */
    @WebEndpoint(name = "wspSoap")
    public WspSoap getWspSoap() {
        return super.getPort(WspSoap, WspSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WspSoap
     */
    @WebEndpoint(name = "wspSoap")
    public WspSoap getWspSoap(WebServiceFeature... features) {
        return super.getPort(WspSoap, WspSoap.class, features);
    }

}
