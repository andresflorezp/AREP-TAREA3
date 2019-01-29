package edu.eci.arem.server;

import java.io.*;
import java.net.*;

public class URLReader {

    public static void main(String[] args) throws MalformedURLException {
        URL google = new URL("https://www.google.co.in/search?\"+ \n" +
                "                           \"q=gnu&rlz=1C1CHZL_enIN71\" + \n" +
                "                           \"4IN715&oq=gnu&aqs=chrome..69i57j6\" + \n" +
                "                           \"9i60l5.653j0j7&sourceid=chrome&ie=UTF\" + \n" +
                "                           \"-8#q=geeks+for+geeks+java");
        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);

            }
        } catch (IOException x) {
            System.err.println(x);
        }*/


        System.out.println("Authority :"+google.getAuthority());
        System.out.println("Path :"+google.getPath());
        System.out.println("Protocol :"+google.getProtocol());
        System.out.println("Host :"+google.getHost());
        System.out.println("Query :"+google.getQuery());
        System.out.println("File :"+google.getFile());
        System.out.println("Ref :"+google.getRef());

    }
}