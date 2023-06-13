package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.android.model.wire.configs.RideLocationMode;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LWL;", "LTL;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/wire/WireLocation;", C17296a.f69688o, "b", "i", "Lco/bird/android/model/RideState;", "rideState", "h", "", "g", "LTq4;", "LTq4;", "reactiveConfig", "Ldr4;", "Ldr4;", "reactiveLocationManager", "LYR4;", "c", "LYR4;", "rideManager", "La94;", "", "", DateTokenConverter.CONVERTER_KEY, "La94;", "lockedAtLocations", "<init>", "(LTq4;Ldr4;LYR4;)V", "location_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,139:1\n180#2:140\n*S KotlinDebug\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl\n*L\n56#1:140\n*E\n"})
/* renamed from: WL */
/* loaded from: classes4.dex */
public final class C8984WL implements InterfaceC7807TL {

    /* renamed from: a */
    public final C36207Tq4 f40775a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f40776b;

    /* renamed from: c */
    public final YR4 f40777c;

    /* renamed from: d */
    public final C37791a94<Map<String, WireLocation>> f40778d;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "", "", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1603#2,9:140\n1855#2:149\n1856#2:152\n1612#2:153\n1179#2,2:154\n1253#2,4:156\n1#3:150\n1#3:151\n*S KotlinDebug\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl$1\n*L\n51#1:140,9\n51#1:149\n51#1:152\n51#1:153\n54#1:154,2\n54#1:156,4\n51#1:151\n*E\n"})
    /* renamed from: WL$a */
    /* loaded from: classes4.dex */
    public static final class C8985a extends Lambda implements Function1<RideStates, Map<String, ? extends WireLocation>> {

        /* renamed from: g */
        public static final C8985a f40779g = new C8985a();

        public C8985a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            if (r1 != false) goto L10;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, WireLocation> invoke(RideStates it) {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList<WireBird> arrayList = new ArrayList();
            for (RideState rideState : it.getRideStates()) {
                WireBird bird = rideState.getRide().getBird();
                if (bird != null) {
                    if (rideState.getStatus() == RideState.Status.LOCKED) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                bird = null;
                if (bird != null) {
                    arrayList.add(bird);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (WireBird wireBird : arrayList) {
                Pair m28425to = TuplesKt.m28425to(wireBird.getId(), wireBird.getLocation());
                linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WL$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8986b extends FunctionReferenceImpl implements Function1<Map<String, ? extends WireLocation>, Unit> {
        public C8986b(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m78571a(Map<String, WireLocation> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37791a94) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends WireLocation> map) {
            m78571a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WL$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8987c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RideLocationMode.values().length];
            try {
                iArr[RideLocationMode.BIRD_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideLocationMode.FEASIBLE_USER_LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideLocationMode.USER_LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RideLocationMode.LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RideLocationMode.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/model/wire/WireLocation;", "oldValue", "newValue", C17296a.f69688o, "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl$lockedAtLocations$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,139:1\n215#2,2:140\n*S KotlinDebug\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl$lockedAtLocations$1\n*L\n37#1:140,2\n*E\n"})
    /* renamed from: WL$d */
    /* loaded from: classes4.dex */
    public static final class C8988d extends Lambda implements Function2<Map<String, ? extends WireLocation>, Map<String, ? extends WireLocation>, Map<String, ? extends WireLocation>> {

        /* renamed from: g */
        public static final C8988d f40780g = new C8988d();

        public C8988d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Map<String, WireLocation> invoke(Map<String, WireLocation> oldValue, Map<String, WireLocation> newValue) {
            Map mutableMap;
            Map<String, WireLocation> map;
            LatLng latLng;
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            mutableMap = MapsKt__MapsKt.toMutableMap(newValue);
            for (Map.Entry entry : mutableMap.entrySet()) {
                WireLocation wireLocation = oldValue.get(entry.getKey());
                WireLocation wireLocation2 = (WireLocation) entry.getValue();
                if (wireLocation != null) {
                    latLng = C37429Yw2.f47648a.m73960k(wireLocation);
                } else {
                    latLng = null;
                }
                if (Intrinsics.areEqual(latLng, C37429Yw2.f47648a.m73960k(wireLocation2))) {
                    mutableMap.put(entry.getKey(), wireLocation);
                }
            }
            map = MapsKt__MapsKt.toMap(mutableMap);
            return map;
        }
    }

    public C8984WL(C36207Tq4 reactiveConfig, InterfaceC40001dr4 reactiveLocationManager, YR4 rideManager) {
        Map emptyMap;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        this.f40775a = reactiveConfig;
        this.f40776b = reactiveLocationManager;
        this.f40777c = rideManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        C37791a94<Map<String, WireLocation>> m71835a = c10586a.m71835a(emptyMap, C8988d.f40780g);
        this.f40778d = m71835a;
        Z84<RideStates> mo75032o0 = rideManager.mo75032o0();
        final C8985a c8985a = C8985a.f40779g;
        Observable<R> map = mo75032o0.map(new InterfaceC23492o() { // from class: UL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Map m78577e;
                m78577e = C8984WL.m78577e(Function1.this, obj);
                return m78577e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "rideManager.rideStates\n …o bird.location }\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = map.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8986b c8986b = new C8986b(m71835a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: VL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8984WL.m78576f(Function1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public static final Map m78577e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m78576f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC7807TL
    /* renamed from: a */
    public WireLocation mo78581a(WireBird bird) {
        RideLocationMode rideLocationMode;
        Intrinsics.checkNotNullParameter(bird, "bird");
        RideState mo75044g0 = this.f40777c.mo75044g0(bird);
        if (mo75044g0 == null) {
            return bird.getLocation();
        }
        if (RideStatesKt.isGuestRide(mo75044g0)) {
            rideLocationMode = RideLocationMode.BIRD_LOCATION;
        } else {
            rideLocationMode = mo75044g0.getRideConfig().getRideConfig().getRideLocationMode();
        }
        int i = C8987c.$EnumSwitchMapping$0[rideLocationMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return WireLocationKt.toLocation$default(this.f40776b.mo43616p().m73665a(), null, 1, null);
            }
            return m78574h(bird, mo75044g0);
        }
        return bird.getLocation();
    }

    @Override // p000.InterfaceC7807TL
    /* renamed from: b */
    public WireBird mo78580b(WireBird bird) {
        WireBird copy;
        Intrinsics.checkNotNullParameter(bird, "bird");
        copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : mo78581a(bird), (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : false, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
        return copy;
    }

    /* renamed from: g */
    public final double m78575g(WireBird wireBird) {
        BirdModel birdModel = WireBirdKt.birdModel(wireBird);
        if (!birdModel.isCruiser() && !birdModel.isMiniCruiser() && !birdModel.isBike() && !birdModel.isMoto()) {
            birdModel.isScooter();
            return 8.88888888888889d;
        }
        return 11.11111111111111d;
    }

    /* renamed from: h */
    public final WireLocation m78574h(WireBird wireBird, RideState rideState) {
        if (RideStateKt.isInUnlockedRide(rideState)) {
            return m78573i(WireLocationKt.toLocation$default(this.f40776b.mo43616p().m73665a(), null, 1, null), wireBird);
        }
        if (RideStateKt.isInRide(rideState) && rideState.getRide().getBirdId() != null) {
            return m78573i(this.f40778d.getValue().get(rideState.getRide().getBirdId()), wireBird);
        }
        return wireBird.getLocation();
    }

    /* renamed from: i */
    public final WireLocation m78573i(WireLocation wireLocation, WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (wireLocation == null) {
            return bird.getLocation();
        }
        DateTime locationUpdatedAt = bird.getLocationUpdatedAt();
        if (locationUpdatedAt != null) {
            if (C37429Yw2.f47648a.m73966e(wireLocation, bird.getLocation()) > (Math.abs(wireLocation.getTimestamp().getMillis() - locationUpdatedAt.getMillis()) / 1000.0d) * m78575g(bird)) {
                return bird.getLocation();
            }
            return wireLocation;
        }
        return wireLocation;
    }
}
