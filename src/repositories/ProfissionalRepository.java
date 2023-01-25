package repositories;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import abstractions.ProfissionalRepositoryAbstract;
import entities.Profissional;
import entities.Servico;

public class ProfissionalRepository extends ProfissionalRepositoryAbstract {

	@Override
	public void exportar(Profissional profissional) throws Exception {

		File directory = new File(PATH);

		// Verificando se a pasta não existe
		if (!directory.exists())
			directory.mkdir(); // criar a pasta

		// abrindo um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(new FileWriter(PATH + "profissionais.txt", true));

		// imprimindo as informações do profissional
		printWriter.write("\n DADOS DO PROFISSIONAL");
		printWriter.write("\n ID........:" + profissional.getIdProfissional());
		printWriter.write("\n NOME......:" + profissional.getNome());
		printWriter.write("\n TELEFONE..:" + profissional.getTelefone());

		printWriter.write("\n DADOS DO ESTABELECIMENTO");
		printWriter.write("\n ID...........:" + profissional.getEstabelecimento().getIdEstabeleciomento());
		printWriter.write("\n NOME.........:" + profissional.getEstabelecimento().getNome());
		printWriter.write("\n CNPJ.........:" + profissional.getEstabelecimento().getCnpj());

		printWriter.write("\n DADOS DO SERVIÇO:");

		for (Servico servico : profissional.getServico()) { // foreach

			printWriter.write("\n ID.............:" + servico.getIdServico());
			printWriter.write("\n NOME...........:" + servico.getNome());
			printWriter.write("\n PREÇO..........:" + servico.getPreco());
			printWriter.write("\n TEMPO EM MIN...:" + servico.getTempoEmMinutos());
			printWriter.write("\n");

		}

		printWriter.flush(); // salvar
		printWriter.close(); // fechar

	}

}
