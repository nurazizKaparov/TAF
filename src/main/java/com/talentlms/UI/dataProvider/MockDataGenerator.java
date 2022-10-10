package com.talentlms.UI.dataProvider;

import com.github.javafaker.Faker;

public class MockDataGenerator {

    Faker faker = new Faker();

    public String generateMockFirstName(){
        return faker.name().firstName();
    }

    public String generateMockLastName(){
        return faker.name().lastName();
    }

    public String generateMockEmail(){
        return faker.internet().emailAddress();
    }

    public String generateMockUsername(){
        return faker.name().username();
    }
}
