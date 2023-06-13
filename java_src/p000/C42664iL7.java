package p000;

import java.util.List;
/* renamed from: iL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42664iL7 extends AbstractC51557xL7 {

    /* renamed from: d */
    public final transient int f87190d;

    /* renamed from: e */
    public final transient int f87191e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC51557xL7 f87192f;

    public C42664iL7(AbstractC51557xL7 abstractC51557xL7, int i, int i2) {
        this.f87192f = abstractC51557xL7;
        this.f87190d = i;
        this.f87191e = i2;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: b */
    public final int mo16057b() {
        return this.f87192f.mo16056c() + this.f87190d + this.f87191e;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: c */
    public final int mo16056c() {
        return this.f87192f.mo16056c() + this.f87190d;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: f */
    public final Object[] mo16055f() {
        return this.f87192f.mo16055f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C31899Bf7.m113729a(i, this.f87191e, "index");
        return this.f87192f.get(i + this.f87190d);
    }

    @Override // p000.AbstractC51557xL7
    /* renamed from: h */
    public final AbstractC51557xL7 mo5427h(int i, int i2) {
        C31899Bf7.m113727c(i, i2, this.f87191e);
        AbstractC51557xL7 abstractC51557xL7 = this.f87192f;
        int i3 = this.f87190d;
        return abstractC51557xL7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f87191e;
    }

    @Override // p000.AbstractC51557xL7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
