import java.net.URLConnection;

public class Xxe(){
String url = "http://10.14.49.6:8000";
String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
String param1 = "Hello";
String param2 = "World!";
     
     public void main(){
String query = String.format("param1=%s&param2=%s", 
     URLEncoder.encode(param1, charset), 
     URLEncoder.encode(param2, charset));
     
}
}
