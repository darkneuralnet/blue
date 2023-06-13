package p000;

import java.util.List;
/* renamed from: kU8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43932kU8 extends AbstractC50453vU8 {

    /* renamed from: d */
    public final transient int f94437d;

    /* renamed from: e */
    public final transient int f94438e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC50453vU8 f94439f;

    public C43932kU8(AbstractC50453vU8 abstractC50453vU8, int i, int i2) {
        this.f94439f = abstractC50453vU8;
        this.f94437d = i;
        this.f94438e = i2;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: b */
    public final int mo28915b() {
        return this.f94439f.mo28914c() + this.f94437d + this.f94438e;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: c */
    public final int mo28914c() {
        return this.f94439f.mo28914c() + this.f94437d;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: f */
    public final Object[] mo28913f() {
        return this.f94439f.mo28913f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        DQ8.m110470a(i, this.f94438e, "index");
        return this.f94439f.get(i + this.f94437d);
    }

    @Override // p000.AbstractC50453vU8
    /* renamed from: h */
    public final AbstractC50453vU8 mo8608h(int i, int i2) {
        DQ8.m110466e(i, i2, this.f94438e);
        AbstractC50453vU8 abstractC50453vU8 = this.f94439f;
        int i3 = this.f94437d;
        return abstractC50453vU8.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f94438e;
    }

    @Override // p000.AbstractC50453vU8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
