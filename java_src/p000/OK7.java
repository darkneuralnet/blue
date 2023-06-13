package p000;

import java.util.List;
/* renamed from: OK7 */
/* loaded from: classes5.dex */
public final class OK7 extends AbstractC40292eL7 {

    /* renamed from: d */
    public final transient int f26397d;

    /* renamed from: e */
    public final transient int f26398e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC40292eL7 f26399f;

    public OK7(AbstractC40292eL7 abstractC40292eL7, int i, int i2) {
        this.f26399f = abstractC40292eL7;
        this.f26397d = i;
        this.f26398e = i2;
    }

    @Override // p000.OI7
    /* renamed from: b */
    public final int mo19397b() {
        return this.f26399f.mo19396c() + this.f26397d + this.f26398e;
    }

    @Override // p000.OI7
    /* renamed from: c */
    public final int mo19396c() {
        return this.f26399f.mo19396c() + this.f26397d;
    }

    @Override // p000.OI7
    /* renamed from: f */
    public final Object[] mo19395f() {
        return this.f26399f.mo19395f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C44937mA7.m26194a(i, this.f26398e, "index");
        return this.f26399f.get(i + this.f26397d);
    }

    @Override // p000.AbstractC40292eL7
    /* renamed from: h */
    public final AbstractC40292eL7 mo43011h(int i, int i2) {
        C44937mA7.m26192c(i, i2, this.f26398e);
        AbstractC40292eL7 abstractC40292eL7 = this.f26399f;
        int i3 = this.f26397d;
        return abstractC40292eL7.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26398e;
    }

    @Override // p000.AbstractC40292eL7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
