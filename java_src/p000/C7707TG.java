package p000;

import com.google.zxing.NotFoundException;
/* renamed from: TG */
/* loaded from: classes6.dex */
public final class C7707TG {

    /* renamed from: a */
    public final AbstractC7368SG f35079a;

    /* renamed from: b */
    public C1837ET f35080b;

    public C7707TG(AbstractC7368SG abstractC7368SG) {
        if (abstractC7368SG != null) {
            this.f35079a = abstractC7368SG;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C1837ET m84122a() throws NotFoundException {
        if (this.f35080b == null) {
            this.f35080b = this.f35079a.mo83718b();
        }
        return this.f35080b;
    }

    /* renamed from: b */
    public C1027CT m84121b(int i, C1027CT c1027ct) throws NotFoundException {
        return this.f35079a.mo85790c(i, c1027ct);
    }

    /* renamed from: c */
    public int m84120c() {
        return this.f35079a.m85789d();
    }

    /* renamed from: d */
    public int m84119d() {
        return this.f35079a.m85787f();
    }

    /* renamed from: e */
    public boolean m84118e() {
        return this.f35079a.m85788e().mo1613f();
    }

    /* renamed from: f */
    public C7707TG m84117f() {
        return new C7707TG(this.f35079a.mo83719a(this.f35079a.m85788e().mo1612g()));
    }

    public String toString() {
        try {
            return m84122a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
