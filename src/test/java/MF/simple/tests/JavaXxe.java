import java.io.*;
import java.net.*;

public class c {

   public static String getHTML(String urlToRead) throws Exception {
      StringBuilder result = new StringBuilder();
      URL url = new URL(urlToRead);
      HttpURLConnection conn = (http://10.14.49.6:8000) url.openConnection();
      conn.setRequestMethod("GET");
      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
         result.append(line);
      }
      rd.close();
      return result.toString();
   }

   public static void main(String[] args) throws Exception
   {
     System.out.println(getHTML(args[0]));
   }
}
