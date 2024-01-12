package DSAandAlgorithms.bigSearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySeacrh {


    public static String search(int number, List<Integer> list) {
        if (number > list.size()){
            return "number does not exist in list";
        }
        if (number > list.size()/2)
            return calculateForMoreThanAverage(number, list);


        return null;
    }

    private static String calculateForMoreThanAverage(int number,List<Integer> list) {
        List<Integer> currentList = new ArrayList<>();
        for (int count = list.size() / 2; count < list.size(); count++) {
            currentList.add(list.get(count));
        }
    }
}
