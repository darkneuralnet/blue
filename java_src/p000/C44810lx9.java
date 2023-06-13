package p000;
/* renamed from: lx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44810lx9 extends Ed9 {

    /* renamed from: d */
    public final transient Object[] f97014d;

    /* renamed from: e */
    public final transient int f97015e;

    /* renamed from: f */
    public final transient int f97016f;

    public C44810lx9(Object[] objArr, int i, int i2) {
        this.f97014d = objArr;
        this.f97015e = i;
        this.f97016f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C43433je8.m30137a(i, this.f97016f, "index");
        Object obj = this.f97014d[i + i + this.f97015e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f97016f;
    }
}
