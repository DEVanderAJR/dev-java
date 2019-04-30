public class Boteco {
	private double   comissao , comissao10 , refri , cerveja , porcao , caldo , couver  , v1  , v2 , saida , chegada;
	private int mesa ;
	private String garcom, dia;
	
	
	public void setdia(String d){		
		dia = d;
	}
	
	public void setmesa(int mes){		
		mesa = mes;
	}
	
	public void setchegada(double che){		
		chegada = che;
	}
	
	public void setsaida(double sai){		
		saida = sai;
	}
	
	public void setcerveja(double cer){		
		cerveja = cer * 3.00 ;
	}
	
	public void setrefri(double ref){		
		refri = ref * 1.50 ;
	}
	public void setporcao(double por){		
		porcao = por * 5.00 ;
	}
	
	public void setcaldos(double cal){		
		caldo = cal * 2.00 ;
	}
	
	public void setgarcom(String gar){		
		garcom = gar ;
	}
	
	public int getmesa(){		
		return mesa;
	}
	
	 public double getcomissao10 (){
		 if (chegada >= 18)
			comissao10 = (v2 * 10) / 100;	
			return arredondar.roundDecimalPart(comissao10,2);
	}
	 
	 
    public double getmostrarcomissao (){
		if (garcom.toLowerCase().equals("1")){
			if(chegada >= 18)
				comissao = (v2 * 10) / 100;}
		if (garcom.toLowerCase().equals("2")){
			if(chegada >= 18)
			    comissao = (v2 * 5) / 100;}	
		return arredondar.roundDecimalPart(comissao,2);
	}
    
    
    public double getv2 (){ 
	    v2 = cerveja + refri + caldo + porcao + couver ; 	
		return arredondar.roundDecimalPart(v2,2);
	}
    
    
    public double getv1 (){
	    v1 = cerveja + refri + caldo + porcao + couver + comissao10; 	
		return arredondar.roundDecimalPart(v1,2);
	}
    
    
	public double getcouver (){
		if (dia.toLowerCase().equals("2")){
			if (chegada >= 18)
			    if ((mesa < 11 ) && (saida >= 20))
				couver = 5.00 ;
		}
		else couver = 0;	
		return arredondar.roundDecimalPart(couver,2);
	}	
}	
