package com.fasterxml.jackson.module.kotlin;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0003\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a\u001c\u0010\f\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¨\u0006\u000f"}, m28432d2 = {"filterOutSingleStringCallables", "", "Lkotlin/reflect/KFunction;", "propertyNames", "", "", "isInlineClass", "", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "isKotlinConstructorWithParameters", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "isPossibleSingleString", "isPrimaryConstructor", "Lkotlin/reflect/KClass;", "kConstructor", "jackson-module-kotlin"}, m28431k = 2, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KotlinNamesAnnotationIntrospectorKt {
    public static final Collection<KFunction<?>> filterOutSingleStringCallables(Collection<? extends KFunction<?>> collection, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!isPossibleSingleString((KFunction) obj, set)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Deprecated(message = "To be removed in 2.14", replaceWith = @ReplaceWith(expression = "with(receiver) { declaringClass.declaredMethods.any { it.name.contains('-') } }", imports = {}))
    private static final boolean isInlineClass(AnnotatedMethod annotatedMethod) {
        boolean contains$default;
        Method[] declaredMethods = annotatedMethod.getDeclaringClass().getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaringClass.declaredMethods");
        for (Method method : declaredMethods) {
            String name = method.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) name, (char) CoreConstants.DASH_CHAR, false, 2, (Object) null);
            if (contains$default) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isKotlinConstructorWithParameters(AnnotatedConstructor annotatedConstructor) {
        if (annotatedConstructor.getParameterCount() > 0) {
            Class<?> declaringClass = annotatedConstructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "declaringClass");
            if (KotlinModuleKt.isKotlinClass(declaringClass) && !annotatedConstructor.getDeclaringClass().isEnum()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPossibleSingleString(KFunction<?> kFunction, Set<String> set) {
        boolean contains;
        Object obj;
        boolean z;
        if (kFunction.getParameters().size() != 1) {
            return false;
        }
        contains = CollectionsKt___CollectionsKt.contains(set, kFunction.getParameters().get(0).getName());
        if (contains || !Intrinsics.areEqual(ReflectJvmMapping.getJavaType(kFunction.getParameters().get(0).getType()), String.class)) {
            return false;
        }
        Iterator<T> it = kFunction.getParameters().get(0).getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Annotation) obj) instanceof JsonProperty) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((JsonProperty) obj) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public static final boolean isPrimaryConstructor(KClass<?> kClass, KFunction<?> kFunction) {
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(kClass);
        if (Intrinsics.areEqual(primaryConstructor, kFunction)) {
            return true;
        }
        if (primaryConstructor == null && kClass.getConstructors().size() == 1) {
            return true;
        }
        return false;
    }
}
