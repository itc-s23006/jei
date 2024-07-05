public class d49Q26kadai {                          
    public static void main(String[] args) {    
        if (args.length > 0) {
            try {
                double n = Double.parseDouble(args[0]);
                d49Q26kadai obj = new d49Q26kadai();
                obj.show(n);                      
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } else {
            System.out.println("Please provide a number as an argument.");
        }
    }                                           
                                                
    void show(double n) {                       
        System.out.println("value is " + n);
    }                                           
}

