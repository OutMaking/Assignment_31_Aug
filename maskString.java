public class String2{
 
    public static void main(String[] args){
        
        String str = "SABBIR";
        String str2 = "POONAWALA";
        System.out.println( mask(str, 2,6, '#')+" "+mask(str2, 2, 9, '#') );
        
    }
    
    private static String mask(String string, int a, int b, char c) 
    {
    
        int length = b - a;
        
        if(length == 0)
            return string;
        
        StringBuilder maskString = new StringBuilder(length);
        
        for(int i = 0; i < length; i++){
            maskString.append(c);
        }
        
        return string.substring(0,a) 
            + maskString.toString() 
            + string.substring(a + length);
    }
 
}