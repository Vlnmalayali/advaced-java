import java.io.*;
import java.net.*;
public class MyClient
{
public static void main(String[] args)
{
try
{
Socket soc=new Socket("localhost",6666);
ObjectOutputStream out=new ObjectOutputStream(soc.getOutputStream());
out.writeUTF("hello you have been caught");
out.flush();
out.close();
out.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
