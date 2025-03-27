package Quiz1.sub;



import Quiz1.A21;
import Quiz1.A22;

public class R21 {
    public static void main(String[] args) {
        // Calculate rectangle area
        A21 rectangle = new A21();
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);

        // Determine month name
        A22 monthInfo = new A22();
        int monthNumber = monthInfo.getMonth();

        String monthName;
        switch(monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month (" + monthNumber + ")";
        }
        System.out.println("Month: " + monthName);
    }
}