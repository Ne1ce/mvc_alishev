package ru.alishev.springcourse.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
        private int id;
        @Min(value = 5,message = "Age incorrect")
        private int age;
        @NotEmpty(message = "Name empty")
        @Size(min = 2,max=10,message = "Name 2-30 char")
        private String name;
        @NotEmpty(message = "Email empty")
        @Email(message = "Email incorrect")
        private String email;

        public Person() {

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

        public Person(int id,String name, int age, String email) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
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
    }

