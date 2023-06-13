package p000;
/* renamed from: zS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52806zS7 extends HL7 {

    /* renamed from: d */
    public final transient Object[] f121390d;

    /* renamed from: e */
    public final transient int f121391e;

    /* renamed from: f */
    public final transient int f121392f;

    public C52806zS7(Object[] objArr, int i, int i2) {
        this.f121390d = objArr;
        this.f121391e = i;
        this.f121392f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C50566vg7.m8263a(i, this.f121392f, "index");
        Object obj = this.f121390d[i + i + this.f121391e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f121392f;
    }
}
