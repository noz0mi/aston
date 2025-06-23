package example.homework2.collections;

public class Main {
    public static void main(String[] args) {
/*        MyOwnHashSet<String> myOwnHashSet = new MyOwnHashSet<>();
        System.out.println(myOwnHashSet.add("Java"));
        System.out.println(myOwnHashSet.add("Java"));
        myOwnHashSet.add("Top");
        myOwnHashSet.add("Integer");
        myOwnHashSet.add("Kira");
        myOwnHashSet.add("abobus");
        System.out.println(myOwnHashSet);
        myOwnHashSet.remove("Java");
        System.out.println(myOwnHashSet);*/
        MyOwnArrayList<Integer> myOwnArrayList = new MyOwnArrayList<>();

        System.out.println(myOwnArrayList.size());
        myOwnArrayList.add(0);
        myOwnArrayList.add(1);
        myOwnArrayList.add(2);
        myOwnArrayList.add(3);
        myOwnArrayList.add(4);
        /*myOwnArrayList.add(5);
        myOwnArrayList.add(6);
        myOwnArrayList.add(7);
        myOwnArrayList.add(8);
        myOwnArrayList.add(9);
        myOwnArrayList.add(10);
        myOwnArrayList.add(11);
        System.out.println(myOwnArrayList);
        myOwnArrayList.remove(9);
        System.out.println(myOwnArrayList);
        myOwnArrayList.add(12);
        System.out.println(myOwnArrayList);*/
        System.out.println(myOwnArrayList);
        Integer [] newArray = new Integer[] {22, 33, 44, 55, 66, 77};
        myOwnArrayList.addAll(2, newArray);
        System.out.println(myOwnArrayList);
        myOwnArrayList.addAll(newArray);
        System.out.println(myOwnArrayList);
        System.out.println(myOwnArrayList.size());
    }
}
