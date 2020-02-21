package commer.domain;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("${myname:'ll'}")
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
