/*
 * Lili 2022/01/26
 */
public class WordHelper {
	/*
	Write method sortByVowels. (20pts)
	This static method returns a sorted String array,
	takes in an array of Strings via a parameter, and sorts them from smallest to largest 
	by the number of vowels.
	A character’s case does not matter, and you may assume that all words only contain 
	alphabet characters and no digits or special symbols.
	*/
	
	public static String[] sortByVowels(String words[])
	{
	//copy the array
	String[] str=words.clone();
	int[] sum=new int[str.length];
	
	//catch each word in the string in the array and count the vowels in each string
	for(int i=0; i<str.length;i++) {
		char[] ch=new char[str[i].length()];
		ch=str[i].toCharArray();
		int vowels=0;
		for(int j=0; j<ch.length;j++) {
			if('y'== ch[j]||'a'== ch[j]||'e'==ch[j]||'u'==ch[j]||'i'==ch[j]||'o'==ch[j])
				vowels++;
			
		}
		sum[i]=vowels;
		
	}
	
	//sort strings in the array 
	for(int k=0;k<sum.length-1;k++) {// bubble sort
		for(int m=0;m<sum.length-k-1;m++)
		if(sum[m]>sum[m+1])
		
		
		{
		int temp=sum[m];//sort count numberr
		sum[m]=sum[m+1];
		sum[m+1]=temp;
		
		String vowel = str[m];//sort name
		str[m]=str[m+1];
		str[m+1]=vowel;
				
		}
	    
     }
	return str;
}
	
	
	/*
	 Write method sortByConsonants. (20pts)
This static method returns a sorted String array, takes in an array of Strings via 
a parameter, and sorts them from smallest to largest by the number of consonants.
A character’s case does not matter, and you may assume that all words 
only contain alphabet characters and no digits or special symbols.
	 */
	
public static String[] sortByConsonants(String words[]) {
//int sum=0;
	//copy the array
	String[] str=words.clone();
	int[] sum=new int[str.length];
	
	//catch each word in the string in the array and count the vowels in each string
	for(int i=0; i<str.length;i++) {
		char[] ch=new char[str[i].length()];
		ch=str[i].toCharArray();
		int vowels=0;
		for(int j=0; j<ch.length;j++) {
			if(ch[j]!='y'&& ch[j]!='a'&&ch[j]!='e'&&ch[j]!='u'&& ch[j]!='i'&&ch[j]!='o')
				{vowels++;};
			
		}sum[i]=vowels;
		
	}
	
	//sort strings in the array 
	for(int k=0;k<sum.length-1;k++) {// bubble sort
		for(int m=0;m<sum.length-k-1;m++)
		{if(sum[m]>sum[m+1])
		
		
		{
		int temp=sum[m];//sort count numberr
		sum[m]=sum[m+1];
		sum[m+1]=temp;
		
		String vowel = str[m];//sort name
		str[m]=str[m+1];
		str[m+1]=vowel;
				
		}
	    }
   }
	return str;
}

 /*
 Write method sortByLength. (20pts)
This static method returns a sorted String array, takes in an array of Strings via a 
parameter, and sorts them from smallest to largest by the number of letters.
A character’s case does not matter, and you may assume that all words only contain
alphabet characters and no digits or special symbols.
 */
	

public static String[] sortByLength(String words[]) {
	//int sum=0;
	
	//copy the array
	 String[] str=words.clone();
		int[] sum=new int[str.length];
		  
		//catch each word in the string in the array and count the vowels in each string
		for(int i=0; i<str.length;i++) {
			char[] ch=new char[str[i].length()];
			ch=str[i].toCharArray();
			int vowels=0;
			for(int j=0; j<ch.length;j++) {
				vowels++;
					
			}
			sum[i]=vowels;
			
		}
		
		//sort strings in the array 
		for(int i=0;i<sum.length-1;i++) {// bubble sort
			for(int j=0;j<sum.length-i-1;j++)
			
				if(sum[j]>sum[j+1])
			{
			int temp=sum[j];//sort count numberr
			sum[j]=sum[j+1];
			sum[j+1]=temp;
			
			String vowel = str[j];//sort name
			str[j]=str[j+1];
			str[j+1]=vowel;
					
			}
		    
	   }
		return str;
	}

}
