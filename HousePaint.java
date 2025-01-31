// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
    public int minCost(int[][] costs) {
       
        int min = Math.min(costs[0][0] , Math.min(costs[0][1],costs[0][2]));
        for(int i = 1 ; i<costs.length ; i++){
            
             costs[i][0] = costs[i][0] + Math.min(costs[i-1][1] , costs[i-1][2]);
             costs[i][1] = costs[i][1] + Math.min(costs[i-1][0] , costs[i-1][2]);
             costs[i][2] = costs[i][2] + Math.min(costs[i-1][0] , costs[i-1][1]);
            
            min = Math.min(costs[i][0] , Math.min(costs[i][1],costs[i][2]));
        }
        
        return min;
    }
}
