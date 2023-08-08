public class verificadorNumeroPrimo {

    public static void main(String[] args) {
        int numero = 4; 
        int resultado = verificaNumeroPrimo(numero);
       
        if (resultado == 1) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
   
    public static int verificaNumeroPrimo(int n) {
        if (n <= 1) {
            return 0;
        }
       
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
       
        return 1;
    }
}