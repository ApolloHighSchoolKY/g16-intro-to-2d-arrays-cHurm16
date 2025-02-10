import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray= new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;
    
    /*
     * 1 2 3
     * 4 5 6
     */

     System.out.println(Arrays.toString(ray));

     //Print the first array in the array ray 
     //System.out.println(ray[0]);
     System.out.println(Arrays.toString(ray[0]));
     System.out.println(Arrays.toString(ray[1]));

     for (int row=0; row<ray.length; row++)
     {
      System.out.println(Arrays.toString(ray[row]));
     }
     //Change ever value in the 2D array to 7 
     //You must use loopS

     //ray[#].length represents the number of colums in each array in the array
     for (int row=0;row<ray.length;row++)
     {
     for (int col=0; col<ray[row].length; col++)
     {
       ray[row][col] = 7;
     }
     }
     
    for (int row=0;row<ray.length;row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Fill the array with random numbers from 0-10 inclusive 
    for (int row =0; row<ray.length; row++)
    for (int col=0; col<ray[row].length; col++)

    {
      ray[row][col] =(int)(Math.random()*11+ 0);
    }

    System.out.println("");

    for (int row =0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    int sum = 0;

    for (int row =0; row<ray.length; row++)
    {
        sum =0;
      
      for (int col=0; col<ray[row].length; col++)
        {
          sum += ray[row][col];
        }
      System.out.println("The sum of row "+row + " is: " +sum);
    }
   
    System.out.println("\n\n\nHomework assignment");
    //Add up the colums of each row using for each loops...

    int add;
    for(int[] row:ray)
    {
      add=0;

      for(int col:row)
      {
        add+=col;
      }

      System.out.println("The sum of row "+row + " is: " +add);
    }
  }
}
