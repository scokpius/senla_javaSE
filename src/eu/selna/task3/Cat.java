package eu.selna.task3;

class Cat {
    private String nameCat = "Barsik";
    private int oldCat = 2;

     Cat() {
    }

     Cat(String name, int old) {
        nameCat = name;
        oldCat = old;
    }

     String getNameCat() {
        return this.nameCat;
    }

     void setNameCat(String name) {
        this.nameCat = name;
    }

     int getOldCat() {
        return oldCat;
    }

     void setOldCat(int old) {
        this.oldCat = old;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Name cat is " + getNameCat() + ". Hi is " + getOldCat() + ".";
    }
}
