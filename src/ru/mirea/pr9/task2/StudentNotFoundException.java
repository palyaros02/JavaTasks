package ru.mirea.pr9.task2;

class StudentNotFoundException extends RuntimeException implements LabClassUI {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
