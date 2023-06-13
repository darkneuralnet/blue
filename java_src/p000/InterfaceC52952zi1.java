package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: zi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public @interface InterfaceC52952zi1 {
    boolean deserialize() default true;

    boolean serialize() default true;
}
