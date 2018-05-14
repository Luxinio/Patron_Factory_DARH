
package telefonos;

/**
 *
 * @author Pc
 */
public class Telefonos {
   
    private int ramSize;
	private String processor;
	public String name = Mobile.SAMSUNG;
   
    


    public static void main(String[] args) {
        Mobile Smg = MobileFactory.createMobile(Mobile.SAMSUNG);
        Mobile Iph = MobileFactory.createMobile(Mobile.IPHONE);
        Mobile Sny = MobileFactory.createMobile(Mobile.SONY);
        Mobile htc = MobileFactory.createMobile(Mobile.HTC);
        Mobile hw = MobileFactory.createMobile(Mobile.HUAWUEI);
        Mobile lg = MobileFactory.createMobile(Mobile.LG);
        
        System.out.println(Smg);
        System.out.println(Iph);
        System.out.println(Sny);
        System.out.println(htc);
        System.out.println(hw);
        System.out.println(lg);
        
        
        
   
    }
    
}
