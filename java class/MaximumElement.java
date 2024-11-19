public class MaximumElement{
 public static void main(String[] args) {
  int [] arr = new int []{19,25,13,4,55,};
  int maximum =arr[0];
  for(int i=0;i<arr.length;i++) {
  if (arr[1] > maximum)
  maximum = arr[i];
}
   System.out.println("maximum number is" + maximum);


}
}