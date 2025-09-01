class Mobile {
    String model;
    static int totalMobiles = 0;

    Mobile(String model) {
        this.model = model;
        totalMobiles++;
    }

    String getModel() {
        return model;
    }

    static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }
}

class Q2Mobiletracker {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung Galaxy M32");
        Mobile m2 = new Mobile("Redmi Note 12");

        System.out.println("Mobile1 model: " + m1.getModel());
        System.out.println("Mobile2 model: " + m2.getModel());

        Mobile.showTotalMobiles();
    }
}

/*Output
Mobile1 model: Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2
*/
