package p000;
/* renamed from: U51 */
/* loaded from: classes5.dex */
public final class U51<T> implements Y94<T> {

    /* renamed from: c */
    public static final Object f36828c = new Object();

    /* renamed from: a */
    public volatile Y94<T> f36829a;

    /* renamed from: b */
    public volatile Object f36830b = f36828c;

    public U51(Y94<T> y94) {
        this.f36829a = y94;
    }

    /* renamed from: a */
    public static <P extends Y94<T>, T> Y94<T> m81997a(P p) {
        CZ3.m112116b(p);
        if (p instanceof U51) {
            return p;
        }
        return new U51(p);
    }

    /* renamed from: b */
    public static Object m81996b(Object obj, Object obj2) {
        boolean z;
        if (obj != f36828c && !(obj instanceof NP2)) {
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
        T t = (T) this.f36830b;
        Object obj = f36828c;
        if (t == obj) {
            synchronized (this) {
                t = this.f36830b;
                if (t == obj) {
                    t = this.f36829a.get();
                    this.f36830b = m81996b(this.f36830b, t);
                    this.f36829a = null;
                }
            }
        }
        return t;
    }
}
