package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* renamed from: uj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49998uj1 {

    /* renamed from: a */
    public static final InterfaceC29292g<Object> f112799a = new C29286a();

    /* renamed from: uj1$a */
    /* loaded from: classes5.dex */
    public class C29286a implements InterfaceC29292g<Object> {
        @Override // p000.C49998uj1.InterfaceC29292g
        public void reset(Object obj) {
        }
    }

    /* renamed from: uj1$b */
    /* loaded from: classes5.dex */
    public class C29287b implements InterfaceC29289d<List<T>> {
        @Override // p000.C49998uj1.InterfaceC29289d
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* renamed from: uj1$c */
    /* loaded from: classes5.dex */
    public class C29288c implements InterfaceC29292g<List<T>> {
        @Override // p000.C49998uj1.InterfaceC29292g
        /* renamed from: a */
        public void reset(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: uj1$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC29289d<T> {
        T create();
    }

    /* renamed from: uj1$e */
    /* loaded from: classes5.dex */
    public static final class C29290e<T> implements InterfaceC41591gY3<T> {

        /* renamed from: a */
        public final InterfaceC29289d<T> f112800a;

        /* renamed from: b */
        public final InterfaceC29292g<T> f112801b;

        /* renamed from: c */
        public final InterfaceC41591gY3<T> f112802c;

        public C29290e(InterfaceC41591gY3<T> interfaceC41591gY3, InterfaceC29289d<T> interfaceC29289d, InterfaceC29292g<T> interfaceC29292g) {
            this.f112802c = interfaceC41591gY3;
            this.f112800a = interfaceC29289d;
            this.f112801b = interfaceC29292g;
        }

        @Override // p000.InterfaceC41591gY3
        /* renamed from: a */
        public T mo9830a() {
            T mo9830a = this.f112802c.mo9830a();
            if (mo9830a == null) {
                mo9830a = this.f112800a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo9830a.getClass());
                }
            }
            if (mo9830a instanceof InterfaceC29291f) {
                ((InterfaceC29291f) mo9830a).mo9828e().mo96960b(false);
            }
            return mo9830a;
        }

        @Override // p000.InterfaceC41591gY3
        /* renamed from: b */
        public boolean mo9829b(T t) {
            if (t instanceof InterfaceC29291f) {
                ((InterfaceC29291f) t).mo9828e().mo96960b(true);
            }
            this.f112801b.reset(t);
            return this.f112802c.mo9829b(t);
        }
    }

    /* renamed from: uj1$f */
    /* loaded from: classes5.dex */
    public interface InterfaceC29291f {
        /* renamed from: e */
        LP5 mo9828e();
    }

    /* renamed from: uj1$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC29292g<T> {
        void reset(T t);
    }

    private C49998uj1() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC29291f> InterfaceC41591gY3<T> m9838a(InterfaceC41591gY3<T> interfaceC41591gY3, InterfaceC29289d<T> interfaceC29289d) {
        return m9837b(interfaceC41591gY3, interfaceC29289d, m9836c());
    }

    /* renamed from: b */
    public static <T> InterfaceC41591gY3<T> m9837b(InterfaceC41591gY3<T> interfaceC41591gY3, InterfaceC29289d<T> interfaceC29289d, InterfaceC29292g<T> interfaceC29292g) {
        return new C29290e(interfaceC41591gY3, interfaceC29289d, interfaceC29292g);
    }

    /* renamed from: c */
    public static <T> InterfaceC29292g<T> m9836c() {
        return (InterfaceC29292g<T>) f112799a;
    }

    /* renamed from: d */
    public static <T extends InterfaceC29291f> InterfaceC41591gY3<T> m9835d(int i, InterfaceC29289d<T> interfaceC29289d) {
        return m9838a(new C43963kY3(i), interfaceC29289d);
    }

    /* renamed from: e */
    public static <T> InterfaceC41591gY3<List<T>> m9834e() {
        return m9833f(20);
    }

    /* renamed from: f */
    public static <T> InterfaceC41591gY3<List<T>> m9833f(int i) {
        return m9837b(new C43963kY3(i), new C29287b(), new C29288c());
    }
}
