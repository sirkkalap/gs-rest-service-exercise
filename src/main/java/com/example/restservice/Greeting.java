package com.example.restservice;

public record Greeting(long id, String content) {
    // This is a record class in Java, which is a special kind of class that is used to hold data.
    // It automatically generates the constructor, getters, equals, hashCode, and toString methods.
    // The 'id' field is of type long and the 'content' field is of type String.
}
