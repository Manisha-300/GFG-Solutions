class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           
            if(max<arr[i] ){
                max=arr[i];
              
            }if(min>arr[i]){
                min=arr[i];
            }
            
        }
        ArrayList<Integer> li=new ArrayList<>();
        li.add(min);
        li.add(max);
        
        return li;
    }
}
