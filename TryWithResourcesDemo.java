/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package maria.trywithresourcesdemo;

/**
 *
 * @author STUDENT
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class TryWithResourcesDemo {

    public static void printFirstLine(String path) {
        
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {

            String line = br.readLine();
            System.out.println(line);

        } catch (IOException e) {
            
            System.out.println("Could not read file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printFirstLine("data.txt");
    }
}


    
