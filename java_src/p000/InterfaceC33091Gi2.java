package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: Gi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public @interface InterfaceC33091Gi2 {
    boolean value() default true;
}
