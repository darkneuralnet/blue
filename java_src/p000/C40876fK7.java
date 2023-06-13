package p000;
/* renamed from: fK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40876fK7 extends AbstractC38851bw7 {

    /* renamed from: f */
    public static final AbstractC38851bw7 f79892f = new C40876fK7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f79893d;

    /* renamed from: e */
    public final transient int f79894e;

    public C40876fK7(Object[] objArr, int i) {
        this.f79893d = objArr;
        this.f79894e = i;
    }

    @Override // p000.AbstractC38851bw7, p000.AbstractC45944ns7
    /* renamed from: a */
    public final int mo22261a(Object[] objArr, int i) {
        System.arraycopy(this.f79893d, 0, objArr, 0, this.f79894e);
        return this.f79894e;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: b */
    public final int mo111b() {
        return this.f79894e;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: c */
    public final int mo110c() {
        return 0;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: f */
    public final Object[] mo109f() {
        return this.f79893d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C41211ft8.m40589a(i, this.f79894e, "index");
        Object obj = this.f79893d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79894e;
    }
}
