/**
 * 
 */
package com.projeto.nutri;

import java.util.ArrayList;

/**
 * @author DEVANDER
 *
 */
	
public class dietas extends cadastroGrupoAlimentar {
	
	/*
	 * ATRIBUTOS DE CLASSE
	 * */
		
	public  int    cod = 0;	
	private String codDieta = ""; //codigo gerado para definir a dieta;
	private double situacaoCalorica = 0; //Definirá se o paciente se enquadrou na metaCalórica	
	private String tipoDieta = "";
	static  ArrayList<cadastroGrupoAlimentar> listaCombinaDietas = new ArrayList<cadastroGrupoAlimentar>();	

	/*
	 * CONSTRUTOR
	 * */
	public dietas() {	
		System.out.println("Combinando melhores Dietas...");
	}	
		
	/*
	 * ENCAPSULAMENTO
	 * */
	public void SettipoDieta(String tipoDieta) {	
		
		this.tipoDieta = tipoDieta;		
	}

	public String GettipoDieta() {		
			
		return this.tipoDieta;
			
	}

	public void Setcod(int cod) {	
		
		this.cod = cod;		
	}

	public int Getcod() {		
			
		return this.cod;
			
	}
	
public void SetcodDieta(String codDieta) {	
		
		this.codDieta = codDieta;		
	}

	public String GetcodDieta() {		
			
		return this.codDieta;
			
	}
		
public void SetsituacaoCalorica(double situacaoCalorica) {	
		
		this.situacaoCalorica = situacaoCalorica;		
	}

	public double GetsituacaoCalorica() {		
			
		return this.situacaoCalorica;
			
	}
		
/*
 * MÉTODOS
 * */

/**
 * MÉTODO QUE DEFINE OS ALIMENTOS QUE SE ENQUADRAM NA METACALORICA DO CLIENTE
 * */
public void criaDieta(String nomeCli,double metaCalorica, ArrayList<cadastroGrupoAlimentar> listaglimentar4) {
	double a,b,c,d = 0;
	cadastroGrupoAlimentar dietas = new cadastroGrupoAlimentar();
	cadastroGrupoAlimentar dietasB = new cadastroGrupoAlimentar();
	cadastroGrupoAlimentar dietasC = new cadastroGrupoAlimentar();
	
	for(int w =0; w <listaglimentar4.size(); w++ ) {
		if(listaglimentar4.get(w).GetgrupoAlimentar() == 1) {
			for(int y =0; y <listaglimentar4.size(); y++ ) {
				if(listaglimentar4.get(y).GetgrupoAlimentar() == 2) {
				
					if(Double.valueOf(listaglimentar4.get(w).kalTotal()) +Double.valueOf(listaglimentar4.get(y).kalTotal()) < metaCalorica) {
						for(int p =0; p <listaglimentar4.size(); p++ ) {
							if(listaglimentar4.get(p).GetgrupoAlimentar() == 3) {
								if(Double.valueOf(listaglimentar4.get(w).kalTotal()) +Double.valueOf(listaglimentar4.get(y).kalTotal())+(listaglimentar4.get(p).kalTotal()) <= metaCalorica) {
									
									
									a = Double.valueOf(listaglimentar4.get(w).kalTotal().doubleValue());
									b = Double.valueOf(listaglimentar4.get(y).kalTotal().doubleValue());
									c = Double.valueOf(listaglimentar4.get(p).kalTotal().doubleValue());
									d= a + b + c;
									
									dietas = new cadastroGrupoAlimentar();
									dietas.SetnomeCliente(nomeCli);
									dietas.SettotKalimentos(d);
									dietas.SetpositionGrupo(w);  //posição do array do alimento cadastrado.
									dietas.Setcod(listaglimentar4.get(w).Getcod());
									dietas.SetgrupoAlimentar(listaglimentar4.get(w).GetgrupoAlimentar());
									dietas.SetnomeAlimento(listaglimentar4.get(w).GetnomeAlimento());
									dietas.Setkal(listaglimentar4.get(w).kalTotal());
									
									listaCombinaDietas.add(dietas);
									
									dietasB = new cadastroGrupoAlimentar();
									dietasB.SetnomeCliente(nomeCli);
									dietasB.SettotKalimentos(d);
									dietasB.SetpositionGrupo(w);  //posição do array do alimento cadastrado.
									dietasB.Setcod(listaglimentar4.get(y).Getcod());
									dietasB.SetgrupoAlimentar(listaglimentar4.get(y).GetgrupoAlimentar());
									dietasB.SetnomeAlimento(listaglimentar4.get(y).GetnomeAlimento());
									dietasB.Setkal(listaglimentar4.get(y).kalTotal());
									
									listaCombinaDietas.add(dietasB);
									
									dietas = new cadastroGrupoAlimentar();
									dietasC.SetnomeCliente(nomeCli);
									dietasC.SettotKalimentos(d);
									dietasC.SetpositionGrupo(y); //posição do array do alimento cadastrado.
									dietasC.Setcod(listaglimentar4.get(y).Getcod());
									dietasC.SetgrupoAlimentar(listaglimentar4.get(p).GetgrupoAlimentar());
									dietasC.SetnomeAlimento(listaglimentar4.get(p).GetnomeAlimento());
									dietasC.Setkal(listaglimentar4.get(p).kalTotal());
									
									listaCombinaDietas.add(dietasC);		
									
									System.out.println("|DIETA DEFINIDA BASEADA NO GRUPO DE ALIMENTOS PREENCHIDOS NO SISTEMA. ***");
									System.out.println("|TIPO DIETA: "+ w + y + p +" |PARA META CALÓRICA: "+ metaCalorica +"kal. ***");
									System.out.println("********************************************************************");
									System.out.println("ALIMENTOS X KAL TOTAL:                                     *******");
									System.out.println("POSITION: "+ w + y+ p+ "**************************************************************");																
									System.out.println("Alimento  :.: " + listaglimentar4.get(w).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(w).kalTotal());
									System.out.println("Alimento  :.: " + listaglimentar4.get(y).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(y).kalTotal());
									System.out.println("Alimento  :.: " + listaglimentar4.get(p).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(p).kalTotal());
									System.out.println("*****************************************************************");
									System.out.println("TOTAL Kal: "                           + (d) +" kals.    *********");
									System.out.println("*********************************************************************");
								}
							}
						}
					}
				}
			}
		}
	}

}


public cadastroGrupoAlimentar viewDietasCombina( ArrayList<cadastroGrupoAlimentar> listaglimentar4) {
	if(listaglimentar4.size()> 0) {
		for(int x =0; x <listaglimentar4.size(); x++ ) {
			switch(listaglimentar4.get(x).GetgrupoAlimentar())
			{
				case 1:
					System.out.println("*****************GRUPO CARBO -1"+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				case 2:
					System.out.println("*****************GRUPO PROTEIN - 2 "+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				case 3:
					System.out.println("*****************GRUPO GORDURAS - 3 "+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				}
				
		}
	}else {System.out.println("GRUPO VAZIO****************");}
	
	
	return null;
	
}
		
public void viewCombinaDietas(String cod) {
	
	 int i = Integer.parseInt(cod);
	
if(i == 0) {
	for(int x =0; x <listaCombinaDietas.size(); x++ ) {
		
		System.out.println("DIETAS:**************************************************************************");					
		System.out.println("NOME CLIENTE: " + listaCombinaDietas.get(x).GetnomeCliente());
		System.out.println("COD CLI: " + listaCombinaDietas.get(x).Getcod());
		System.out.println("GRUPO ALIMENTAR: " + listaCombinaDietas.get(x).GetgrupoAlimentar());
		System.out.println("ALIMENTO: " + listaCombinaDietas.get(x).GetnomeAlimento());
		System.out.println("KAL x PORÇÃO: "+ listaCombinaDietas.get(x).Getkal());
		System.out.println("TOTAL Kal: "+ listaCombinaDietas.get(x).GettotKalimentos());
						
	}
	
}else {
	//for(int x =0; x <listaCombinaDietas.size(); x++ ) {
	
	 int p = Integer.parseInt(cod.substring(0,1));
	 System.out.println(p);
	 int q = Integer.parseInt(cod.substring(1,2));
	 System.out.println(q);
	 int r = Integer.parseInt(cod.substring(2,3));
	 System.out.println(r);
	
	 	System.out.println("|TIPO DIETA: " + p + q + r + " |");//PARA META CALÓRICA: "listaCombinaDietas.get(p). +"kal. ***");
		System.out.println("********************************************************************");
		System.out.println("ALIMENTOS X KAL TOTAL:                                     *******");
		System.out.println("POSITION: "+ p + q+ r+ "**************************************************************");																
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(p).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(p).kalTotal());
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(p).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(p).kalTotal());
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(p).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(p).kalTotal());
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(q).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(q).kalTotal());
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(q).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(q).kalTotal());
		System.out.println("Alimento  :.: " + listaCombinaDietas.get(q).GetnomeAlimento()+"- KalxPorcao :.:" + listaCombinaDietas.get(q).kalTotal());
		System.out.println("*****************************************************************");
		System.out.println("TOTAL Kal: "                           + (listaCombinaDietas.get(p).GettotKalimentos()) +" kals.    *********");
		System.out.println("*********************************************************************");
	 								
		
		
}
	
	

}

}