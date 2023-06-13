package p000;

import java.util.List;
/* renamed from: zv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53088zv7 extends AbstractC38851bw7 {

    /* renamed from: d */
    public final transient int f122489d;

    /* renamed from: e */
    public final transient int f122490e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC38851bw7 f122491f;

    public C53088zv7(AbstractC38851bw7 abstractC38851bw7, int i, int i2) {
        this.f122491f = abstractC38851bw7;
        this.f122489d = i;
        this.f122490e = i2;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: b */
    public final int mo111b() {
        return this.f122491f.mo110c() + this.f122489d + this.f122490e;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: c */
    public final int mo110c() {
        return this.f122491f.mo110c() + this.f122489d;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: f */
    public final Object[] mo109f() {
        return this.f122491f.mo109f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C41211ft8.m40589a(i, this.f122490e, "index");
        return this.f122491f.get(i + this.f122489d);
    }

    @Override // p000.AbstractC38851bw7
    /* renamed from: h */
    public final AbstractC38851bw7 mo108h(int i, int i2) {
        C41211ft8.m40587c(i, i2, this.f122490e);
        AbstractC38851bw7 abstractC38851bw7 = this.f122491f;
        int i3 = this.f122489d;
        return abstractC38851bw7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f122490e;
    }

    @Override // p000.AbstractC38851bw7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
