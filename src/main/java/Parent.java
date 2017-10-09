public class Parent {

    private boolean isUnemployed = false;
    private boolean isPensioned = false;
    private boolean isSingleParent = false;
    private boolean isDisabled = false;
    private boolean isDadSelfemployed = false;


    public Parent(boolean isUnemployed, boolean isPensioned, boolean isSingleParent, boolean isDisabled, boolean isDadSelfemployed) {
        this.isUnemployed = isUnemployed;
        this.isPensioned = isPensioned;
        this.isSingleParent = isSingleParent;
        this.isDisabled = isDisabled;
        this.isDadSelfemployed = isDadSelfemployed;
    }

    public boolean isUnemployed() {
        return isUnemployed;
    }

    public boolean isPensioned() {
        return isPensioned;
    }

    public boolean isSingleParent() {
        return isSingleParent;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public boolean isDadSelfemployed() {
        return isDadSelfemployed;
    }
}
