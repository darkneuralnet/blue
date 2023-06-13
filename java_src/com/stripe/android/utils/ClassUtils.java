package com.stripe.android.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J$\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J,\u0010\r\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/utils/ClassUtils;", "", "()V", "findField", "Ljava/lang/reflect/Field;", "clazz", "Ljava/lang/Class;", "allowedFields", "", "", "findMethod", "Ljava/lang/reflect/Method;", "allowedMethods", "getInternalObject", "", "obj", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nClassUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassUtils.kt\ncom/stripe/android/utils/ClassUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n1282#2,2:56\n1282#2,2:58\n*S KotlinDebug\n*F\n+ 1 ClassUtils.kt\ncom/stripe/android/utils/ClassUtils\n*L\n36#1:56,2\n50#1:58,2\n*E\n"})
/* loaded from: classes7.dex */
public final class ClassUtils {
    public static final ClassUtils INSTANCE = new ClassUtils();

    private ClassUtils() {
    }

    @JvmStatic
    public static final Field findField(Class<?> clazz, Collection<String> allowedFields) {
        Field field;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedFields, "allowedFields");
        Field[] fields = clazz.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(fields, "fields");
        int length = fields.length;
        int i = 0;
        while (true) {
            if (i < length) {
                field = fields[i];
                if (allowedFields.contains(field.getName())) {
                    break;
                }
                i++;
            } else {
                field = null;
                break;
            }
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @JvmStatic
    public static final Method findMethod(Class<?> clazz, Collection<String> allowedMethods) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedMethods, "allowedMethods");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "clazz.declaredMethods");
        for (Method method : declaredMethods) {
            if (allowedMethods.contains(method.getName())) {
                return method;
            }
        }
        return null;
    }

    @JvmStatic
    public static final Object getInternalObject(Class<?> clazz, Set<String> allowedFields, Object obj) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedFields, "allowedFields");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Field findField = findField(clazz, allowedFields);
        if (findField == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(findField.get(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            return null;
        }
        return m116783constructorimpl;
    }
}
