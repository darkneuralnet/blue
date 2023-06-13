package p000;
/* renamed from: jY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43370jY3<T> implements InterfaceC42184hY3<T> {

    /* renamed from: a */
    public final Object[] f92918a;

    /* renamed from: b */
    public int f92919b;

    public C43370jY3(int i) {
        if (i > 0) {
            this.f92918a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000.InterfaceC42184hY3
    /* renamed from: a */
    public T mo30348a() {
        int i = this.f92919b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f92918a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f92919b = i - 1;
        return t;
    }

    @Override // p000.InterfaceC42184hY3
    /* renamed from: b */
    public boolean mo30347b(T t) {
        int i = this.f92919b;
        Object[] objArr = this.f92918a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f92919b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC42184hY3
    /* renamed from: c */
    public void mo30346c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f92919b;
            Object[] objArr = this.f92918a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f92919b = i3 + 1;
            }
        }
    }
}
