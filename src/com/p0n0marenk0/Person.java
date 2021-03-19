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

public class Person {

    private String fullName;
    private String name;
    private String secondName;
    private String surname;
    private int age;

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(String name, String secondName, String surname, int age) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
    }

    public Person(String fullName) {
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                setSurname(words[i]);
            } else if (i == 1) {
                setName(words[i]);
            } else if (i == 2) {
                setSecondName(words[i]);
            }
        }
        this.fullName = fullName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
