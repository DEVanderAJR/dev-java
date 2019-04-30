package javaapplication1;

public class Automovel {
    protected String modelo;
    protected String marca;
    protected int ano;
    protected String cor;
    protected float precoBase;
    protected int combustivel;
    
    //construtor
    public Automovel(String modelo,String marca,int ano, String cor,
            float precobase,String combustivel){
    setModelo(modelo);
    setMarca(marca);
    setAno(ano);
    setCor(cor);
    setPrecoBase(precoBase);
    setCombustivel(combustivel);
    }
    
    public void getModelo(){
        
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void getMarca(){}
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        if (ano >= 1900 && ano <= 2011)
            this.ano = ano;
        else 
            this.ano = 2010;
    }
    
    public void getCor(){}
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void getPrecoBase(){}
    
    public void setPrecoBase(float precoBase){
        this.precoBase = precoBase;
    }
    
    public void getCombustivel(){
        
    }
    
    public void setCombustivel(String cobustivel){
        switch(combustivel){
                case GASOLINA:
                case ETANOL:
                case FLEX:
                case DIESEL:
                case GNV:
                     this.combustivel = combustivel;
                     break;
                default:
                    this.combustivel = FLEX;
                    break;
                         
        }               
        
    }
    
    
}

/** modelo, marca, ano, cor, precoBase e combustivel.
 * o ano do veiculo nao podera ser inferior a 1900
 * e maior q 2011
 * a classe deve ter 5 constantes que representam os tipos de
 * combustiveis aceitos (etanol, gasolina, gnv, diesel e flex).
 * somente um desses combustiveis sera aceito. o valor default 
 * é flex;
 * o preço base nunca deverá ser menor q 0.
 * 
 * Essa classe deve ter um construtor q receba todos os parametros
 * um metodo chamado quantoCusta() q retorna o preço do veiculo
 * e um metodo chamado toString() que retorna uma string com 
 * todas as informações do automovel.
 */