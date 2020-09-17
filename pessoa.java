package herancaEntregar;
import java.util.*;
public class pessoa {
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	public pessoa (String nome, String email, String telefone, String endereco) {
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		this.endereco=endereco;		
	}
	public void solicitarViagem (String nome, String email, String telefone, String endereco) {
		Scanner a = new Scanner(System.in);
		System.out.println("Email dx solicitante: ");
		email=a.next();
		System.out.println("Telefone dx solicitante: ");
		telefone=a.next();
		System.out.println("Enderoço dx solicitante: ");
		endereco=a.next();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
