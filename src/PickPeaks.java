import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class PickPeaks {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(getPeaks(arr));


    }




    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        int peak = 0;
        int index = 0;
        Map<String, List<Integer>> peaks = new HashMap<>();
        List<Integer> peakList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak = arr[i];
                index = i;
                peakList.add(peak);
                indexList.add(index);
            }
        }

        peaks.put("peaks", peakList);
        peaks.put("indexes", indexList);

        return peaks;

    }
}