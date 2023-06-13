package p000;

import dagger.Lazy;
/* renamed from: V51 */
/* loaded from: classes7.dex */
public final class V51<T> implements Y94<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f38587c = new Object();

    /* renamed from: a */
    public volatile Y94<T> f38588a;

    /* renamed from: b */
    public volatile Object f38589b = f38587c;

    public V51(Y94<T> y94) {
        this.f38588a = y94;
    }

    /* renamed from: a */
    public static <P extends Y94<T>, T> Lazy<T> m80430a(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new V51((Y94) C51679xZ3.m5005b(p));
    }

    /* renamed from: b */
    public static <P extends Y94<T>, T> Y94<T> m80429b(P p) {
        C51679xZ3.m5005b(p);
        if (p instanceof V51) {
            return p;
        }
        return new V51(p);
    }

    /* renamed from: c */
    public static Object m80428c(Object obj, Object obj2) {
        boolean z;
        if (obj != f38587c) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // p000.Y94
    public T get() {
        T t = (T) this.f38589b;
        Object obj = f38587c;
        if (t == obj) {
            synchronized (this) {
                t = this.f38589b;
                if (t == obj) {
                    t = this.f38588a.get();
                    this.f38589b = m80428c(this.f38589b, t);
                    this.f38588a = null;
                }
            }
        }
        return t;
    }
}
