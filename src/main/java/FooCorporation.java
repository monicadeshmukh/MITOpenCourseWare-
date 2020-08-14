/**
 * Assignment 2
 * Implemenetd by Monica Deshmukh
 * 8/14/2020
 */

/**
 * Write a method that takes the base pay and hours worked as parameters, and prints the total pay or an error. Write a main
 * method that calls this method for each of these employees:
 */
public class FooCorporation {
    public static void main(String[] args) {
        /**
         * Test cases
         *            Base Pay Hours Worked
         * Employee 1   $7.50         35
         * Employee 2   $8.20         47
         * Employee 3   $10.00        73
         *
         */
        Double basePay = null;
        Long hoursWorked = 0L;
        int emloyeeNo;
        Double amountPaid = null;

        for (int testCase = 1; testCase <=3; testCase++){

            switch (testCase) {
                case (1): {
                    //Employee 1
                    basePay = 7.50;
                    hoursWorked = 35L;
                    emloyeeNo = testCase;
                    amountPaid = calculatePay(basePay, hoursWorked);
                    if (amountPaid != null)
                        System.out.println("Employee " + emloyeeNo + " gets paid $" + amountPaid);
                    break;
                }
                case (2): {
                    //Employee 2
                    basePay = 8.20;
                    hoursWorked = 47L;
                    emloyeeNo = testCase;
                    amountPaid = calculatePay(basePay, hoursWorked);
                    if (amountPaid != null)
                        System.out.println("Employee " + emloyeeNo + " gets paid $" + amountPaid);

                    break;
                }
                case (3): {
                    //Employee 3
                    basePay = 10.00;
                    hoursWorked = 73L;
                    emloyeeNo = testCase;
                    amountPaid = calculatePay(basePay, hoursWorked);
                    if (amountPaid != null)
                        System.out.println("Employee " + emloyeeNo + " gets paid $" + amountPaid);

                    break;
                }
            }
        }




    }

    /**
     * An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
     * For every hour over 40, they get overtime = (base pay) × 1.5.
     * The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
     * If the number of hours is greater than 60, print an error message.
     * @param basePay
     * @param hoursWorked
     * @return: amount to be paid including salary and overtime
     */
    static Double calculatePay(Double basePay, Long hoursWorked) {
        Double amountPaid = null;
        if (hoursWorked > 60){
            System.out.println("Maximum number of hours allowed is 60 hours. Please re-enter hours worked.");
            return amountPaid;
        }
        if (basePay < 8.0){
            System.out.println("Minimum wage required is $8.0 per hour. Please re-enter base pay.");
            return amountPaid;
        }
        if (hoursWorked > 40) {
            Double overtime = basePay * 1.5 * (hoursWorked - 40);
            Double salary = basePay * 40;
            amountPaid = overtime + salary;
        }
        else    //hoursWorked <= 40 hours
            amountPaid = basePay * hoursWorked;

        return amountPaid;
    }
}
