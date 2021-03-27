
public class lab10a 
{
  public static void main( String[] args )
  {
     BigNum b1;
     BigNum b2;
     BigNum b3;
     BigNum b4;
     
     b1 = new BigNum();
     b2 = new BigNum( "8AB3");
     b3 = new BigNum( b2);
     b4 = new BigNum( "8AB3");
     
     
//     System.out.println( b1);
//     System.out.println( b2);
//     System.out.println( b3);
//     
//     b2.shift( true);
//     System.out.println( b2);
//     
//     b3.shift( false);
//     System.out.println( b3);
       
//       b1.add( b2);
//       System.out.println( b2);
//     
     
     
      
     b2.add( b3); 
     System.out.println( b2); 
     b2.add( b4);
     System.out.println( b2);
  }
  
  
  
  
  
  
}