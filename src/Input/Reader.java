package Input;

import java.util.Scanner;
import java.lang.Integer;

public class Reader {
    Scanner reader;

    public Reader(){
      reader = new Scanner(System.in);
    }

    public int readInt(String message){
        boolean flag = true;
        while(flag){
            System.out.print(message);
            String line = reader.nextLine();
            try{
                return Integer.parseInt(line.trim());
            }
            catch (NumberFormatException e){
                System.out.println("Введите целое число");
            }
        }
    }

    public String readLine(){
        return reader.nextLine();
    }

}