package kpi.fict.practice3.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static kpi.fict.practice3.task1.Shop.Util.*;

class Shop {

    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    private int goods;

    Shop(String name) {
        this.name = name;
    }

    void fillByGoods(){
        System.out.println("How much goods you want to add?");
        goods = getIntValue();
    }

    void createDepartment(){
        System.out.println("Enter name, location and capacity of new department");
        departments.add(new Department(getStringValue(),getStringValue(),getIntValue()));
    }

    void eliminateDepartment(){
        System.out.println("Which department you want to eliminate?");
        String buf = getStringValue();

        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getName().equals(buf))
                departments.remove(departments.get(i));
        }
    }

    void sortByName(){
        departments.sort(new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    protected class Department {
        private String name;
        private String location;
        private int goods;
        private int capacity;

        Department(String name, String location, int capacity) {
            this.name = name;
            this.location = location;
            this.capacity = capacity;
        }

        void getGoodsFromShop(){
            System.out.println("How much goods you want to get?");
            int buf = getIntValue();
            if ((goods + buf) <= capacity) {
                goods += buf;
                Shop.this.goods -= buf;
            }
            else
                System.out.println("Not enough space!");
        }

        String getName() {
            return name;
        }


        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", goods=" + goods +
                    '}';
        }
    }

    static class Util {
         static Scanner scanner = new Scanner(System.in);

         static String getStringValue(){
             return scanner.next();
         }

         static int getIntValue(){
             return scanner.nextInt();
         }
    }

    ArrayList<Department> getDepartments() {
        return departments;
    }

    public int getGoods() {
        return goods;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                ", goods=" + goods +
                '}';
    }
}
