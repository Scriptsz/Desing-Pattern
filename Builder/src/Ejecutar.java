public class Ejecutar {
    public static void main(String[] args) {

        Converter objASCII = new ASCIIConverter();
        Converter objPostScript = new PostScriptConverter();
        Converter objPDF = new PDFConverter();
        Converter objXLS = new XLSConverter();

        Reader objReader = new Reader("line", objXLS);
        Reader objPostScriptReader = new Reader("paragraph", objPostScript);
        Reader objPDFReader = new Reader("table", objPDF);

        System.out.println(objReader.parseImput());
        System.out.println(objPostScriptReader.parseImput());
        System.out.println(objPDFReader.parseImput());
    }

}
