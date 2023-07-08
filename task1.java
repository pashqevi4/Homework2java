package homework2java;

import java.util.Scanner;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
// select * from students where 'name=Ivanov' and 'country=Russia' and...
public class task1 {
    public static void main(String[] args) {
        where();
    }
    static void where(){
        StringBuilder sBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите страну:");
        String country = scanner.nextLine();
        System.out.println("Введите город:");
        String city = scanner.nextLine();
        System.out.println("Введите возраст:");
        String age = scanner.nextLine();

        if ((surname == "Ivanov") && (country == "Russia") && (city == "Moscow")){
            sBuilder.append(surname).append(name).append(country).append(city).append(age);
            System.out.println(sBuilder.toString());
        }
        scanner.close();
        System.out.println(sBuilder.toString());

    }
}
