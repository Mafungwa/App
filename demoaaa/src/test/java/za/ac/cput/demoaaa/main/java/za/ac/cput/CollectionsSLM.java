package za.ac.cput.demoaaa.main.java.za.ac.cput;

import java.util.*;

public class CollectionsSLM {

    ArrayList<String> carsModel = new ArrayList<String>();

    public HashMap myMap() {
        HashMap<String, String> myMoto = new HashMap();
        myMoto.put("Ranger", "Ford Engine");
        myMoto.put("Kia", "V6");
        myMoto.put("Polo", "semi-automatic");
        myMoto.put("Luxus", "2JZ-GE I6");
        return myMoto;
    }

    public TreeSet SetM() {
        String myMoto[] = {"Ranger","Kia","Polo","Luxus"};
        Set<String> set = new HashSet<String>();
        set.add(myMoto[0]);
        set.add(myMoto[1]);
        set.add(myMoto[2]);
        set.add(myMoto[3]);

        TreeSet sortedSet = new TreeSet<String>(set);

        return sortedSet;
    }

    public ArrayList listArl() {

        carsModel.add("Ranger");
        carsModel.add("Kia");
        carsModel.add("Polo");
        carsModel.add("Luxus");

        return carsModel;
    }

    public ArrayList myCollection() {
        carsModel.add("Ranger");
        carsModel.add("Polo");
        carsModel.add("Luxus");
        carsModel.add("Kia");

        Collections.sort(carsModel);

        return carsModel;

    }

    public ArrayList my1Collection() {
        carsModel.add("Ranger");
        carsModel.add("Kia");
        carsModel.add("Polo");
        carsModel.add("Luxus");

        return carsModel;

    }
}
