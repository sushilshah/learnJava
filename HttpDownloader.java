package net.codejava.networking;
 
import java.io.IOException;
 
public class HttpDownloader {
 
    public static void main(String[] args) {
        String fileURL = "http://jdbc.postgresql.org/download/postgresql-9.2-1002.jdbc4.jar";
        String saveDir = "E:/Download";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}