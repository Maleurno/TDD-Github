package AsocArray;

import java.util.ArrayList;

public class AsocArray {
	
	private class conjunto{
		String Clave;
		String Valor;
	}
	
	private ArrayList <conjunto> AsocArray;
	
	public void put(String clave, String valor){
		conjunto c=new conjunto();
		c.Clave=clave;
		c.Valor=valor;
		AsocArray.add(c);
	}
	
	public String get(String clave){
		String valor_resultado = null;
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				valor_resultado = aux.Valor;
			}
		}
		if(valor_resultado == null){
			throw new UndefinedKeyException("No se admite número negativo");
		}
		return valor_resultado;
	}
	
	public String getOrElse(String clave, String porDefecto){
		String valor_resultado = porDefecto;
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				valor_resultado = aux.Valor;
			}
		}
		return valor_resultado;
	}
	
	public boolean containKeys(String clave){
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(String clave){
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				return AsocArray.remove(aux);
			}
		}
		return false;
	}

}
