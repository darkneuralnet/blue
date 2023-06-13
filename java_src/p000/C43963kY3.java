package p000;
/* renamed from: kY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43963kY3<T> extends C42777iY3<T> {

    /* renamed from: c */
    public final Object f94491c;

    public C43963kY3(int i) {
        super(i);
        this.f94491c = new Object();
    }

    @Override // p000.C42777iY3, p000.InterfaceC41591gY3
    /* renamed from: a */
    public T mo9830a() {
        T t;
        synchronized (this.f94491c) {
            t = (T) super.mo9830a();
        }
        return t;
    }

    @Override // p000.C42777iY3, p000.InterfaceC41591gY3
    /* renamed from: b */
    public boolean mo9829b(T t) {
        boolean mo9829b;
        synchronized (this.f94491c) {
            mo9829b = super.mo9829b(t);
        }
        return mo9829b;
    }
}
