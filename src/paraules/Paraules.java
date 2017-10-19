package paraules;

public class Paraules {

    LT entr = new LT();
    Paraula paraules[] = new Paraula[100];
    int comptador = 0;
    String p = entr.llegirLinia();

    public void inicio() {
        int index = 0;
        int guarda = 0;
        for (int i = 0; i < nparaules(); i++) {
            while (p.charAt(index) != ' ' && p.charAt(index) != '.' && p.charAt(index) != ',' && p.charAt(index) != ';') {
                index++;
            }
            Paraula pa = new Paraula(p.substring(guarda, index));
            paraules[i] = pa;
            comptador++;
            index++;
            guarda = index;
        }
        imprimirParaules();
    }
    
    public int nparaules(){
        int numero = 0;
        int i = 0;
        while (p.charAt(i) != '.'){
            if (p.charAt(i) == ' ') {
                numero++;
            }
            i++;
        }
        numero++;
        return numero;
    }
    
    public void imprimirParaules (){
        for(int i = 0; i < comptador; i++){
            System.out.println(paraules[i]);
        }
    }

    public static void main(String[] args) {
        new Paraules().inicio();
    }

}
