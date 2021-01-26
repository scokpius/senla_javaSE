package eu.selna.task3;


public class Main {

public static void main(String[] args) {
        Cat cat, catti;
        String[] names = {"Kyzya", "Vasya", "Asya", "Liza", "Tom", "Wolly", "Muha", "Sirius", "Fluff", "Snowball"};
        int[] olds = {2, 8, 3, 6, 1, 7, 4, 2, 1, 3};
        Cat[] cats = new Cat[5];
        int i = 1;

        while (i<=10){
            cat = new Cat();
            System.out.println(cat);
            i++;
        }
        System.out.println("------------------------------------------------");
        for (int j = 0; j < 10 ; j++) {
            cat = new Cat();
            cat.setNameCat(names[j]);
            cat.setOldCat(olds[j]);
            System.out.println(cat);
        }
        System.out.println("------------------------------------------------");
        i = 0;
        do {
            cat = new Cat(names[i], olds[i]);
            System.out.println(cat);
            i++;
        } while (i<10);
        System.out.println("------------------------------------------------");

        for (int j = 0; j < 5; j++) {
            cats[j] =  new Cat();
            cats[j].setNameCat(names[j+3]);
            cats[j].setOldCat(olds[j+2]);
        }
        for (Cat cat1 : cats) {
            System.out.println(cat1);
        }
        System.out.println("------------------------------------------------");
        System.out.println(cats[1].equals(cats[2]));
        catti = new Cat(names[5], olds[8]);
        System.out.println(catti.toString());
    }

}
