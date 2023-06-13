package p000;
/* renamed from: KL7 */
/* loaded from: classes5.dex */
public final class KL7 extends AbstractC38851bw7 {

    /* renamed from: d */
    public final transient Object[] f19457d;

    /* renamed from: e */
    public final transient int f19458e;

    /* renamed from: f */
    public final transient int f19459f;

    public KL7(Object[] objArr, int i, int i2) {
        this.f19457d = objArr;
        this.f19458e = i;
        this.f19459f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C41211ft8.m40589a(i, this.f19459f, "index");
        Object obj = this.f19457d[i + i + this.f19458e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19459f;
    }
}
