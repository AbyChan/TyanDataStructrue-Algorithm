public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        Map<String, Integer> dict = new HashMap<>();
        for (String l : L) {
            if (!dict.containsKey(l)) {
                dict.put(l, 0);
            }
            
            dict.put(l, dict.get(l)+1);
        }
        
        int len = L[0].length();
        int lenSum = len*L.length;
        
        List<Integer> list = new ArrayList<>();
        
        traverseS : for (int i=0; i<=S.length()-lenSum; i++) {
            Map<String, Integer> dictCopy = new HashMap<>(dict);
            
            for (int j=i; j<i+lenSum; j=j+len) {
                String s = S.substring(j, j+len);
                Integer num = dictCopy.get(s);
                if (num==null || num==0)
                    continue traverseS;
                num--;
                dictCopy.put(s, num);
            }
            
            list.add(i);
        }
        
        return list;
    }
}
