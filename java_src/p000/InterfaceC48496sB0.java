package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
/* renamed from: sB0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC48496sB0<F, T> {

    /* renamed from: sB0$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC28229a {
        /* renamed from: a */
        public static Type m14590a(int i, ParameterizedType parameterizedType) {
            return C34031Ki6.m98477g(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m14589b(Type type) {
            return C34031Ki6.m98476h(type);
        }

        /* renamed from: c */
        public InterfaceC48496sB0<?, RequestBody> mo14588c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, MN4 mn4) {
            return null;
        }

        /* renamed from: d */
        public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotationArr, MN4 mn4) {
            return null;
        }

        /* renamed from: e */
        public InterfaceC48496sB0<?, String> m14586e(Type type, Annotation[] annotationArr, MN4 mn4) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
