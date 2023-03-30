import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Bortoluzzi
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		int [] array = new int[50 ];
		int a[] = new int[5];

		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				riempi_array(array, -5,5);
				stampa(array);
				int min =minArray(array);
				System.out.println(min);

				break;
			case 2:
				int [] array1= new int[20];
				int [] pari = new int[20];
				riempi_array(array1, 1,100);
				stampa(array1);
				stampaPari(pari, array1);
				break;
			case 3:
				int [] d = new int[8];
				int [] array2 = new int[50];
				riempi_array(array2, 1,100);
				stampa(array2);
				ArrayDiv(a,d);

				break;
			case 4:
				riempi_array(array, 1,100);
				stampa(a);


			default:
			case 5:
				riempi_array(array, 1,100);
				ZigZag(array);
				stampa(a);

				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	public static int minArray(int[] array) 
	{
		int min = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(array[i] < min) 
			{
				min = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) 
		{
			if(array[i]==min) 
			{
				break;
			}

		}

		return min;
	}

	public static void stampaPari(int[] array, int[] pari) 
	{

		for(int i=0; i<pari.length; i++) 
		{

			if(pari[i]%2==0) 
			{
				System.out.println(pari[i]);
			}
		}
		int n = array.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[i])
					swap(pari, i, j);
	}
	public static void ArrayDiv(int[]a, int []d)
	{
		System.out.println("scegli il multiplo da inserire");
		int x = Integer.parseInt(in.nextLine());
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%x==0)
			{
				d[i]=a[i];
			}

		}

	}
	public static void ZigZag(int array[]  )
	{
		int k = array.length-1;
		System.out.println();
		for(int i =0; i<array.length/2; i++) 
		{
			System.out.println(array[i]);
			System.out.println(array[k]);
			
		}
		




	}

	public static void stampa(int[] array) 
	{
		int n = array.length;
		for(int i = 0; i<n; i++) 
		{
			System.out.print(array[i]+" | ");
		}
		System.out.println();
	}
	public static void riempi_array(int array[], int min, int max) 
	{
		int n = array.length;
		for(int i=0; i<n; i++) 
		{
			array[i]=(int)(Math.random()*(max-min+1))+min;
		}	

	}



	public static void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	public static void riempi_array (int array[]) 
	{
		for(int i=0; i<array.length; i++) 
		{
			System.out.println("inserisci un numero");
			array[i]= Integer.parseInt(in.nextLine());

		}
	}
}



