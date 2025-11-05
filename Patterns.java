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
        int row = 0; 
        while (row<rows)
        {
            row++;
            int numbers = 0;
            while (numbers<row)
            {
                System.out.print(row);
                numbers++;
            }
            System.out.println();
        }
    }
    public static void EO (int maxE)
    {
        String letter = "E";
        if (maxE % 2 == 0)
        {
            letter = "O";
        }
    }
    public static void main (String [] args){
    stars(8);
    triangle(5);
    }
}

