package p000;
/* renamed from: sM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48601sM6<T> implements InterfaceC50972wM6, InterfaceC46230oM6 {

    /* renamed from: c */
    public static final Object f108678c = new Object();

    /* renamed from: a */
    public volatile InterfaceC50972wM6<T> f108679a;

    /* renamed from: b */
    public volatile Object f108680b = f108678c;

    public C48601sM6(InterfaceC50972wM6<T> interfaceC50972wM6) {
        this.f108679a = interfaceC50972wM6;
    }

    /* renamed from: b */
    public static <P extends InterfaceC50972wM6<T>, T> InterfaceC50972wM6<T> m14272b(P p) {
        C46814pL6.m19449j(p);
        return p instanceof C48601sM6 ? p : new C48601sM6(p);
    }

    /* renamed from: c */
    public static <P extends InterfaceC50972wM6<T>, T> InterfaceC46230oM6<T> m14271c(P p) {
        if (p instanceof InterfaceC46230oM6) {
            return (InterfaceC46230oM6) p;
        }
        C46814pL6.m19449j(p);
        return new C48601sM6(p);
    }

    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final T mo6967a() {
        T t = (T) this.f108680b;
        Object obj = f108678c;
        if (t == obj) {
            synchronized (this) {
                t = this.f108680b;
                if (t == obj) {
                    t = this.f108679a.mo6967a();
                    Object obj2 = this.f108680b;
                    if (obj2 != obj && !(obj2 instanceof C49787uM6) && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f108680b = t;
                    this.f108679a = null;
                }
            }
        }
        return t;
    }
}
