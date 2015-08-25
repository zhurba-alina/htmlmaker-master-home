package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

public class Div extends AbstractElement<Div> implements Element {

    public String print() {
        StringBuilder html = new StringBuilder()
                .append("\n")
                .append("<div")
                .append(getCssClass())
                .append(">");

        for (Element el : elements) {
            html.append(el.print());
        }
        return html.append("</div>").append("\n").toString();
    }

    private List<Element> elements = new ArrayList<Element>();
    public Div addElement(Element el) {
        this.elements.add(el);
        return this;
    }
}
