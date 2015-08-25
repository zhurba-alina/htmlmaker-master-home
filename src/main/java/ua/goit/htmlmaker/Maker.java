package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.*;

public class Maker {

    public static void main(String[] a) {

        Page page = new Page()
                .addHead(
                        new Head()
                                .addCssLink(new CssLink("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"))
                )
                .addBody(
                        new Body().addClass("bg-success")
                                .addElement(new Div().addClass("container")
                                                .addElement(new Div().addClass("row")
                                                                .addElement(new Div().addClass("col-md-12")
                                                                                .addElement(new Div().addClass("jumbotron")
                                                                                                .addElement(new Text("<h1>Hello, world!</h1>\n" +
                                                                                                                "\n" +
                                                                                                                "                <p>...</p>\n" +
                                                                                                                "\n" +
                                                                                                                "                <p><a ")
                                                                                                                .addClass("btn btn-primary btn-lg")
                                                                                                                .addElement(new Text(" href=\"#\" role=\"button\">Learn more</a>"))
                                                                                                )
                                                                                )
                                                                                .addElement(new Div().addClass("panel panel-default")
                                                                                                .addElement(new Div().addClass("panel-heading").addElement(new Text("My Panel"))
                                                                                                )

                                                                                                .addElement(new Div().addClass("panel-body")
                                                                                                                .addElement(new Button("Submit").addClass("btn", "btn-success"))
                                                                                                                .addElement(new Button("Cancel").addClass("btn", "btn-primary"))
                                                                                                )
                                                                                )
                                                                )
                                                )
                                )
                );

        System.out.println(page.print());
    }
}
