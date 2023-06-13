package p000;

import java.util.List;
/* renamed from: JG8 */
/* loaded from: classes5.dex */
public final class JG8 extends CH8 {

    /* renamed from: d */
    public final transient int f17271d;

    /* renamed from: e */
    public final transient int f17272e;

    /* renamed from: f */
    public final /* synthetic */ CH8 f17273f;

    public JG8(CH8 ch8, int i, int i2) {
        this.f17273f = ch8;
        this.f17271d = i;
        this.f17272e = i2;
    }

    @Override // p000.ZF8
    /* renamed from: b */
    public final int mo5561b() {
        return this.f17273f.mo5560c() + this.f17271d + this.f17272e;
    }

    @Override // p000.ZF8
    /* renamed from: c */
    public final int mo5560c() {
        return this.f17273f.mo5560c() + this.f17271d;
    }

    @Override // p000.ZF8
    /* renamed from: f */
    public final Object[] mo5559f() {
        return this.f17273f.mo5559f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C38425bD8.m64819a(i, this.f17272e, "index");
        return this.f17273f.get(i + this.f17271d);
    }

    @Override // p000.CH8
    /* renamed from: h */
    public final CH8 mo100743h(int i, int i2) {
        C38425bD8.m64817c(i, i2, this.f17272e);
        CH8 ch8 = this.f17273f;
        int i3 = this.f17271d;
        return ch8.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17272e;
    }

    @Override // p000.CH8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
