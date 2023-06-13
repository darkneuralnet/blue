package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: J29 */
/* loaded from: classes5.dex */
public final class J29 {

    /* renamed from: a */
    public final EnumC46638p29 f16699a;

    /* renamed from: b */
    public final Integer f16700b;

    /* renamed from: c */
    public final Integer f16701c;

    /* renamed from: d */
    public final Boolean f16702d;

    public /* synthetic */ J29(C40708f29 c40708f29, C52566z29 c52566z29) {
        EnumC46638p29 enumC46638p29;
        Integer num;
        enumC46638p29 = c40708f29.f79337a;
        this.f16699a = enumC46638p29;
        num = c40708f29.f79338b;
        this.f16700b = num;
        this.f16701c = null;
        this.f16702d = null;
    }

    @D18(zza = 1)
    /* renamed from: a */
    public final EnumC46638p29 m101254a() {
        return this.f16699a;
    }

    @D18(zza = 2)
    /* renamed from: b */
    public final Integer m101253b() {
        return this.f16700b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J29)) {
            return false;
        }
        J29 j29 = (J29) obj;
        if (Objects.equal(this.f16699a, j29.f16699a) && Objects.equal(this.f16700b, j29.f16700b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16699a, this.f16700b, null, null);
    }
}
