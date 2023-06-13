package p000;
/* renamed from: FR8 */
/* loaded from: classes6.dex */
public final class FR8<E> extends ZP8<E> {

    /* renamed from: f */
    public static final ZP8<Object> f9374f = new FR8(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f9375d;

    /* renamed from: e */
    public final transient int f9376e;

    public FR8(Object[] objArr, int i) {
        this.f9375d = objArr;
        this.f9376e = i;
    }

    @Override // p000.ZP8, p000.XO8
    /* renamed from: a */
    public final int mo21022a(Object[] objArr, int i) {
        System.arraycopy(this.f9375d, 0, objArr, 0, this.f9376e);
        return this.f9376e;
    }

    @Override // p000.XO8
    /* renamed from: b */
    public final int mo77028b() {
        return this.f9376e;
    }

    @Override // p000.XO8
    /* renamed from: c */
    public final int mo77027c() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C52142yK8.m3664a(i, this.f9376e, "index");
        E e = (E) this.f9375d[i];
        e.getClass();
        return e;
    }

    @Override // p000.XO8
    /* renamed from: h */
    public final boolean mo6791h() {
        return false;
    }

    @Override // p000.XO8
    /* renamed from: j */
    public final Object[] mo77026j() {
        return this.f9375d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9376e;
    }
}
