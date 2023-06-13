package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.ChargerBirdBadgeType;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.OwnershipKind;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.constant.SpecialCondition;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.BirdLicenseView;
import co.bird.android.model.persistence.nestedstructures.BountyReason;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.PhysicalLockTutorialStep;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.persistence.nestedstructures.Smartlock;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdLabel;
import co.bird.android.model.wire.WireBirdLicenseView;
import co.bird.android.model.wire.WireBountyReason;
import co.bird.android.model.wire.WireLifecycle;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.android.model.wire.WireSmartlock;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u000f\u001a\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0012\u001a\n\u0010\u0017\u001a\u00020\u0016*\u00020\u0015\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c\u001a\n\u0010\u001f\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010 \u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010!\u001a\u00020\u0015*\u00020\u0016\u001a\n\u0010\"\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010#\u001a\u00020\t*\u00020\n\u001a\n\u0010$\u001a\u00020\f*\u00020\r¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBirdLabel;", "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "b", "Lco/bird/android/model/wire/WirePhysicalLock;", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "f", "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;", "g", "Lco/bird/android/model/wire/WireSmartlock;", "Lco/bird/android/model/persistence/nestedstructures/Smartlock;", "i", "Lco/bird/android/model/wire/WireLifecycle;", "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "e", "Lco/bird/android/model/wire/WireBirdLicenseView;", "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;", "c", "Lco/bird/android/model/wire/WirePrivateBird;", "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "h", "Lco/bird/android/model/wire/WireBountyReason;", "Lco/bird/android/model/persistence/nestedstructures/BountyReason;", DateTokenConverter.CONVERTER_KEY, "LTk5;", "", RequestHeadersFactory.MODEL, "j", "p", "k", "n", "l", "m", "o", "bird_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdConversion.kt\nco/bird/android/repository/converter/BirdConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1549#2:394\n1620#2,3:395\n1549#2:398\n1620#2,3:399\n1549#2:402\n1620#2,3:403\n1549#2:406\n1620#2,3:407\n1549#2:410\n1620#2,3:411\n1549#2:414\n1620#2,3:415\n*S KotlinDebug\n*F\n+ 1 BirdConversion.kt\nco/bird/android/repository/converter/BirdConversionKt\n*L\n82#1:394\n82#1:395,3\n100#1:398\n100#1:399,3\n126#1:402\n126#1:403,3\n127#1:406\n127#1:407,3\n368#1:410\n368#1:411,3\n369#1:414\n369#1:415,3\n*E\n"})
/* renamed from: ZK */
/* loaded from: classes4.dex */
public final class C10235ZK {
    /* renamed from: a */
    public static final Bird m73313a(WireBird wireBird) {
        PhysicalLock physicalLock;
        boolean z;
        ArrayList arrayList;
        BirdLicenseView birdLicenseView;
        PrivateBird privateBird;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String id = wireBird.getId();
        String model = wireBird.getModel();
        String taskId = wireBird.getTaskId();
        int batteryLevel = wireBird.getBatteryLevel();
        Integer estimatedRange = wireBird.getEstimatedRange();
        int distance = wireBird.getDistance();
        Geolocation m17966a = C47311qB0.m17966a(wireBird.getLocation());
        String code = wireBird.getCode();
        String stickerId = wireBird.getStickerId();
        String serialNumber = wireBird.getSerialNumber();
        boolean disconnected = wireBird.getDisconnected();
        boolean collect = wireBird.getCollect();
        boolean submerged = wireBird.getSubmerged();
        boolean lost = wireBird.getLost();
        boolean locked = wireBird.getLocked();
        boolean ackLocked = wireBird.getAckLocked();
        boolean captive = wireBird.getCaptive();
        boolean gpsFix = wireBird.getGpsFix();
        boolean broken = wireBird.getBroken();
        BirdLabel m73312b = m73312b(wireBird.getLabel());
        List<BirdAction> actions = wireBird.getActions();
        String bountyId = wireBird.getBountyId();
        Integer bountyPrice = wireBird.getBountyPrice();
        String bountyCurrency = wireBird.getBountyCurrency();
        boolean bountyLost = wireBird.getBountyLost();
        boolean bountyOverdue = wireBird.getBountyOverdue();
        BountyKind bountyKind = wireBird.getBountyKind();
        String brandName = wireBird.getBrandName();
        BirdTaskKind taskKind = wireBird.getTaskKind();
        DateTime gpsAt = wireBird.getGpsAt();
        DateTime trackedAt = wireBird.getTrackedAt();
        String token = wireBird.getToken();
        boolean bluetooth = wireBird.getBluetooth();
        boolean cellular = wireBird.getCellular();
        DateTime startedAt = wireBird.getStartedAt();
        DateTime dueAt = wireBird.getDueAt();
        boolean asleep = wireBird.getAsleep();
        String imei = wireBird.getImei();
        String boardProtocol = wireBird.getBoardProtocol();
        WirePhysicalLock physicalLock2 = wireBird.getPhysicalLock();
        if (physicalLock2 != null) {
            physicalLock = m73308f(physicalLock2);
        } else {
            physicalLock = null;
        }
        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
        if (physicalLocks != null) {
            List<WirePhysicalLock> list = physicalLocks;
            z = submerged;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault2);
            for (WirePhysicalLock wirePhysicalLock : list) {
                arrayList.add(m73308f(wirePhysicalLock));
            }
        } else {
            z = submerged;
            arrayList = null;
        }
        boolean priorityCollect = wireBird.getPriorityCollect();
        boolean down = wireBird.getDown();
        boolean needsInspection = wireBird.getNeedsInspection();
        String partnerId = wireBird.getPartnerId();
        String nestId = wireBird.getNestId();
        DateTime lastRideEndedAt = wireBird.getLastRideEndedAt();
        PartnerBirdState partnerBirdState = wireBird.getPartnerBirdState();
        boolean peril = wireBird.getPeril();
        boolean deliverable = wireBird.getDeliverable();
        Lifecycle m73309e = m73309e(wireBird.getLifecycle());
        boolean offline = wireBird.getOffline();
        WireBirdLicenseView license = wireBird.getLicense();
        if (license != null) {
            birdLicenseView = m73311c(license);
        } else {
            birdLicenseView = null;
        }
        String areaKey = wireBird.getAreaKey();
        NestPurpose nestPurpose = wireBird.getNestPurpose();
        WirePrivateBird privateBird2 = wireBird.getPrivateBird();
        if (privateBird2 != null) {
            privateBird = m73306h(privateBird2);
        } else {
            privateBird = null;
        }
        DateTime scannedAt = wireBird.getScannedAt();
        MapPinBadge badgeType = wireBird.getBadgeType();
        List<WireBountyReason> bountyReasons = wireBird.getBountyReasons();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bountyReasons, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (WireBountyReason wireBountyReason : bountyReasons) {
            arrayList2.add(m73310d(wireBountyReason));
        }
        String ephemeralId = wireBird.getEphemeralId();
        String bleMacAddress = wireBird.getBleMacAddress();
        DateTime locationUpdatedAt = wireBird.getLocationUpdatedAt();
        return new Bird(id, model, taskId, batteryLevel, estimatedRange, distance, m17966a, code, stickerId, serialNumber, disconnected, collect, z, lost, locked, ackLocked, captive, gpsFix, broken, m73312b, actions, bountyId, bountyPrice, bountyCurrency, bountyLost, bountyOverdue, bountyKind, brandName, taskKind, gpsAt, trackedAt, token, bluetooth, cellular, startedAt, dueAt, asleep, imei, boardProtocol, physicalLock, arrayList, priorityCollect, down, needsInspection, partnerId, nestId, lastRideEndedAt, partnerBirdState, peril, deliverable, m73309e, offline, birdLicenseView, areaKey, nestPurpose, privateBird, scannedAt, badgeType, arrayList2, ephemeralId, bleMacAddress, Boolean.valueOf(wireBird.getHasHelmet()), locationUpdatedAt);
    }

    /* renamed from: b */
    public static final BirdLabel m73312b(WireBirdLabel wireBirdLabel) {
        Intrinsics.checkNotNullParameter(wireBirdLabel, "<this>");
        return new BirdLabel(wireBirdLabel.getName(), wireBirdLabel.getColor(), wireBirdLabel.getMarker(), wireBirdLabel.getBadgeType(), wireBirdLabel.getChargerBadgeType());
    }

    /* renamed from: c */
    public static final BirdLicenseView m73311c(WireBirdLicenseView wireBirdLicenseView) {
        Intrinsics.checkNotNullParameter(wireBirdLicenseView, "<this>");
        return new BirdLicenseView(wireBirdLicenseView.getCode());
    }

    /* renamed from: d */
    public static final BountyReason m73310d(WireBountyReason wireBountyReason) {
        Intrinsics.checkNotNullParameter(wireBountyReason, "<this>");
        return new BountyReason(wireBountyReason.getKey(), wireBountyReason.getText());
    }

    /* renamed from: e */
    public static final Lifecycle m73309e(WireLifecycle wireLifecycle) {
        Intrinsics.checkNotNullParameter(wireLifecycle, "<this>");
        return new Lifecycle(wireLifecycle.getCondition(), wireLifecycle.getSpecialCondition(), wireLifecycle.getBrainState(), wireLifecycle.getPlacement());
    }

    /* renamed from: f */
    public static final PhysicalLock m73308f(WirePhysicalLock wirePhysicalLock) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Smartlock smartlock;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wirePhysicalLock, "<this>");
        String id = wirePhysicalLock.getId();
        String birdId = wirePhysicalLock.getBirdId();
        String kind = wirePhysicalLock.getKind();
        String combination = wirePhysicalLock.getCombination();
        List<String> lockInstructions = wirePhysicalLock.getLockInstructions();
        List<String> unlockInstructions = wirePhysicalLock.getUnlockInstructions();
        List<WirePhysicalLockTutorialStep> tutorialSteps = wirePhysicalLock.getTutorialSteps();
        if (tutorialSteps != null) {
            List<WirePhysicalLockTutorialStep> list = tutorialSteps;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault2);
            for (WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep : list) {
                arrayList.add(m73307g(wirePhysicalLockTutorialStep));
            }
        } else {
            arrayList = null;
        }
        List<WirePhysicalLockTutorialStep> endRideTutorialSteps = wirePhysicalLock.getEndRideTutorialSteps();
        if (endRideTutorialSteps != null) {
            List<WirePhysicalLockTutorialStep> list2 = endRideTutorialSteps;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep2 : list2) {
                arrayList2.add(m73307g(wirePhysicalLockTutorialStep2));
            }
        } else {
            arrayList2 = null;
        }
        WireSmartlock smartlock2 = wirePhysicalLock.getSmartlock();
        if (smartlock2 != null) {
            smartlock = m73305i(smartlock2);
        } else {
            smartlock = null;
        }
        return new PhysicalLock(id, birdId, kind, combination, lockInstructions, unlockInstructions, arrayList, arrayList2, smartlock, wirePhysicalLock.getPurpose());
    }

    /* renamed from: g */
    public static final PhysicalLockTutorialStep m73307g(WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep) {
        Intrinsics.checkNotNullParameter(wirePhysicalLockTutorialStep, "<this>");
        return new PhysicalLockTutorialStep(wirePhysicalLockTutorialStep.getImageUrl(), wirePhysicalLockTutorialStep.getTitle(), wirePhysicalLockTutorialStep.getBody());
    }

    /* renamed from: h */
    public static final PrivateBird m73306h(WirePrivateBird wirePrivateBird) {
        Intrinsics.checkNotNullParameter(wirePrivateBird, "<this>");
        return new PrivateBird(wirePrivateBird.getId(), null, wirePrivateBird.getUserId(), wirePrivateBird.getEndedAt(), wirePrivateBird.getUserFirstScanAt(), wirePrivateBird.getOwnershipKind(), wirePrivateBird.getCreatedAt(), wirePrivateBird.getUpdatedAt());
    }

    /* renamed from: i */
    public static final Smartlock m73305i(WireSmartlock wireSmartlock) {
        Intrinsics.checkNotNullParameter(wireSmartlock, "<this>");
        return new Smartlock(wireSmartlock.getId(), wireSmartlock.getPhysicalLockId(), wireSmartlock.getMacAddress(), wireSmartlock.getTokenRequest(), wireSmartlock.getTokenRequests(), wireSmartlock.getVendor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = kotlin.text.StringsKt___StringsKt.takeLast(r0, 5);
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bird m73304j(C36154Tk5 c36154Tk5, String model) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        String macAddress = c36154Tk5.m83016a().mo17280e();
        String m80922c = C36388Uk5.m80922c(c36154Tk5);
        String str = (m80922c == null || str == null) ? "" : "";
        String str2 = str;
        String macAddress2 = c36154Tk5.m83016a().mo17280e();
        OwnershipKind ownershipKind = OwnershipKind.OWNER;
        DateTime now = DateTime.now();
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(macAddress2, "macAddress");
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        PrivateBird privateBird = new PrivateBird(macAddress2, null, "", null, null, ownershipKind, now, now2);
        String m80922c2 = C36388Uk5.m80922c(c36154Tk5);
        if (m80922c2 == null) {
            m80922c2 = c36154Tk5.m83016a().mo17280e();
        }
        String str3 = m80922c2;
        Geolocation geolocation = new Geolocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null);
        BirdLabel birdLabel = new BirdLabel("", 0, null, BirdBadgeType.UNKNOWN, ChargerBirdBadgeType.UNKNOWN);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        BountyKind bountyKind = BountyKind.UNKNOWN;
        BirdTaskKind birdTaskKind = BirdTaskKind.UNKNOWN;
        Lifecycle lifecycle = new Lifecycle(Condition.UNKNOWN, SpecialCondition.UNKNOWN, BrainState.UNKNOWN, Placement.UNKNOWN);
        MapPinBadge mapPinBadge = MapPinBadge.UNKNOWN;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        String mo17280e = c36154Tk5.m83016a().mo17280e();
        Intrinsics.checkNotNullExpressionValue(macAddress, "macAddress");
        Intrinsics.checkNotNullExpressionValue(str3, "deviceName() ?: bleDevice.macAddress");
        return new Bird(macAddress, model, null, 0, null, 0, geolocation, str2, null, str3, false, false, false, false, false, false, false, false, false, birdLabel, emptyList, null, null, "", false, false, bountyKind, null, birdTaskKind, null, null, null, true, false, null, null, false, null, null, null, null, false, false, false, null, null, null, null, false, false, lifecycle, false, null, null, null, privateBird, null, mapPinBadge, emptyList2, null, mo17280e, null, null);
    }

    /* renamed from: k */
    public static final WireLifecycle m73303k(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        return new WireLifecycle(lifecycle.getCondition(), lifecycle.getSpecialCondition(), lifecycle.getBrainState(), lifecycle.getPlacement());
    }

    /* renamed from: l */
    public static final WirePhysicalLock m73302l(PhysicalLock physicalLock) {
        ArrayList arrayList;
        ArrayList arrayList2;
        WireSmartlock wireSmartlock;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(physicalLock, "<this>");
        String id = physicalLock.getId();
        String birdId = physicalLock.getBirdId();
        String kind = physicalLock.getKind();
        String combination = physicalLock.getCombination();
        List<String> lockInstructions = physicalLock.getLockInstructions();
        List<String> unlockInstructions = physicalLock.getUnlockInstructions();
        List<PhysicalLockTutorialStep> tutorialSteps = physicalLock.getTutorialSteps();
        if (tutorialSteps != null) {
            List<PhysicalLockTutorialStep> list = tutorialSteps;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault2);
            for (PhysicalLockTutorialStep physicalLockTutorialStep : list) {
                arrayList.add(m73301m(physicalLockTutorialStep));
            }
        } else {
            arrayList = null;
        }
        List<PhysicalLockTutorialStep> endRideTutorialSteps = physicalLock.getEndRideTutorialSteps();
        if (endRideTutorialSteps != null) {
            List<PhysicalLockTutorialStep> list2 = endRideTutorialSteps;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (PhysicalLockTutorialStep physicalLockTutorialStep2 : list2) {
                arrayList2.add(m73301m(physicalLockTutorialStep2));
            }
        } else {
            arrayList2 = null;
        }
        Smartlock smartlock = physicalLock.getSmartlock();
        if (smartlock != null) {
            wireSmartlock = m73299o(smartlock);
        } else {
            wireSmartlock = null;
        }
        return new WirePhysicalLock(id, birdId, kind, combination, lockInstructions, unlockInstructions, arrayList, arrayList2, wireSmartlock, physicalLock.getPurpose());
    }

    /* renamed from: m */
    public static final WirePhysicalLockTutorialStep m73301m(PhysicalLockTutorialStep physicalLockTutorialStep) {
        Intrinsics.checkNotNullParameter(physicalLockTutorialStep, "<this>");
        return new WirePhysicalLockTutorialStep(physicalLockTutorialStep.getImageUrl(), physicalLockTutorialStep.getTitle(), physicalLockTutorialStep.getBody());
    }

    /* renamed from: n */
    public static final WirePrivateBird m73300n(PrivateBird privateBird) {
        Intrinsics.checkNotNullParameter(privateBird, "<this>");
        return new WirePrivateBird(privateBird.getId(), privateBird.getUserId(), privateBird.getEndedAt(), privateBird.getUserFirstScanAt(), privateBird.getOwnershipKind(), privateBird.getCreatedAt(), privateBird.getUpdatedAt());
    }

    /* renamed from: o */
    public static final WireSmartlock m73299o(Smartlock smartlock) {
        Intrinsics.checkNotNullParameter(smartlock, "<this>");
        return new WireSmartlock(smartlock.getId(), smartlock.getPhysicalLockId(), smartlock.getMacAddress(), smartlock.getTokenRequest(), smartlock.getTokenRequests(), smartlock.getVendor());
    }

    /* renamed from: p */
    public static final WireBird m73298p(Bird bird) {
        WirePrivateBird wirePrivateBird;
        WirePhysicalLock wirePhysicalLock;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        String id = bird.getId();
        String model = bird.getModel();
        String taskId = bird.getTaskId();
        int batteryLevel = bird.getBatteryLevel();
        Integer estimatedRange = bird.getEstimatedRange();
        int distance = bird.getDistance();
        WireLocation m17960g = C47311qB0.m17960g(bird.getLocation());
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
        WireLifecycle m73303k = m73303k(bird.getLifecycle());
        boolean offline = bird.getOffline();
        String areaKey = bird.getAreaKey();
        NestPurpose nestPurpose = bird.getNestPurpose();
        PrivateBird privateBird = bird.getPrivateBird();
        if (privateBird != null) {
            wirePrivateBird = m73300n(privateBird);
        } else {
            wirePrivateBird = null;
        }
        DateTime scannedAt = bird.getScannedAt();
        MapPinBadge badgeType = bird.getBadgeType();
        String ephemeralId = bird.getEphemeralId();
        String bleMacAddress = bird.getBleMacAddress();
        DateTime locationUpdatedAt = bird.getLocationUpdatedAt();
        boolean areEqual = Intrinsics.areEqual(bird.getHasHelmet(), Boolean.TRUE);
        PhysicalLock physicalLock = bird.getPhysicalLock();
        if (physicalLock != null) {
            wirePhysicalLock = m73302l(physicalLock);
        } else {
            wirePhysicalLock = null;
        }
        return new WireBird(id, model, taskId, batteryLevel, estimatedRange, distance, m17960g, code, stickerId, serialNumber, disconnected, collect, submerged, lost, locked, ackLocked, captive, gpsFix, broken, null, actions, bountyId, bountyPrice, bountyCurrency, bountyLost, bountyOverdue, bountyKind, brandName, taskKind, gpsAt, trackedAt, token, bluetooth, cellular, startedAt, dueAt, asleep, imei, boardProtocol, wirePhysicalLock, priorityCollect, down, needsInspection, partnerId, nestId, lastRideEndedAt, partnerBirdState, peril, deliverable, m73303k, offline, null, areaKey, null, nestPurpose, wirePrivateBird, scannedAt, badgeType, null, false, ephemeralId, areEqual, locationUpdatedAt, bleMacAddress, null, null, 524288, 203948032, 3, null);
    }
}
