package p000;
/* renamed from: xI8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51531xI8 extends CH8 {

    /* renamed from: f */
    public static final CH8 f117358f = new C51531xI8(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f117359d;

    /* renamed from: e */
    public final transient int f117360e;

    public C51531xI8(Object[] objArr, int i) {
        this.f117359d = objArr;
        this.f117360e = i;
    }

    @Override // p000.CH8, p000.ZF8
    /* renamed from: a */
    public final int mo5562a(Object[] objArr, int i) {
        System.arraycopy(this.f117359d, 0, objArr, 0, this.f117360e);
        return this.f117360e;
    }

    @Override // p000.ZF8
    /* renamed from: b */
    public final int mo5561b() {
        return this.f117360e;
    }

    @Override // p000.ZF8
    /* renamed from: c */
    public final int mo5560c() {
        return 0;
    }

    @Override // p000.ZF8
    /* renamed from: f */
    public final Object[] mo5559f() {
        return this.f117359d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C38425bD8.m64819a(i, this.f117360e, "index");
        Object obj = this.f117359d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f117360e;
    }
}
