package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: U18 */
/* loaded from: classes5.dex */
public final class U18 {

    /* renamed from: a */
    public final ZN8 f36711a;

    /* renamed from: b */
    public final Boolean f36712b;

    /* renamed from: c */
    public final RK8 f36713c = null;

    /* renamed from: d */
    public final WJ8 f36714d;

    /* renamed from: e */
    public final Integer f36715e;

    /* renamed from: f */
    public final Integer f36716f;

    public /* synthetic */ U18(C48998t18 c48998t18, G18 g18) {
        this.f36711a = C48998t18.m13218h(c48998t18);
        this.f36712b = C48998t18.m13217i(c48998t18);
        this.f36714d = C48998t18.m13219g(c48998t18);
        this.f36715e = C48998t18.m13216j(c48998t18);
        this.f36716f = C48998t18.m13215k(c48998t18);
    }

    @InterfaceC45135mW7(zza = 4)
    /* renamed from: a */
    public final WJ8 m82101a() {
        return this.f36714d;
    }

    @InterfaceC45135mW7(zza = 1)
    /* renamed from: b */
    public final ZN8 m82100b() {
        return this.f36711a;
    }

    @InterfaceC45135mW7(zza = 2)
    /* renamed from: c */
    public final Boolean m82099c() {
        return this.f36712b;
    }

    @InterfaceC45135mW7(zza = 5)
    /* renamed from: d */
    public final Integer m82098d() {
        return this.f36715e;
    }

    @InterfaceC45135mW7(zza = 6)
    /* renamed from: e */
    public final Integer m82097e() {
        return this.f36716f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U18)) {
            return false;
        }
        U18 u18 = (U18) obj;
        if (Objects.equal(this.f36711a, u18.f36711a) && Objects.equal(this.f36712b, u18.f36712b) && Objects.equal(null, null) && Objects.equal(this.f36714d, u18.f36714d) && Objects.equal(this.f36715e, u18.f36715e) && Objects.equal(this.f36716f, u18.f36716f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f36711a, this.f36712b, null, this.f36714d, this.f36715e, this.f36716f);
    }
}
