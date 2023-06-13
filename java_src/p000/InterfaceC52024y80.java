package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* renamed from: y80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC52024y80<R, T> {

    /* renamed from: y80$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30429a {
        /* renamed from: b */
        public static Type m4084b(int i, ParameterizedType parameterizedType) {
            return C34031Ki6.m98477g(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m4083c(Type type) {
            return C34031Ki6.m98476h(type);
        }

        /* renamed from: a */
        public abstract InterfaceC52024y80<?, ?> mo1288a(Type type, Annotation[] annotationArr, MN4 mn4);
    }

    /* renamed from: a */
    Type mo1287a();

    /* renamed from: b */
    T mo1286b(InterfaceC51431x80<R> interfaceC51431x80);
}
