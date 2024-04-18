public class PostScriptConverter implements Converter{
    public String makeLine(){
        return "Generating PostScript Line";
    }

    public String makeParagraph(){
        return "Generating PostScript Paragraph";
    }

    public String makeTable(){
        return "Generating PostScript Table";
    }

    public String getDocument(){
        return "Getting PostScript Document";
    }
}
