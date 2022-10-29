package school.mjc.stage0.loops.task5;

import java.util.List;
public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if(height <= 2){
            return;
        }
        StringBuilder st = new StringBuilder();
        for(int i = height-1; i >= 0; i -= 2){
            String curr = "";
            for(int j = 0; j < (height - 1 - i)/2; j++)
                curr += " ";
            for(int j = i; j >= 0; j--)
                curr += "8";
            for(int j = 0; j < (height - 1 - i)/2; j++)
                curr += " ";
            st.append(curr + '\n');
        }
        List<String> arr = List.of(st.toString().split("\n"));
        for(int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
        for(int i = arr.size() - (height % 2 == 0 ? 1 : 2); i >= 0; i--)
            System.out.println(arr.get(i));
    }
}
