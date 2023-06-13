package p000;
/* renamed from: W51 */
/* loaded from: classes.dex */
public final class W51<T> implements Z94<T>, InterfaceC38163an2<T> {

    /* renamed from: c */
    public static final Object f40392c = new Object();

    /* renamed from: a */
    public volatile Z94<T> f40393a;

    /* renamed from: b */
    public volatile Object f40394b = f40392c;

    public W51(Z94<T> z94) {
        this.f40393a = z94;
    }

    /* renamed from: a */
    public static <P extends Z94<T>, T> InterfaceC38163an2<T> m78853a(P p) {
        if (p instanceof InterfaceC38163an2) {
            return (InterfaceC38163an2) p;
        }
        return new W51((Z94) C52272yZ3.m3259b(p));
    }

    /* renamed from: b */
    public static <P extends Z94<T>, T> Z94<T> m78852b(P p) {
        C52272yZ3.m3259b(p);
        if (p instanceof W51) {
            return p;
        }
        return new W51(p);
    }

    /* renamed from: c */
    public static Object m78851c(Object obj, Object obj2) {
        boolean z;
        if (obj != f40392c) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // p000.Z94
    public T get() {
        T t = (T) this.f40394b;
        Object obj = f40392c;
        if (t == obj) {
            synchronized (this) {
                t = this.f40394b;
                if (t == obj) {
                    t = this.f40393a.get();
                    this.f40394b = m78851c(this.f40394b, t);
                    this.f40393a = null;
                }
            }
        }
        return t;
    }
}
