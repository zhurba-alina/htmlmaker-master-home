package ua.goit.htmlmaker.element;

// SOLID
public class Page implements Element {

    private Element body, head;

//    @Override
    public String print() {
        StringBuilder html = new StringBuilder();
        html.append("<html>").append("\n");

        if (head != null) {
            html.append(head.print());
        }
        if (body != null) {
            html.append(body.print());
        }

        html.append("</html>");
        return html.toString();
    }

    public Page addBody(Element body) {

        this.body = body;
        return this;
    }

    public Page addHead(Element head) {
        this.head = head;
        return this;
    }
}
