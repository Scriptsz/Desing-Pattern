public class PDFConverter implements Converter{
    public String makeLine(){
        return "Generating PDF Line";
    }

    public String makeParagraph(){
        return "Generating PDF Paragraph";
    }

    public String makeTable(){
        return "Generating PDF Table";
    }

    public String getDocument(){
        return "Getting PDF Document";
    }
}
