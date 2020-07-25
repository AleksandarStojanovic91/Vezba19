public class Main {

    public static void main(String[] args) {
        String[] tip = {"Bycicle","Car","Mobile Phone"};
        String[] naziv = {"BMX","Renault 4","I-Phone"};
        double[] cena = {150.55,100,500};

        for(int i = 0;i<3;i++) {
            System.out.println(naziv[i] + " is type " + tip[i] + " and it costs " + cena[i]);
        }
    }
}
