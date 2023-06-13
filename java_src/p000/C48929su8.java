package p000;

import android.content.Context;
/* renamed from: su8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48929su8 extends AbstractC39602dA8 {

    /* renamed from: a */
    public final Context f109563a;

    /* renamed from: b */
    public final LD8 f109564b;

    public C48929su8(Context context, LD8 ld8) {
        this.f109563a = context;
        this.f109564b = ld8;
    }

    @Override // p000.AbstractC39602dA8
    /* renamed from: a */
    public final Context mo13401a() {
        return this.f109563a;
    }

    @Override // p000.AbstractC39602dA8
    /* renamed from: b */
    public final LD8 mo13400b() {
        return this.f109564b;
    }

    public final boolean equals(Object obj) {
        LD8 ld8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC39602dA8) {
            AbstractC39602dA8 abstractC39602dA8 = (AbstractC39602dA8) obj;
            if (this.f109563a.equals(abstractC39602dA8.mo13401a()) && ((ld8 = this.f109564b) != null ? ld8.equals(abstractC39602dA8.mo13400b()) : abstractC39602dA8.mo13400b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f109563a.hashCode() ^ 1000003;
        LD8 ld8 = this.f109564b;
        if (ld8 == null) {
            hashCode = 0;
        } else {
            hashCode = ld8.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String obj = this.f109563a.toString();
        String valueOf = String.valueOf(this.f109564b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
