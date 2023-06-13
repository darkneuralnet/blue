package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.C34031Ki6;
/* renamed from: IN1 */
/* loaded from: classes8.dex */
public abstract class IN1<ResponseT, ReturnT> extends AbstractC37639Zt5<ReturnT> {

    /* renamed from: a */
    public final KI4 f15406a;

    /* renamed from: b */
    public final Call.Factory f15407b;

    /* renamed from: c */
    public final InterfaceC48496sB0<ResponseBody, ResponseT> f15408c;

    /* renamed from: IN1$a */
    /* loaded from: classes8.dex */
    public static final class C3518a<ResponseT, ReturnT> extends IN1<ResponseT, ReturnT> {

        /* renamed from: d */
        public final InterfaceC52024y80<ResponseT, ReturnT> f15409d;

        public C3518a(KI4 ki4, Call.Factory factory, InterfaceC48496sB0<ResponseBody, ResponseT> interfaceC48496sB0, InterfaceC52024y80<ResponseT, ReturnT> interfaceC52024y80) {
            super(ki4, factory, interfaceC48496sB0);
            this.f15409d = interfaceC52024y80;
        }

        @Override // p000.IN1
        /* renamed from: c */
        public ReturnT mo102448c(InterfaceC51431x80<ResponseT> interfaceC51431x80, Object[] objArr) {
            return this.f15409d.mo1286b(interfaceC51431x80);
        }
    }

    /* renamed from: IN1$b */
    /* loaded from: classes8.dex */
    public static final class C3519b<ResponseT> extends IN1<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC52024y80<ResponseT, InterfaceC51431x80<ResponseT>> f15410d;

        /* renamed from: e */
        public final boolean f15411e;

        public C3519b(KI4 ki4, Call.Factory factory, InterfaceC48496sB0<ResponseBody, ResponseT> interfaceC48496sB0, InterfaceC52024y80<ResponseT, InterfaceC51431x80<ResponseT>> interfaceC52024y80, boolean z) {
            super(ki4, factory, interfaceC48496sB0);
            this.f15410d = interfaceC52024y80;
            this.f15411e = z;
        }

        @Override // p000.IN1
        /* renamed from: c */
        public Object mo102448c(InterfaceC51431x80<ResponseT> interfaceC51431x80, Object[] objArr) {
            InterfaceC51431x80<ResponseT> mo1286b = this.f15410d.mo1286b(interfaceC51431x80);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (this.f15411e) {
                    return C31948Bl2.m113526b(mo1286b, continuation);
                }
                return C31948Bl2.m113527a(mo1286b, continuation);
            } catch (Exception e) {
                return C31948Bl2.m113524d(e, continuation);
            }
        }
    }

    /* renamed from: IN1$c */
    /* loaded from: classes8.dex */
    public static final class C3520c<ResponseT> extends IN1<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC52024y80<ResponseT, InterfaceC51431x80<ResponseT>> f15412d;

        public C3520c(KI4 ki4, Call.Factory factory, InterfaceC48496sB0<ResponseBody, ResponseT> interfaceC48496sB0, InterfaceC52024y80<ResponseT, InterfaceC51431x80<ResponseT>> interfaceC52024y80) {
            super(ki4, factory, interfaceC48496sB0);
            this.f15412d = interfaceC52024y80;
        }

        @Override // p000.IN1
        /* renamed from: c */
        public Object mo102448c(InterfaceC51431x80<ResponseT> interfaceC51431x80, Object[] objArr) {
            InterfaceC51431x80<ResponseT> mo1286b = this.f15412d.mo1286b(interfaceC51431x80);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return C31948Bl2.m113525c(mo1286b, continuation);
            } catch (Exception e) {
                return C31948Bl2.m113524d(e, continuation);
            }
        }
    }

    public IN1(KI4 ki4, Call.Factory factory, InterfaceC48496sB0<ResponseBody, ResponseT> interfaceC48496sB0) {
        this.f15406a = ki4;
        this.f15407b = factory;
        this.f15408c = interfaceC48496sB0;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> InterfaceC52024y80<ResponseT, ReturnT> m102451d(MN4 mn4, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC52024y80<ResponseT, ReturnT>) mn4.m95386a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C34031Ki6.m98470n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> InterfaceC48496sB0<ResponseBody, ResponseT> m102450e(MN4 mn4, Method method, Type type) {
        try {
            return mn4.m95378i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C34031Ki6.m98470n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> IN1<ResponseT, ReturnT> m102449f(MN4 mn4, Method method, KI4 ki4) {
        Type genericReturnType;
        boolean z;
        boolean z2 = ki4.f19392k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type m98478f = C34031Ki6.m98478f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C34031Ki6.m98476h(m98478f) == HM4.class && (m98478f instanceof ParameterizedType)) {
                m98478f = C34031Ki6.m98477g(0, (ParameterizedType) m98478f);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new C34031Ki6.C4554b(null, InterfaceC51431x80.class, m98478f);
            annotations = LB5.m97606a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        InterfaceC52024y80 m102451d = m102451d(mn4, method, genericReturnType, annotations);
        Type mo1287a = m102451d.mo1287a();
        if (mo1287a != Response.class) {
            if (mo1287a != HM4.class) {
                if (ki4.f19384c.equals("HEAD") && !Void.class.equals(mo1287a)) {
                    throw C34031Ki6.m98471m(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                InterfaceC48496sB0 m102450e = m102450e(mn4, method, mo1287a);
                Call.Factory factory = mn4.f23030b;
                if (!z2) {
                    return new C3518a(ki4, factory, m102450e, m102451d);
                }
                if (z) {
                    return new C3520c(ki4, factory, m102450e, m102451d);
                }
                return new C3519b(ki4, factory, m102450e, m102451d, false);
            }
            throw C34031Ki6.m98471m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw C34031Ki6.m98471m(method, "'" + C34031Ki6.m98476h(mo1287a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    @Override // p000.AbstractC37639Zt5
    /* renamed from: a */
    public final ReturnT mo72347a(Object[] objArr) {
        return mo102448c(new C34226Le3(this.f15406a, objArr, this.f15407b, this.f15408c), objArr);
    }

    /* renamed from: c */
    public abstract ReturnT mo102448c(InterfaceC51431x80<ResponseT> interfaceC51431x80, Object[] objArr);
}
