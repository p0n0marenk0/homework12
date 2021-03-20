/*1) Написать класс Person, у которого есть следующие поля:
- Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович",
 и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."

2*) Дата рождения задается как строка типа "18.12.1985"
- добавить метод который выводит количество полных лет
*/
package com.p0n0marenk0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonUtil {
    private static final List<Person> listOfPerson = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        Person person = new Person("Иван", "Иванович", "Иванов", "18.12.1985");
        listOfPerson.add(person);
        System.out.println(person.toString());
        for (int i = 0; i < listOfPerson.size(); i++) {
            System.out.println(returnFullName(i));
            System.out.println(returnFullNameAndNotFull(i));
            System.out.println(returnAge(listOfPerson.get(i).getDateOfBirth()));
            try {
                returnAge(listOfPerson.get(i).getDateOfBirth());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private static String returnFullName(int index) {
        return listOfPerson.get(index).getSurname() + " " + listOfPerson.get(index).getName() +
                " " + listOfPerson.get(index).getSecondName() + " ";
    }

    private static String returnFullNameAndNotFull(int index) {
        return listOfPerson.get(index).getSurname() + " " + listOfPerson.get(index).getName().charAt(index) +
                ". " + listOfPerson.get(index).getSecondName().charAt(index) + ". ";
    }

    private static int returnAge(String dateOfBirth) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date docDate = format.parse(dateOfBirth);
        LocalDate docDate1 = docDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate realDate = LocalDate.now();
        return Period.between(docDate1, realDate).getYears();
    }
}


