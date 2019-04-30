package Hotel;

import java.text.DecimalFormat;

public class DataHora
{
    protected int dia;
    protected int mes;
    protected int ano;
    protected int hora;
    protected int minuto;
    protected int segundo;

    private static final int JANEIRO = 1, FEVEREIRO = 2, MARCO = 3,
    					ABRIL = 4, MAIO = 5, JUNHO = 6,
    					JULHO = 7, AGOSTO = 8, SETEMBRO = 9,
    					OUTUBRO = 10, NOVEMBRO = 11, DEZEMBRO = 12;

    public DataHora()
    {
        setData(1, 1, 1);
    }

    public DataHora(int dia, int mes, int ano)
    {
        setData(dia, mes, ano);
    }

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo)
	{
        setDataHora(dia, mes, ano, hora, minuto, segundo);
	}

    public int getDia()
    {
        return this.dia;
    }

    public int getMes()
    {
        return this.mes;
    }

    public int getAno()
    {
        return this.ano;
    }

    public int getHora()
    {
        return this.hora;
    }

    public int getMinuto()
    {
        return this.minuto;
    }

    public int getSegundo()
    {
        return this.segundo;
    }

    public void setData(int dia, int mes, int ano)
    {
        setDataHora(dia, mes, ano, 0, 0, 0);
    }

    public DataHora getData()
    {
        return new DataHora(this.dia, this.mes, this.ano);
    }

    public void setDataHora(int dia, int mes, int ano,
    		int hora, int minuto, int segundo)
    {
        if (ano > 0)
            this.ano = ano;
        else
            this.ano = 1;

        if (mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            this.mes = 1;

        switch (this.mes)
        {
            case ABRIL:
            case JUNHO:
            case SETEMBRO:
            case NOVEMBRO:
                if (dia >= 1 && dia <= 30)
                    this.dia = dia;
                else
                    this.dia = 1;
                break;
            case FEVEREIRO:
                if (dia >= 1 && dia <= 28)
                    this.dia = dia;
				else if (dia >= 1 && dia <= 29 && DataHora.bissexto(this.ano))
                    this.dia = dia;
                else
                    this.dia = 1;
                break;
            default:
                if (dia >= 1 && dia <= 31)
                    this.dia = dia;
                else
                    this.dia = 1;
                break;
        }

        if (hora >= 0 && hora < 24)
            this.hora = hora;
        else
            this.hora = 0;

        if (minuto >= 0 && minuto < 60)
            this.minuto = minuto;
        else
            this.minuto = 0;

        if (segundo >= 0 && segundo < 60)
            this.segundo = segundo;
        else
            this.segundo = 0;
    }

    public static double diferenca(DataHora obj1, DataHora obj2)
    {
        double diasObj1 = obj1.converteParaDias();
        double diasObj2 = obj2.converteParaDias();
        return (diasObj2 - diasObj1);
    }

    public String paraString()
    {
    	DecimalFormat doisDigitos = new DecimalFormat("00");
    	DecimalFormat quatroDigitos = new DecimalFormat("0000");
        return  doisDigitos.format(this.dia) + "/" +
        		doisDigitos.format(this.mes) + "/" +
        		quatroDigitos.format(this.ano) + " " +
        		doisDigitos.format(this.hora) + ":" +
        		doisDigitos.format(this.minuto) + ":" +
        		doisDigitos.format(this.segundo);
    }

    private static boolean bissexto(int ano)
    {
        return (ano % 100 == 0) && ((ano / 100) % 4 == 0);
    }

    private double converteParaDias()
    {
        double dias = 0;
        dias += (double)this.segundo / (60 * 60 * 24);
        dias += (double)this.minuto / (60 * 24);
        dias += (double)this.hora / 24;
        dias += (double)this.dia - 1;
        for (int m = 1; m < this.mes; m++)
            dias += (double)DataHora.diasNoMes(m, this.ano);
        for (int a = 1; a < this.ano; a++)
        	dias += (DataHora.bissexto(a) ? 366.0 : 365.0);
        return dias;
    }

    private static int diasNoMes(int mes, int ano)
    {
        switch (mes)
        {
            case ABRIL:
            case JUNHO:
            case SETEMBRO:
            case NOVEMBRO:
                return 30;
            case FEVEREIRO:
                if (DataHora.bissexto(ano))
                    return 29;
                else
                    return 28;
            default:
                return 31;
        }
    }
}