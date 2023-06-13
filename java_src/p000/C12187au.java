package p000;

import p000.C52885zb4;
/* renamed from: au */
/* loaded from: classes.dex */
public final class C12187au extends C52885zb4.AbstractC31050b {

    /* renamed from: j */
    public final int f56501j;

    /* renamed from: k */
    public final String f56502k;

    public C12187au(int i, String str) {
        this.f56501j = i;
        if (str != null) {
            this.f56502k = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // p000.C52885zb4.AbstractC31050b
    /* renamed from: c */
    public String mo1057c() {
        return this.f56502k;
    }

    @Override // p000.C52885zb4.AbstractC31050b
    /* renamed from: d */
    public int mo1056d() {
        return this.f56501j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C52885zb4.AbstractC31050b)) {
            return false;
        }
        C52885zb4.AbstractC31050b abstractC31050b = (C52885zb4.AbstractC31050b) obj;
        if (this.f56501j == abstractC31050b.mo1056d() && this.f56502k.equals(abstractC31050b.mo1057c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f56501j ^ 1000003) * 1000003) ^ this.f56502k.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f56501j + ", name=" + this.f56502k + "}";
    }
}
