import java.io.*;
class PrincipalRateTime {
    public static void main(String[] args) {
        Float principalAmount = new Float(0); 
        Float RateOfTnterest = new Float(0);
        int NumberOfYear = 0;
        try {
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter Principal Amount:");
            System.out.flush();
            tempString = in.readLine();
            principalAmount = Float.valueOf(tempString);
            System.out.println("Enter Rate Of Interest:");
            System.out.flush();
            tempString = in.readLine();
            RateOfTnterest = Float.valueOf(tempString);
            System.out.println("Enter Number of Year:");
            System.out.flush();
            tempString = in.readLine();
            NumberOfYear = Integer.parseInt(tempString);
            float interestTotal = principalAmount*RateOfTnterest*NumberOfYear;
            System.out.println("Total interest =" + interestTotal);
         } catch(Exception ex)
         {}
    }
}
