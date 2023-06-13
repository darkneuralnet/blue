package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.8")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lkotlin/SubclassOptInRequired;", "", "markerClass", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@ExperimentalSubclassOptIn
/* loaded from: classes8.dex */
public @interface SubclassOptInRequired {
    Class<? extends Annotation> markerClass();
}