import java.time.LocalDate;
import java.time.Period;

public class FirstChild implements Child {

    public static final int BASE_FIRSTCHILD_ALLOWANCE = 9209;
    private LocalDate birthdate;
    private Parent parent;

    public FirstChild(LocalDate birthdate, Parent parent) {
        this.birthdate = birthdate;
        this.parent = parent;
    }

    @Override
    public int getAmountOfBaseAllowance() {
        if (parent.isDadSelfemployed()) {
            return 6179;
        } else {
            return BASE_FIRSTCHILD_ALLOWANCE;
        }
    }

    public int getAgeAllowance() {
        if (getAge() >= 0 && getAge() <= 5) {
            return 0;
        } else if (getAge() >= 6 && getAge() <= 11) {
            return 1604;
        } else if (getAge() >= 12 && getAge() <= 17) {
            return 2443;
        } else {
            return 2816;
        }
    }

    public int getUnemployedOrPensionedAddition() {
        if (parent.isUnemployed() || parent.isPensioned()) {
            return 4688;
        } else {
            return 0;
        }
    }

    public int getDisabledAddition() {
        if (parent.isDisabled()) {
            return 4688;
        } else {
            return 0;
        }
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }
}
