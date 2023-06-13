package p000;

import java.util.List;
/* renamed from: qk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47643qk7 extends AbstractC44688ll7 {

    /* renamed from: d */
    public final transient int f105711d;

    /* renamed from: e */
    public final transient int f105712e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC44688ll7 f105713f;

    public C47643qk7(AbstractC44688ll7 abstractC44688ll7, int i, int i2) {
        this.f105713f = abstractC44688ll7;
        this.f105711d = i;
        this.f105712e = i2;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: b */
    public final int mo17168b() {
        return this.f105713f.mo17167c() + this.f105711d + this.f105712e;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: c */
    public final int mo17167c() {
        return this.f105713f.mo17167c() + this.f105711d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Uo9.m80802a(i, this.f105712e, "index");
        return this.f105713f.get(i + this.f105711d);
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: h */
    public final boolean mo17166h() {
        return true;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: j */
    public final Object[] mo17165j() {
        return this.f105713f.mo17165j();
    }

    @Override // p000.AbstractC44688ll7
    /* renamed from: o */
    public final AbstractC44688ll7 mo17164o(int i, int i2) {
        Uo9.m80800c(i, i2, this.f105712e);
        AbstractC44688ll7 abstractC44688ll7 = this.f105713f;
        int i3 = this.f105711d;
        return abstractC44688ll7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f105712e;
    }

    @Override // p000.AbstractC44688ll7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
