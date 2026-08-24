class Solution {
    public int[][] merge(int[][] ins) {
        Arrays.sort(ins,(a,b) -> a[0]-b[0]);
        List<int[]>res=new ArrayList<>();
        for(int[] i: ins){
            if(res.isEmpty() || res.get(res.size()-1)[1]<i[0])
            res.add(i);
            else
            res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1], i[1]);
        }
        return res.toArray(new int[res.size()][]);
    }
}