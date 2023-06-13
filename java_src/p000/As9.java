package p000;
/* renamed from: As9 */
/* loaded from: classes5.dex */
public final class As9 extends Ed9 {

    /* renamed from: f */
    public static final Ed9 f1294f = new As9(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f1295d;

    /* renamed from: e */
    public final transient int f1296e;

    public As9(Object[] objArr, int i) {
        this.f1295d = objArr;
        this.f1296e = i;
    }

    @Override // p000.Ed9, p000.TT8
    /* renamed from: a */
    public final int mo24687a(Object[] objArr, int i) {
        System.arraycopy(this.f1295d, 0, objArr, 0, this.f1296e);
        return this.f1296e;
    }

    @Override // p000.TT8
    /* renamed from: b */
    public final int mo64917b() {
        return this.f1296e;
    }

    @Override // p000.TT8
    /* renamed from: c */
    public final int mo64916c() {
        return 0;
    }

    @Override // p000.TT8
    /* renamed from: f */
    public final Object[] mo64915f() {
        return this.f1295d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C43433je8.m30137a(i, this.f1296e, "index");
        Object obj = this.f1295d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1296e;
    }
}
