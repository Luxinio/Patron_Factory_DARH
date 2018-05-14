package telefonos;

public class IPhone implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
       public String name = Mobile.IPHONE;
	public IPhone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
                this.name = name;
	}
        
        @Override
         public String toString() {
    return " name: " +name + 
            " ram size: " + ramSize +  
           " processor " + String.valueOf(this.processor) +  
           " GPU " + String.valueOf(this.GPU); 
}       
}
