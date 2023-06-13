package p000;
/* renamed from: JW7 */
/* loaded from: classes5.dex */
public final class JW7 extends DR7 {

    /* renamed from: d */
    public final transient Object[] f17716d;

    /* renamed from: e */
    public final transient int f17717e;

    /* renamed from: f */
    public final transient int f17718f;

    public JW7(Object[] objArr, int i, int i2) {
        this.f17716d = objArr;
        this.f17717e = i;
        this.f17718f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C34833Nt7.m93213a(i, this.f17718f, "index");
        Object obj = this.f17716d[i + i + this.f17717e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17718f;
    }
}
