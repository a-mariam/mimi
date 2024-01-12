package DSAandAlgorithms.bigSearch;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class BinarySeacrhTest {


    @Test
    public void testBinarySearch(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int number = 9;
       String response =  BinarySeacrh.search(9,list);
       assertEquals("9",response);
    }
}