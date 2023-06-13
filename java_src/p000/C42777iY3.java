package p000;
/* renamed from: iY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42777iY3<T> implements InterfaceC41591gY3<T> {

    /* renamed from: a */
    public final Object[] f87463a;

    /* renamed from: b */
    public int f87464b;

    public C42777iY3(int i) {
        if (i > 0) {
            this.f87463a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000.InterfaceC41591gY3
    /* renamed from: a */
    public T mo9830a() {
        int i = this.f87464b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f87463a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f87464b = i - 1;
        return t;
    }

    @Override // p000.InterfaceC41591gY3
    /* renamed from: b */
    public boolean mo9829b(T t) {
        if (!m33827c(t)) {
            int i = this.f87464b;
            Object[] objArr = this.f87463a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f87464b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: c */
    public final boolean m33827c(T t) {
        for (int i = 0; i < this.f87464b; i++) {
            if (this.f87463a[i] == t) {
                return true;
            }
        }
        return false;
    }
}
