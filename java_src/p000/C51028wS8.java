package p000;
/* renamed from: wS8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51028wS8 extends ZP8<Object> {

    /* renamed from: d */
    public final transient Object[] f116024d;

    /* renamed from: e */
    public final transient int f116025e;

    /* renamed from: f */
    public final transient int f116026f;

    public C51028wS8(Object[] objArr, int i, int i2) {
        this.f116024d = objArr;
        this.f116025e = i;
        this.f116026f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C52142yK8.m3664a(i, this.f116026f, "index");
        return this.f116024d[i + i + this.f116025e];
    }

    @Override // p000.XO8
    /* renamed from: h */
    public final boolean mo6791h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f116026f;
    }
}
