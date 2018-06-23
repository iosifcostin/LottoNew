
import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {

        Set<Integer> numereAgentie = genereaza();
        System.out.println("Numerele castigatoare : \n" + numereAgentie);

        Set<Integer> numereBilet = genereaza();
        System.out.println("Numerele primului bilet : \n" + numereBilet);


        int contor = 1;

        while (!numereAgentie.containsAll(numereBilet)){

            numereBilet = genereaza();
            contor++;
            System.out.println(contor);
            if (numereAgentie.containsAll(numereBilet)){
                System.out.println("Ai castigat 6/49 dupa " + contor + " jocuri");
                System.out.println("Numerele castigatoare sunt : \n" + numereAgentie +"\n"+
                                   "Numerele biletului dupa " + contor + " jocuri\n" + numereBilet );
            }


        }



    }

    static Set<Integer> genereaza (){
        Set<Integer> integers = new HashSet<>(6);
        while (integers.size() < 6) {
            integers.add((int) (Math.random() * 48 + 1));
        }
        return integers;
    }
}