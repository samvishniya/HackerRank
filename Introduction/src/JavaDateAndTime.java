import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     *as of java 8 this is easy using java.time
     *import java.time.LocalDate;
...
//String month = in.next();
int mm = in.nextInt();
//String day = in.next();
int dd = in.nextInt();
//String year = in.next();
int yy = in.nextInt();
in.close();
LocalDate dt = LocalDate.of(yy, mm, dd);
System.out.print(dt.getDayOfWeek());
     *
     *
     */



   public static String findDay(int month, int day, int year) {

        // line below is a custom way to make own calendar
        //Calendar cal = new Calendar.Builder().setDate(year, month-1, day).build();
        
        // this uses gregoriancalendar format, so use this 99% of time
        Calendar calen = new GregorianCalendar(year,month-1,day);

        
        int dayOfWeek = (calen.get(Calendar.DAY_OF_WEEK));

        String result ="";
            switch (dayOfWeek) {
        
        case 1: 
            result = "SUNDAY" ;
            break;
        case 2: 
            result = "MONDAY";
            break;
        case 3: 
            result = "TUESDAY";
            break;
        case 4: 
            result = "WEDNESDAY";
            break;
        case 5:
            result = "THURSDAY";
            break;
        case 6:
            result = "FRIDAY";
            break;
        case 7: 
            result = "SATURDAY";
            break;
        
        }
        return result;
    }

}


public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
