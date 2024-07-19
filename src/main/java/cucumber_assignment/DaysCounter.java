package cucumber_assignment;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;


public class DaysCounter {

    public static int count(String birthDate) {

            try {
                LocalDate birthdateLocalDate = LocalDate.parse(birthDate);
                LocalDate currentDate = LocalDate.now();
                Period range = Period.between(birthdateLocalDate, currentDate);

                int ageInDays = range.getDays();
                System.out.println("The age in number of days is: " + ageInDays);
                if (ageInDays >= 0) return ageInDays;

                    else System.out.println("Birthdate should not be in the future."); return -1;

            }

            catch (DateTimeException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
                return -1;
            }


    }
}
