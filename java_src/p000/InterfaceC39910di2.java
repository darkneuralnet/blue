package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: di2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public @interface InterfaceC39910di2 {
    boolean nullSafe() default true;

    Class<?> value();
}
