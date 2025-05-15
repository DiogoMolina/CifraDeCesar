public class App {
    public static void main(String[] args) {

        Mecanismo mec = new Mecanismo();
        String entradaTexto = "C:\\Users\\Diogo\\Desktop\\Pastas\\Estudos Facul\\COMPILADORES\\entradaTexto.txt";
        String saidaCripto = "C:\\Users\\Diogo\\Desktop\\Pastas\\Estudos Facul\\COMPILADORES\\saidaCripto.txt";
        mec.executarCripto(entradaTexto, saidaCripto);
        String saidaDecripto = "C:\\Users\\Diogo\\Desktop\\Pastas\\Estudos Facul\\COMPILADORES\\saidaDecripto.txt";
        mec.executarDecripto(saidaCripto, saidaDecripto);

    }
}