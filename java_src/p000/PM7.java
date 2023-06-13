package p000;

import java.util.List;
/* renamed from: PM7 */
/* loaded from: classes5.dex */
public final class PM7 extends AbstractC42089hN7 {

    /* renamed from: d */
    public final transient int f28355d;

    /* renamed from: e */
    public final transient int f28356e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC42089hN7 f28357f;

    public PM7(AbstractC42089hN7 abstractC42089hN7, int i, int i2) {
        this.f28357f = abstractC42089hN7;
        this.f28355d = i;
        this.f28356e = i2;
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: b */
    public final Object[] mo5318b() {
        return this.f28357f.mo5318b();
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: c */
    public final int mo5317c() {
        return this.f28357f.mo5317c() + this.f28355d;
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: e */
    public final int mo5316e() {
        return this.f28357f.mo5317c() + this.f28355d + this.f28356e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C46222oL7.m21304a(i, this.f28356e, "index");
        return this.f28357f.get(i + this.f28355d);
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: h */
    public final boolean mo5315h() {
        return true;
    }

    @Override // p000.AbstractC42089hN7
    /* renamed from: o */
    public final AbstractC42089hN7 mo36481o(int i, int i2) {
        C46222oL7.m21302c(i, i2, this.f28356e);
        AbstractC42089hN7 abstractC42089hN7 = this.f28357f;
        int i3 = this.f28355d;
        return abstractC42089hN7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28356e;
    }

    @Override // p000.AbstractC42089hN7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
