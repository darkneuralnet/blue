package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: X29 */
/* loaded from: classes5.dex */
public final class X29 {

    /* renamed from: a */
    public final E29 f42572a;

    /* renamed from: b */
    public final Boolean f42573b;

    /* renamed from: c */
    public final Boolean f42574c;

    /* renamed from: d */
    public final Integer f42575d;

    /* renamed from: e */
    public final Float f42576e;

    /* renamed from: f */
    public final IX8 f42577f;

    public /* synthetic */ X29(C49602u29 c49602u29, N29 n29) {
        E29 e29;
        Boolean bool;
        Boolean bool2;
        e29 = c49602u29.f111617a;
        this.f42572a = e29;
        bool = c49602u29.f111618b;
        this.f42573b = bool;
        bool2 = c49602u29.f111619c;
        this.f42574c = bool2;
        this.f42575d = null;
        this.f42576e = null;
        this.f42577f = null;
    }

    @InterfaceC40939fR7(zza = 1)
    /* renamed from: a */
    public final E29 m77517a() {
        return this.f42572a;
    }

    @InterfaceC40939fR7(zza = 3)
    /* renamed from: b */
    public final Boolean m77516b() {
        return this.f42574c;
    }

    @InterfaceC40939fR7(zza = 2)
    /* renamed from: c */
    public final Boolean m77515c() {
        return this.f42573b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X29)) {
            return false;
        }
        X29 x29 = (X29) obj;
        if (Objects.equal(this.f42572a, x29.f42572a) && Objects.equal(this.f42573b, x29.f42573b) && Objects.equal(this.f42574c, x29.f42574c) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42572a, this.f42573b, this.f42574c, null, null, null);
    }
}
