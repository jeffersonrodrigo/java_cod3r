package controle;

public class For3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Aqui é o i: " + i);
        }
        System.out.println("Sai do i");

        // i = 12; // Aqui não é possível fazer alteração no i pois a variável só é conhecida dentro do laço for
        System.out.println("\n\n");

        int k = 0;
        for (; k < 10; k++) {
            System.out.println("Aqui é o k: " + k);
        }
        k = 12;
        System.out.println("Novo valor de k é: " + k);
				
				//laço dentro do laço
        for(int a =0; a < 10; a++){
            for(int b = 0; b < 10; b++) {
                System.out.printf("[%d %d]", a, b);
            }
            System.out.println();
        }
    }
}
