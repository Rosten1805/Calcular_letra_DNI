
import java.util.Scanner;
    public class LetraDNI {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce tu número de DNI: ");
                int numDNI = sc.nextInt();
                System.out.printf("La letra que corresponde a %d es %c", numDNI, calcularLetra(numDNI));
                sc.close();
            }

            private static char calcularLetra(int dni){
                String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
                int resto = dni%23;
                return caracteres.charAt(resto);
            }

            private static char calcularLetraArray(int dni){
                char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                int resto = dni%23;
                return caracteres[resto];
            }
        }
