package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

public class Body extends AbstractElement<Body> implements Element {

    private List<Element> elements = new ArrayList<Element>();

    public Body addElement(Element el) {
        this.elements.add(el);
        return this;
    }

//    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<body")
                .append(getCssClass())
                .append(">");

        for (Element el : elements) {
            html.append(el.print());
        }

        return html.append("</body>").append("\n").toString();
    }
}
