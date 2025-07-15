class FindPair{
  public static void main(String[] args){
    int arr[]={4,6,9,2,1,6};
    int target=12;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==target){
          System.out.println("("+arr[i]+","+arr[j]+")");
        }
      }
    }
  }
}
