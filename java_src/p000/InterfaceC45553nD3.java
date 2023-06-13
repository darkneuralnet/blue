package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: nD3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public @interface InterfaceC45553nD3 {
    String value() default "";
}
