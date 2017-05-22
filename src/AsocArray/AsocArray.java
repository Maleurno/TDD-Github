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
	
	private conjunto getConjunto(String clave){
		conjunto result = null;
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				result = aux;
			}
		}
		return result;
	}
	
	public String get(String clave){
		String valor_resultado = null;
		conjunto aux = getConjunto(clave);
		if(aux != null){
			valor_resultado = aux.Valor;
		}else{
			throw new UndefinedKeyException("No se admite número negativo");
		}
		return valor_resultado;
	}
	
	public String getOrElse(String clave, String porDefecto){
		String valor_resultado = porDefecto;
		conjunto aux = getConjunto(clave);
		if(aux != null){
			valor_resultado = aux.Valor;
		}
		return valor_resultado;
	}
	
	public boolean containKeys(String clave){
		boolean result = false;
		for(conjunto aux:AsocArray){
			if(aux.Clave==clave){
				result = true;
			}
		}
		return result;
	}
	
	public boolean remove(String clave){
		boolean result = false;
		conjunto aux = getConjunto(clave);
		if(aux != null){
			result = AsocArray.remove(aux);
		}
		return result;
	}
	
	public int size(){
		return AsocArray.size();
	}

}
