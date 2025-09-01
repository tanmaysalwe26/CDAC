class TeaCup {
    String teaType;
	static int totalCups = 0;

    TeaCup(String teaType) {
        this.teaType = teaType;
        totalCups++;
    }

    String getTeaType() {
        return teaType;
    }

    static void showTotalCups() {
        System.out.println("Total cups made: " + totalCups);
    }
}

	class Q1Cupcounter {
	public static void main(String[] args) {
        TeaCup cup1 = new TeaCup("Masala Tea");
        TeaCup cup2 = new TeaCup("Green Tea");
        TeaCup cup3 = new TeaCup("Ginger Tea");

        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        TeaCup.showTotalCups();
    }
}

/*Output
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3
*/