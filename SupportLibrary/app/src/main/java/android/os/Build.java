package android.os;

public class Build {
    private static Integer version = 0;

    public static String getRadioVersion() {
        version += 1; // Doesn't make any sense, but hey
        return version.toString();
    }
}
