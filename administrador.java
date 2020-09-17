package herancaEntregar;
import java.util.*;
import java.text.NumberFormat;
public class administrador extends pessoa {
	private float ajudaDeCusto;
	private float despesaMensal;
	private Scanner r;
	private float despesa;
	public administrador (String nome, String email, String telefone, String endereco, float ajudaDeCusto, float despesaMensal) {
		super(nome, email, telefone, endereco);
		this.ajudaDeCusto=ajudaDeCusto;
		this.despesaMensal=despesaMensal;
	}	
	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public float getAjudaDeCusto() {		
		return ajudaDeCusto;
	}
	public void despesa () {
		r =new Scanner(System.in);
		System.out.println("Qual a despesa mensal?");
		System.out.println(despesaMensal);
		despesa =r.nextFloat()*100;
	}
	public void gerarAjudaCusto () {
		if(despesaMensal<despesa) {
			setAjudaDeCusto(5000);
			System.out.println(getNome()+", receber� "+NumberFormat.getCurrencyInstance().format(getAjudaDeCusto())+", atrav�s do "+getEmail()+" e "+getTelefone()+" a confirma��o de dep�sito.\nO relat�rio ser� encaminhado ao endereco: "+getEndereco());
		}else {
			System.out.println("N�o alcan�ou o teto de gastos!");
		}
	}
}
/*Scanner a = new Scanner(System.in);
System.out.println("Tipo de viagem:\n1 - nacional\n2 internacional");
tipoViagem = a.nextInt();
if(tipoViagem==1) {
	System.out.println(getNome());
	System.out.println("Viagem nacional\nDigite a dura��o da viagem em dias");
	qtddDias = a.nextInt();
	this.ajudaDeCusto=qtddDias*1000;
	System.out.println("Valor total da viagem "+NumberFormat.getCurrencyInstance().format(ajudaDeCusto)+"\nDura��o (dias): "+qtddDias);
}else if (tipoViagem==2) {
	System.out.println("Viagem internacional\nDigite a dura��o da viagem em dias");
	qtddDias = a.nextInt();
	ajudaDeCusto=qtddDias*4500;
	System.out.println("Valor total da viagem "+NumberFormat.getCurrencyInstance().format(ajudaDeCusto));
}else {
	System.out.println("Op��o inv�lida!!!");
}

*	public void gerarSolicitacao() {
		System.out.println("Eu "+getNome()+" solicito autoriza��o aos repons�seis libera��o do montante de "+getAjudaDeCusto()+", para realizar uma viagem comdutra��o de ,\n� fins de negocia��o de contrato.");
	}
*/