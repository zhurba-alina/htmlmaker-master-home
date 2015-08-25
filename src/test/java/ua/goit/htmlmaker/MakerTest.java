package ua.goit.htmlmaker;

import org.junit.Assert;
import org.junit.Test;
import ua.goit.htmlmaker.element.Body;
import ua.goit.htmlmaker.element.Page;
import ua.goit.htmlmaker.element.UL;

public class MakerTest {

  @org.junit.Test
  public void test() {

    Page page = new Page().addBody(new Body());
    String actual = page.print();

    Assert.assertEquals("<html></html>", actual);
  }

  @Test
  public void createSite() {
    Page page = new Page()
        .addBody(
            new Body()
                .addElement(new UL())
        );
    Assert.assertEquals("....", page.print());
  }
}
