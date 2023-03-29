class Main {
  public static void main(String[] args) {
    int len = 6;

    for(int i=0;i<len;i++)
      {
        for(int j=0;j<i;j++)
          System.out.print("*");
        System.out.println();
      }


    for(int a=0;a<5;a++){
      for(int b=0; b<5-a;b++)
          System.out.print(" ");
        for(int b=0;b<a+1;b++)
          System.out.print("*");
        System.out.println();
      }
      
  }
}