
package modelo;

public class Validacao
{
    private String numero1;
    private String numero2;
    private Double num1;
    private Double num2;
    private String mensagem;
    private String operacao;  
    
    public Validacao(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        validarNumeros();
        validarOperacao();
    
    }
    
    
    
    private void validarNumeros()
    {
       try
       {
           this.mensagem = "";
           this.num1 = Double.parseDouble(numero1);
       }
       
       catch(NumberFormatException e)
       {
           this.mensagem += "Número inválido no campo1\n";
       }
       
       try
       {
           
           this.num2 = Double.parseDouble(numero2);
       }
       
       catch(NumberFormatException e)
       {
           this.mensagem += "Número inválido no campo2\n";
       }
       
       
    }
    
    private void validarOperacao()
    {
        if(this.numero2.equals("0") && this.operacao.equals("/"))
        {
            this.mensagem = "Divisão por zero";
        
        }
    }

    public Double getNum1()
    {
        return num1;
    }

    public Double getNum2()
    {
        return num2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
}

