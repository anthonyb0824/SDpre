public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 1;
    int sum = 0;

    while(counter <=20){
      sum = sum + counter;
      if(sum == 210){
        System.out.println(sum);
      }
      else{
        counter++;
      }
    }
  }
}
