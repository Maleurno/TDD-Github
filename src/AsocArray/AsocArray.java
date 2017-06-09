package AsocArray;


public class AsocArray {
	
	public String Clave[]=null;
	public String Valor[]=null;
	public int size = 0;
	
	public void put(String clave, String valor){
		Clave[size] = clave;
		Valor[size] = valor;
		size ++;
	}
	
	public String get(String clave){
		String valor_resultado = "null";
		for(int aux =0; aux < size; aux++){
			if(Clave[aux] == clave){
				valor_resultado = Valor[aux];
				aux = size;
			}
		}
		if(valor_resultado == "null"){
			throw new UndefinedKeyException("No se admite número negativo");
		}
		return valor_resultado;
	}
	
	public String getOrElse(String clave, String porDefecto){
		String valor_resultado = porDefecto;
		for(int aux =0; aux < size; aux++){
			if(Clave[aux] == clave){
				valor_resultado = Valor[aux];
				aux = size;
			}
		}
		return valor_resultado;
	}
	
	public boolean containKeys(String clave){
		boolean result = false;
		for(int aux =0; aux < size; aux++){
			if(Clave[aux] == clave){
				result = true;
				aux = size;
			}
		}
		return result;
	}
	
	public boolean remove(String clave){
		boolean result = false;
		for(int aux =0; aux < size; aux++){
			if(Clave[aux] == clave){
				result = true;
			}
			if(result){
				Clave[aux] = Clave[aux+1];
				Valor[aux] = Valor[aux+1];
			}
		}
		if(result) size--;
		return result;
	}
	
	public int size(){
		return size;
	}

}
