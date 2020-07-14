package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        super(name,age);
        this.name = name;
        this.age = age;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super();
        this.name = "CatName";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
