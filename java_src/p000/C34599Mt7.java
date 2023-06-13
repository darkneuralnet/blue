package p000;

import java.util.List;
/* renamed from: Mt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34599Mt7 extends AbstractC32268Cu7 {

    /* renamed from: d */
    public final transient int f23769d;

    /* renamed from: e */
    public final transient int f23770e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC32268Cu7 f23771f;

    public C34599Mt7(AbstractC32268Cu7 abstractC32268Cu7, int i, int i2) {
        this.f23771f = abstractC32268Cu7;
        this.f23769d = i;
        this.f23770e = i2;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: b */
    public final int mo14905b() {
        return this.f23771f.mo14904c() + this.f23769d + this.f23770e;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: c */
    public final int mo14904c() {
        return this.f23771f.mo14904c() + this.f23769d;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: f */
    public final Object[] mo14903f() {
        return this.f23771f.mo14903f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C49421tk7.m11818a(i, this.f23770e, "index");
        return this.f23771f.get(i + this.f23769d);
    }

    @Override // p000.AbstractC32268Cu7
    /* renamed from: h */
    public final AbstractC32268Cu7 mo94609h(int i, int i2) {
        C49421tk7.m11816c(i, i2, this.f23770e);
        AbstractC32268Cu7 abstractC32268Cu7 = this.f23771f;
        int i3 = this.f23769d;
        return abstractC32268Cu7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23770e;
    }

    @Override // p000.AbstractC32268Cu7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
