public class demo {
  public static void main(String[] args) {
    
  int nums[][] = new int [3][];
  nums [0] = new int[4];
  nums [1]= new int[2];
  nums [2]= new int [3];
    nums[0][0]=5;
    nums[0][1]=2;
    nums[0][2]=9;
    nums[0][3]=7;
    nums[1][0]=3;
    nums[1][1]=6;
    nums[2][0]=8;
    nums[2][1]=1;
    nums[2][2]=4;

  /* int nums[][] = {
    {5,2,3,6},
    {8,3},
    {9,5,6}

  }; */


    for(int i = 0; i<=2; i++)
    {
      for (int j =0; j<nums[i].length;j++)
      {
        System.out.print(nums[i][j] +" ");
      }
      System.out.println();
    } 
  }
}