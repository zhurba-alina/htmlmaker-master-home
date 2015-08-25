package ua.goit.htmlmaker.element;

public class CssLink implements Element {

    private String cssUrl;

    public CssLink(String cssUrl) {

        this.cssUrl = cssUrl;
    }

//    @Override
    public String print() {
        return String.format("<link rel=\"stylesheet\" href=\"%s\">", cssUrl);
    }
}
