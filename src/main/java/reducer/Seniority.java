package reducer;

/**
 * Created by Jeka on 27/08/2015.
 */
public enum Seniority {
    JUNIOR(0,14000), MIDDLE(14001,21000),SENIOR(21001,30000);

    private final int max;
    private final int min;

    Seniority(int min, int max) {
        this.min = min;
        this.max= max;
    }

    public static Seniority whoAreYou(int salary) {
        Seniority[] seniorities = values();
        for (Seniority seniority : seniorities) {
            if (seniority.min < salary && salary < seniority.max) {
                return seniority;
            }
        }
        throw new RuntimeException("no such seniority");
    }
}
