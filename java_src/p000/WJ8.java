package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: WJ8 */
/* loaded from: classes5.dex */
public final class WJ8 {

    /* renamed from: a */
    public final EnumC45612nJ8 f40757a;

    /* renamed from: b */
    public final PI8 f40758b;

    /* renamed from: c */
    public final EnumC52726zJ8 f40759c;

    /* renamed from: d */
    public final EnumC38479bJ8 f40760d;

    /* renamed from: e */
    public final Boolean f40761e;

    /* renamed from: f */
    public final Float f40762f;

    public /* synthetic */ WJ8(DI8 di8, KJ8 kj8) {
        EnumC45612nJ8 enumC45612nJ8;
        PI8 pi8;
        EnumC52726zJ8 enumC52726zJ8;
        EnumC38479bJ8 enumC38479bJ8;
        Boolean bool;
        Float f;
        enumC45612nJ8 = di8.f5501a;
        this.f40757a = enumC45612nJ8;
        pi8 = di8.f5502b;
        this.f40758b = pi8;
        enumC52726zJ8 = di8.f5503c;
        this.f40759c = enumC52726zJ8;
        enumC38479bJ8 = di8.f5504d;
        this.f40760d = enumC38479bJ8;
        bool = di8.f5505e;
        this.f40761e = bool;
        f = di8.f5506f;
        this.f40762f = f;
    }

    @InterfaceC45135mW7(zza = 2)
    /* renamed from: a */
    public final PI8 m78593a() {
        return this.f40758b;
    }

    @InterfaceC45135mW7(zza = 4)
    /* renamed from: b */
    public final EnumC38479bJ8 m78592b() {
        return this.f40760d;
    }

    @InterfaceC45135mW7(zza = 1)
    /* renamed from: c */
    public final EnumC45612nJ8 m78591c() {
        return this.f40757a;
    }

    @InterfaceC45135mW7(zza = 3)
    /* renamed from: d */
    public final EnumC52726zJ8 m78590d() {
        return this.f40759c;
    }

    @InterfaceC45135mW7(zza = 5)
    /* renamed from: e */
    public final Boolean m78589e() {
        return this.f40761e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WJ8)) {
            return false;
        }
        WJ8 wj8 = (WJ8) obj;
        if (Objects.equal(this.f40757a, wj8.f40757a) && Objects.equal(this.f40758b, wj8.f40758b) && Objects.equal(this.f40759c, wj8.f40759c) && Objects.equal(this.f40760d, wj8.f40760d) && Objects.equal(this.f40761e, wj8.f40761e) && Objects.equal(this.f40762f, wj8.f40762f)) {
            return true;
        }
        return false;
    }

    @InterfaceC45135mW7(zza = 6)
    /* renamed from: f */
    public final Float m78588f() {
        return this.f40762f;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40757a, this.f40758b, this.f40759c, this.f40760d, this.f40761e, this.f40762f);
    }
}
