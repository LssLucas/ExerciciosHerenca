package herancaEntregar;
import java.util.*;
import java.io.*;
public class administradorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner select = new Scanner(System.in);
		System.out.println("Digite a - para executar Administrador\nb - para executar Vendedor");
		String opcao=select.next();
		switch (opcao) {
		case "a":
			administrador adma = new administrador("Nome", "email@email.com", "12-34567-8910", "Rua Cidade, Cidade Estado - UF", 0, 10);
			adma.despesa();
			adma.gerarAjudaCusto();		
			break;
		case "b":
			vendedor vendx = new vendedor("Nome", "email@email.com", "12-34567-8910", "Rua Cidade, Cidade Estado - UF", 0, 0);
			vendx.gerarVendar();
			vendx.gerarComissao();
			vendx.salario();
			break;
		}

	}
}
