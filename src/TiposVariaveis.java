public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        // para que uma variável seje uma constante precisa da palavra reservada 'final'
        // e o nome dever ser declarado em upercase
        final double VALOR_DE_PI = 3.14;
        System.out.print(VALOR_DE_PI);
    }
}
