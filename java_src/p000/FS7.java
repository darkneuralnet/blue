package p000;
/* renamed from: FS7 */
/* loaded from: classes5.dex */
public final class FS7 extends AbstractC51557xL7 {

    /* renamed from: f */
    public static final AbstractC51557xL7 f9398f = new FS7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f9399d;

    /* renamed from: e */
    public final transient int f9400e;

    public FS7(Object[] objArr, int i) {
        this.f9399d = objArr;
        this.f9400e = i;
    }

    @Override // p000.AbstractC51557xL7, p000.AbstractC47983rJ7
    /* renamed from: a */
    public final int mo5429a(Object[] objArr, int i) {
        System.arraycopy(this.f9399d, 0, objArr, 0, this.f9400e);
        return this.f9400e;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: b */
    public final int mo16057b() {
        return this.f9400e;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: c */
    public final int mo16056c() {
        return 0;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: f */
    public final Object[] mo16055f() {
        return this.f9399d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C31899Bf7.m113729a(i, this.f9400e, "index");
        Object obj = this.f9399d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9400e;
    }
}
