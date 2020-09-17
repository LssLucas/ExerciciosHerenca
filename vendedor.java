package herancaEntregar;
import java.text.NumberFormat;
import java.util.*;
public class vendedor extends pessoa {
	private float valorVendas;
	private float comissao;
	
	public vendedor (String nome, String email, String telefone, String endereco, float valorVendas, float comissao) {
		super(nome, email, telefone, endereco);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
	}
	public float getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public void gerarVendar() {
		Random rd = new Random();
		valorVendas=rd.nextFloat()*100;
		System.out.println("Vendas do m�s: "+NumberFormat.getCurrencyInstance().format(valorVendas));
	}
	public void gerarComissao() {
		comissao=(float) (valorVendas*0.2);
		System.out.println("Comiss�o (20%):"+NumberFormat.getCurrencyInstance().format(comissao));
	}
	public void salario() {
		double salTotal=valorVendas+comissao;
		System.out.println("Salario Bruto "+NumberFormat.getCurrencyInstance().format(salTotal));		
		System.out.println(getNome()+", receber� "+NumberFormat.getCurrencyInstance().format(salTotal)+", atrav�s do "+getEmail()+" e "+getTelefone()+" a confirma��o de dep�sito.\nO relat�rio ser� encaminhado ao endereco: "+getEndereco());
	}
}