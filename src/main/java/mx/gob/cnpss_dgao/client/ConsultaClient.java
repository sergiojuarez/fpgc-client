package mx.gob.cnpss_dgao.client;

import mx.gob.cnpss_dgao.Wsp;
import mx.gob.cnpss_dgao.WspSoap;

public class ConsultaClient {
	
	
		public ConsultaClient() {
		}
		public static void main(String str[]) throws Exception {
//		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.
//		newInstance();
//		Client client = dcf.createClient("http://www.cnpss-dgao.gob.mx/WSDGAO_GESTION/wsp.asmx?WSDL");
//		//Object order = Thread.currentThread().
//				Endpoint endpoint = (Endpoint) client.getEndpoint();
//				
//		//System.out.println("Response is " + response[0]);
//				
				Wsp  myServ = new Wsp();
				WspSoap  fgpcService  = myServ.getWspSoap();   

				
				String resultado = fgpcService.consultaDatos("09115143216","HERR741227HDFRMF01", "", "", "", "", "", "USPRUEBA");
				
			
			
						System.out.println("The order ID is " + resultado);		
				
				
		}
		
		
		}
	
 

	