package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0002¨\u0006\u0003"}, m28432d2 = {"getStaticJsonValueGetter", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "jackson-module-kotlin"}, m28431k = 2, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KotlinSerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Method getStaticJsonValueGetter(Class<?> cls) {
        boolean z;
        boolean z2;
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "this.declaredMethods");
        for (Method method : declaredMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                Annotation[] annotations = method.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations, "method.annotations");
                int length = annotations.length;
                int i = 0;
                while (true) {
                    z = true;
                    if (i < length) {
                        if (annotations[i] instanceof JsonValue) {
                            z2 = true;
                            break;
                        }
                        i++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return method;
            }
        }
        return null;
    }
}
