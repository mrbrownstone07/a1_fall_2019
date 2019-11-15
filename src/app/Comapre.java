package app;

/**
 * Comapre
 */
class Compare { 
    public static int stringCompare(String str1,  String str2) { 
        for (int i = 0; i < str1.length() &&  i < str2.length(); i++) 
            if ((int)str1.charAt(i) ==  (int)str2.charAt(i)) continue; 
            else return (int)str1.charAt(i) -  (int)str2.charAt(i); 

        return (str1.length() < str2.length()) ?  (str1.length()-str2.length())  
                : (str1.length() > str2.length()) ? (str1.length()-str2.length()) 
                : 0; 
    }
} 