package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: BE8 */
/* loaded from: classes5.dex */
public final class BE8 {

    /* renamed from: a */
    public final SD8 f2118a;

    /* renamed from: b */
    public final EnumC49708uD8 f2119b;

    /* renamed from: c */
    public final EnumC39638dE8 f2120c;

    /* renamed from: d */
    public final GD8 f2121d;

    /* renamed from: e */
    public final Boolean f2122e;

    /* renamed from: f */
    public final Float f2123f;

    public /* synthetic */ BE8(C42593iD8 c42593iD8, C46160oE8 c46160oE8) {
        SD8 sd8;
        EnumC49708uD8 enumC49708uD8;
        EnumC39638dE8 enumC39638dE8;
        GD8 gd8;
        Boolean bool;
        Float f;
        sd8 = c42593iD8.f86971a;
        this.f2118a = sd8;
        enumC49708uD8 = c42593iD8.f86972b;
        this.f2119b = enumC49708uD8;
        enumC39638dE8 = c42593iD8.f86973c;
        this.f2120c = enumC39638dE8;
        gd8 = c42593iD8.f86974d;
        this.f2121d = gd8;
        bool = c42593iD8.f86975e;
        this.f2122e = bool;
        f = c42593iD8.f86976f;
        this.f2123f = f;
    }

    @HR7(zza = 2)
    /* renamed from: a */
    public final EnumC49708uD8 m114195a() {
        return this.f2119b;
    }

    @HR7(zza = 4)
    /* renamed from: b */
    public final GD8 m114194b() {
        return this.f2121d;
    }

    @HR7(zza = 1)
    /* renamed from: c */
    public final SD8 m114193c() {
        return this.f2118a;
    }

    @HR7(zza = 3)
    /* renamed from: d */
    public final EnumC39638dE8 m114192d() {
        return this.f2120c;
    }

    @HR7(zza = 5)
    /* renamed from: e */
    public final Boolean m114191e() {
        return this.f2122e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BE8)) {
            return false;
        }
        BE8 be8 = (BE8) obj;
        if (Objects.equal(this.f2118a, be8.f2118a) && Objects.equal(this.f2119b, be8.f2119b) && Objects.equal(this.f2120c, be8.f2120c) && Objects.equal(this.f2121d, be8.f2121d) && Objects.equal(this.f2122e, be8.f2122e) && Objects.equal(this.f2123f, be8.f2123f)) {
            return true;
        }
        return false;
    }

    @HR7(zza = 6)
    /* renamed from: f */
    public final Float m114190f() {
        return this.f2123f;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2118a, this.f2119b, this.f2120c, this.f2121d, this.f2122e, this.f2123f);
    }
}
