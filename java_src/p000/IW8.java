package p000;
/* renamed from: IW8 */
/* loaded from: classes5.dex */
public final class IW8 extends AbstractC50453vU8 {

    /* renamed from: d */
    public final transient Object[] f15858d;

    /* renamed from: e */
    public final transient int f15859e;

    /* renamed from: f */
    public final transient int f15860f;

    public IW8(Object[] objArr, int i, int i2) {
        this.f15858d = objArr;
        this.f15859e = i;
        this.f15860f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DQ8.m110470a(i, this.f15860f, "index");
        Object obj = this.f15858d[i + i + this.f15859e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15860f;
    }
}
