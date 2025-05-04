

public class Checker {
    private String regex = ("mon|tue|wed|thu|fri|sat|sun");
    private String regexL = ("[aeiou]*");
    private String regexT = ("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");

    public boolean isDayOfWeek(String string) {
        if (string.matches(this.regex)) {
            return true;
        }else
            return false;
    }

    public boolean allVowels(String string) {
        if (string.matches(this.regexL)) {
            return true;
        }else
            return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches(this.regexT)) {
            return true;
        }else
            return false;
    }
}
