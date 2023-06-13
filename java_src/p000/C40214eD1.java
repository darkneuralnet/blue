package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Balance;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LeD1;", "", "Lco/bird/android/model/Balance;", C17296a.f69688o, "Lco/bird/android/model/User;", "b", "Lco/bird/android/model/wire/configs/RideConfig;", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", "Lkotlin/Unit;", "getUnit", "()Lkotlin/Unit;", "unit", "Lco/bird/android/model/Balance;", "getBalance", "()Lco/bird/android/model/Balance;", "balance", "Lco/bird/android/model/User;", "getUser", "()Lco/bird/android/model/User;", "user", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/configs/RideConfig;", "getRideConfig", "()Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "<init>", "(Lkotlin/Unit;Lco/bird/android/model/Balance;Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/RideConfig;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40214eD1 {

    /* renamed from: a */
    public final Unit f78121a;

    /* renamed from: b */
    public final Balance f78122b;

    /* renamed from: c */
    public final User f78123c;

    /* renamed from: d */
    public final RideConfig f78124d;

    public C40214eD1(Unit unit, Balance balance, User user, RideConfig rideConfig) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        this.f78121a = unit;
        this.f78122b = balance;
        this.f78123c = user;
        this.f78124d = rideConfig;
    }

    /* renamed from: a */
    public final Balance m43099a() {
        return this.f78122b;
    }

    /* renamed from: b */
    public final User m43098b() {
        return this.f78123c;
    }

    /* renamed from: c */
    public final RideConfig m43097c() {
        return this.f78124d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40214eD1) {
            C40214eD1 c40214eD1 = (C40214eD1) obj;
            return Intrinsics.areEqual(this.f78121a, c40214eD1.f78121a) && Intrinsics.areEqual(this.f78122b, c40214eD1.f78122b) && Intrinsics.areEqual(this.f78123c, c40214eD1.f78123c) && Intrinsics.areEqual(this.f78124d, c40214eD1.f78124d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f78121a.hashCode() * 31) + this.f78122b.hashCode()) * 31) + this.f78123c.hashCode()) * 31) + this.f78124d.hashCode();
    }

    public String toString() {
        Unit unit = this.f78121a;
        Balance balance = this.f78122b;
        User user = this.f78123c;
        RideConfig rideConfig = this.f78124d;
        return "GooglePayConfig(unit=" + unit + ", balance=" + balance + ", user=" + user + ", rideConfig=" + rideConfig + ")";
    }
}
