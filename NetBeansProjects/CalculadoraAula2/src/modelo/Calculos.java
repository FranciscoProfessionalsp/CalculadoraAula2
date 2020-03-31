
package modelo;


public class Calculos
{
    private Double num1;
    private Double num2;
    private String operacao;
    private Double res;   
    
    
    public Calculos(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        calcular();
        
    
    }
    
    
    private void calcular()
    {
        if(this.operacao.equals("+"))
        {
            somar();
        }
        
        if(this.operacao.equals("-"))
        {
            subtrair();
        }
        
        if(this.operacao.equals("*"))
        {
            multiplicar();
        }
        
        if(this.operacao.equals("/"))
        {
            dividir();
        }
    
    }
    
    private void somar()
    {
        this.res = num1 + num2;
    
    }
    
    private void subtrair()
    {
        this.res = num1 - num2;
    }
    
    private void multiplicar()
    {
        this.res = num1 * num2;
    }
    
    private void dividir()
    {
        this.res = num1 / num2;
    }

    public Double getRes()
    {
        return res;
    }
    
    
    
}   
