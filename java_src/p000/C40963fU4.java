package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Lco/bird/android/model/wire/WireBird;", "newBird", "b", "newRide", "c", "ride_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: fU4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40963fU4 {
    /* renamed from: a */
    public static final boolean m41295a(WireRide wireRide) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        if (wireRide.isActive() && wireRide.getBird() != null) {
            WireBird bird = wireRide.getBird();
            Intrinsics.checkNotNull(bird);
            if (bird.getLocked()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = r73.copy((r91 & 1) != 0 ? r73.f66717id : null, (r91 & 2) != 0 ? r73.model : null, (r91 & 4) != 0 ? r73.taskId : null, (r91 & 8) != 0 ? r73.batteryLevel : 0, (r91 & 16) != 0 ? r73.estimatedRange : r71, (r91 & 32) != 0 ? r73.distance : 0, (r91 & 64) != 0 ? r73.location : null, (r91 & 128) != 0 ? r73.code : null, (r91 & 256) != 0 ? r73.stickerId : null, (r91 & 512) != 0 ? r73.serialNumber : null, (r91 & 1024) != 0 ? r73.disconnected : false, (r91 & 2048) != 0 ? r73.collect : false, (r91 & 4096) != 0 ? r73.submerged : false, (r91 & 8192) != 0 ? r73.lost : false, (r91 & 16384) != 0 ? r73.locked : false, (r91 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r73.ackLocked : false, (r91 & 65536) != 0 ? r73.captive : false, (r91 & net.danlew.android.joda.DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r73.gpsFix : false, (r91 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r73.broken : false, (r91 & 524288) != 0 ? r73.label : null, (r91 & 1048576) != 0 ? r73.actions : null, (r91 & 2097152) != 0 ? r73.bountyId : null, (r91 & 4194304) != 0 ? r73.bountyPrice : null, (r91 & 8388608) != 0 ? r73.bountyCurrency : null, (r91 & okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r73.bountyLost : false, (r91 & 33554432) != 0 ? r73.bountyOverdue : false, (r91 & 67108864) != 0 ? r73.bountyKind : null, (r91 & 134217728) != 0 ? r73.brandName : null, (r91 & 268435456) != 0 ? r73.taskKind : null, (r91 & 536870912) != 0 ? r73.gpsAt : null, (r91 & 1073741824) != 0 ? r73.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r73.token : null, (r92 & 1) != 0 ? r73.bluetooth : false, (r92 & 2) != 0 ? r73.cellular : false, (r92 & 4) != 0 ? r73.startedAt : null, (r92 & 8) != 0 ? r73.dueAt : null, (r92 & 16) != 0 ? r73.asleep : false, (r92 & 32) != 0 ? r73.imei : null, (r92 & 64) != 0 ? r73.boardProtocol : null, (r92 & 128) != 0 ? r73.physicalLock : null, (r92 & 256) != 0 ? r73.priorityCollect : false, (r92 & 512) != 0 ? r73.down : false, (r92 & 1024) != 0 ? r73.needsInspection : false, (r92 & 2048) != 0 ? r73.partnerId : r44, (r92 & 4096) != 0 ? r73.nestId : null, (r92 & 8192) != 0 ? r73.lastRideEndedAt : null, (r92 & 16384) != 0 ? r73.partnerBirdState : null, (r92 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r73.peril : false, (r92 & 65536) != 0 ? r73.deliverable : false, (r92 & net.danlew.android.joda.DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r73.lifecycle : null, (r92 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r73.offline : false, (r92 & 524288) != 0 ? r73.license : null, (r92 & 1048576) != 0 ? r73.areaKey : null, (r92 & 2097152) != 0 ? r73.fleetId : null, (r92 & 4194304) != 0 ? r73.nestPurpose : null, (r92 & 8388608) != 0 ? r73.privateBird : r56, (r92 & okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r73.scannedAt : null, (r92 & 33554432) != 0 ? r73.badgeType : null, (r92 & 67108864) != 0 ? r73.bountyReasons : null, (r92 & 134217728) != 0 ? r73.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r73.ephemeralId : null, (r92 & 536870912) != 0 ? r73.hasHelmet : false, (r92 & 1073741824) != 0 ? r73.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r73.bleMacAddress : null, (r93 & 1) != 0 ? r73.cellId : null, (r93 & 2) != 0 ? r73.externalFeedType : null);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WireBird m41294b(WireBird wireBird, WireBird wireBird2) {
        WirePrivateBird privateBird;
        String partnerId;
        Integer estimatedRange;
        WireBird copy;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird2 == null || (privateBird = wireBird2.getPrivateBird()) == null) {
            privateBird = wireBird.getPrivateBird();
        }
        WirePrivateBird wirePrivateBird = privateBird;
        if (wireBird2 == null || (partnerId = wireBird2.getPartnerId()) == null) {
            partnerId = wireBird.getPartnerId();
        }
        String str = partnerId;
        if (wireBird2 == null || (estimatedRange = wireBird2.getEstimatedRange()) == null) {
            estimatedRange = wireBird.getEstimatedRange();
        }
        Integer num = estimatedRange;
        if (wireBird2 == null || copy == null) {
            return wireBird;
        }
        return copy;
    }

    /* renamed from: c */
    public static final WireRide m41293c(WireRide wireRide, WireRide newRide) {
        WireBird bird;
        WireRide copy;
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        Intrinsics.checkNotNullParameter(newRide, "newRide");
        WireBird bird2 = wireRide.getBird();
        if (bird2 == null || (bird = m41294b(bird2, newRide.getBird())) == null) {
            bird = newRide.getBird();
        }
        copy = newRide.copy((r45 & 1) != 0 ? newRide.f66754id : null, (r45 & 2) != 0 ? newRide.distance : 0.0d, (r45 & 4) != 0 ? newRide.birdId : null, (r45 & 8) != 0 ? newRide.bird : bird, (r45 & 16) != 0 ? newRide.birdEphemeralId : null, (r45 & 32) != 0 ? newRide.cost : 0, (r45 & 64) != 0 ? newRide.currency : null, (r45 & 128) != 0 ? newRide.startedAt : null, (r45 & 256) != 0 ? newRide.deliveryUnlockedAt : null, (r45 & 512) != 0 ? newRide.completedAt : null, (r45 & 1024) != 0 ? newRide.continuedAt : null, (r45 & 2048) != 0 ? newRide.canceledAt : null, (r45 & 4096) != 0 ? newRide.delivery : false, (r45 & 8192) != 0 ? newRide.payAsYouGo : false, (r45 & 16384) != 0 ? newRide.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newRide.type : null, (r45 & 65536) != 0 ? newRide.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? newRide.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newRide.privateBirdId : null, (r45 & 524288) != 0 ? newRide.vehicleModel : null, (r45 & 1048576) != 0 ? newRide.tipId : null, (r45 & 2097152) != 0 ? newRide.startedInNoRideZone : false, (r45 & 4194304) != 0 ? newRide.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? newRide.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newRide.userGuestId : null, (r45 & 33554432) != 0 ? newRide.rideDetail : null);
        return copy;
    }

    /* renamed from: d */
    public static final boolean m41292d(WireRide wireRide) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        if (wireRide.isActive() && wireRide.getBird() != null) {
            WireBird bird = wireRide.getBird();
            Intrinsics.checkNotNull(bird);
            if (!bird.getLocked()) {
                return true;
            }
        }
        return false;
    }
}
