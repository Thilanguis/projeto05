package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	//atributo para armazanhar o caminho do diretório para onde os arquivos deverão ser exportados 
	protected static final String PATH = "c:\\temp\\";
	
	
	//método abstrato que deverá ser implementado para realizar a exportação dos arquivos
	public abstract void exportar(Profissional profissional) throws Exception;

}
