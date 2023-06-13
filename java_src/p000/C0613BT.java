package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLifecycle;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePrivateBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\u0016\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0000¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/VehicleDescriptor;", "g", "Lco/bird/android/model/wire/WireBird;", "h", "f", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "Lco/bird/android/model/wire/WireLocation;", "c", "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "Lco/bird/android/model/wire/WireLifecycle;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "Lco/bird/android/model/wire/WirePrivateBird;", "e", "", "b", "", "Lco/bird/android/model/constant/PartKind;", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: BT */
/* loaded from: classes3.dex */
public final class C0613BT {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BT$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0614a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdModel.values().length];
            try {
                iArr[BirdModel.BIRDBIKE_UNPAIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdModel.BIRDBIKE_PAIRABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdModel.ES500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Map<PartKind, String> m114032a(Bird bird) {
        Map<PartKind, String> mapOf;
        Map<PartKind, String> mapOf2;
        Map<PartKind, String> emptyMap;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        int i = C0614a.$EnumSwitchMapping$0[WireBirdKt.birdModel(m114027f(bird)).ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PartKind.CHASSIS, bird.getSerialNumber()));
                return mapOf2;
            }
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        PartKind partKind = PartKind.BLE_MAC_ADDRESS;
        String bleMacAddress = bird.getBleMacAddress();
        if (bleMacAddress == null) {
            bleMacAddress = "";
        }
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(partKind, bleMacAddress));
        return mapOf;
    }

    /* renamed from: b */
    public static final boolean m114031b(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (bird.getLifecycle().getCondition() == Condition.NEEDS_SERVICE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final WireLocation m114030c(Geolocation geolocation) {
        double latitude = geolocation.getLatitude();
        double longitude = geolocation.getLongitude();
        Double heading = geolocation.getHeading();
        Double speed = geolocation.getSpeed();
        Double altitude = geolocation.getAltitude();
        Double accuracy = geolocation.getAccuracy();
        boolean mocked = geolocation.getMocked();
        DateTime time = geolocation.getTime();
        String source = geolocation.getSource();
        if (source == null) {
            source = "";
        }
        return new WireLocation(latitude, longitude, heading, speed, altitude, accuracy, mocked, time, source);
    }

    /* renamed from: d */
    public static final WireLifecycle m114029d(Lifecycle lifecycle) {
        return new WireLifecycle(lifecycle.getCondition(), lifecycle.getSpecialCondition(), lifecycle.getBrainState(), lifecycle.getPlacement());
    }

    /* renamed from: e */
    public static final WirePrivateBird m114028e(PrivateBird privateBird) {
        return new WirePrivateBird(privateBird.getId(), privateBird.getUserId(), privateBird.getEndedAt(), privateBird.getUserFirstScanAt(), privateBird.getOwnershipKind(), privateBird.getCreatedAt(), privateBird.getUpdatedAt());
    }

    /* renamed from: f */
    public static final WireBird m114027f(Bird bird) {
        WirePrivateBird wirePrivateBird;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        String id = bird.getId();
        String model = bird.getModel();
        String taskId = bird.getTaskId();
        int batteryLevel = bird.getBatteryLevel();
        Integer estimatedRange = bird.getEstimatedRange();
        int distance = bird.getDistance();
        WireLocation m114030c = m114030c(bird.getLocation());
        String code = bird.getCode();
        String stickerId = bird.getStickerId();
        String serialNumber = bird.getSerialNumber();
        boolean disconnected = bird.getDisconnected();
        boolean collect = bird.getCollect();
        boolean submerged = bird.getSubmerged();
        boolean lost = bird.getLost();
        boolean locked = bird.getLocked();
        boolean ackLocked = bird.getAckLocked();
        boolean captive = bird.getCaptive();
        boolean gpsFix = bird.getGpsFix();
        boolean broken = bird.getBroken();
        List<BirdAction> actions = bird.getActions();
        String bountyId = bird.getBountyId();
        Integer bountyPrice = bird.getBountyPrice();
        String bountyCurrency = bird.getBountyCurrency();
        boolean bountyLost = bird.getBountyLost();
        boolean bountyOverdue = bird.getBountyOverdue();
        BountyKind bountyKind = bird.getBountyKind();
        String brandName = bird.getBrandName();
        BirdTaskKind taskKind = bird.getTaskKind();
        DateTime gpsAt = bird.getGpsAt();
        DateTime trackedAt = bird.getTrackedAt();
        String token = bird.getToken();
        boolean bluetooth = bird.getBluetooth();
        boolean cellular = bird.getCellular();
        DateTime startedAt = bird.getStartedAt();
        DateTime dueAt = bird.getDueAt();
        boolean asleep = bird.getAsleep();
        String imei = bird.getImei();
        String boardProtocol = bird.getBoardProtocol();
        boolean priorityCollect = bird.getPriorityCollect();
        boolean down = bird.getDown();
        boolean needsInspection = bird.getNeedsInspection();
        String partnerId = bird.getPartnerId();
        String nestId = bird.getNestId();
        DateTime lastRideEndedAt = bird.getLastRideEndedAt();
        PartnerBirdState partnerBirdState = bird.getPartnerBirdState();
        boolean peril = bird.getPeril();
        boolean deliverable = bird.getDeliverable();
        WireLifecycle m114029d = m114029d(bird.getLifecycle());
        boolean offline = bird.getOffline();
        String areaKey = bird.getAreaKey();
        NestPurpose nestPurpose = bird.getNestPurpose();
        PrivateBird privateBird = bird.getPrivateBird();
        if (privateBird != null) {
            wirePrivateBird = m114028e(privateBird);
        } else {
            wirePrivateBird = null;
        }
        DateTime scannedAt = bird.getScannedAt();
        MapPinBadge badgeType = bird.getBadgeType();
        String ephemeralId = bird.getEphemeralId();
        String bleMacAddress = bird.getBleMacAddress();
        return new WireBird(id, model, taskId, batteryLevel, estimatedRange, distance, m114030c, code, stickerId, serialNumber, disconnected, collect, submerged, lost, locked, ackLocked, captive, gpsFix, broken, null, actions, bountyId, bountyPrice, bountyCurrency, bountyLost, bountyOverdue, bountyKind, brandName, taskKind, gpsAt, trackedAt, token, bluetooth, cellular, startedAt, dueAt, asleep, imei, boardProtocol, null, priorityCollect, down, needsInspection, partnerId, nestId, lastRideEndedAt, partnerBirdState, peril, deliverable, m114029d, offline, null, areaKey, null, nestPurpose, wirePrivateBird, scannedAt, badgeType, null, false, ephemeralId, Intrinsics.areEqual(bird.getHasHelmet(), Boolean.TRUE), bird.getLocationUpdatedAt(), bleMacAddress, null, null, 524288, 203948160, 3, null);
    }

    /* renamed from: g */
    public static final VehicleDescriptor m114026g(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        return new VehicleDescriptor(bird.getId(), bird.getImei(), bird.getSerialNumber(), bird.getBleMacAddress(), bird.getModel(), null, 32, null);
    }

    /* renamed from: h */
    public static final VehicleDescriptor m114025h(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return new VehicleDescriptor(wireBird.getId(), wireBird.getImei(), wireBird.getSerialNumber(), wireBird.getBleMacAddress(), wireBird.getModel(), null, 32, null);
    }
}
