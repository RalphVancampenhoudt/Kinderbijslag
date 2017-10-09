import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

public class FamilyAllowanceTest {

    Parent regularParent = new Parent(false,  false,  false, false, false);
    Parent unemployedParent = new Parent (true, false, false, false,    false);

    @Test
    public void calculateAllowance_GivenAFirstChildAge6_ShouldReturn108_13() throws Exception {
        int expected = 10813;

        Child firstchild = new FirstChild(LocalDate.of(2011, 4, 8), regularParent);

        int actual = AllowanceCalculator.calculateAllowance(firstchild);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void calculateAllowance_GivenAFirstChildAge12_ShouldReturn116_52() throws Exception {
        int expected = 11652;

        Child firstchild = new FirstChild(LocalDate.of(2005, 9, 6), regularParent);

        int actual = AllowanceCalculator.calculateAllowance(firstchild);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void calculateAllowance_GivenAFirstChildAge12AndUnemployedParent_ShouldReturn163_40() throws Exception {
        int expected = 16340;

        Child firstchild = new FirstChild(LocalDate.of(2005, 9, 6), unemployedParent);

        int actual = AllowanceCalculator.calculateAllowance(firstchild);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

}