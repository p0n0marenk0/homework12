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

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {
    private static final List<Person> listOfPerson = new ArrayList<>();
    public static void main(String[] args) {
        Person person = new Person("Иван","Иванович","Иванов", 22);
        listOfPerson.add(person);
        System.out.println(person.toString());
        System.out.println(returnFullName());
        System.out.println(returnFullNameAndNotFull());
    }

    private static String returnFullName() {
        return listOfPerson.get(0).getSurname() + " " + listOfPerson.get(0).getName() +
                " " + listOfPerson.get(0).getSecondName() + " ";
    }

    private static String returnFullNameAndNotFull() {
        return listOfPerson.get(0).getSurname() + " " + listOfPerson.get(0).getName().charAt(0) +
                ". " + listOfPerson.get(0).getSecondName().charAt(0) + ". ";
    }
}
