import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres generar?");
		int casillas = sc.nextInt();
		int num[] = new int[casillas];
		
		System.out.println("Introduce el numero maximo dentro del rango que quieres");
		int max = sc.nextInt();
		System.out.println("Introduce el numero minimo dentro del rango que quieres");
		int min = sc.nextInt();
		
		for(int i = 0; i<num.length; i++) {
			num[i] = num_rand(max, min);
			System.out.println(num[i]);
		}

	}
	
	public static int num_rand  (int max, int min) {
		return (int) (Math.random() * (max - min - 1) + (min)) + 1;
	}

}
