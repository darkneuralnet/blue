package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: Jg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33781Jg8 {

    /* renamed from: a */
    public final EnumC39189cW8 f17997a;

    /* renamed from: b */
    public final Boolean f17998b;

    /* renamed from: c */
    public final Boolean f17999c;

    /* renamed from: d */
    public final C45109mT8 f18000d;

    /* renamed from: e */
    public final X29 f18001e;

    public /* synthetic */ C33781Jg8(C40488eg8 c40488eg8, C49382tg8 c49382tg8) {
        EnumC39189cW8 enumC39189cW8;
        Boolean bool;
        Boolean bool2;
        X29 x29;
        enumC39189cW8 = c40488eg8.f78687a;
        this.f17997a = enumC39189cW8;
        bool = c40488eg8.f78688b;
        this.f17998b = bool;
        bool2 = c40488eg8.f78689c;
        this.f17999c = bool2;
        this.f18000d = null;
        x29 = c40488eg8.f78690d;
        this.f18001e = x29;
    }

    @InterfaceC40939fR7(zza = 1)
    /* renamed from: a */
    public final EnumC39189cW8 m100029a() {
        return this.f17997a;
    }

    @InterfaceC40939fR7(zza = 5)
    /* renamed from: b */
    public final X29 m100028b() {
        return this.f18001e;
    }

    @InterfaceC40939fR7(zza = 2)
    /* renamed from: c */
    public final Boolean m100027c() {
        return this.f17998b;
    }

    @InterfaceC40939fR7(zza = 3)
    /* renamed from: d */
    public final Boolean m100026d() {
        return this.f17999c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33781Jg8)) {
            return false;
        }
        C33781Jg8 c33781Jg8 = (C33781Jg8) obj;
        if (Objects.equal(this.f17997a, c33781Jg8.f17997a) && Objects.equal(this.f17998b, c33781Jg8.f17998b) && Objects.equal(this.f17999c, c33781Jg8.f17999c) && Objects.equal(null, null) && Objects.equal(this.f18001e, c33781Jg8.f18001e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17997a, this.f17998b, this.f17999c, null, this.f18001e);
    }
}
