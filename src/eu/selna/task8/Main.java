package eu.selna.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(2, 15);
        list.add(3, 7);
        list.add(1, 10);

        MyList<String> myList4 = new MyArrayList<>(5);
        myList4.add("cdd");
        myList4.add("dsf");
        myList4.add("ssd");
        myList4.add("asw");
        myList4.add(2, "err");
        myList4.add(3, "ljf");
        myList4.add(1, "tug");
        myList4.add("jgr");
        myList4.add("jfr");

        MyList<Integer> myList1 = new MyArrayList<>(5);
        myList1.add(2);
        myList1.add(8);
        myList1.add(3);
        myList1.add(7);
        myList1.add(2, 18);
        myList1.add(3, 6);
        myList1.add(1, 4);
        myList1.add(3);
        myList1.add(4);

        MyList<Integer> myList = new MyArrayList<>();
        myList.add(4);
        myList.add(9);
        myList.add(1);
        myList.addAll(2, myList1);

        MyList<Integer> myList2 = new MyArrayList<>(myList1);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                 if (o1 < o2) return -1;
                else {
                    if(o1 == o2) return 0;
                    else {
                        return 1;
                    }
                }
            }
        };


        System.out.println("list = " + list);
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(index) = " + list.get(3));
        System.out.println("list.indexOf(object) = " + list.indexOf(2));
        System.out.println("list.subList(indexStart, indexEdn) = " + list.subList(2, 5));
        list.sort(comparator);
        System.out.println("list.sort(comparator) = " + list + "\n");



        System.out.println("myList = " + myList.isEmpty());
        System.out.println("myList = " + myList);
        myList.set(3, 21);
        System.out.println("myList = " + myList);
        myList.remove(3);
        System.out.println("myList = " + myList);
        MyList<Integer> myList3 = myList.subList(3, 10);
        System.out.println("myList3 = " + myList3 );
        myList3.sort(comparator);
        System.out.println("myList3 = " + myList3 + "\n");

        System.out.println("myList4 = " + myList4 );
        MyList<String> myList5 = myList4.subList(3, 7);
        System.out.println("myList4 = " + myList5 + "\n");



        System.out.println(2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3);




//        System.out.println("myList1 = " + myList1);
//        System.out.println("myList1.isEmpty() = " + myList1.isEmpty());
//        System.out.println("myList1.size = " + myList1.size());
//        System.out.println("myList1.get(index) = " + myList1.get(1));
//        System.out.println("myList1.indexOf(object) = " + myList1.indexOf(4));
//        System.out.println("myList1.lastIndexOf(object) = " + myList1.lastIndexOf(4) + "\n");
//
//        System.out.println("myList2 = " + myList2.isEmpty());
//        System.out.println("myList2 = " + myList2);
//        System.out.println("myList2.size = " + myList2.size());


    }

}

