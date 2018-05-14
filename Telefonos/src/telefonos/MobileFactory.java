package telefonos;

public class MobileFactory {
	public static Mobile createMobile(String type){
		
            if(type.equals (Mobile.IPHONE)){   
		return new IPhone(2, "A9", "A9 GPu");
		}else 
                
            if(type.equals(Mobile.SONY)){
                return new Sony(2,"ARM");
                    }else 
                    
             if(type.equals(Mobile.SAMSUNG)){
                return new Samsung("Intel");
                        }else
                                 
             if(type.equals(Mobile.HTC)){
             return new Htc(8, "12 GB", "20 MegaPixeles");
                                     }
                                     else {
                                     
            if(type.equals (Mobile.HUAWUEI)){
                return new Huawuei(16, "8 GB expandible a 32", "15 MegaPixeles");
		}
            
                else{
                if(type.equals(Mobile.LG)){
                    return new Lg(8,"16 GB","10 MegaPixeles");
                
                
                
                }
            
            
                         }
            
            
                                     
                                     
                                     }
                                 
                                 {
			return null;
		}
	}
}
