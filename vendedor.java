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
		System.out.println("Vendas do mês: "+NumberFormat.getCurrencyInstance().format(valorVendas));
	}
	public void gerarComissao() {
		comissao=(float) (valorVendas*0.2);
		System.out.println("Comissão (20%):"+NumberFormat.getCurrencyInstance().format(comissao));
	}
	public void salario() {
		double salTotal=valorVendas+comissao;
		System.out.println("Salario Bruto "+NumberFormat.getCurrencyInstance().format(salTotal));		
		System.out.println(getNome()+", receberá "+NumberFormat.getCurrencyInstance().format(salTotal)+", através do "+getEmail()+" e "+getTelefone()+" a confirmação de depósito.\nO relatório será encaminhado ao endereco: "+getEndereco());
	}
}