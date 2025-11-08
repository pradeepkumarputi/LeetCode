class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(
            (a,b)->freq.get(b)-freq.get(a)
        );
        pq.addAll(freq.keySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int count = freq.get(ch);
            while(count-- > 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}