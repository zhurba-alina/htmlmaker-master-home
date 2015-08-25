package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

public class Text extends AbstractElement<Text> implements Element {

    private String text;
    public Text(String text) {
        this.text = text;
    }

    private List<Element> elements = new ArrayList<Element>();
    public Text addElement(Element el) {
        this.elements.add(el);
        return this;
    }

    public String print() {
        StringBuilder html = new StringBuilder()
                .append(text)
                .append(getCssClass());

        for (Element el : elements) {
            html.append(el.print());
        }
        return html.toString();
    }
}
