package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

public class Head implements Element{

  private List<Element> elements = new ArrayList<Element>();

//  @Override
  public String print() {
    StringBuilder res = new StringBuilder().append("<head>");

    for (Element element : elements) {
      res.append(element.print());
    }
    return res.append("</head>").append("\n").toString();
  }

  public Head addCssLink(CssLink cssLink) {
    this.elements.add(cssLink);
    return this;
  }
}
