public class One{
    public static void main(String agrs[]){
        int arr[]=new int[]{1,1,0,0,1,1,1,0,0,1,1,1,1,1,1};
        int count=1;
        int maxC=1;
       
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==1 && arr[i+1]==1){
                count++;
             }else{
                if(count>maxC){
                    maxC=count;
                }
                count=1;
             }
        }
        if(count > maxC)
        {
            maxC = count;
        }
        System.out.println(maxC);
    }
}
