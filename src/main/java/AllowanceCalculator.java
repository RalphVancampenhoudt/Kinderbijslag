public class AllowanceCalculator {

    public static int calculateAllowance(Child kind) {
        return kind.getAmountOfBaseAllowance() + kind.getAgeAllowance() + kind.getDisabledAddition() + kind.getUnemployedOrPensionedAddition();

    }
}
