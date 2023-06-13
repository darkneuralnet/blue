package p000;

import co.bird.android.model.RideState;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a*\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¨\u0006\r"}, m28432d2 = {"Li25;", "Lco/bird/android/model/wire/WireRide;", "ride", "LgR4;", "warning", "", "endRideAllowed", "LzQ4;", "b", "endRideWasAllowed", "endRideChosen", "LyQ4;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: O25 */
/* loaded from: classes2.dex */
public final class O25 {
    /* renamed from: a */
    public static final C52192yQ4 m92983a(C42483i25 c42483i25, WireRide ride, EnumC41529gR4 warning, boolean z, boolean z2) {
        boolean z3;
        String str;
        Integer m39470c;
        Long l;
        String str2;
        Intrinsics.checkNotNullParameter(c42483i25, "<this>");
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(warning, "warning");
        RideConfig rideConfig = c42483i25.m35012f4().mo75030r().m73665a().getRideConfig();
        boolean m35309C4 = c42483i25.m35309C4(ride);
        WireBird bird = ride.getBird();
        boolean z4 = true;
        if (bird != null && bird.getCellular()) {
            z3 = true;
        } else {
            z3 = false;
        }
        WireBird bird2 = ride.getBird();
        String str3 = (bird2 == null || (str3 = bird2.getModel()) == null) ? "" : "";
        String currency = ride.getCurrency();
        long distance = (long) ride.getDistance();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        WireBird bird3 = ride.getBird();
        if (bird3 != null) {
            str = bird3.getPartnerId();
        } else {
            str = null;
        }
        String id = ride.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = ride.getStartedAt();
        if (startedAt == null) {
            Map<String, DateTime> m35001g4 = c42483i25.m35001g4();
            WireBird bird4 = ride.getBird();
            if (bird4 != null) {
                str2 = bird4.getId();
            } else {
                str2 = null;
            }
            startedAt = m35001g4.get(str2);
        }
        RideState mo75038i1 = c42483i25.m35012f4().mo75038i1(ride.getId());
        Boolean valueOf = Boolean.valueOf((mo75038i1 == null || !RideStatesKt.isPrimaryRide(mo75038i1)) ? false : false);
        Long valueOf2 = Long.valueOf(c42483i25.m35012f4().mo75032o0().m73665a().getActiveRideCount());
        String enumC41529gR4 = warning.toString();
        if (warning.m39470c() != null) {
            l = Long.valueOf(m39470c.intValue());
        } else {
            l = null;
        }
        return new C52192yQ4(null, null, null, m35309C4, z3, str3, currency, distance, null, minimumRidePrice, minutePrice, includedMinutes, str, id, applyTax, basePrice, startedAt, null, null, valueOf, valueOf2, enumC41529gR4, l, z, z2, c42483i25.m35098X3().mo55540n(), 393479, null);
    }

    /* renamed from: b */
    public static final C52785zQ4 m92982b(C42483i25 c42483i25, WireRide ride, EnumC41529gR4 warning, boolean z) {
        Config m73665a;
        boolean z2;
        String str;
        Integer m39470c;
        Long l;
        String str2;
        Intrinsics.checkNotNullParameter(c42483i25, "<this>");
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(warning, "warning");
        RideState mo75038i1 = c42483i25.m35012f4().mo75038i1(ride.getId());
        if (mo75038i1 == null || (m73665a = mo75038i1.getRideConfig()) == null) {
            m73665a = c42483i25.m35012f4().mo75030r().m73665a();
        }
        RideConfig rideConfig = m73665a.getRideConfig();
        boolean m35309C4 = c42483i25.m35309C4(ride);
        WireBird bird = ride.getBird();
        boolean z3 = true;
        if (bird != null && bird.getCellular()) {
            z2 = true;
        } else {
            z2 = false;
        }
        WireBird bird2 = ride.getBird();
        String str3 = (bird2 == null || (r5 = bird2.getModel()) == null) ? "" : "";
        String currency = ride.getCurrency();
        boolean z4 = z2;
        long distance = (long) ride.getDistance();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        WireBird bird3 = ride.getBird();
        if (bird3 != null) {
            str = bird3.getPartnerId();
        } else {
            str = null;
        }
        String id = ride.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = ride.getStartedAt();
        if (startedAt == null) {
            Map<String, DateTime> m35001g4 = c42483i25.m35001g4();
            WireBird bird4 = ride.getBird();
            if (bird4 != null) {
                str2 = bird4.getId();
            } else {
                str2 = null;
            }
            startedAt = m35001g4.get(str2);
        }
        RideState mo75038i12 = c42483i25.m35012f4().mo75038i1(ride.getId());
        Boolean valueOf = Boolean.valueOf((mo75038i12 == null || !RideStatesKt.isPrimaryRide(mo75038i12)) ? false : false);
        Long valueOf2 = Long.valueOf(c42483i25.m35012f4().mo75032o0().m73665a().getActiveRideCount());
        String enumC41529gR4 = warning.toString();
        if (warning.m39470c() != null) {
            l = Long.valueOf(m39470c.intValue());
        } else {
            l = null;
        }
        return new C52785zQ4(null, null, null, m35309C4, z4, str3, currency, distance, null, minimumRidePrice, minutePrice, includedMinutes, str, id, applyTax, basePrice, startedAt, null, null, valueOf, valueOf2, enumC41529gR4, l, z, c42483i25.m35098X3().mo55540n(), Double.valueOf(m73665a.getNestSearchAccuracyRadiusLimit()), m73665a.getParkingConfig().getRiderNestAdditionalBufferMeters(), 393479, null);
    }
}
