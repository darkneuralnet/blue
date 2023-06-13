package p000;

import android.util.Size;
/* renamed from: nu */
/* loaded from: classes.dex */
public final class C26737nu extends AbstractC44540lW5 {

    /* renamed from: a */
    public final Size f101006a;

    /* renamed from: b */
    public final Size f101007b;

    /* renamed from: c */
    public final Size f101008c;

    /* renamed from: d */
    public final Size f101009d;

    /* renamed from: e */
    public final Size f101010e;

    public C26737nu(Size size, Size size2, Size size3, Size size4, Size size5) {
        if (size != null) {
            this.f101006a = size;
            if (size2 != null) {
                this.f101007b = size2;
                if (size3 != null) {
                    this.f101008c = size3;
                    if (size4 != null) {
                        this.f101009d = size4;
                        if (size5 != null) {
                            this.f101010e = size5;
                            return;
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSize");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    @Override // p000.AbstractC44540lW5
    /* renamed from: b */
    public Size mo22220b() {
        return this.f101006a;
    }

    @Override // p000.AbstractC44540lW5
    /* renamed from: c */
    public Size mo22219c() {
        return this.f101008c;
    }

    @Override // p000.AbstractC44540lW5
    /* renamed from: d */
    public Size mo22218d() {
        return this.f101010e;
    }

    @Override // p000.AbstractC44540lW5
    /* renamed from: e */
    public Size mo22217e() {
        return this.f101009d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC44540lW5)) {
            return false;
        }
        AbstractC44540lW5 abstractC44540lW5 = (AbstractC44540lW5) obj;
        if (this.f101006a.equals(abstractC44540lW5.mo22220b()) && this.f101007b.equals(abstractC44540lW5.mo22216f()) && this.f101008c.equals(abstractC44540lW5.mo22219c()) && this.f101009d.equals(abstractC44540lW5.mo22217e()) && this.f101010e.equals(abstractC44540lW5.mo22218d())) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC44540lW5
    /* renamed from: f */
    public Size mo22216f() {
        return this.f101007b;
    }

    public int hashCode() {
        return ((((((((this.f101006a.hashCode() ^ 1000003) * 1000003) ^ this.f101007b.hashCode()) * 1000003) ^ this.f101008c.hashCode()) * 1000003) ^ this.f101009d.hashCode()) * 1000003) ^ this.f101010e.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f101006a + ", s720pSize=" + this.f101007b + ", previewSize=" + this.f101008c + ", s1440pSize=" + this.f101009d + ", recordSize=" + this.f101010e + "}";
    }
}
