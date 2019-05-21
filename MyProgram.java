public class MyProgram extends ConsoleProgram
{
    public boolean canGo = true;//If the user ever types in stop at any time, the program will stop
    public void run()
    {
        System.out.println("Note: if a value is returned as a 0, most likely the user typed the wrong operation.");
        System.out.println("Please note that the operations are: multiply,divide,add, and subtract");
        while(canGo == true)
        {
            double v1 = readDouble("Please enter a value: ");
            System.out.println("During operation selection, you can also type stop to kill the program.");
            String c = readLine("Which operation? ");
            double v2 = readDouble("Please enter your second value: ");
            System.out.println("Your result is: " + Calc(v1,v2,c));
        }
    }
    
    public double Calc(double value1, double value2, String choice)
    {
        switch(choice)
        {
            case "multiply":
            case "Multiply":
                return value1 * value2;
            case "divide":
            case "Divide":
                return value1 / value2;
            case "add":
            case "Add":
                return value1 + value2;
            case "subtract":
            case "Subtract":
                return value1 - value2;
            case "stop":
            case "Stop":
                canGo = !canGo;
                break;
                
        }
        return 0;
        
    }
}