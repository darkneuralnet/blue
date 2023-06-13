package p000;
/* renamed from: Ym2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37339Ym2<T> implements X94<T> {

    /* renamed from: c */
    public static final Object f46584c = new Object();

    /* renamed from: a */
    public volatile Object f46585a = f46584c;

    /* renamed from: b */
    public volatile X94<T> f46586b;

    public C37339Ym2(X94<T> x94) {
        this.f46586b = x94;
    }

    @Override // p000.X94
    public T get() {
        T t = (T) this.f46585a;
        Object obj = f46584c;
        if (t == obj) {
            synchronized (this) {
                t = this.f46585a;
                if (t == obj) {
                    t = this.f46586b.get();
                    this.f46585a = t;
                    this.f46586b = null;
                }
            }
        }
        return t;
    }
}
