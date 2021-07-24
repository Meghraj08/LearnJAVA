package Exceptions;

public class NewError {
    public static void main(String[] args) throws AgeInvalidException {
        ErrorHandling errorHandling = new ErrorHandling();
        try {
            errorHandling.ageCheck(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            errorHandling.ageCheck(10);
        } catch (AgeInvalidException e) {
            System.out.println(e);
        }
    }
}
