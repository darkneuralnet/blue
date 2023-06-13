package p000;
/* renamed from: DN7 */
/* loaded from: classes5.dex */
public final class DN7 extends AbstractC40292eL7 {

    /* renamed from: d */
    public final transient Object[] f5568d;

    /* renamed from: e */
    public final transient int f5569e;

    /* renamed from: f */
    public final transient int f5570f;

    public DN7(Object[] objArr, int i, int i2) {
        this.f5568d = objArr;
        this.f5569e = i;
        this.f5570f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C44937mA7.m26194a(i, this.f5570f, "index");
        Object obj = this.f5568d[i + i + this.f5569e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5570f;
    }
}
