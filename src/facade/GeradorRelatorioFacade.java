package facade;

import visitor.ComprasCliente;
import visitor.FormatoVisitante;
import visitor.Relatorio;
import visitor.VisitanteHTML;

public class GeradorRelatorioFacade {
	
	public void gerarRelatorioClientesEmHtml() {
		Relatorio r = new ComprasCliente();

		FormatoVisitante visitante = new VisitanteHTML();
		String resultado = (String) r.gerarRelatorio(visitante);
		
		System.out.println(resultado);
	}
}
