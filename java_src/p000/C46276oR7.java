package p000;

import java.util.List;
/* renamed from: oR7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46276oR7 extends DR7 {

    /* renamed from: d */
    public final transient int f101999d;

    /* renamed from: e */
    public final transient int f102000e;

    /* renamed from: f */
    public final /* synthetic */ DR7 f102001f;

    public C46276oR7(DR7 dr7, int i, int i2) {
        this.f102001f = dr7;
        this.f101999d = i;
        this.f102000e = i2;
    }

    @Override // p000.VO7
    /* renamed from: b */
    public final int mo21068b() {
        return this.f102001f.mo21067c() + this.f101999d + this.f102000e;
    }

    @Override // p000.VO7
    /* renamed from: c */
    public final int mo21067c() {
        return this.f102001f.mo21067c() + this.f101999d;
    }

    @Override // p000.VO7
    /* renamed from: f */
    public final Object[] mo21066f() {
        return this.f102001f.mo21066f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C34833Nt7.m93213a(i, this.f102000e, "index");
        return this.f102001f.get(i + this.f101999d);
    }

    @Override // p000.DR7
    /* renamed from: h */
    public final DR7 mo21065h(int i, int i2) {
        C34833Nt7.m93211c(i, i2, this.f102000e);
        DR7 dr7 = this.f102001f;
        int i3 = this.f101999d;
        return dr7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f102000e;
    }

    @Override // p000.DR7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
