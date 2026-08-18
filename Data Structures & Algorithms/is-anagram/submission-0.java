class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        if(s.length()!= t.length()){
            return false;
        }else{
            for (char ch : s.toCharArray()) {
            arr1.add(ch);
        }
        for (char ch : t.toCharArray()) {
            arr2.add(ch);
        }
        }
        for(int i = 0; i < arr1.size(); i++){
            for(int j = 0; j < arr2.size(); j++){
                if(arr1.get(i) == arr2.get(j)){
                    arr1.remove(i);
                    arr2.remove(j);
                    i--;
                    break;
                }
            }
        }
        if(arr1.isEmpty() && arr2.isEmpty()) return true;
        return false;

    }
}
