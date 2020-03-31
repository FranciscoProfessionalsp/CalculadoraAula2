
package modelo;

public class Controle
{
    
    private String numero1;
    private String numero2;
    private String operacao;
    private String mensagem;
    private String resultado;
    
    
    public Controle(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        executar();
    
    }
    
    private void executar()
    {
        Validacao validacao = new Validacao(numero1, numero2, operacao);
        this.mensagem = validacao.getMensagem();
        if(this.mensagem.equals(""))
        {
            Calculos calculos = new Calculos(validacao.getNum1(), validacao.getNum2(),operacao);
            this.resultado = calculos.getRes().toString();
        }
        else
        {
            this.resultado = this.mensagem;
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getResultado()
    {
        return resultado;
    }
    
    
    
}
