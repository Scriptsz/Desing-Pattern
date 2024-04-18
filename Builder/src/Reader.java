public class Reader {
    private String element;
    private Converter convert;

    public Reader(String element, Converter convert) {
        this.element = element;
        this.convert = convert;
    }

    public String parseInput(){
        String msg = "";
        switch (element){
            case "line":
                msg=convert.makeLine();
                break;
            case "paragraph":
                msg=convert.makeParagraph();
                break;
            case "table":
                msg=convert.makeTable();
                break;
            case "document":
                msg=convert.getDocument();
                break;
            default:
                msg="Element not found";
        }

        return msg;
    }
    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Converter getConvert() {
        return convert;
    }

    public void setConvert(Converter convert) {
        this.convert = convert;
    }
}


