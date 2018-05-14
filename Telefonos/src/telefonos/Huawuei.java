/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;

/**
 *
 * @author Alejandro
 */
public class Huawuei implements Mobile{
        private int ramSize;
	private String almacenamiento;
	private String camara;
        public String name = Mobile.HUAWUEI;
          public Huawuei(int ramSize, String almacenamiento, String camara){
		this.ramSize = ramSize;
		this.almacenamiento = almacenamiento;
		this.camara = camara;
	}
    
      @Override
      
      public String toString(){
          return  " nombre: "+name+ 
                  " ramSize in GB " + ramSize + 
                  " almacenamiento " + String.valueOf(this.almacenamiento)
                  +" camara " + String.valueOf(this.camara);
          
      
      }
}
