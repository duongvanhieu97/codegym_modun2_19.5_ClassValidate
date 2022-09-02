public class Main {
    private static ValidateClassName validateClassName;
    public static final String[] validClassName = {"C0318G", "A1241H", "P4513G"};
    public static final String[] invalidClassName = {"M0318G", "P0323A", "23414"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className : validClassName) {
            boolean isValid = validateClassName.validate(className);
            System.out.println(className + "is valid " + isValid);
        }
        for (String className : invalidClassName) {
            boolean isValid = validateClassName.validate(className);
            System.out.println(className + " is valid " + isValid);
        }
    }
}
