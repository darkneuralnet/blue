package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* renamed from: Zt5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC37639Zt5<T> {
    /* renamed from: b */
    public static <T> AbstractC37639Zt5<T> m72346b(MN4 mn4, Method method) {
        KI4 m99034b = KI4.m99034b(mn4, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!C34031Ki6.m98474j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return IN1.m102449f(mn4, method, m99034b);
            }
            throw C34031Ki6.m98471m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw C34031Ki6.m98471m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    /* renamed from: a */
    public abstract T mo72347a(Object[] objArr);
}
