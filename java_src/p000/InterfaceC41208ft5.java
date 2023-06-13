package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ft5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public @interface InterfaceC41208ft5 {
    String[] alternate() default {};

    String value();
}
