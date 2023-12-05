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
            switch(Opcodes[i]) {
                case 'a':
                    results[i] = leftval[i] + rightval[i];
                    break;
                case 'd':
                    results[i] = leftval[i] / rightval[i];
                    break;
                case 's':
                    results[i] = leftval[i] - rightval[i];
                    break;
                case 'm':
                    results[i] = leftval[i] * rightval[i];
                    break;
                default:
                    System.out.println("Invalid Opcode: " + Opcodes[i]);
                    results[i] = 0.0d;



            }  //for the switch
            }// for the for loop
        for(double currentresult : results)
            System.out.println(currentresult);

        }



}