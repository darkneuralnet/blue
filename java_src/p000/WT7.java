package p000;
/* renamed from: WT7 */
/* loaded from: classes5.dex */
public final class WT7 extends AbstractC51557xL7 {

    /* renamed from: d */
    public final transient Object[] f41126d;

    /* renamed from: e */
    public final transient int f41127e;

    /* renamed from: f */
    public final transient int f41128f;

    public WT7(Object[] objArr, int i, int i2) {
        this.f41126d = objArr;
        this.f41127e = i;
        this.f41128f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C31899Bf7.m113729a(i, this.f41128f, "index");
        Object obj = this.f41126d[i + i + this.f41127e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41128f;
    }
}
