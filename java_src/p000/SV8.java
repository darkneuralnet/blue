package p000;
/* renamed from: SV8 */
/* loaded from: classes5.dex */
public final class SV8 extends AbstractC50453vU8 {

    /* renamed from: f */
    public static final AbstractC50453vU8 f33822f = new SV8(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f33823d;

    /* renamed from: e */
    public final transient int f33824e;

    public SV8(Object[] objArr, int i) {
        this.f33823d = objArr;
        this.f33824e = i;
    }

    @Override // p000.AbstractC50453vU8, p000.AbstractC37976aT8
    /* renamed from: a */
    public final int mo5039a(Object[] objArr, int i) {
        System.arraycopy(this.f33823d, 0, objArr, 0, this.f33824e);
        return this.f33824e;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: b */
    public final int mo28915b() {
        return this.f33824e;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: c */
    public final int mo28914c() {
        return 0;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: f */
    public final Object[] mo28913f() {
        return this.f33823d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DQ8.m110470a(i, this.f33824e, "index");
        Object obj = this.f33823d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33824e;
    }
}
