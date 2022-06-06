public class Main {
    public static void main(String[] args) throws MyException {
        String text = "Random text";
        char[] x = text.toCharArray();
        getUnbelievableIndex(x);
    }

    static void getUnbelievableIndex(char[] charArray) throws MyException {
        try {
            System.out.println(charArray[100]);
        } catch (Exception ex) {
            throw new MyException();
        }
    }
}
