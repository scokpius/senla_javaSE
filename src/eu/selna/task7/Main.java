package eu.selna.task7;

import eu.selna.task7.constant.Material;
import eu.selna.task7.constant.Name;
import eu.selna.task7.constant.Shape;
import eu.selna.task7.factory.Factory;

public class Main {
    private static Robot[] robots = new Robot[9];

    public static void main(String[] args) {

        int quantity = 0;

        while (robots.length != quantity){
            Robot robot = getRobot();
            if (robots[quantity] == null && !(equalsRobot(robot))){
                robot.setName(selectNameFromList(quantity).toString());
                robots[quantity] = robot;
                quantity ++;
            }

        }

        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }

    private static boolean equalsRobot(Robot robot){
        boolean flag = false;
        for (Robot value : robots) {
            if (value == null) {
                break;
            }
            if ((value.getHead().getForm()).equals(robot.getHead().getForm())) {
                if ((value.getBody().getMaterial()).equals(robot.getBody().getMaterial())) {
                    flag = true;
                    break;
                }
            }
        }
       return flag;
    }

    private static Robot getRobot(){
        Factory factoryHead = new Factory<Head>();
        Factory factoryBody = new Factory<Body>();
        factoryHead.createElement(new Head(chooseShapeOfHead()));
        factoryBody.createElement(new Body(chooseMaterialOfBody()));
        return new Robot((Head) factoryHead.getTypeObject(),
                (Body) factoryBody.getTypeObject());
    }

    private static Name selectNameFromList(int i){
        Name[] name = Name.values();
        return name[i];

    }
    private static Shape chooseShapeOfHead(){
        int shapeNumber = (int)(Math.random()*3)+1;
        switch (shapeNumber){
            case 1: return Shape.CUBE;
            case 2: return Shape.DODECAHEDRON;
            case 3: return Shape.SPHERE;
            default: return null;
        }
    }

    private static Material chooseMaterialOfBody(){
        int shapeNumber = (int)(Math.random()*3)+1;
        switch (shapeNumber){
            case 1: return Material.METAL;
            case 2: return Material.PLASTIC;
            case 3: return Material.TREE;
            default: return null;
        }

    }

}
