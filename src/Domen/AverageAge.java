package Domen;

import java.util.ArrayList;
import java.util.List;

public class AverageAge<T extends Person> {

        public static <T extends Person> void averageAge2(ArrayList<T> persons){
            int count = 0;
            int ages = 0;
        
         for (int i = 0; i < persons.size(); i++){
                count++;
                ages += persons.get(i).getAge();
            }
            
            //Вычисление среднего возраста и возврат результата
            int average = ages / count;
            System.out.println("Средний возраст равен - " + average + "лет");
        }
        
    }