package p000;

import java.util.List;
/* renamed from: OP8 */
/* loaded from: classes6.dex */
public final class OP8 extends ZP8 {

    /* renamed from: d */
    public final transient int f26550d;

    /* renamed from: e */
    public final transient int f26551e;

    /* renamed from: f */
    public final /* synthetic */ ZP8 f26552f;

    public OP8(ZP8 zp8, int i, int i2) {
        this.f26552f = zp8;
        this.f26550d = i;
        this.f26551e = i2;
    }

    @Override // p000.XO8
    /* renamed from: b */
    public final int mo77028b() {
        return this.f26552f.mo77027c() + this.f26550d + this.f26551e;
    }

    @Override // p000.XO8
    /* renamed from: c */
    public final int mo77027c() {
        return this.f26552f.mo77027c() + this.f26550d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C52142yK8.m3664a(i, this.f26551e, "index");
        return this.f26552f.get(i + this.f26550d);
    }

    @Override // p000.XO8
    /* renamed from: h */
    public final boolean mo6791h() {
        return true;
    }

    @Override // p000.XO8
    /* renamed from: j */
    public final Object[] mo77026j() {
        return this.f26552f.mo77026j();
    }

    @Override // p000.ZP8
    /* renamed from: s */
    public final ZP8 mo73203s(int i, int i2) {
        C52142yK8.m3657h(i, i2, this.f26551e);
        ZP8 zp8 = this.f26552f;
        int i3 = this.f26550d;
        return zp8.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26551e;
    }

    @Override // p000.ZP8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
