package p000;
/* renamed from: pM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46824pM7 extends AbstractC40292eL7 {

    /* renamed from: f */
    public static final AbstractC40292eL7 f103571f = new C46824pM7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f103572d;

    /* renamed from: e */
    public final transient int f103573e;

    public C46824pM7(Object[] objArr, int i) {
        this.f103572d = objArr;
        this.f103573e = i;
    }

    @Override // p000.AbstractC40292eL7, p000.OI7
    /* renamed from: a */
    public final int mo19398a(Object[] objArr, int i) {
        System.arraycopy(this.f103572d, 0, objArr, 0, this.f103573e);
        return this.f103573e;
    }

    @Override // p000.OI7
    /* renamed from: b */
    public final int mo19397b() {
        return this.f103573e;
    }

    @Override // p000.OI7
    /* renamed from: c */
    public final int mo19396c() {
        return 0;
    }

    @Override // p000.OI7
    /* renamed from: f */
    public final Object[] mo19395f() {
        return this.f103572d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C44937mA7.m26194a(i, this.f103573e, "index");
        Object obj = this.f103572d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f103573e;
    }
}
