package util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

public class Payments {
  
  public static final String template= "<bancoazteca><tipoOperacion>%s</tipoOperacion><correoComprador>%s</correoComprador><idSesion>%s</idSesion><idTransaccion>%s</idTransaccion><afiliacion>%s</afiliacion><monto>%s</monto><ipComprador>%s</ipComprador><navegador>%s</navegador><sku>%s</sku></bancoazteca>";
  
  public static final String url = "http://10.50.109.44:9086/BusinessToBusinessWS/services/PB2B?wsdl";
  
  public static final String xml = "<bancoAzteca><eservices><request><canalEntrada>ecommerce</canalEntrada><idterminal>10126</idterminal><tipo_operacion>200\n </tipo_operacion><idTransaccion>TPVV-7043220-1570760800767</idTransaccion></request></eservices></bancoAzteca>\n";

  
  public Payments() {
    // TODO Auto-generated constructor stub
  }
  
  public String getToken() {
    
    HttpClient client = HttpClient.newHttpClient();
    
    HttpRequest request = HttpRequest.newBuilder()
                                       .uri(URI.create(url))
                                       .header("Content-Type", "text/xml;charset=utf-8")
                                       .POST(HttpRequest.BodyPublishers.ofString(xml))
                                       .build();
    try {
    
      HttpResponse <Void> response = client.send(
                                            request, 
                                            HttpResponse.BodyHandlers.discarding());
      
      System.out.println(response.statusCode());
      
    } catch (Exception e) {
    // TODO: handle exception
    }
    
    return null;
  }
  /**
   * 
   * @return un string con el numero random 
   */
  public static  String randomGerardo() {
     
    return new Random()
             .ints(0,9)
             .limit(20)
             .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
             .toString();
    
  } 


  
}
