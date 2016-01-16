package in.workarounds.bundler.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by madki on 16/10/15.
 */
@Retention(CLASS) @Target(TYPE)
public @interface RequireBundler {
    boolean requireAll() default true;
    String bundlerMethod() default "";
    boolean inheritArgs() default true;
    boolean inheritState() default true;
    int flags() default -1;
    String data() default "";
    String action() default "";
}
