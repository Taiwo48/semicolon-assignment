public class MinimumElement{
 public static void main(String[] args) {
  int [] arr = new int []{19,25,13,4,55,};
  int minimum =arr[0];
  for(int i=0;i<arr.length;i++) {
  if (arr[1] < minimum)
  minimum = arr[i];
}
   System.out.println("minimum number is" + minimum);


}
}