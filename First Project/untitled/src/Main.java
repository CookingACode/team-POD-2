// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.println("first line from app!");
        //System.out.println("second line of the app");
        double[] leftval = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightval = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] Opcodes = {'d', 'a', 's', 'm'};
        double[] results = new double[Opcodes.length];

        for (int i = 0; i < Opcodes.length; i++) {
            results[i] = execute(Opcodes[i], leftval[i], rightval[i]);

        }  //for the switch
    }


    static double execute(char Opcode, double leftval, double rightval) {
        double result;
        switch (Opcode) {
            case 'a':
                result = leftval + rightval;
                break;
            case 'd':
                result = leftval / rightval;
                break;
            case 's':
                result = leftval - rightval;
                break;
            case 'm':
                result = leftval * rightval;
                break;
            default:
                System.out.println("Invalid Opcode: " + Opcode);
                result = 0.0d;


        }
        return result;
        for(double currentresult : result)
            System.out.println(currentresult);


    }
}
