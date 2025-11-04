// Kuang Miao
//11 4 2025
// This project is meant to print out the assigned patterns
public class Patterns{

    public static void stars (int rows)
    {
        String stars = "*";
        int row = 0;
        while (row<rows)
        {
            row++;
            System.out.println(stars);
            stars += "**";
          }
    }
    public static void triangle (int rows)
    {
        int numbers = 1;
        int row = 0; 
        int i = 0;
        while (row<rows)
        {
            row++; 
            System.out.println(numbers);
            numbers++;
        }
    }
    public static void main (String [] args){
    stars(8);
    triangle(5);
    }
}
