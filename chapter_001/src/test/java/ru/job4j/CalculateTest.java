package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Pavel Zakhvatov (zkhwtf@mm.st)
 * @since 11.01.18
 * @version 1
*/
public class CalculateTest {
  /**
   * Test echo.
  */ @Test
  public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Pavel Zakhvatov";
    String expect = "Echo, echo, echo : Pavel Zakhvatov";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
  }
}
