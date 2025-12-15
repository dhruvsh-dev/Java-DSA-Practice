class Solution{
  public void checkNumber(int n){
    if(n<0){
      System.out.println("Negative");
    }
    if(n>0){
      System.out.println("Positive");
    }
    if(n=0){
      System.out.println("Zero");
    }
    if(n%2==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}
