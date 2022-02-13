public class inchesToMetersTable {
        public static void main(String args[]){
             double inches, meters;
             int count;
             count = 0;

             for (inches=1; inches<=100; inches++) {
                meters = inches / 39.37;
                System.out.println(inches + " inches is " + meters + " meters");
                count++;
                if (count==12){
                        System.out.println();
                        count = 0; //reinicia a contagem
                }
             }
        }
}
