import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AbrirArquivo {

	private BufferedReader br;
	private boolean fim = false;
	private List<String[]> linhas;

	public AbrirArquivo() {
		linhas = new ArrayList<>();
	}

	public boolean abrirArquivo(String dados) throws FileNotFoundException {
		File f = new File(dados);
		br = new BufferedReader(new FileReader(f));
		return f.exists();
	}

	private String lerLinha() throws IOException {
		String ret;
		if ((ret = br.readLine()) == null) {
			br.close();
			fim = true;
		}
		return ret;
	}

}