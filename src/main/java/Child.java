import java.time.LocalDate;

public interface Child {

    LocalDate getBirthdate();

    int getAmountOfBaseAllowance();

    int getAgeAllowance();

    int getUnemployedOrPensionedAddition();

    int getDisabledAddition();

}
