package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: Ed3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public @interface InterfaceC32579Ed3 {
    String value() default "";
}
