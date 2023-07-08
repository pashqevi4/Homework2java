package homework2java;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
public class task2 {
    public static void main(String[] args) {
        bubble();
        
    }
  
    static void bubble(){
        String path = "log.txt";
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try{
            fileHandler = new FileHandler(path,true);
        }catch(IOException e){
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        try(FileWriter fileWriter = new FileWriter(path, true);){
        fileWriter.write(str);
        fileWriter.flush();
        } catch(Exception e){
            e.printStackTrace();
        }

        int[] arr = {7,22,19,72,4,54,23,7,12,50,66,1,9};
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length-j; i++) {
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                
            }
        }
        return arr;

    }
}
