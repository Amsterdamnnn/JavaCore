package kpi.fict.practice3.task1;

class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Barrrracuda");
        shop.createDepartment();
        shop.createDepartment();
        System.out.println(shop);
        shop.sortByName();
        System.out.println(shop);
        shop.fillByGoods();
        System.out.println(shop);
        shop.getDepartments().get(0).getGoodsFromShop();
        System.out.println(shop.getDepartments().get(0));
        shop.eliminateDepartment();
        System.out.println(shop);
    }
}

