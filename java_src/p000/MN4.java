package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.C37737a40;
import p000.InterfaceC48496sB0;
import p000.InterfaceC52024y80;
/* renamed from: MN4 */
/* loaded from: classes8.dex */
public final class MN4 {

    /* renamed from: a */
    public final Map<Method, AbstractC37639Zt5<?>> f23029a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Call.Factory f23030b;

    /* renamed from: c */
    public final HttpUrl f23031c;

    /* renamed from: d */
    public final List<InterfaceC48496sB0.AbstractC28229a> f23032d;

    /* renamed from: e */
    public final List<InterfaceC52024y80.AbstractC30429a> f23033e;

    /* renamed from: f */
    public final Executor f23034f;

    /* renamed from: g */
    public final boolean f23035g;

    /* renamed from: MN4$a */
    /* loaded from: classes8.dex */
    public class C5281a implements InvocationHandler {

        /* renamed from: a */
        public final C50457vV3 f23036a = C50457vV3.m8578g();

        /* renamed from: b */
        public final Object[] f23037b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f23038c;

        public C5281a(Class cls) {
            this.f23038c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f23037b;
            }
            if (this.f23036a.m8577i(method)) {
                return this.f23036a.mo8575h(method, this.f23038c, obj, objArr);
            }
            return MN4.this.m95384c(method).mo72347a(objArr);
        }
    }

    public MN4(Call.Factory factory, HttpUrl httpUrl, List<InterfaceC48496sB0.AbstractC28229a> list, List<InterfaceC52024y80.AbstractC30429a> list2, Executor executor, boolean z) {
        this.f23030b = factory;
        this.f23031c = httpUrl;
        this.f23032d = list;
        this.f23033e = list2;
        this.f23034f = executor;
        this.f23035g = z;
    }

    /* renamed from: a */
    public InterfaceC52024y80<?, ?> m95386a(Type type, Annotation[] annotationArr) {
        return m95382e(null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T m95385b(Class<T> cls) {
        m95376k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C5281a(cls));
    }

    /* renamed from: c */
    public AbstractC37639Zt5<?> m95384c(Method method) {
        AbstractC37639Zt5<?> abstractC37639Zt5;
        AbstractC37639Zt5<?> abstractC37639Zt52 = this.f23029a.get(method);
        if (abstractC37639Zt52 != null) {
            return abstractC37639Zt52;
        }
        synchronized (this.f23029a) {
            abstractC37639Zt5 = this.f23029a.get(method);
            if (abstractC37639Zt5 == null) {
                abstractC37639Zt5 = AbstractC37639Zt5.m72346b(this, method);
                this.f23029a.put(method, abstractC37639Zt5);
            }
        }
        return abstractC37639Zt5;
    }

    /* renamed from: d */
    public C5282b m95383d() {
        return new C5282b(this);
    }

    /* renamed from: e */
    public InterfaceC52024y80<?, ?> m95382e(InterfaceC52024y80.AbstractC30429a abstractC30429a, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f23033e.indexOf(abstractC30429a) + 1;
        int size = this.f23033e.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC52024y80<?, ?> mo1288a = this.f23033e.get(i).mo1288a(type, annotationArr, this);
            if (mo1288a != null) {
                return mo1288a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC30429a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f23033e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f23033e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f23033e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> InterfaceC48496sB0<T, RequestBody> m95381f(InterfaceC48496sB0.AbstractC28229a abstractC28229a, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f23032d.indexOf(abstractC28229a) + 1;
        int size = this.f23032d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC48496sB0<T, RequestBody> interfaceC48496sB0 = (InterfaceC48496sB0<T, RequestBody>) this.f23032d.get(i).mo14588c(type, annotationArr, annotationArr2, this);
            if (interfaceC48496sB0 != null) {
                return interfaceC48496sB0;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC28229a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f23032d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f23032d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f23032d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> InterfaceC48496sB0<ResponseBody, T> m95380g(InterfaceC48496sB0.AbstractC28229a abstractC28229a, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f23032d.indexOf(abstractC28229a) + 1;
        int size = this.f23032d.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC48496sB0<ResponseBody, T> interfaceC48496sB0 = (InterfaceC48496sB0<ResponseBody, T>) this.f23032d.get(i).mo14587d(type, annotationArr, this);
            if (interfaceC48496sB0 != null) {
                return interfaceC48496sB0;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC28229a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f23032d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f23032d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f23032d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> InterfaceC48496sB0<T, RequestBody> m95379h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m95381f(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public <T> InterfaceC48496sB0<ResponseBody, T> m95378i(Type type, Annotation[] annotationArr) {
        return m95380g(null, type, annotationArr);
    }

    /* renamed from: j */
    public <T> InterfaceC48496sB0<T, String> m95377j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f23032d.size();
        for (int i = 0; i < size; i++) {
            InterfaceC48496sB0<T, String> interfaceC48496sB0 = (InterfaceC48496sB0<T, String>) this.f23032d.get(i).m14586e(type, annotationArr, this);
            if (interfaceC48496sB0 != null) {
                return interfaceC48496sB0;
            }
        }
        return C37737a40.C10560d.f49773a;
    }

    /* renamed from: k */
    public final void m95376k(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f23035g) {
                C50457vV3 m8578g = C50457vV3.m8578g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!m8578g.m8577i(method) && !Modifier.isStatic(method.getModifiers())) {
                        m95384c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: MN4$b */
    /* loaded from: classes8.dex */
    public static final class C5282b {

        /* renamed from: a */
        public final C50457vV3 f23040a;

        /* renamed from: b */
        public Call.Factory f23041b;

        /* renamed from: c */
        public HttpUrl f23042c;

        /* renamed from: d */
        public final List<InterfaceC48496sB0.AbstractC28229a> f23043d;

        /* renamed from: e */
        public final List<InterfaceC52024y80.AbstractC30429a> f23044e;

        /* renamed from: f */
        public Executor f23045f;

        /* renamed from: g */
        public boolean f23046g;

        public C5282b(C50457vV3 c50457vV3) {
            this.f23043d = new ArrayList();
            this.f23044e = new ArrayList();
            this.f23040a = c50457vV3;
        }

        /* renamed from: a */
        public C5282b m95375a(InterfaceC52024y80.AbstractC30429a abstractC30429a) {
            List<InterfaceC52024y80.AbstractC30429a> list = this.f23044e;
            Objects.requireNonNull(abstractC30429a, "factory == null");
            list.add(abstractC30429a);
            return this;
        }

        /* renamed from: b */
        public C5282b m95374b(InterfaceC48496sB0.AbstractC28229a abstractC28229a) {
            List<InterfaceC48496sB0.AbstractC28229a> list = this.f23043d;
            Objects.requireNonNull(abstractC28229a, "factory == null");
            list.add(abstractC28229a);
            return this;
        }

        /* renamed from: c */
        public C5282b m95373c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m95372d(HttpUrl.get(str));
        }

        /* renamed from: d */
        public C5282b m95372d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f23042c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: e */
        public MN4 m95371e() {
            if (this.f23042c != null) {
                Call.Factory factory = this.f23041b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f23045f;
                if (executor == null) {
                    executor = this.f23040a.mo8576c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f23044e);
                arrayList.addAll(this.f23040a.m8583a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f23043d.size() + 1 + this.f23040a.m8580e());
                arrayList2.add(new C37737a40());
                arrayList2.addAll(this.f23043d);
                arrayList2.addAll(this.f23040a.m8581d());
                return new MN4(factory2, this.f23042c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f23046g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public C5282b m95370f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f23041b = factory;
            return this;
        }

        /* renamed from: g */
        public C5282b m95369g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return m95370f(okHttpClient);
        }

        public C5282b() {
            this(C50457vV3.m8578g());
        }

        public C5282b(MN4 mn4) {
            this.f23043d = new ArrayList();
            this.f23044e = new ArrayList();
            C50457vV3 m8578g = C50457vV3.m8578g();
            this.f23040a = m8578g;
            this.f23041b = mn4.f23030b;
            this.f23042c = mn4.f23031c;
            int size = mn4.f23032d.size() - m8578g.m8580e();
            for (int i = 1; i < size; i++) {
                this.f23043d.add(mn4.f23032d.get(i));
            }
            int size2 = mn4.f23033e.size() - this.f23040a.m8582b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f23044e.add(mn4.f23033e.get(i2));
            }
            this.f23045f = mn4.f23034f;
            this.f23046g = mn4.f23035g;
        }
    }
}
