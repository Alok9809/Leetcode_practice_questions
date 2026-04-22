class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> l = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            
            for(int j = 0;j<dictionary.length;j++){
                if(diff(queries[i],dictionary[j])<=2){

                    l.add(queries[i]);
                    break;
                }
                
            }

        }
        return l;
    }
    public int diff(String word1,String word2){
        int count = 0;
        
        for(int i =0;i<word1.length();i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                count++;
            }
        }return count;
    }
}