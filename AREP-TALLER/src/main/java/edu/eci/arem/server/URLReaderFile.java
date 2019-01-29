package edu.eci.arem.server;


import java.io.*;
import java.net.*;
import java.util.*;

public class URLReaderFile {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digita una URL");
        String urluserpath = in.readLine();
        URL urluser = new URL(urluserpath);
        in = new BufferedReader(new InputStreamReader(urluser.openStream()));
        String DATA = "";
        String line = null;
        while ((line = in.readLine()) != null) {
            DATA += line;
        }
        String ruta = "prueba.html";
        File file = new File(ruta);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(DATA);
        bw.close();

    }


}



