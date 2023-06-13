package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleKt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.response.BirdCodeWithStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.functions.InterfaceC23492o;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022J\u0010\n\u001aF\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00060\u0004j\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0006`\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\f2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\tH\u0016JX\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\f2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\tH\u0002J\f\u0010\u0015\u001a\u00020\u0005*\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LAk6;", "Lxk6;", "Lco/bird/android/model/Vehicle;", "vehicle", "Ljava/util/HashMap;", "", "Lkotlin/Triple;", "Lco/bird/api/response/BirdCodeWithStatus;", "", "Lkotlin/collections/HashMap;", "serialNumberScanResultMap", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "serialNumberBlacklist", "Lco/bird/android/model/wire/WirePart;", "birdSerialPartMap", "Lio/reactivex/p;", "Lco/bird/android/model/NearbyBirdViewModel;", C17296a.f69688o, "LHM4;", DateTokenConverter.CONVERTER_KEY, "f", "h", "Lgl;", "Lgl;", "preference", "LaM;", "b", "LaM;", "birdManager", "<init>", "(Lgl;LaM;)V", "vehiclebirdhydration_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ak6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31709Ak6 implements InterfaceC51791xk6 {

    /* renamed from: a */
    public final C22454gl f1009a;

    /* renamed from: b */
    public final InterfaceC10636aM f1010b;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/BirdCodeWithStatus;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ak6$a */
    /* loaded from: classes4.dex */
    public static final class C0201a extends Lambda implements Function1<HM4<BirdCodeWithStatus>, InterfaceC24574u<? extends HM4<BirdCodeWithStatus>>> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f1011g;

        /* renamed from: h */
        public final /* synthetic */ HashSet<String> f1012h;

        /* renamed from: i */
        public final /* synthetic */ C31709Ak6 f1013i;

        /* renamed from: j */
        public final /* synthetic */ HashMap<String, WirePart> f1014j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0201a(Vehicle vehicle, HashSet<String> hashSet, C31709Ak6 c31709Ak6, HashMap<String, WirePart> hashMap) {
            super(1);
            this.f1011g = vehicle;
            this.f1012h = hashSet;
            this.f1013i = c31709Ak6;
            this.f1014j = hashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<BirdCodeWithStatus>> invoke(HM4<BirdCodeWithStatus> response) {
            WirePart wirePart;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103943b() != 404 && response.m103943b() != 403 && (!VehicleKt.isIBeacon(this.f1011g) || response.m103943b() != 400)) {
                String imei = this.f1011g.getImei();
                if (imei != null) {
                    wirePart = new WirePart(null, PartKind.BRAIN, imei, 1, null);
                } else {
                    wirePart = new WirePart(null, PartKind.CHASSIS, this.f1011g.getBird().getSerialNumber(), 1, null);
                }
                this.f1014j.put(this.f1013i.m115319f(this.f1011g), wirePart);
                return AbstractC24507p.m32068G(response);
            }
            this.f1012h.add(this.f1013i.m115319f(this.f1011g));
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/BirdCodeWithStatus;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/NearbyBirdViewModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ak6$b */
    /* loaded from: classes4.dex */
    public static final class C0202b extends Lambda implements Function1<HM4<BirdCodeWithStatus>, InterfaceC24574u<? extends NearbyBirdViewModel>> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f1015g;

        /* renamed from: h */
        public final /* synthetic */ int f1016h;

        /* renamed from: i */
        public final /* synthetic */ C31709Ak6 f1017i;

        /* renamed from: j */
        public final /* synthetic */ HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> f1018j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0202b(Vehicle vehicle, int i, C31709Ak6 c31709Ak6, HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> hashMap) {
            super(1);
            this.f1015g = vehicle;
            this.f1016h = i;
            this.f1017i = c31709Ak6;
            this.f1018j = hashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends NearbyBirdViewModel> invoke(HM4<BirdCodeWithStatus> response) {
            WireBird copy;
            Vehicle copy2;
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            BirdCodeWithStatus m103944a = response.m103944a();
            if (m103944a != null) {
                Vehicle vehicle = this.f1015g;
                int i = this.f1016h;
                C31709Ak6 c31709Ak6 = this.f1017i;
                HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> hashMap = this.f1018j;
                boolean isIBeacon = VehicleKt.isIBeacon(vehicle);
                WireBird bird = vehicle.getBird();
                int battery = vehicle.getBattery();
                String id = m103944a.getId();
                String code = m103944a.getCode();
                String model = m103944a.getModel();
                String serialNumber = m103944a.getSerialNumber();
                if (serialNumber == null) {
                    serialNumber = vehicle.getBird().getSerialNumber();
                }
                copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : id, (r91 & 2) != 0 ? bird.model : model, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : battery, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : code, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : serialNumber, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : false, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
                copy2 = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : copy, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
                WireServiceCenterStatus status = m103944a.getStatus();
                if (isIBeacon && c31709Ak6.m115317h()) {
                    z = true;
                } else {
                    z = false;
                }
                NearbyBirdViewModel nearbyBirdViewModel = new NearbyBirdViewModel(copy2, status, i, isIBeacon, z);
                hashMap.put(c31709Ak6.m115319f(nearbyBirdViewModel.getVehicle()), new Triple<>(m103944a, m103944a.getModel(), Boolean.valueOf(VehicleKt.isIBeacon(vehicle))));
                AbstractC24507p m32068G = AbstractC24507p.m32068G(nearbyBirdViewModel);
                if (m32068G != null) {
                    return m32068G;
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    public C31709Ak6(C22454gl preference, InterfaceC10636aM birdManager) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        this.f1009a = preference;
        this.f1010b = birdManager;
    }

    /* renamed from: e */
    public static final InterfaceC24574u m115320e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final InterfaceC24574u m115318g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC51791xk6
    /* renamed from: a */
    public AbstractC24507p<NearbyBirdViewModel> mo4752a(Vehicle vehicle, HashMap<String, Triple<BirdCodeWithStatus, String, Boolean>> serialNumberScanResultMap, HashSet<String> serialNumberBlacklist, HashMap<String, WirePart> birdSerialPartMap) {
        WireBird copy;
        Vehicle copy2;
        boolean z;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(serialNumberScanResultMap, "serialNumberScanResultMap");
        Intrinsics.checkNotNullParameter(serialNumberBlacklist, "serialNumberBlacklist");
        Intrinsics.checkNotNullParameter(birdSerialPartMap, "birdSerialPartMap");
        if (serialNumberBlacklist.contains(m115319f(vehicle))) {
            AbstractC24507p<NearbyBirdViewModel> m32024u = AbstractC24507p.m32024u();
            Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
            return m32024u;
        }
        Triple<BirdCodeWithStatus, String, Boolean> triple = serialNumberScanResultMap.get(m115319f(vehicle));
        int i = C45871nl4.nearby_vehicles_qr_code_label;
        if (triple != null) {
            BirdCodeWithStatus component1 = triple.component1();
            String component2 = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            copy = r22.copy((r91 & 1) != 0 ? r22.f66717id : component1.getId(), (r91 & 2) != 0 ? r22.model : component2, (r91 & 4) != 0 ? r22.taskId : null, (r91 & 8) != 0 ? r22.batteryLevel : vehicle.getBattery(), (r91 & 16) != 0 ? r22.estimatedRange : null, (r91 & 32) != 0 ? r22.distance : 0, (r91 & 64) != 0 ? r22.location : null, (r91 & 128) != 0 ? r22.code : component1.getCode(), (r91 & 256) != 0 ? r22.stickerId : null, (r91 & 512) != 0 ? r22.serialNumber : null, (r91 & 1024) != 0 ? r22.disconnected : false, (r91 & 2048) != 0 ? r22.collect : false, (r91 & 4096) != 0 ? r22.submerged : false, (r91 & 8192) != 0 ? r22.lost : false, (r91 & 16384) != 0 ? r22.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r22.ackLocked : false, (r91 & 65536) != 0 ? r22.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r22.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r22.broken : false, (r91 & 524288) != 0 ? r22.label : null, (r91 & 1048576) != 0 ? r22.actions : null, (r91 & 2097152) != 0 ? r22.bountyId : null, (r91 & 4194304) != 0 ? r22.bountyPrice : null, (r91 & 8388608) != 0 ? r22.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r22.bountyLost : false, (r91 & 33554432) != 0 ? r22.bountyOverdue : false, (r91 & 67108864) != 0 ? r22.bountyKind : null, (r91 & 134217728) != 0 ? r22.brandName : null, (r91 & 268435456) != 0 ? r22.taskKind : null, (r91 & 536870912) != 0 ? r22.gpsAt : null, (r91 & 1073741824) != 0 ? r22.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r22.token : null, (r92 & 1) != 0 ? r22.bluetooth : false, (r92 & 2) != 0 ? r22.cellular : false, (r92 & 4) != 0 ? r22.startedAt : null, (r92 & 8) != 0 ? r22.dueAt : null, (r92 & 16) != 0 ? r22.asleep : false, (r92 & 32) != 0 ? r22.imei : null, (r92 & 64) != 0 ? r22.boardProtocol : null, (r92 & 128) != 0 ? r22.physicalLock : null, (r92 & 256) != 0 ? r22.priorityCollect : false, (r92 & 512) != 0 ? r22.down : false, (r92 & 1024) != 0 ? r22.needsInspection : false, (r92 & 2048) != 0 ? r22.partnerId : null, (r92 & 4096) != 0 ? r22.nestId : null, (r92 & 8192) != 0 ? r22.lastRideEndedAt : null, (r92 & 16384) != 0 ? r22.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r22.peril : false, (r92 & 65536) != 0 ? r22.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r22.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r22.offline : false, (r92 & 524288) != 0 ? r22.license : null, (r92 & 1048576) != 0 ? r22.areaKey : null, (r92 & 2097152) != 0 ? r22.fleetId : null, (r92 & 4194304) != 0 ? r22.nestPurpose : null, (r92 & 8388608) != 0 ? r22.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r22.scannedAt : null, (r92 & 33554432) != 0 ? r22.badgeType : null, (r92 & 67108864) != 0 ? r22.bountyReasons : null, (r92 & 134217728) != 0 ? r22.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r22.ephemeralId : null, (r92 & 536870912) != 0 ? r22.hasHelmet : false, (r92 & 1073741824) != 0 ? r22.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r22.bleMacAddress : null, (r93 & 1) != 0 ? r22.cellId : null, (r93 & 2) != 0 ? vehicle.getBird().externalFeedType : null);
            copy2 = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : copy, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
            WireServiceCenterStatus status = component1.getStatus();
            if (booleanValue && m115317h()) {
                z = true;
            } else {
                z = false;
            }
            AbstractC24507p<NearbyBirdViewModel> m32068G = AbstractC24507p.m32068G(new NearbyBirdViewModel(copy2, status, i, booleanValue, z));
            Intrinsics.checkNotNullExpressionValue(m32068G, "just(NearbyBirdViewModel…peratorMapMode()\n      ))");
            return m32068G;
        }
        AbstractC24507p<HM4<BirdCodeWithStatus>> m115321d = m115321d(vehicle, serialNumberBlacklist, birdSerialPartMap);
        final C0202b c0202b = new C0202b(vehicle, i, this, serialNumberScanResultMap);
        AbstractC24507p m32021x = m115321d.m32021x(new InterfaceC23492o() { // from class: yk6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m115318g;
                m115318g = C31709Ak6.m115318g(Function1.this, obj);
                return m115318g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32021x, "override fun hydrateVehi…Maybe.empty()\n      }\n  }");
        return m32021x;
    }

    /* renamed from: d */
    public final AbstractC24507p<HM4<BirdCodeWithStatus>> m115321d(Vehicle vehicle, HashSet<String> hashSet, HashMap<String, WirePart> hashMap) {
        String str;
        if (!VehicleKt.isIBeacon(vehicle) && !WireBirdKt.isOKBModel(vehicle.getBird()) && vehicle.getImei() == null) {
            str = vehicle.getBird().getSerialNumber();
        } else {
            str = null;
        }
        AbstractC23442F<HM4<BirdCodeWithStatus>> mo71576f1 = this.f1010b.mo71576f1(str, vehicle.getImei(), vehicle.getBeaconHash(), vehicle.getProximityUUID());
        final C0201a c0201a = new C0201a(vehicle, hashSet, this, hashMap);
        AbstractC24507p m33163C = mo71576f1.m33163C(new InterfaceC23492o() { // from class: zk6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m115320e;
                m115320e = C31709Ak6.m115320e(Function1.this, obj);
                return m115320e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "private fun fetchBirdByS…se)\n        }\n      }\n  }");
        return m33163C;
    }

    /* renamed from: f */
    public final String m115319f(Vehicle vehicle) {
        if (!VehicleKt.isIBeacon(vehicle)) {
            String imei = vehicle.getImei();
            return imei == null ? vehicle.getBird().getSerialNumber() : imei;
        }
        String beaconHash = vehicle.getBeaconHash();
        Intrinsics.checkNotNull(beaconHash);
        return beaconHash;
    }

    /* renamed from: h */
    public final boolean m115317h() {
        return this.f1009a.m37571t0() == MapMode.OPERATOR || this.f1009a.m37571t0() == MapMode.SERVICE_CENTER;
    }
}
