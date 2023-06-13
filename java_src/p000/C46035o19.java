package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: o19  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46035o19 {

    /* renamed from: a */
    public final V09 f101232a;

    /* renamed from: b */
    public final Integer f101233b;

    /* renamed from: c */
    public final Integer f101234c;

    /* renamed from: d */
    public final Boolean f101235d;

    public /* synthetic */ C46035o19(L09 l09, C40105e19 c40105e19) {
        V09 v09;
        Integer num;
        v09 = l09.f20595a;
        this.f101232a = v09;
        num = l09.f20596b;
        this.f101233b = num;
        this.f101234c = null;
        this.f101235d = null;
    }

    @KY7(zza = 1)
    /* renamed from: a */
    public final V09 m21967a() {
        return this.f101232a;
    }

    @KY7(zza = 2)
    /* renamed from: b */
    public final Integer m21966b() {
        return this.f101233b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C46035o19)) {
            return false;
        }
        C46035o19 c46035o19 = (C46035o19) obj;
        if (Objects.equal(this.f101232a, c46035o19.f101232a) && Objects.equal(this.f101233b, c46035o19.f101233b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f101232a, this.f101233b, null, null);
    }
}
