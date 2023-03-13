package es.iesjandula.miguel_rios_gutierrez.Depuracion2;

public class Depuracion2 
{
	private static String code1 = ":@A=", code2 = ">;?<", code3 = "BC:@";

	public static void main(String[] args) 
	{
		// You cannot write any code her
		System.out.println();
	}

		/**
		*Firstly, you have to decrypt every code
		*/
		public static void decrypter(String code) 
		{
			for (int i = 0 ; i < code.length() ; i++)
			{
				char charDecrypted = (char)(code.charAt(i) - 10) ;
				System.out.print(charDecrypted);
			}
		}
		
		/**
		 * Secondly, use the decrypted code to get the secret code
		 */
		public static void crackingCode (String decryptedCode)
		{
			//secretCode must be assigned to
			//decryptedCode.hashCode() to get
			// the secret code
			int secretCode = -1;
			
			if (secretCode == 1724615)
			{
				System.out.println("Code cracked!");
			}
		}
}