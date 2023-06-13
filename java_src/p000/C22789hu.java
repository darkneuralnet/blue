package p000;

import p000.AbstractC49831uR5;
/* renamed from: hu */
/* loaded from: classes.dex */
public final class C22789hu extends AbstractC49831uR5 {

    /* renamed from: d */
    public final int f86071d;

    /* renamed from: e */
    public final AbstractC49831uR5.EnumC29195a f86072e;

    public C22789hu(int i, AbstractC49831uR5.EnumC29195a enumC29195a) {
        this.f86071d = i;
        if (enumC29195a != null) {
            this.f86072e = enumC29195a;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    @Override // p000.AbstractC49831uR5
    /* renamed from: a */
    public int mo10279a() {
        return this.f86071d;
    }

    @Override // p000.AbstractC49831uR5
    /* renamed from: b */
    public AbstractC49831uR5.EnumC29195a mo10278b() {
        return this.f86072e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC49831uR5)) {
            return false;
        }
        AbstractC49831uR5 abstractC49831uR5 = (AbstractC49831uR5) obj;
        if (this.f86071d == abstractC49831uR5.mo10279a() && this.f86072e.equals(abstractC49831uR5.mo10278b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f86071d ^ 1000003) * 1000003) ^ this.f86072e.hashCode();
    }

    public String toString() {
        return "StreamInfo{id=" + this.f86071d + ", streamState=" + this.f86072e + "}";
    }
}
