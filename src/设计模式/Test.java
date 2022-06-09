package 设计模式;

import java.util.*;

public class Test {
    public static void main(String[] args) {


        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < 18; i++) {
            hashMap.put(i, i);
        }




        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        treeMap.put(1, 5);
        treeMap.put(2, 3);
        treeMap.put(-1, 9);
        treeMap.forEach((key,value)->{
            System.out.println(key + " " + value);
        });

        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(treeMap.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        HashSet<Node> hashSet = new HashSet<>();
        Node node = new Node(1, "abc");
        hashSet.add(node);
        node = new Node(2, "abc");
        hashSet.add(node);
        node = new Node(3, "abc");
        hashSet.add(node);
        hashSet.forEach((item)->{
            System.out.println(item.index + " " + item.name);
        });
        System.out.println(hashSet.size());
    }



    static class Node{
        int index;
        String name;

        public Node(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || this.getClass() != o.getClass())
                return false;
            Node node = (Node) o;
            return name.equals(node.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
