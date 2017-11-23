package cliente;

import facade.GeradorRelatorioFacade;
import visitor.ComprasCliente;
import visitor.FormatoVisitante;
import visitor.Relatorio;
import visitor.VisitanteHTML;

public class Main {

	public static void main(String[] args) {
		
		//Realizando a operação com o FACADE
		GeradorRelatorioFacade facade = new GeradorRelatorioFacade();
		facade.gerarRelatorioClientesEmHtml();
		
		//Realizando a operação sem FACADE
		Relatorio r = new ComprasCliente();
		FormatoVisitante visitante = new VisitanteHTML();
		String resultado = (String) r.gerarRelatorio(visitante);
		System.out.println(resultado);
	}
}
