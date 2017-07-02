package daggerok;

import dagerok.CalcGrv;
import lombok.experimental.var;
import lombok.val;

import static java.lang.String.format;
import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {

    val a = 2;
    val b = 3;

    var c = CalcGrv.plus(a, b);
    out.println(format("groovy: %d plus %d equals %d", a, b, c));

    c = CalcKt.minus(a, b);
    out.println(format("kotlin: %d minus %d equals %d", a, b, c));
  }
}
