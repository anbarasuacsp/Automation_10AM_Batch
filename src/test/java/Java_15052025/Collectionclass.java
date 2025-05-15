package Java_15052025;

import java.util.*;

public class Collectionclass {
    void arrarylist(){
//        ArrayList<String> Studentlist = new ArrayList<>();
        LinkedList<String> Studentlist = new LinkedList<>();
        Collection col = new LinkedList();
        col.add("");
        List<String> li = new ArrayList<>();
        List<String> lio = new LinkedList<>();
        Set<String> se = new HashSet<>();
        Studentlist.add("Sowmya");
        Studentlist.add("Gohila");
        Studentlist.add("Nila");
        Studentlist.add("Subulash");
        Studentlist.add("Anbu");
        System.out.println("All available Students: "+Studentlist);
        System.out.println("Total Number of student: " +Studentlist.size());
        System.out.println("Going to remove subilash: "+Studentlist.remove("Subulash"));
        System.out.println("After Removing Subilash: "+Studentlist);
        Studentlist.add("Priya");
        System.out.println(Studentlist);
        Studentlist.remove(3);
        System.out.println(Studentlist);
        Studentlist.add("Anbu");
        System.out.println(Studentlist);
        Studentlist.add("Anbu");
        System.out.println(Studentlist);
        Studentlist.add(" ");
        System.out.println(Studentlist);
        Studentlist.add(" ");
        System.out.println(Studentlist);
        Studentlist.add(" ");
        System.out.println(Studentlist);
        Studentlist.add(" ");
        System.out.println(Studentlist);
//        Studentlist.add(2, "Ramya");
//        System.out.println(Studentlist);
    }
    void Hashsetyu() {
        HashSet<String> set = new HashSet<>();
        set.add("Sowmya");
        set.add("Gokila");
        set.add("Sowmya");
        set.add("Gokila");
        set.add("Anbu");
        set.add("Nila");
        set.add("");
        set.add("");
        set.add("");
        System.out.println(set);
    }
    void hashmapo(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Gohilfga", 23);
        map.put("Gohila", 25);
        map.put("Gohila", 45);
        map.put("Gohila", 89);
        map.put("Gohitrela", 23);
        map.put("Gohiertla", 23);
        map.put("Gorethila", 23);
        map.put("Goerthila", 23);
        map.put("Gotrhila", 23);
        map.put("trttr", 23);
        map.put("Gorhila", 23);
        map.put("Gohrila", 23);
        System.out.println(map);
    }
    public static void main(String[] args) {
        Collectionclass printstudentlist = new Collectionclass();
//        printstudentlist.arrarylist();
//        printstudentlist.Hashsetyu();
        printstudentlist.hashmapo();
    }

}
