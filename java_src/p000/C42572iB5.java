package p000;
/* renamed from: iB5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42572iB5<T> implements Y94<T> {

    /* renamed from: c */
    public static final Object f86856c = new Object();

    /* renamed from: a */
    public volatile Y94<T> f86857a;

    /* renamed from: b */
    public volatile Object f86858b = f86856c;

    public C42572iB5(Y94<T> y94) {
        this.f86857a = y94;
    }

    /* renamed from: a */
    public static <P extends Y94<T>, T> Y94<T> m34371a(P p) {
        if (!(p instanceof C42572iB5) && !(p instanceof V51)) {
            return new C42572iB5((Y94) C51679xZ3.m5005b(p));
        }
        return p;
    }

    @Override // p000.Y94
    public T get() {
        T t = (T) this.f86858b;
        if (t == f86856c) {
            Y94<T> y94 = this.f86857a;
            if (y94 == null) {
                return (T) this.f86858b;
            }
            T t2 = y94.get();
            this.f86858b = t2;
            this.f86857a = null;
            return t2;
        }
        return t;
    }
}
