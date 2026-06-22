class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int n = fruits.length;
        int count = 0;
        
        

        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<n){
            int fr = fruits[high];
            map.put(fr,map.getOrDefault(fr,0)+1);
            while(map.size()>2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0) map.remove(fruits[low]);
                low++;
            }
            
                count = Math.max(count,high-low+1);
            
            high++;



        
        }return count;
    }
}