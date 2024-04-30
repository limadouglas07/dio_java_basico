public class Operadores {
    public static void main(String[] args) {
        String nome1 = "Douglas";
        String nome2 = new String("Douglas"); //quando utilizamos objetos e textos utilizamos o metodo "equals"..
        System.out.println(nome1.equals(nome2));
        
        int numero = 5;
        numero += 1; // ou numero++;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 3;
        b = 6;
        int resultado = a==b ? 1 : 0; // Se for verdadeiro é 1 e falso 0.
        System.out.println(resultado);

        String resultado1 = a==b ? "Verdadeiro" : "Falso"; // Utilizado operador ternário para abreviar o if deixando  o código mais limpo.
        System.out.println(resultado1);
    }
}
