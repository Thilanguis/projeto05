package principal;

import java.util.ArrayList;

import abstractions.ProfissionalRepositoryAbstract;
import entities.Estabelecimento;
import entities.Profissional;
import entities.Servico;
import repositories.ProfissionalRepository;

public class program {

	public static void main(String[] args) {

		try {

			Profissional profissional = new Profissional();

			profissional.setIdProfissional(24);
			profissional.setNome("Gabriel Granado");
			profissional.setTelefone("2456-4456");

			profissional.setEstabelecimento(new Estabelecimento());
			profissional.getEstabelecimento().setIdEstabeleciomento(18);
			profissional.getEstabelecimento().setNome("Loja do Mané");
			profissional.getEstabelecimento().setCnpj("66.123.435/001-08");

			profissional.setServico(new ArrayList<Servico>());
			profissional.getServico().add(new Servico(1, "corte de cabelo", 100.0, 30));
			profissional.getServico().add(new Servico(2, "barba", 50.0, 30));

			// exportando para arquivo
			ProfissionalRepositoryAbstract repository = new ProfissionalRepository();
			repository.exportar(profissional);

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();

		}

	}

}
