package org.example.models;

import javax.validation.constraints.*;

/**
 * @author Vladislav Osada
 * @date 08.06.2023 1:10
 */


public class Person {

    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно содержать от 2 до 30 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя должно содержать только буквы")
    private String name;

    @Min(value = 0,message = "Укажите правельный возраст")
    private int age;

    @NotEmpty(message = "Email не должен быть пустым")
    @Email(message = "Введите валидный email")
    private String email;



    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
