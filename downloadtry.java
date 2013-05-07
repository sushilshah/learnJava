public class downloadtry{
	public static void main(String [] args){

String word = "Moon";

System.setProperty("http.proxyHost", "172.20.0.100");
System.setProperty("http.proxyPort", "8080");

URL url = new URL("http://introcs.cs.princeton.edu/java/36inheritance/Spaceship.java");
url.openConnection();
InputStream reader = url.openStream();
FileOutputStream writer = new FileOutputStream("t");
byte[] buffer = new byte[153600];
int bytesRead = 0;
while ((bytesRead = reader.read(buffer)) > 0)
{  
    writer.write(buffer, 0, bytesRead);
    buffer = new byte[153600];
}
writer.close();
reader.close();
}
}