import java.io.*;
import java.net.*;

public class JavaXxe
{
  public void main()
  {
String urlString = "http://10.14.49.6:8000/";
URL url = new URL(urlString);
URLConnection conn = url.openConnection();
InputStream is = conn.getInputStream();
// Do what you want with that stream
}}
