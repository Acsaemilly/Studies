package semester2026_2.NumericalMethods;

public class BaseConversion {

    public int Algoritmo1(String numero, int base) {

        if (base < 2 || base > 36){
            System.out.println("Base inválida, escolha uma base entre 2 e 36");
            System.exit(0);
        }
        int numeroDecimal = 0;
        for (int i=0; i < numero.length(); i++){

            // Converte um caracter para número
            char digito = numero.charAt(i); // Pega apenas o character da posição

            // transforma o char em número
            if (digito >= '0' && digito <= '9') {
                int valor = digito - '0';
                if (valor < base){ // Verifica se o valor é coerente com a base solicitada
                    numeroDecimal = numeroDecimal * base + valor;
                } else {
                    System.out.println("Número fora da base");
                    System.exit(0);
                }
            } else {
                if (digito >= 'A' && digito <='Z') {
                    int valor = digito - 'A' + 10; // Se for letra, reduz 65 e adiciona 10.
                    if (valor < base) {
                        numeroDecimal = numeroDecimal * base + valor;
                    } else {
                        System.out.println("Número fora da base");
                        System.exit(0);
                    }
                } else { // Se o número conter letras mínusculas ou for negativo
                    System.out.println("Número inválido. Use apenas números e letras maiúsculas.");
                    System.exit(0);
                }
            }
        }
        return numeroDecimal;
    }

    public String Algoritmo2(int numero, int base) {
        String numeroNaBase = "";

        if (base < 2 || base > 36){
            System.out.println("Base inválida, escolha uma base entre 2 e 36");
            System.exit(0);
        }

        if (numero == 0){ // Se for 0 já retorna 0
            return "0";
        }

        if (numero < 0) { //verifica se é positivo
            System.out.println("Número inválido, insira um número não negativo");
            System.exit(0);
        }

        while (numero != 0){ //faz divisões até o número incial ser 0
            int resto = numero % base;
            numero = numero / base;
            char digito;

            if (resto < 10) {
                digito = (char) ('0' + resto);
            } else {
                digito = (char) ('A' + resto - 10);
            }

            numeroNaBase = digito + numeroNaBase;
        }

        return numeroNaBase;
    }

}
