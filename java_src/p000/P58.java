package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: P58 */
/* loaded from: classes5.dex */
public final class P58 {

    /* renamed from: a */
    public final G59 f27888a;

    /* renamed from: c */
    public final Boolean f27890c;

    /* renamed from: e */
    public final Lk9 f27892e;

    /* renamed from: f */
    public final DR7 f27893f;

    /* renamed from: g */
    public final DR7 f27894g;

    /* renamed from: b */
    public final Boolean f27889b = null;

    /* renamed from: d */
    public final J29 f27891d = null;

    public /* synthetic */ P58(C43109j58 c43109j58, C52595z58 c52595z58) {
        this.f27888a = C43109j58.m31128i(c43109j58);
        this.f27890c = C43109j58.m31126k(c43109j58);
        this.f27892e = C43109j58.m31127j(c43109j58);
        this.f27893f = C43109j58.m31136a(c43109j58);
        this.f27894g = C43109j58.m31135b(c43109j58);
    }

    @D18(zza = 6)
    /* renamed from: a */
    public final DR7 m90856a() {
        return this.f27893f;
    }

    @D18(zza = 7)
    /* renamed from: b */
    public final DR7 m90855b() {
        return this.f27894g;
    }

    @D18(zza = 1)
    /* renamed from: c */
    public final G59 m90854c() {
        return this.f27888a;
    }

    @D18(zza = 5)
    /* renamed from: d */
    public final Lk9 m90853d() {
        return this.f27892e;
    }

    @D18(zza = 3)
    /* renamed from: e */
    public final Boolean m90852e() {
        return this.f27890c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P58)) {
            return false;
        }
        P58 p58 = (P58) obj;
        if (Objects.equal(this.f27888a, p58.f27888a) && Objects.equal(null, null) && Objects.equal(this.f27890c, p58.f27890c) && Objects.equal(null, null) && Objects.equal(this.f27892e, p58.f27892e) && Objects.equal(this.f27893f, p58.f27893f) && Objects.equal(this.f27894g, p58.f27894g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f27888a, null, this.f27890c, null, this.f27892e, this.f27893f, this.f27894g);
    }
}
