package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by total on 15.10.2016.
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:/kik.txt");


           int tmp = inputStream.read();
           int tmp1 = inputStream.read();
           int tmp2 = inputStream.read();
           int tmp3 = inputStream.read();


        System.out.println(tmp + " " + tmp1 + " " + tmp2 + " " + tmp3);
        inputStream.close();
    }
}
