package p000;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.WU2;
/* renamed from: QW2 */
/* loaded from: classes5.dex */
public class QW2 {

    /* renamed from: e */
    public static final C6789c f30454e = new C6789c();

    /* renamed from: f */
    public static final WU2<Object, Object> f30455f = new C6787a();

    /* renamed from: a */
    public final List<C6788b<?, ?>> f30456a;

    /* renamed from: b */
    public final C6789c f30457b;

    /* renamed from: c */
    public final Set<C6788b<?, ?>> f30458c;

    /* renamed from: d */
    public final InterfaceC41591gY3<List<Throwable>> f30459d;

    /* renamed from: QW2$a */
    /* loaded from: classes5.dex */
    public static class C6787a implements WU2<Object, Object> {
        @Override // p000.WU2
        /* renamed from: a */
        public boolean mo19952a(Object obj) {
            return false;
        }

        @Override // p000.WU2
        /* renamed from: b */
        public WU2.C9060a<Object> mo19951b(Object obj, int i, int i2, C48964sy3 c48964sy3) {
            return null;
        }
    }

    /* renamed from: QW2$b */
    /* loaded from: classes5.dex */
    public static class C6788b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f30460a;

        /* renamed from: b */
        public final Class<Data> f30461b;

        /* renamed from: c */
        public final XU2<? extends Model, ? extends Data> f30462c;

        public C6788b(Class<Model> cls, Class<Data> cls2, XU2<? extends Model, ? extends Data> xu2) {
            this.f30460a = cls;
            this.f30461b = cls2;
            this.f30462c = xu2;
        }

        /* renamed from: a */
        public boolean m88445a(Class<?> cls) {
            return this.f30460a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m88444b(Class<?> cls, Class<?> cls2) {
            return m88445a(cls) && this.f30461b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: QW2$c */
    /* loaded from: classes5.dex */
    public static class C6789c {
        /* renamed from: a */
        public <Model, Data> PW2<Model, Data> m88443a(List<WU2<Model, Data>> list, InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
            return new PW2<>(list, interfaceC41591gY3);
        }
    }

    public QW2(InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
        this(interfaceC41591gY3, f30454e);
    }

    /* renamed from: f */
    public static <Model, Data> WU2<Model, Data> m88447f() {
        return (WU2<Model, Data>) f30455f;
    }

    /* renamed from: a */
    public final <Model, Data> void m88452a(Class<Model> cls, Class<Data> cls2, XU2<? extends Model, ? extends Data> xu2, boolean z) {
        int i;
        C6788b<?, ?> c6788b = new C6788b<>(cls, cls2, xu2);
        List<C6788b<?, ?>> list = this.f30456a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, c6788b);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void m88451b(Class<Model> cls, Class<Data> cls2, XU2<? extends Model, ? extends Data> xu2) {
        m88452a(cls, cls2, xu2, true);
    }

    /* renamed from: c */
    public final <Model, Data> WU2<Model, Data> m88450c(C6788b<?, ?> c6788b) {
        return (WU2) C52865zZ3.m1111d(c6788b.f30462c.mo19945b(this));
    }

    /* renamed from: d */
    public synchronized <Model, Data> WU2<Model, Data> m88449d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C6788b<?, ?> c6788b : this.f30456a) {
                if (this.f30458c.contains(c6788b)) {
                    z = true;
                } else if (c6788b.m88444b(cls, cls2)) {
                    this.f30458c.add(c6788b);
                    arrayList.add(m88450c(c6788b));
                    this.f30458c.remove(c6788b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f30457b.m88443a(arrayList, this.f30459d);
            } else if (arrayList.size() == 1) {
                return (WU2) arrayList.get(0);
            } else if (z) {
                return m88447f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f30458c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public synchronized <Model> List<WU2<Model, ?>> m88448e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C6788b<?, ?> c6788b : this.f30456a) {
                if (!this.f30458c.contains(c6788b) && c6788b.m88445a(cls)) {
                    this.f30458c.add(c6788b);
                    arrayList.add(m88450c(c6788b));
                    this.f30458c.remove(c6788b);
                }
            }
        } catch (Throwable th) {
            this.f30458c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: g */
    public synchronized List<Class<?>> m88446g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C6788b<?, ?> c6788b : this.f30456a) {
            if (!arrayList.contains(c6788b.f30461b) && c6788b.m88445a(cls)) {
                arrayList.add(c6788b.f30461b);
            }
        }
        return arrayList;
    }

    public QW2(InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3, C6789c c6789c) {
        this.f30456a = new ArrayList();
        this.f30458c = new HashSet();
        this.f30459d = interfaceC41591gY3;
        this.f30457b = c6789c;
    }
}
