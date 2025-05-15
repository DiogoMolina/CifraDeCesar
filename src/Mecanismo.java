import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mecanismo {

    private BufferedReader reader;
    private ArrayList<String> bufferPrimario;

    public void CarregarArquivo(String caminhoCompleto){
        this.CarregarArquivo(caminhoCompleto);
    }

    private void CarregarBufferPrimario(String caminhoCompleto){
        this.reader = null;
        try {
            this.reader = new BufferedReader(new FileReader(caminhoCompleto));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void ProcessarBufferPrimario(){
        this.bufferPrimario = new ArrayList<>();
        try {
            String linha;
            while ((linha = this.reader.readLine()) != null) {
                bufferPrimario.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

    public void executarCripto(String arquivoTexto, String arquivoCripto){

        this.bufferPrimario = new ArrayList<>();
        CarregarBufferPrimario(arquivoTexto);
        ProcessarBufferPrimario();
        CifraCesar criptografar = new CifraCesar(0);

        for (String texto : this.bufferPrimario) {
            
        }

        System.out.println(bufferPrimario);
    }

        public void executarDecripto(String entradaCripto, String saidaDecripto){
        // O aluno deve desenvolver o código para realizar o processo.
    }

}