package pricing.domain;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final Gender gender;
    private final String mobileNumber;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, Gender gender, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public Gender getGender() {
        return gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
