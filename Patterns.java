// Kuang Miao
// 11 4 2025
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
        int i = 0; 
        while (i<rows)
        {
            i++;
            int numbers = 0;
            while (numbers<i)
            {
                System.out.print(i);
                numbers++;
            }
            System.out.println();
        }
    }
    public static void odds (int start)
    {
            for (int number = start; number>0; number -=2)
            {
                for (int i = 0; i < number; i++)
                {
                    System.out.print(number);
                }
                System.out.println();
            }
        
    }
    
    public static void EO (int maxE)
    {
        String letter = "E";
        if(maxE%2==0){
            letter = "O";
        }
        for (int i = 0; i < maxE; i++)
        {
          
                for (int j = 0; j <= i; j+=1)
                {
                 
                        System.out.print(letter);
                        
                
                }
                if(letter.equals("E")){
                    letter = "O";
                }
                else{
                    letter = "E";
                }
                System.out.println();
            }
        
        for (int i = maxE-2; i >= 0; i--)
        {
          
                for (int j = 0; j <= i; j++)
                {
                 
                        System.out.print(letter);
                        
                
                }
                if(letter.equals("E")){
                    letter = "O";
                }
                else{
                    letter = "E";
                }
                System.out.println();
            }
    }
    public static void pyramid(int rows)
    {
        int length = rows * 2 - 1;
        for (int i = 1; i<=rows; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.print(i);
            }
            System.out.println();
            length -=2;
        }
    }
    public static void main (String [] args){
    stars(8);
    triangle(5);
    odds(9);
    EO(5);
    pyramid(5);
    }
}
// outer loop, how many rows there are
// inner loop, how many letters/numbers I should print on each row

