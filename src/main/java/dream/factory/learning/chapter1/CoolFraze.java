package dream.factory.learning.chapter1;

public class CoolFraze {
    public static void main (String[] arg) {
        String [] prvaLista = {"Jako", "Naj", "Masu", "Podosta"};
        String [] drugaLista = {"Super", "Puno", "Stvarno", "GOSU" };
        String [] trecaLista = {"Cool", "Guba", "Gala", "Groovy", "IMBA", "-etina"};

        int oneLength = prvaLista.length;
        int twoLength = drugaLista.length;
        int threeLength = trecaLista.length;

        int nasumicno1=(int) (Math.random() * oneLength);
        int nasumicno2=(int) (Math.random() * twoLength);
        int nasumicno3=(int) (Math.random() * threeLength);


        String fraza = prvaLista[nasumicno1] + drugaLista[nasumicno2] + trecaLista[nasumicno3];

        System.out.println("Frane je " + fraza);

    }

}
