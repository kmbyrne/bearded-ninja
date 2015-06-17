import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kevin.Byrne on 6/16/2015.
 */
public class MaxContSub {

    public int findMaximumValueContiguousSubsequence(int[] array){
        Map<String, Integer> curr = null;
        Map<String, Integer> best = null;
        for(int i = 0; i < array.length; i++){
            if(null == curr){
                curr = new HashMap<String, Integer>();
                curr.put("start", i);
                curr.put("end", i);
                curr.put("total", array[i]);
            } else {
                if(curr.get("total") + array[i] > curr.get("total")){
                    curr.put("end", i);
                    curr.put("total", curr.get("total") + array[i]);
                } else {
                    curr = null;
                }
            }
            if(null != curr){
                if(null == best){
                    best = curr;
                } else if(best.get("total") < curr.get("total")){
                    best = curr;
                }
            }
        }

        System.out.format("Start:%d, end:%d, total:%d\n", best.get("start"), best.get("end"), best.get("total"));
        return best.get("total");
    }

    public int[] findLongestIncreasingSubsequence(int[] array){
        ArrayList<Integer> rval = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(rval.size() < 1){
                rval.add(array[])
            }
        }
    }
}

