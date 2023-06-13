package p000;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: YU2 */
/* loaded from: classes5.dex */
public class YU2 {

    /* renamed from: a */
    public final QW2 f45920a;

    /* renamed from: b */
    public final C9788a f45921b;

    /* renamed from: YU2$a */
    /* loaded from: classes5.dex */
    public static class C9788a {

        /* renamed from: a */
        public final Map<Class<?>, C9789a<?>> f45922a = new HashMap();

        /* renamed from: YU2$a$a */
        /* loaded from: classes5.dex */
        public static class C9789a<Model> {

            /* renamed from: a */
            public final List<WU2<Model, ?>> f45923a;

            public C9789a(List<WU2<Model, ?>> list) {
                this.f45923a = list;
            }
        }

        /* renamed from: a */
        public void m75000a() {
            this.f45922a.clear();
        }

        /* renamed from: b */
        public <Model> List<WU2<Model, ?>> m74999b(Class<Model> cls) {
            C9789a<?> c9789a = this.f45922a.get(cls);
            if (c9789a == null) {
                return null;
            }
            return (List<WU2<Model, ?>>) c9789a.f45923a;
        }

        /* renamed from: c */
        public <Model> void m74998c(Class<Model> cls, List<WU2<Model, ?>> list) {
            if (this.f45922a.put(cls, new C9789a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public YU2(InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
        this(new QW2(interfaceC41591gY3));
    }

    /* renamed from: b */
    public static <A> Class<A> m75004b(A a) {
        return (Class<A>) a.getClass();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m75005a(Class<Model> cls, Class<Data> cls2, XU2<? extends Model, ? extends Data> xu2) {
        this.f45920a.m88451b(cls, cls2, xu2);
        this.f45921b.m75000a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m75003c(Class<?> cls) {
        return this.f45920a.m88446g(cls);
    }

    /* renamed from: d */
    public <A> List<WU2<A, ?>> m75002d(A a) {
        List<WU2<A, ?>> m75001e = m75001e(m75004b(a));
        if (!m75001e.isEmpty()) {
            int size = m75001e.size();
            List<WU2<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                WU2<A, ?> wu2 = m75001e.get(i);
                if (wu2.mo19952a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(wu2);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, m75001e);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    /* renamed from: e */
    public final synchronized <A> List<WU2<A, ?>> m75001e(Class<A> cls) {
        List<WU2<A, ?>> m74999b;
        m74999b = this.f45921b.m74999b(cls);
        if (m74999b == null) {
            m74999b = Collections.unmodifiableList(this.f45920a.m88448e(cls));
            this.f45921b.m74998c(cls, m74999b);
        }
        return m74999b;
    }

    public YU2(QW2 qw2) {
        this.f45921b = new C9788a();
        this.f45920a = qw2;
    }
}
