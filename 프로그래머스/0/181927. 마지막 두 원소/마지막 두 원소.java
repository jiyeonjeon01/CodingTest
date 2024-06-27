import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] new_list = Arrays.copyOf(num_list, num_list.length + 1);

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            new_list[new_list.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            new_list[new_list.length - 1] = num_list[num_list.length - 1] * 2;
        }
        
        num_list = new_list.clone();
        
        return num_list;
    }
}