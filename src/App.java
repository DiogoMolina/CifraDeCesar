public class App {
    public static void main(String[] args) {

        Mecanismo mec = new Mecanismo();
        String entradaTexto = "src/Textos/entradaTexto.txt";
        String saidaCripto = "src/Textos/saidaCripto.txt";
        mec.executarCripto(entradaTexto, saidaCripto);
        String saidaDecripto = "src/Textos/saidaDecripto.txt";
        mec.executarDecripto(saidaCripto, saidaDecripto);

    }
}