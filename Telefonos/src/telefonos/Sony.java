package telefonos;

public class Sony implements Mobile{
	private int ramSize;
	private String processor;
      public String name = Mobile.SONY;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
        
        @Override
         public String toString() {
    return  " name: " + name  + 
            " ram size: " + ramSize + 
           " processor " + String.valueOf(this.processor); 
}       
}
