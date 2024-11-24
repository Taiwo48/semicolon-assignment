public class IndexArray {
  public static void main(String[] args) {
   int[] array = {1,2,3,4,5,};
}

   public static int findIndex(int[] arr,int value){
    for(int i=0;i<arr.length;i++){
     if (arr[i] == value) {
      return i;
}
}

    return -1;
}
}