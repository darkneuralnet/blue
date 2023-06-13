package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: RK8 */
/* loaded from: classes5.dex */
public final class RK8 {

    /* renamed from: a */
    public final EnumC49178tK8 f31907a;

    /* renamed from: b */
    public final Integer f31908b;

    /* renamed from: c */
    public final Integer f31909c;

    /* renamed from: d */
    public final Boolean f31910d;

    public /* synthetic */ RK8(C42656iK8 c42656iK8, FK8 fk8) {
        EnumC49178tK8 enumC49178tK8;
        Integer num;
        enumC49178tK8 = c42656iK8.f87180a;
        this.f31907a = enumC49178tK8;
        num = c42656iK8.f87181b;
        this.f31908b = num;
        this.f31909c = null;
        this.f31910d = null;
    }

    @InterfaceC45135mW7(zza = 1)
    /* renamed from: a */
    public final EnumC49178tK8 m86844a() {
        return this.f31907a;
    }

    @InterfaceC45135mW7(zza = 2)
    /* renamed from: b */
    public final Integer m86843b() {
        return this.f31908b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RK8)) {
            return false;
        }
        RK8 rk8 = (RK8) obj;
        if (Objects.equal(this.f31907a, rk8.f31907a) && Objects.equal(this.f31908b, rk8.f31908b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f31907a, this.f31908b, null, null);
    }
}
