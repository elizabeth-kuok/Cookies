package edu.ldsbc.assignment6;

public class NotFoundException extends Exception {

    String message;

    public NotFoundException(String message) {
        this.message = message;
    }

    public String toString() {
        return "NotFoundException Occurred: " + message;
    }
}
