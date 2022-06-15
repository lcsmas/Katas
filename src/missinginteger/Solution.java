package missinginteger;

import java.util.*;

public class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                set.add(A[i]);
            }
        }
        if(set.size() == 0) {
            return 1;
        }
        List<Integer> list = new ArrayList<>(set);

        list.sort(Comparator.naturalOrder());
        int j = 1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > j){
                return j;
            }
            j++;
        }
        return list.get(list.size()-1)+1;
    }
}
