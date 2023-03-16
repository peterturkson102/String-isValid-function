class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
        boolean isValid = true;
        int count= 1;
        Map<Character, Integer> validMap = new HashMap<>();
        for(int asd = 0;asd<s.length();asd++){
            if(!validMap.containsKey(s.charAt(asd))){
                validMap.put(s.charAt(asd), 1);
            }else{
                validMap.put(s.charAt(asd), validMap.get(s.charAt(asd))+1);
            }
        }
        int min = Collections.min(validMap.entrySet(),Map.Entry.comparingByValue()).getValue();
        int max = Collections.max(validMap.entrySet(),Map.Entry.comparingByValue()).getValue();
        int maxcount = 0;
        int mincount = 0;
        for(Map.Entry<Character, Integer> aw: validMap.entrySet()){
            if(aw.getValue()==min){
                mincount++;
            }else{
                maxcount++;
            }
        }
        int constantVal = maxcount>mincount?max:min;
        for(Map.Entry<Character, Integer> ad: validMap.entrySet()){
            if(ad.getValue()!=constantVal&& count ==1){
                count--;
                if(ad.getValue()-1>constantVal){
                    isValid=false;
                }
            }else if(ad.getValue()!=constantVal&& count !=1){
                isValid=false;
            }
        }
     
     
     return isValid == true? "YES":"NO";   
    }

}
