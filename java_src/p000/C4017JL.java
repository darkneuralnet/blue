package p000;

import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleKt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.api.request.BLEScanTrigger;
import co.bird.api.response.BirdCodeWithStatus;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC39873de5;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u0001:\u0001\fB!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00070\"j\b\u0012\u0004\u0012\u00020\u0007`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00070\"j\b\u0012\u0004\u0012\u00020\u0007`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00070\"j\b\u0012\u0004\u0012\u00020\u0007`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R8\u00101\u001a&\u0012\f\u0012\n .*\u0004\u0018\u00010\u00020\u0002 .*\u0012\u0012\f\u0012\n .*\u0004\u0018\u00010\u00020\u0002\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, m28432d2 = {"LJL;", "LyL;", "Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/p;", "p", "Lco/bird/android/model/wire/WireBird;", "", "t", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", C17296a.f69688o, "bird", "", "b", "c", "", DateTokenConverter.CONVERTER_KEY, "", "e", "LaM;", "LaM;", "birdManager", "Llp2;", "Llp2;", "bluetoothManager", "Lde5;", "Lde5;", "rxBleClient", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "discoveredBirdVehicleCache", "unfilteredBirdIdentifierCache", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "f", "Ljava/util/HashSet;", "serialNumberBlacklist", "g", "discoveredIBeaconCache", "h", "iBeaconBlacklist", "i", "networkCallFiredList", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/Observable;", "sharedScanObservable", "<init>", "(LaM;Llp2;Lde5;)V", "k", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdFinderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdFinderManagerImpl.kt\nco/bird/android/app/manager/BirdFinderManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n180#2:143\n515#3:144\n500#3,6:145\n442#3:151\n392#3:152\n1238#4,4:153\n*S KotlinDebug\n*F\n+ 1 BirdFinderManagerImpl.kt\nco/bird/android/app/manager/BirdFinderManagerImpl\n*L\n79#1:143\n83#1:144\n83#1:145,6\n92#1:151\n92#1:152\n92#1:153,4\n*E\n"})
/* renamed from: JL */
/* loaded from: classes2.dex */
public final class C4017JL implements InterfaceC30556yL {

    /* renamed from: k */
    public static final C4018a f17363k = new C4018a(null);

    /* renamed from: l */
    public static final int f17364l = 8;

    /* renamed from: a */
    public final InterfaceC10636aM f17365a;

    /* renamed from: b */
    public final InterfaceC44723lp2 f17366b;

    /* renamed from: c */
    public final AbstractC39873de5 f17367c;

    /* renamed from: d */
    public final LruCache<String, Vehicle> f17368d;

    /* renamed from: e */
    public final LruCache<String, Unit> f17369e;

    /* renamed from: f */
    public final HashSet<String> f17370f;

    /* renamed from: g */
    public final LruCache<String, WireBird> f17371g;

    /* renamed from: h */
    public final HashSet<String> f17372h;

    /* renamed from: i */
    public final HashSet<String> f17373i;

    /* renamed from: j */
    public final Observable<Vehicle> f17374j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJL$a;", "", "", "MAX_CACHE_SIZE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JL$a */
    /* loaded from: classes2.dex */
    public static final class C4018a {
        public /* synthetic */ C4018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4018a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$b */
    /* loaded from: classes2.dex */
    public static final class C4019b extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f17376h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4019b(String str) {
            super(1);
            this.f17376h = str;
        }

        /* renamed from: a */
        public final void m100678a(InterfaceC23465c interfaceC23465c) {
            C4017JL.this.f17373i.add(this.f17376h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m100678a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/BirdCodeWithStatus;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$c */
    /* loaded from: classes2.dex */
    public static final class C4020c extends Lambda implements Function1<HM4<BirdCodeWithStatus>, InterfaceC24574u<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f17377g;

        /* renamed from: h */
        public final /* synthetic */ C4017JL f17378h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4020c(Vehicle vehicle, C4017JL c4017jl) {
            super(1);
            this.f17377g = vehicle;
            this.f17378h = c4017jl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Vehicle> invoke(HM4<BirdCodeWithStatus> response) {
            WireBird copy;
            Vehicle copy2;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103943b() != 404 && response.m103943b() != 403 && (!VehicleKt.isIBeacon(this.f17377g) || response.m103943b() != 400)) {
                BirdCodeWithStatus m103944a = response.m103944a();
                if (m103944a != null) {
                    Vehicle vehicle = this.f17377g;
                    copy = r5.copy((r91 & 1) != 0 ? r5.f66717id : null, (r91 & 2) != 0 ? r5.model : null, (r91 & 4) != 0 ? r5.taskId : null, (r91 & 8) != 0 ? r5.batteryLevel : 0, (r91 & 16) != 0 ? r5.estimatedRange : null, (r91 & 32) != 0 ? r5.distance : 0, (r91 & 64) != 0 ? r5.location : null, (r91 & 128) != 0 ? r5.code : m103944a.getCode(), (r91 & 256) != 0 ? r5.stickerId : null, (r91 & 512) != 0 ? r5.serialNumber : null, (r91 & 1024) != 0 ? r5.disconnected : false, (r91 & 2048) != 0 ? r5.collect : false, (r91 & 4096) != 0 ? r5.submerged : false, (r91 & 8192) != 0 ? r5.lost : false, (r91 & 16384) != 0 ? r5.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r5.ackLocked : false, (r91 & 65536) != 0 ? r5.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r5.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r5.broken : false, (r91 & 524288) != 0 ? r5.label : null, (r91 & 1048576) != 0 ? r5.actions : null, (r91 & 2097152) != 0 ? r5.bountyId : null, (r91 & 4194304) != 0 ? r5.bountyPrice : null, (r91 & 8388608) != 0 ? r5.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r5.bountyLost : false, (r91 & 33554432) != 0 ? r5.bountyOverdue : false, (r91 & 67108864) != 0 ? r5.bountyKind : null, (r91 & 134217728) != 0 ? r5.brandName : null, (r91 & 268435456) != 0 ? r5.taskKind : null, (r91 & 536870912) != 0 ? r5.gpsAt : null, (r91 & 1073741824) != 0 ? r5.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r5.token : null, (r92 & 1) != 0 ? r5.bluetooth : false, (r92 & 2) != 0 ? r5.cellular : false, (r92 & 4) != 0 ? r5.startedAt : null, (r92 & 8) != 0 ? r5.dueAt : null, (r92 & 16) != 0 ? r5.asleep : false, (r92 & 32) != 0 ? r5.imei : null, (r92 & 64) != 0 ? r5.boardProtocol : null, (r92 & 128) != 0 ? r5.physicalLock : null, (r92 & 256) != 0 ? r5.priorityCollect : false, (r92 & 512) != 0 ? r5.down : false, (r92 & 1024) != 0 ? r5.needsInspection : false, (r92 & 2048) != 0 ? r5.partnerId : null, (r92 & 4096) != 0 ? r5.nestId : null, (r92 & 8192) != 0 ? r5.lastRideEndedAt : null, (r92 & 16384) != 0 ? r5.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r5.peril : false, (r92 & 65536) != 0 ? r5.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r5.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r5.offline : false, (r92 & 524288) != 0 ? r5.license : null, (r92 & 1048576) != 0 ? r5.areaKey : null, (r92 & 2097152) != 0 ? r5.fleetId : null, (r92 & 4194304) != 0 ? r5.nestPurpose : null, (r92 & 8388608) != 0 ? r5.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r5.scannedAt : null, (r92 & 33554432) != 0 ? r5.badgeType : null, (r92 & 67108864) != 0 ? r5.bountyReasons : null, (r92 & 134217728) != 0 ? r5.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r5.ephemeralId : null, (r92 & 536870912) != 0 ? r5.hasHelmet : false, (r92 & 1073741824) != 0 ? r5.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r5.bleMacAddress : null, (r93 & 1) != 0 ? r5.cellId : null, (r93 & 2) != 0 ? vehicle.getBird().externalFeedType : null);
                    copy2 = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : copy, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
                    AbstractC24507p m32068G = AbstractC24507p.m32068G(copy2);
                    if (m32068G != null) {
                        return m32068G;
                    }
                }
                return AbstractC24507p.m32024u();
            }
            if (VehicleKt.isIBeacon(this.f17377g)) {
                String beaconHash = this.f17377g.getBeaconHash();
                if (beaconHash != null) {
                    this.f17378h.f17372h.add(beaconHash);
                }
            } else {
                this.f17378h.f17370f.add(this.f17378h.m100685t(this.f17377g.getBird()));
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$d */
    /* loaded from: classes2.dex */
    public static final class C4021d extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public static final C4021d f17379g = new C4021d();

        public C4021d() {
            super(1);
        }

        /* renamed from: a */
        public final void m100676a(Vehicle vehicle) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m100676a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JL$e */
    /* loaded from: classes2.dex */
    public static final class C4022e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C4022e f17380g = new C4022e();

        public C4022e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lde5$a;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$f */
    /* loaded from: classes2.dex */
    public static final class C4023f extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, InterfaceC23434B<? extends Vehicle>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: JL$f$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C4024a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbstractC39873de5.EnumC19828a.values().length];
                try {
                    iArr[AbstractC39873de5.EnumC19828a.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C4023f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(AbstractC39873de5.EnumC19828a it) {
            int i;
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC39873de5.EnumC19828a mo33641c = C4017JL.this.f17367c.mo33641c();
            if (mo33641c == null) {
                i = -1;
            } else {
                i = C4024a.$EnumSwitchMapping$0[mo33641c.ordinal()];
            }
            if (i == 1) {
                return C4017JL.this.f17366b.mo11726b(BLEScanTrigger.BIRD_FINDER).m32113r1().onErrorResumeNext(Observable.empty());
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$g */
    /* loaded from: classes2.dex */
    public static final class C4025g extends Lambda implements Function1<Vehicle, Unit> {
        public C4025g() {
            super(1);
        }

        /* renamed from: a */
        public final void m100674a(Vehicle it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!VehicleKt.isIBeacon(it)) {
                C4017JL.this.f17369e.put(C4017JL.this.m100685t(it.getBird()), Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m100674a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$h */
    /* loaded from: classes2.dex */
    public static final class C4026h extends Lambda implements Function1<Vehicle, Boolean> {
        public C4026h() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
            if (r5.f17383g.f17370f.contains(r5.f17383g.m100685t(r6.getBird())) == false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
            if (r6 == false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Vehicle it) {
            boolean contains;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = true;
            if (VehicleKt.isIBeacon(it)) {
                if (C4017JL.this.f17371g.get(it.getBeaconHash()) == null) {
                    contains = CollectionsKt___CollectionsKt.contains(C4017JL.this.f17372h, it.getBeaconHash());
                }
                z = false;
            } else {
                if (C4017JL.this.f17368d.get(C4017JL.this.m100685t(it.getBird())) == null) {
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JL$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4027i extends FunctionReferenceImpl implements Function1<Vehicle, AbstractC24507p<Vehicle>> {
        public C4027i(Object obj) {
            super(1, obj, C4017JL.class, "fetchBirdBySerialNumberOrImei", "fetchBirdBySerialNumberOrImei(Lco/bird/android/model/Vehicle;)Lio/reactivex/Maybe;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC24507p<Vehicle> invoke(Vehicle p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C4017JL) this.receiver).m100689p(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JL$j */
    /* loaded from: classes2.dex */
    public static final class C4028j extends Lambda implements Function1<Vehicle, Unit> {
        public C4028j() {
            super(1);
        }

        /* renamed from: a */
        public final void m100671a(Vehicle it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (VehicleKt.isIBeacon(it)) {
                C4017JL.this.f17371g.put(it.getBeaconHash(), it.getBird());
            } else {
                C4017JL.this.f17368d.put(C4017JL.this.m100685t(it.getBird()), it);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m100671a(vehicle);
            return Unit.INSTANCE;
        }
    }

    public C4017JL(InterfaceC10636aM birdManager, InterfaceC44723lp2 bluetoothManager, AbstractC39873de5 rxBleClient) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        this.f17365a = birdManager;
        this.f17366b = bluetoothManager;
        this.f17367c = rxBleClient;
        this.f17368d = new LruCache<>(1024);
        this.f17369e = new LruCache<>(1024);
        this.f17370f = new HashSet<>();
        this.f17371g = new LruCache<>(1024);
        this.f17372h = new HashSet<>();
        this.f17373i = new HashSet<>();
        Observable<AbstractC39873de5.EnumC19828a> distinctUntilChanged = rxBleClient.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) rxBleClient.mo33641c()).distinctUntilChanged();
        final C4023f c4023f = new C4023f();
        Observable<R> switchMap = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: CL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100682w;
                m100682w = C4017JL.m100682w(Function1.this, obj);
                return m100682w;
            }
        });
        final C4025g c4025g = new C4025g();
        Observable doOnNext = switchMap.doOnNext(new InterfaceC23484g() { // from class: DL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4017JL.m100681x(Function1.this, obj);
            }
        });
        final C4026h c4026h = new C4026h();
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: EL
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m100680y;
                m100680y = C4017JL.m100680y(Function1.this, obj);
                return m100680y;
            }
        });
        final C4027i c4027i = new C4027i(this);
        Observable flatMapMaybe = filter.flatMapMaybe(new InterfaceC23492o() { // from class: FL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m100679z;
                m100679z = C4017JL.m100679z(Function1.this, obj);
                return m100679z;
            }
        });
        final C4028j c4028j = new C4028j();
        this.f17374j = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: GL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4017JL.m100700A(Function1.this, obj);
            }
        }).share();
    }

    /* renamed from: A */
    public static final void m100700A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m100688q(C4017JL this$0, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        this$0.f17373i.remove(key);
    }

    /* renamed from: r */
    public static final InterfaceC24574u m100687r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m100686s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m100684u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m100683v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23434B m100682w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m100681x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m100680y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: z */
    public static final InterfaceC24574u m100679z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC30556yL
    /* renamed from: a */
    public void mo3652a(ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Observable<Vehicle> sharedScanObservable = this.f17374j;
        Intrinsics.checkNotNullExpressionValue(sharedScanObservable, "sharedScanObservable");
        Object m33094as = sharedScanObservable.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4021d c4021d = C4021d.f17379g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: HL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4017JL.m100684u(Function1.this, obj);
            }
        };
        final C4022e c4022e = C4022e.f17380g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: IL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4017JL.m100683v(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC30556yL
    /* renamed from: b */
    public boolean mo3651b(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (this.f17368d.get(m100685t(bird)) != null) {
            return true;
        }
        Map<String, Vehicle> snapshot = this.f17368d.snapshot();
        Intrinsics.checkNotNullExpressionValue(snapshot, "discoveredBirdVehicleCache.snapshot()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Vehicle> entry : snapshot.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getBird().getCode(), bird.getCode())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC30556yL
    /* renamed from: c */
    public void mo3650c() {
        this.f17368d.evictAll();
        this.f17369e.evictAll();
        this.f17371g.evictAll();
    }

    @Override // p000.InterfaceC30556yL
    /* renamed from: d */
    public Map<String, Vehicle> mo3649d() {
        Map<String, Vehicle> snapshot = this.f17368d.snapshot();
        Intrinsics.checkNotNullExpressionValue(snapshot, "discoveredBirdVehicleCache.snapshot()");
        return snapshot;
    }

    @Override // p000.InterfaceC30556yL
    /* renamed from: e */
    public Set<String> mo3648e() {
        return this.f17369e.snapshot().keySet();
    }

    /* renamed from: p */
    public final AbstractC24507p<Vehicle> m100689p(Vehicle vehicle) {
        String str;
        if (!VehicleKt.isIBeacon(vehicle) && !WireBirdKt.isBdCompatible(vehicle.getBird())) {
            str = vehicle.getBird().getSerialNumber();
        } else {
            str = null;
        }
        final String str2 = str + ", " + vehicle.getImei() + ", " + vehicle.getBeaconHash() + ", " + vehicle.getProximityUUID();
        if (this.f17373i.contains(str2)) {
            AbstractC24507p<Vehicle> m32024u = AbstractC24507p.m32024u();
            Intrinsics.checkNotNullExpressionValue(m32024u, "{\n      Maybe.empty()\n    }");
            return m32024u;
        }
        AbstractC23442F<HM4<BirdCodeWithStatus>> mo71576f1 = this.f17365a.mo71576f1(str, vehicle.getImei(), vehicle.getBeaconHash(), vehicle.getProximityUUID());
        final C4019b c4019b = new C4019b(str2);
        AbstractC23442F<HM4<BirdCodeWithStatus>> m33110r = mo71576f1.m33102v(new InterfaceC23484g() { // from class: zL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4017JL.m100686s(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: AL
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C4017JL.m100688q(C4017JL.this, str2);
            }
        });
        final C4020c c4020c = new C4020c(vehicle, this);
        AbstractC24507p m33163C = m33110r.m33163C(new InterfaceC23492o() { // from class: BL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m100687r;
                m100687r = C4017JL.m100687r(Function1.this, obj);
                return m100687r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "private fun fetchBirdByS…    }\n        }\n    }\n  }");
        return m33163C;
    }

    /* renamed from: t */
    public final String m100685t(WireBird wireBird) {
        if (WireBirdKt.isBdCompatible(wireBird)) {
            String imei = wireBird.getImei();
            if (imei == null) {
                return wireBird.getSerialNumber();
            }
            return imei;
        }
        return wireBird.getSerialNumber();
    }
}
