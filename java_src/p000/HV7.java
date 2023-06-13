package p000;
/* renamed from: HV7 */
/* loaded from: classes5.dex */
public final class HV7 extends DR7 {

    /* renamed from: f */
    public static final DR7 f13475f = new HV7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f13476d;

    /* renamed from: e */
    public final transient int f13477e;

    public HV7(Object[] objArr, int i) {
        this.f13476d = objArr;
        this.f13477e = i;
    }

    @Override // p000.DR7, p000.VO7
    /* renamed from: a */
    public final int mo6713a(Object[] objArr, int i) {
        System.arraycopy(this.f13476d, 0, objArr, i, this.f13477e);
        return i + this.f13477e;
    }

    @Override // p000.VO7
    /* renamed from: b */
    public final int mo21068b() {
        return this.f13477e;
    }

    @Override // p000.VO7
    /* renamed from: c */
    public final int mo21067c() {
        return 0;
    }

    @Override // p000.VO7
    /* renamed from: f */
    public final Object[] mo21066f() {
        return this.f13476d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C34833Nt7.m93213a(i, this.f13477e, "index");
        Object obj = this.f13476d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13477e;
    }
}
