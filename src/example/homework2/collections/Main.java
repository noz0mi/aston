package example.homework2.collections;

public class Main {
    public static void main(String[] args) {
        MyOwnArrayList<Integer> myOwnArrayList = new MyOwnArrayList<>();
        System.out.println(myOwnArrayList.size());
        myOwnArrayList.add(0);
        myOwnArrayList.add(1);
        myOwnArrayList.add(2);
        myOwnArrayList.add(3);
        myOwnArrayList.add(4);
        System.out.println(myOwnArrayList);
        System.out.println(myOwnArrayList.size());
        Integer [] newArray = new Integer[] {22, 33, 44, 55, 66, 77};
        myOwnArrayList.addAll(2, newArray);
        System.out.println(myOwnArrayList);
        myOwnArrayList.addAll(newArray);
        System.out.println(myOwnArrayList);
        System.out.println(myOwnArrayList.size());
    }
}
