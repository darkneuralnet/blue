package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdScan;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.InterfaceC27246pJ;
import p000.InterfaceC46473om3;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u000e\b\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\b\b\u0001\u0010'\u001a\u00020$\u0012\b\b\u0001\u0010*\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0019\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\u0096\u0001J\t\u0010\u000b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\f\u001a\u00020\u0005H\u0096\u0001J\t\u0010\r\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0096\u0001J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, m28432d2 = {"LHx6;", "Lwx6;", "Let3;", "", "enabled", "", "a5", "LbN4;", "kotlin.jvm.PlatformType", "p0", "handleResult", "onPause", "onResume", "N6", "Lio/reactivex/Observable;", "d4", C17296a.f69688o, "rawResult", "l", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/c;", "o", "Lom3;", "b", "Lom3;", "operatorManager", "LpJ;", "c", "LpJ;", "bluetoothManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LLx6;", "e", "LLx6;", "ui", "f", "Let3;", "delegate", "g", "Ljava/lang/String;", "sessionId", "<init>", "(Lom3;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWakeVehiclesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeVehiclesPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeVehiclesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n237#2:112\n180#2:113\n237#2:114\n*S KotlinDebug\n*F\n+ 1 WakeVehiclesPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeVehiclesPresenterImpl\n*L\n49#1:112\n52#1:113\n68#1:114\n*E\n"})
/* renamed from: Hx6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33464Hx6 implements InterfaceC51328wx6, InterfaceC40613et3 {

    /* renamed from: b */
    public final InterfaceC46473om3 f14222b;

    /* renamed from: c */
    public final InterfaceC27246pJ f14223c;

    /* renamed from: d */
    public final LifecycleScopeProvider<EnumC7097RE> f14224d;

    /* renamed from: e */
    public final InterfaceC34400Lx6 f14225e;

    /* renamed from: f */
    public final InterfaceC40613et3 f14226f;

    /* renamed from: g */
    public final String f14227g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LXK;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$a */
    /* loaded from: classes2.dex */
    public static final class C3282a extends Lambda implements Function1<C9400XK, InterfaceC23496h> {
        public C3282a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C9400XK it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33464Hx6.this.m103178o(it.m77124b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LbN4;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LbN4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$b */
    /* loaded from: classes2.dex */
    public static final class C3283b extends Lambda implements Function1<C38511bN4, Unit> {
        public C3283b() {
            super(1);
        }

        /* renamed from: a */
        public final void m103168a(C38511bN4 c38511bN4) {
            C33464Hx6 c33464Hx6 = C33464Hx6.this;
            Intrinsics.checkNotNull(c38511bN4);
            c33464Hx6.m103181l(c38511bN4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38511bN4 c38511bN4) {
            m103168a(c38511bN4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "kotlin.jvm.PlatformType", "scanResponse", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$c */
    /* loaded from: classes2.dex */
    public static final class C3284c extends Lambda implements Function1<HM4<BirdScan>, Unit> {
        public C3284c() {
            super(1);
        }

        /* renamed from: a */
        public final void m103167a(HM4<BirdScan> scanResponse) {
            String m11932c;
            Intrinsics.checkNotNullExpressionValue(scanResponse, "scanResponse");
            C49375tg1 m94017d = NM4.m94017d(scanResponse);
            if (m94017d != null && (m11932c = m94017d.m11932c()) != null) {
                C33464Hx6.this.f14225e.error(m11932c);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdScan> hm4) {
            m103167a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hx6$d */
    /* loaded from: classes2.dex */
    public static final class C3285d extends Lambda implements Function1<Throwable, Unit> {
        public C3285d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C33464Hx6.this.f14225e.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "response", "", C17296a.f69688o, "(LHM4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$e */
    /* loaded from: classes2.dex */
    public static final class C3286e extends Lambda implements Function1<HM4<BirdScan>, Boolean> {

        /* renamed from: g */
        public static final C3286e f14232g = new C3286e();

        public C3286e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HM4<BirdScan> response) {
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103944a() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "response", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$f */
    /* loaded from: classes2.dex */
    public static final class C3287f extends Lambda implements Function1<HM4<BirdScan>, WireBird> {

        /* renamed from: g */
        public static final C3287f f14233g = new C3287f();

        public C3287f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(HM4<BirdScan> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            BirdScan m103944a = response.m103944a();
            Intrinsics.checkNotNull(m103944a);
            return m103944a.getBird();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$g */
    /* loaded from: classes2.dex */
    public static final class C3288g extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Vehicle>> {
        public C3288g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(WireBird bird) {
            WireBird copy;
            Intrinsics.checkNotNullParameter(bird, "bird");
            InterfaceC27246pJ interfaceC27246pJ = C33464Hx6.this.f14223c;
            copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : true, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
            return InterfaceC27246pJ.C27247a.enableDeepSleep$default(interfaceC27246pJ, copy, false, new C4464KY(null, bird.getId(), bird.getModel(), null, null, C33464Hx6.this.f14227g, null, EnumC12346bH.SINGLE.name(), null, null, null, 1881, null), null, false, false, 56, null).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hx6$h */
    /* loaded from: classes2.dex */
    public static final class C3289h extends Lambda implements Function1<Vehicle, Unit> {
        public C3289h() {
            super(1);
        }

        /* renamed from: a */
        public final void m103163a(Vehicle vehicle) {
            C33464Hx6.this.f14225e.success(C45871nl4.wake_vehicles_success);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m103163a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hx6$i */
    /* loaded from: classes2.dex */
    public static final class C3290i extends Lambda implements Function1<Throwable, Unit> {
        public C3290i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C33464Hx6.this.f14225e.error(C45871nl4.wake_vehicles_error);
        }
    }

    public C33464Hx6(InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC34400Lx6 ui, InterfaceC40613et3 delegate) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f14222b = operatorManager;
        this.f14223c = bluetoothManager;
        this.f14224d = scopeProvider;
        this.f14225e = ui;
        this.f14226f = delegate;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f14227g = uuid;
    }

    /* renamed from: m */
    public static final InterfaceC23496h m103180m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m103179n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m103177p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m103176r(C33464Hx6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo35632a5(true);
    }

    /* renamed from: s */
    public static final void m103175s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m103174t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final boolean m103173u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: v */
    public static final WireBird m103172v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m103171w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m103170x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: N6 */
    public void mo35634N6() {
        this.f14226f.mo35634N6();
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a */
    public void mo35633a() {
        this.f14226f.mo35633a();
        Observable<C9400XK> mo7497W3 = this.f14225e.mo7497W3();
        final C3282a c3282a = new C3282a();
        AbstractC23461c flatMapCompletable = mo7497W3.flatMapCompletable(new InterfaceC23492o() { // from class: xx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m103180m;
                m103180m = C33464Hx6.m103180m(Function1.this, obj);
                return m103180m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate() …e.enableScanner(true)\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f14224d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as = this.f14226f.mo35628d4().m33094as(AutoDispose.m45239a(this.f14224d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3283b c3283b = new C3283b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33464Hx6.m103179n(Function1.this, obj);
            }
        });
        this.f14226f.mo35632a5(true);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a5 */
    public void mo35632a5(boolean z) {
        this.f14226f.mo35632a5(z);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: d4 */
    public Observable<C38511bN4> mo35628d4() {
        return this.f14226f.mo35628d4();
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
        this.f14226f.handleResult(c38511bN4);
    }

    /* renamed from: l */
    public final void m103181l(C38511bN4 c38511bN4) {
        if (c38511bN4.m64617f() != null) {
            String raw = c38511bN4.m64617f();
            C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
            Intrinsics.checkNotNullExpressionValue(raw, "raw");
            String m99597e = c33894Jt4.m99597e(raw);
            if (m99597e == null || m103178o(m99597e) == null) {
                Object m33041n = m103178o(raw).m33041n(AutoDispose.m45239a(this.f14224d));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                ((CompletableSubscribeProxy) m33041n).subscribe();
            }
        }
    }

    /* renamed from: o */
    public final AbstractC23461c m103178o(String str) {
        this.f14225e.mo7482jl();
        AbstractC23442F legacyScanOperatorBird$default = InterfaceC46473om3.C27057a.legacyScanOperatorBird$default(this.f14222b, str, ScanMode.ADMIN, null, 4, null);
        final C3284c c3284c = new C3284c();
        AbstractC23442F m33101w = legacyScanOperatorBird$default.m33101w(new InterfaceC23484g() { // from class: zx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33464Hx6.m103175s(Function1.this, obj);
            }
        });
        final C3285d c3285d = new C3285d();
        AbstractC23442F m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: Ax6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33464Hx6.m103174t(Function1.this, obj);
            }
        });
        final C3286e c3286e = C3286e.f14232g;
        AbstractC24507p m33098z = m33106t.m33098z(new InterfaceC23494q() { // from class: Bx6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m103173u;
                m103173u = C33464Hx6.m103173u(Function1.this, obj);
                return m103173u;
            }
        });
        final C3287f c3287f = C3287f.f14233g;
        AbstractC24507p m32067H = m33098z.m32067H(new InterfaceC23492o() { // from class: Cx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m103172v;
                m103172v = C33464Hx6.m103172v(Function1.this, obj);
                return m103172v;
            }
        });
        final C3288g c3288g = new C3288g();
        AbstractC23442F m32072C = m32067H.m32072C(new InterfaceC23492o() { // from class: Dx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103171w;
                m103171w = C33464Hx6.m103171w(Function1.this, obj);
                return m103171w;
            }
        });
        final C3289h c3289h = new C3289h();
        AbstractC23442F m33101w2 = m32072C.m33101w(new InterfaceC23484g() { // from class: Ex6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33464Hx6.m103170x(Function1.this, obj);
            }
        });
        final C3290i c3290i = new C3290i();
        AbstractC23442F m33110r = m33101w2.m33106t(new InterfaceC23484g() { // from class: Fx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33464Hx6.m103177p(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: Gx6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C33464Hx6.m103176r(C33464Hx6.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33110r, "private fun scan(code: S…   .onErrorComplete()\n  }");
        AbstractC23461c m33069Q = C28237sD.progress$default(m33110r, this.f14225e, 0, 2, (Object) null).m33159G().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun scan(code: S…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    @Override // p000.InterfaceC40613et3
    public void onPause() {
        this.f14226f.onPause();
    }

    @Override // p000.InterfaceC40613et3
    public void onResume() {
        this.f14226f.onResume();
    }
}
