package ru.Shiakhmetov.employment;

public class Name {
    String name;
    String surname;
    String patronymic;

    
    public boolean setFullName(String line){
        boolean searchFlag = false;
        String[] parts;
        
        parts = line.isEmpty() ? new String[0] : line.split("\\s+");
        searchFlag = parts.length >=1 && parts.length <= 3 ;

        if (parts.length == 1){
            name = parts[0];
        }
        else if(parts.length == 2){
            surname = parts[0];
            name = parts[1];
        }
        else if(parts.length == 3){
            surname = parts[0];
            name = parts[1];
            patronymic = parts[2];
        }

        return searchFlag;
    }

    public String getFullName(){
        return surname + name + patronymic;
    }

    
}
