package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class CollectionsSLMTest {

    CollectionsSLM  cSLM = new CollectionsSLM();


    @Test
    public void myMap() {
        
        HashMap actMap = new HashMap();
        String expMy ="{Ranger=Ford Engine, Kia=V6, Polo=semi-automatic, Luxus=2JZ-GE I6}";
        expMy= expMy.substring(1, expMy.length()-1);
        String[] keyValuePairs = expMy.split(",");
        Map<String,String> map = new HashMap<>();
        for(String pair : keyValuePairs)
        {
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }
        Assert.assertTrue(actMap.equals(actMap));
        
    }

    @Test
    public void setM() {

        CollectionsSLM myTree =new CollectionsSLM();

        String[] arryL = {"Ranger", "Kia", "Polo", "Luxus"};
        List<String> list = Arrays.asList(arryL);
        Set<String> expectS = new TreeSet(list);

        Assert.assertEquals(expectS,myTree.SetM());

    }

    @Test
    public void listArl() {

        CollectionsSLM expectptO = new CollectionsSLM();
        ArrayList<String> expeList = new ArrayList<>();
        expeList.add("Ranger");expeList.add("Kia");expeList.add("Polo");expeList.add("Luxus");

        Assert.assertEquals(expeList,expectptO.listArl());

    }

    @Test
    public void myCollection() {


        CollectionsSLM expectCol = new CollectionsSLM();
        String [] arAr = {"kia","Luxus","Polo","Ranger"};
        ArrayList<String> carsdsList = new ArrayList<String>(Arrays.asList(arAr));
        Assert.assertNotEquals(carsdsList,expectCol.myCollection());

    }
}