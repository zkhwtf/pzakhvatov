package ru.job4j;

/**
 * Класс, вывод строки в консоль.
 * @author Pavel Zakhvatov (zkhwtf@mm.st)
 * @since 11.01.18
 * @version 1
 */
public class Calculate {
  /**
   * Метод, вывод строки в консоль.
   * @param args - args, имя массива  String.
   */
  public static void main(String[] args) {
    System.out.println("Hello, World!!");
  }
  /**
   * Method echo.
   * @param name name.
   * @return Echo + name.
   */
  public String echo(String name) {
    return "Echo, echo, echo : " + name;
  }
}
