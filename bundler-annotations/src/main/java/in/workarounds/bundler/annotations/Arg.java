package in.workarounds.bundler.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by madki on 21/10/15.
 */
@Target({FIELD,TYPE}) @Retention(CLASS)
public @interface Arg {
  String key() default "";
  Class<?> type() default Class.class;
}
