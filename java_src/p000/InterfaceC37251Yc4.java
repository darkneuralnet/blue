package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: Yc4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public @interface InterfaceC37251Yc4 {
    boolean encoded() default false;
}
