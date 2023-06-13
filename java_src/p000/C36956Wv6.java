package p000;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.GravityVector;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.Polygon;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.ParkingLocationVerificationConfig;
import co.bird.android.model.wire.configs.ParkingLocationVerificationMethod;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Earth;
import com.google.p034ar.core.GeospatialPose;
import com.google.p034ar.core.Session;
import com.google.p034ar.core.TrackingState;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.p047ui.PrimaryButtonAnimator;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import p000.C36956Wv6;
import p000.InterfaceC28816tm;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002uvBa\b\u0007\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00108\u001a\u00020\u0018\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\br\u0010sJ\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002J\f\u0010\u000e\u001a\u00020\u000b*\u00020\rH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0006\u0010\u001d\u001a\u00020\u000bR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\"\u0010R\u001a\u0010\u0012\f\u0012\n O*\u0004\u0018\u00010\u000b0\u000b0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010[\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010F¨\u0006w"}, m28432d2 = {"LWv6;", "Lf1;", "LYv6;", "LZv6;", "Landroid/location/Location;", "location", "Lco/bird/android/model/ParkingNest;", "L", "", "k0", "forceEndRide", "", "n0", "", "v0", "", "earthAccuracy", "Lkotlin/Pair;", "r0", "Lcom/google/ar/core/Earth;", "earth", "Lcom/google/ar/core/Session;", "session", "Lco/bird/android/buava/Optional;", "", "barcodes", "t0", "renderer", "N", "s0", "Lbn;", "e", "Lbn;", "areaManager", "Ltm;", "f", "Ltm;", "arManager", "Ldr4;", "g", "Ldr4;", "locationManager", "LRh6;", "h", "LRh6;", "userStream", "Le13;", "i", "Le13;", "navigator", "Lco/bird/android/model/wire/WireBird;", "j", "Lco/bird/android/model/wire/WireBird;", "bird", "k", "Ljava/lang/String;", "rideId", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "handler", "Lgl;", "m", "Lgl;", "appPreference", "LOh;", "n", "LOh;", "appBuildConfig", "o", "Z", "debugging", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "p", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "parkingLocationVerificationConfig", "q", "resultRequired", "LAG;", "kotlin.jvm.PlatformType", "r", "LAG;", "restartSubject", "LWv6$b;", "s", "LWv6$b;", "scanningState", "t", "Lkotlin/Lazy;", "m0", "()Lco/bird/android/model/ParkingNest;", "parkingNest", "Lorg/joda/time/DateTime;", "u", "Lorg/joda/time/DateTime;", "startScanningTime", "v", "Ljava/lang/Double;", "requiredAccuracy", "Lcom/google/ar/core/GeospatialPose;", "w", "Lcom/google/ar/core/GeospatialPose;", "currentCameraGeospatialPose", "", "x", "Ljava/lang/Long;", "timeoutSeconds", "y", "D", "bestAccuracyMeters", "z", "userRequest", "LTq4;", "config", "<init>", "(LTq4;Lbn;Ltm;Ldr4;LRh6;Le13;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Landroid/os/Handler;Lgl;LOh;)V", "A", C17296a.f69688o, "b", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVpsResolvePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n2333#2,14:490\n180#3:504\n180#3:505\n161#3:506\n161#3:507\n218#3:508\n180#3:509\n180#3:510\n1#4:511\n*S KotlinDebug\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter\n*L\n85#1:490,14\n124#1:504\n141#1:505\n155#1:506\n193#1:507\n231#1:508\n296#1:509\n362#1:510\n*E\n"})
/* renamed from: Wv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36956Wv6 extends AbstractC20169f1<InterfaceC37424Yv6, InterfaceC37658Zv6> {

    /* renamed from: A */
    public static final C9213a f42301A = new C9213a(null);

    /* renamed from: e */
    public final InterfaceC12495bn f42302e;

    /* renamed from: f */
    public final InterfaceC28816tm f42303f;

    /* renamed from: g */
    public final InterfaceC40001dr4 f42304g;

    /* renamed from: h */
    public final InterfaceC35660Rh6 f42305h;

    /* renamed from: i */
    public final InterfaceC40099e13 f42306i;

    /* renamed from: j */
    public final WireBird f42307j;

    /* renamed from: k */
    public final String f42308k;

    /* renamed from: l */
    public final Handler f42309l;

    /* renamed from: m */
    public final C22454gl f42310m;

    /* renamed from: n */
    public final InterfaceC6097Oh f42311n;

    /* renamed from: o */
    public final boolean f42312o;

    /* renamed from: p */
    public final ParkingLocationVerificationConfig f42313p;

    /* renamed from: q */
    public final boolean f42314q;

    /* renamed from: r */
    public final C0058AG<Unit> f42315r;

    /* renamed from: s */
    public EnumC9214b f42316s;

    /* renamed from: t */
    public final Lazy f42317t;

    /* renamed from: u */
    public DateTime f42318u;

    /* renamed from: v */
    public Double f42319v;

    /* renamed from: w */
    public GeospatialPose f42320w;

    /* renamed from: x */
    public final Long f42321x;

    /* renamed from: y */
    public double f42322y;

    /* renamed from: z */
    public boolean f42323z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wv6$A */
    /* loaded from: classes3.dex */
    public static final class C9210A extends Lambda implements Function1<Boolean, Unit> {
        public C9210A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C36956Wv6.this.m77663n0(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$B */
    /* loaded from: classes3.dex */
    public static final class C9211B extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Long>> {
        public C9211B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Long> invoke(Unit it) {
            AbstractC24507p<Long> m32049a0;
            Intrinsics.checkNotNullParameter(it, "it");
            C36956Wv6.this.m42280h(C38850bw6.f59809a);
            Long l = C36956Wv6.this.f42321x;
            if (l == null || (m32049a0 = AbstractC24507p.m32049a0(l.longValue(), TimeUnit.SECONDS)) == null) {
                return AbstractC24507p.m32024u();
            }
            return m32049a0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "b", "()Lco/bird/android/model/ParkingNest;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$C */
    /* loaded from: classes3.dex */
    public static final class C9212C extends Lambda implements Function0<ParkingNest> {
        public C9212C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ParkingNest invoke() {
            return C36956Wv6.m77693M(C36956Wv6.this, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LWv6$a;", "", "", "CLOSE_DOWN_DELAY_MILLISECONDS", "J", "", "GRAVITY_VERTICAL_THRESHOLD", "I", "MINIMUM_SCAN_TIME_SECONDS_FOR_UX", "VPS_LOCATION_EXPIRATION_SECONDS", "<init>", "()V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$a */
    /* loaded from: classes3.dex */
    public static final class C9213a {
        public /* synthetic */ C9213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9213a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LWv6$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$b */
    /* loaded from: classes3.dex */
    public enum EnumC9214b {
        FLOOR,
        FRONT,
        RIGHT,
        COMPLETE
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$c */
    /* loaded from: classes3.dex */
    public static final class C9215c extends Lambda implements Function1<Long, Unit> {
        public C9215c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77639a(Long l) {
            C36956Wv6 c36956Wv6 = C36956Wv6.this;
            c36956Wv6.m42280h(new C38257aw6(c36956Wv6.f42314q));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m77639a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wv6$d */
    /* loaded from: classes3.dex */
    public static final class C9216d extends Lambda implements Function1<Throwable, Unit> {
        public C9216d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C36956Wv6 c36956Wv6 = C36956Wv6.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c36956Wv6.m77647v0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$e */
    /* loaded from: classes3.dex */
    public static final class C9217e extends Lambda implements Function1<Earth, Unit> {
        public C9217e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77638a(Earth it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C36956Wv6.this.f42315r.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Earth earth) {
            m77638a(earth);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$f */
    /* loaded from: classes3.dex */
    public static final class C9218f extends Lambda implements Function1<Earth, Unit> {
        public C9218f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77637a(Earth earth) {
            if (C36956Wv6.this.f42318u == null) {
                C36956Wv6.this.f42318u = DateTime.now();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Earth earth) {
            m77637a(earth);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$g */
    /* loaded from: classes3.dex */
    public static final class C9219g extends Lambda implements Function1<Earth, Boolean> {

        /* renamed from: g */
        public static final C9219g f42336g = new C9219g();

        public C9219g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Earth it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getTrackingState() == TrackingState.TRACKING) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$h */
    /* loaded from: classes3.dex */
    public static final class C9220h extends Lambda implements Function1<Earth, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC37424Yv6 f42338h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9220h(InterfaceC37424Yv6 interfaceC37424Yv6) {
            super(1);
            this.f42338h = interfaceC37424Yv6;
        }

        /* renamed from: a */
        public final void m77635a(Earth earth) {
            if (C36956Wv6.this.f42312o) {
                C36956Wv6.m77649u0(C36956Wv6.this, earth, this.f42338h.mo58920C4().m73665a().m59035e(), null, 4, null);
            }
            C36956Wv6.this.m42280h(new C34128Kt4(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Earth earth) {
            m77635a(earth);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$i */
    /* loaded from: classes3.dex */
    public static final class C9221i extends Lambda implements Function1<Earth, Boolean> {
        public C9221i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Earth it) {
            Intrinsics.checkNotNullParameter(it, "it");
            double horizontalAccuracy = it.getCameraGeospatialPose().getHorizontalAccuracy();
            if (horizontalAccuracy < C36956Wv6.this.f42322y) {
                C36956Wv6.this.f42322y = horizontalAccuracy;
            }
            Pair m77655r0 = C36956Wv6.this.m77655r0(horizontalAccuracy);
            C36956Wv6.this.f42319v = (Double) m77655r0.getSecond();
            C36956Wv6.this.f42320w = it.getCameraGeospatialPose();
            return (Boolean) m77655r0.getFirst();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/Earth;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Earth;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$j */
    /* loaded from: classes3.dex */
    public static final class C9222j extends Lambda implements Function1<Earth, Unit> {
        public C9222j() {
            super(1);
        }

        /* renamed from: a */
        public final void m77633a(Earth earth) {
            C36956Wv6.this.f42303f.mo8185j();
            C36956Wv6.this.m42280h(new C34128Kt4(false));
            C36956Wv6.this.m42280h(C46714pA5.f103226a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Earth earth) {
            m77633a(earth);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wv6$k */
    /* loaded from: classes3.dex */
    public static final class C9223k extends Lambda implements Function1<Throwable, Unit> {
        public C9223k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C36956Wv6 c36956Wv6 = C36956Wv6.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c36956Wv6.m77647v0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$l */
    /* loaded from: classes3.dex */
    public static final class C9224l extends Lambda implements Function1<Optional<List<? extends C0774Bx>>, Unit> {
        public C9224l() {
            super(1);
        }

        /* renamed from: a */
        public final void m77632a(Optional<List<C0774Bx>> optional) {
            if (C36956Wv6.this.f42318u == null) {
                C36956Wv6.this.f42318u = DateTime.now();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends C0774Bx>> optional) {
            m77632a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$Availability;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lcom/google/ar/core/ArCoreApk$Availability;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$m */
    /* loaded from: classes3.dex */
    public static final class C9225m extends Lambda implements Function1<Optional<ArCoreApk.Availability>, ArCoreApk.Availability> {

        /* renamed from: g */
        public static final C9225m f42343g = new C9225m();

        public C9225m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ArCoreApk.Availability invoke(Optional<ArCoreApk.Availability> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ArCoreApk.Availability m59035e = it.m59035e();
            if (m59035e == null || !(!m59035e.isUnsupported())) {
                return null;
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00022&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "optional", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LBx;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVpsResolvePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$20\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n1#2:490\n288#3,2:491\n*S KotlinDebug\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$20\n*L\n214#1:491,2\n*E\n"})
    /* renamed from: Wv6$n */
    /* loaded from: classes3.dex */
    public static final class C9226n extends Lambda implements Function1<Optional<List<? extends C0774Bx>>, C0774Bx> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC37424Yv6 f42345h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9226n(InterfaceC37424Yv6 interfaceC37424Yv6) {
            super(1);
            this.f42345h = interfaceC37424Yv6;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0774Bx invoke(Optional<List<C0774Bx>> optional) {
            boolean z;
            boolean contains$default;
            List<C0774Bx> m59035e = optional.m59035e();
            Object obj = null;
            if (m59035e != null) {
                if (!(!m59035e.isEmpty())) {
                    m59035e = null;
                }
                if (m59035e != null) {
                    C36956Wv6 c36956Wv6 = C36956Wv6.this;
                    InterfaceC37424Yv6 interfaceC37424Yv6 = this.f42345h;
                    Iterator<T> it = m59035e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        C0774Bx c0774Bx = (C0774Bx) next;
                        if (c36956Wv6.f42312o) {
                            c36956Wv6.m77651t0(interfaceC37424Yv6.mo58902r9().m73665a().m59035e(), interfaceC37424Yv6.mo58920C4().m73665a().m59035e(), Optional.f63040c.m59033b(c0774Bx.m113296e()));
                        }
                        String barcode = c0774Bx.m113296e();
                        boolean z2 = false;
                        if (barcode != null) {
                            C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
                            Intrinsics.checkNotNullExpressionValue(barcode, "barcode");
                            if (c33894Jt4.m99597e(barcode) != null) {
                                String stickerId = c36956Wv6.f42307j.getStickerId();
                                Intrinsics.checkNotNull(stickerId);
                                contains$default = StringsKt__StringsKt.contains$default((CharSequence) barcode, (CharSequence) stickerId, false, 2, (Object) null);
                                if (contains$default) {
                                    z = true;
                                    if (!z) {
                                        z2 = true;
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                        if (z2) {
                            obj = next;
                            break;
                        }
                    }
                    C36956Wv6 c36956Wv62 = C36956Wv6.this;
                    C0774Bx c0774Bx2 = (C0774Bx) obj;
                    if (c0774Bx2 == null) {
                        c36956Wv62.m42280h(C46778pH6.f103433a);
                    }
                    return c0774Bx2;
                }
            }
            C36956Wv6 c36956Wv63 = C36956Wv6.this;
            InterfaceC37424Yv6 interfaceC37424Yv62 = this.f42345h;
            if (c36956Wv63.f42312o) {
                c36956Wv63.m77651t0(interfaceC37424Yv62.mo58902r9().m73665a().m59035e(), interfaceC37424Yv62.mo58920C4().m73665a().m59035e(), Optional.f63040c.m59032c(""));
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LBx;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LBx;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$o */
    /* loaded from: classes3.dex */
    public static final class C9227o extends Lambda implements Function1<C0774Bx, Unit> {
        public C9227o() {
            super(1);
        }

        /* renamed from: a */
        public final void m77629a(C0774Bx c0774Bx) {
            C36956Wv6.this.f42303f.mo8186i(C36956Wv6.this.f42307j.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C0774Bx c0774Bx) {
            m77629a(c0774Bx);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LBx;", "kotlin.jvm.PlatformType", "it", "", "b", "(LBx;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$p */
    /* loaded from: classes3.dex */
    public static final class C9228p extends Lambda implements Function1<C0774Bx, Unit> {
        public C9228p() {
            super(1);
        }

        /* renamed from: c */
        public static final void m77626c(C36956Wv6 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }

        /* renamed from: b */
        public final void m77627b(C0774Bx c0774Bx) {
            boolean z;
            boolean z2;
            GeospatialPose geospatialPose = C36956Wv6.this.f42320w;
            boolean z3 = true;
            if (geospatialPose != null) {
                final C36956Wv6 c36956Wv6 = C36956Wv6.this;
                LatLng latLng = new LatLng(geospatialPose.getLatitude(), geospatialPose.getLongitude());
                ParkingNest m77694L = c36956Wv6.m77694L(C39339cm2.m60884e(latLng));
                InterfaceC28816tm interfaceC28816tm = c36956Wv6.f42303f;
                ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS;
                String str = c36956Wv6.f42308k;
                String id = c36956Wv6.f42307j.getId();
                if (m77694L != null && c36956Wv6.m77668k0(m77694L, C39339cm2.m60884e(latLng))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm, parkingLocationVerificationMethod, str, id, m77694L, Boolean.valueOf(z2), null, Double.valueOf(c36956Wv6.f42322y), Double.valueOf(geospatialPose.getHorizontalAccuracy()), null, null, 800, null);
                if (c36956Wv6.f42312o) {
                    if (m77694L == null || !c36956Wv6.m77668k0(m77694L, C39339cm2.m60884e(latLng))) {
                        z3 = false;
                    }
                    if (z3) {
                        c36956Wv6.m42280h(H32.f12785a);
                    } else {
                        c36956Wv6.m42280h(C43747kA3.f94052a);
                    }
                }
                InterfaceC40001dr4 interfaceC40001dr4 = c36956Wv6.f42304g;
                EnumC36493Uw2 enumC36493Uw2 = EnumC36493Uw2.VPS;
                Location location = new Location(enumC36493Uw2.name());
                location.setLatitude(geospatialPose.getLatitude());
                location.setLongitude(geospatialPose.getLongitude());
                location.setAccuracy((float) geospatialPose.getHorizontalAccuracy());
                location.setAltitude(geospatialPose.getAltitude());
                if (Build.VERSION.SDK_INT >= 26) {
                    location.setVerticalAccuracyMeters((float) geospatialPose.getVerticalAccuracy());
                }
                C36727Vw2 c36727Vw2 = new C36727Vw2(location, enumC36493Uw2);
                DateTime plusSeconds = DateTime.now().plusSeconds(30);
                Intrinsics.checkNotNullExpressionValue(plusSeconds, "now().plusSeconds(VPS_LOCATION_EXPIRATION_SECONDS)");
                interfaceC40001dr4.mo43620l(new C47831r36(c36727Vw2, null, plusSeconds, 2, null));
                c36956Wv6.f42309l.postDelayed(new Runnable() { // from class: Xv6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36956Wv6.C9228p.m77626c(C36956Wv6.this);
                    }
                }, PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
                return;
            }
            C36956Wv6 c36956Wv62 = C36956Wv6.this;
            InterfaceC28816tm interfaceC28816tm2 = c36956Wv62.f42303f;
            ParkingLocationVerificationMethod parkingLocationVerificationMethod2 = ParkingLocationVerificationMethod.GOOGLE_VPS;
            String str2 = c36956Wv62.f42308k;
            String id2 = c36956Wv62.f42307j.getId();
            ParkingNest m77665m0 = c36956Wv62.m77665m0();
            ParkingNest m77665m02 = c36956Wv62.m77665m0();
            if (m77665m02 != null && c36956Wv62.m77668k0(m77665m02, c36956Wv62.f42304g.mo43616p().m73665a())) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm2, parkingLocationVerificationMethod2, str2, id2, m77665m0, Boolean.valueOf(z), "Trouble obtaining earth for camera pose", Double.valueOf(c36956Wv62.f42322y), null, null, null, 896, null);
            C41318g46.m40160d("Trouble obtaining earth for camera pose", new Object[0]);
            c36956Wv62.m42280h(C31880Bd6.f2617a);
            C36956Wv6.m77661o0(c36956Wv62, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C0774Bx c0774Bx) {
            m77627b(c0774Bx);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wv6$q */
    /* loaded from: classes3.dex */
    public static final class C9229q extends Lambda implements Function1<Throwable, Unit> {
        public C9229q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C36956Wv6 c36956Wv6 = C36956Wv6.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c36956Wv6.m77647v0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$r */
    /* loaded from: classes3.dex */
    public static final class C9230r extends Lambda implements Function1<DialogResponse, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Wv6$r$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C9231a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C9230r() {
            super(1);
        }

        /* renamed from: a */
        public final void m77625a(DialogResponse dialogResponse) {
            int i;
            boolean z;
            boolean z2;
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C9231a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            boolean z3 = false;
            if (i != 1) {
                if (i == 2) {
                    if (C36956Wv6.this.f42314q) {
                        InterfaceC28816tm interfaceC28816tm = C36956Wv6.this.f42303f;
                        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS;
                        String str = C36956Wv6.this.f42308k;
                        String id = C36956Wv6.this.f42307j.getId();
                        ParkingNest m77665m0 = C36956Wv6.this.m77665m0();
                        ParkingNest m77665m02 = C36956Wv6.this.m77665m0();
                        if (m77665m02 != null) {
                            C36956Wv6 c36956Wv6 = C36956Wv6.this;
                            if (c36956Wv6.m77668k0(m77665m02, c36956Wv6.f42304g.mo43616p().m73665a())) {
                                z2 = true;
                                InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm, parkingLocationVerificationMethod, str, id, m77665m0, Boolean.valueOf(z2), C36956Wv6.this.f42321x + " seconds time out and continues to ride (result required)", Double.valueOf(C36956Wv6.this.f42322y), null, null, null, 896, null);
                                C36956Wv6.this.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, TuplesKt.m28425to("parking_verification_failed", Boolean.TRUE));
                                return;
                            }
                        }
                        z2 = false;
                        InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm, parkingLocationVerificationMethod, str, id, m77665m0, Boolean.valueOf(z2), C36956Wv6.this.f42321x + " seconds time out and continues to ride (result required)", Double.valueOf(C36956Wv6.this.f42322y), null, null, null, 896, null);
                        C36956Wv6.this.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, TuplesKt.m28425to("parking_verification_failed", Boolean.TRUE));
                        return;
                    }
                    InterfaceC28816tm interfaceC28816tm2 = C36956Wv6.this.f42303f;
                    ParkingLocationVerificationMethod parkingLocationVerificationMethod2 = ParkingLocationVerificationMethod.GOOGLE_VPS;
                    String str2 = C36956Wv6.this.f42308k;
                    String id2 = C36956Wv6.this.f42307j.getId();
                    ParkingNest m77665m03 = C36956Wv6.this.m77665m0();
                    ParkingNest m77665m04 = C36956Wv6.this.m77665m0();
                    if (m77665m04 != null) {
                        C36956Wv6 c36956Wv62 = C36956Wv6.this;
                        if (c36956Wv62.m77668k0(m77665m04, c36956Wv62.f42304g.mo43616p().m73665a())) {
                            z = true;
                            InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm2, parkingLocationVerificationMethod2, str2, id2, m77665m03, Boolean.valueOf(z), C36956Wv6.this.f42321x + " seconds time out and ends ride (result not required)", Double.valueOf(C36956Wv6.this.f42322y), null, null, null, 896, null);
                            C36956Wv6.this.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("arcore_end_ride_regardless", Boolean.TRUE));
                            return;
                        }
                    }
                    z = false;
                    InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm2, parkingLocationVerificationMethod2, str2, id2, m77665m03, Boolean.valueOf(z), C36956Wv6.this.f42321x + " seconds time out and ends ride (result not required)", Double.valueOf(C36956Wv6.this.f42322y), null, null, null, 896, null);
                    C36956Wv6.this.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("arcore_end_ride_regardless", Boolean.TRUE));
                    return;
                }
                return;
            }
            InterfaceC28816tm interfaceC28816tm3 = C36956Wv6.this.f42303f;
            ParkingLocationVerificationMethod parkingLocationVerificationMethod3 = ParkingLocationVerificationMethod.GOOGLE_VPS;
            String str3 = C36956Wv6.this.f42308k;
            String id3 = C36956Wv6.this.f42307j.getId();
            ParkingNest m77665m05 = C36956Wv6.this.m77665m0();
            ParkingNest m77665m06 = C36956Wv6.this.m77665m0();
            if (m77665m06 != null) {
                C36956Wv6 c36956Wv63 = C36956Wv6.this;
                if (c36956Wv63.m77668k0(m77665m06, c36956Wv63.f42304g.mo43616p().m73665a())) {
                    z3 = true;
                }
            }
            InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm3, parkingLocationVerificationMethod3, str3, id3, m77665m05, Boolean.valueOf(z3), C36956Wv6.this.f42321x + " seconds time out and keeps on trying", Double.valueOf(C36956Wv6.this.f42322y), null, null, null, 896, null);
            C36956Wv6.this.f42315r.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m77625a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/GravityVector;", "kotlin.jvm.PlatformType", "sensorReading", "", C17296a.f69688o, "(Lco/bird/android/model/GravityVector;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVpsResolvePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$25\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1#2:490\n*E\n"})
    /* renamed from: Wv6$s */
    /* loaded from: classes3.dex */
    public static final class C9232s extends Lambda implements Function1<GravityVector, Unit> {
        public C9232s() {
            super(1);
        }

        /* renamed from: a */
        public final void m77624a(GravityVector gravityVector) {
            EnumC9214b enumC9214b = null;
            boolean z = true;
            if (gravityVector.getZ() > 1.0f) {
                EnumC9214b enumC9214b2 = C36956Wv6.this.f42316s;
                if (enumC9214b2 != EnumC9214b.FLOOR) {
                    z = false;
                }
                if (z) {
                    enumC9214b = enumC9214b2;
                }
                if (enumC9214b != null) {
                    C36956Wv6.this.f42316s = EnumC9214b.FRONT;
                }
            } else if (gravityVector.getZ() < 1.0f) {
                EnumC9214b enumC9214b3 = C36956Wv6.this.f42316s;
                if (enumC9214b3 != EnumC9214b.FRONT) {
                    z = false;
                }
                if (z) {
                    enumC9214b = enumC9214b3;
                }
                if (enumC9214b != null) {
                    C36956Wv6.this.f42316s = EnumC9214b.RIGHT;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GravityVector gravityVector) {
            m77624a(gravityVector);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/GravityVector;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/GravityVector;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$t */
    /* loaded from: classes3.dex */
    public static final class C9233t extends Lambda implements Function1<GravityVector, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Wv6$t$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C9234a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC9214b.values().length];
                try {
                    iArr[EnumC9214b.FRONT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC9214b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C9233t() {
            super(1);
        }

        /* renamed from: a */
        public final void m77623a(GravityVector gravityVector) {
            int i = C9234a.$EnumSwitchMapping$0[C36956Wv6.this.f42316s.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C36956Wv6.this.m42280h(PC2.f28088a);
                    return;
                }
                return;
            }
            C36956Wv6.this.m42280h(QC2.f30009a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GravityVector gravityVector) {
            m77623a(gravityVector);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/ArCoreApk$Availability;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/ArCoreApk$Availability;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$u */
    /* loaded from: classes3.dex */
    public static final class C9235u extends Lambda implements Function1<ArCoreApk.Availability, Unit> {
        public C9235u() {
            super(1);
        }

        /* renamed from: a */
        public final void m77622a(ArCoreApk.Availability availability) {
            C36956Wv6 c36956Wv6 = C36956Wv6.this;
            c36956Wv6.m42280h(new RI4(c36956Wv6.f42323z));
            C36956Wv6.this.f42323z = false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArCoreApk.Availability availability) {
            m77622a(availability);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lcom/google/ar/core/ArCoreApk$Availability;", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$InstallStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/google/ar/core/ArCoreApk$Availability;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$v */
    /* loaded from: classes3.dex */
    public static final class C9236v extends Lambda implements Function1<ArCoreApk.Availability, InterfaceC23434B<? extends Optional<ArCoreApk.InstallStatus>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC37424Yv6 f42353g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9236v(InterfaceC37424Yv6 interfaceC37424Yv6) {
            super(1);
            this.f42353g = interfaceC37424Yv6;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Optional<ArCoreApk.InstallStatus>> invoke(ArCoreApk.Availability it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f42353g.getArCoreInstallStatus();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/ArCoreApk$InstallStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lcom/google/ar/core/ArCoreApk$InstallStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$w */
    /* loaded from: classes3.dex */
    public static final class C9237w extends Lambda implements Function1<ArCoreApk.InstallStatus, Unit> {
        public C9237w() {
            super(1);
        }

        /* renamed from: a */
        public final void m77620a(ArCoreApk.InstallStatus installStatus) {
            if (installStatus == ArCoreApk.InstallStatus.INSTALL_REQUESTED) {
                C36956Wv6 c36956Wv6 = C36956Wv6.this;
                c36956Wv6.m42280h(new RI4(c36956Wv6.f42323z));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArCoreApk.InstallStatus installStatus) {
            m77620a(installStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/ArCoreApk$InstallStatus;", "status", "", C17296a.f69688o, "(Lcom/google/ar/core/ArCoreApk$InstallStatus;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$x */
    /* loaded from: classes3.dex */
    public static final class C9238x extends Lambda implements Function1<ArCoreApk.InstallStatus, Boolean> {

        /* renamed from: g */
        public static final C9238x f42355g = new C9238x();

        public C9238x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ArCoreApk.InstallStatus status) {
            boolean z;
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == ArCoreApk.InstallStatus.INSTALLED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/ar/core/ArCoreApk$InstallStatus;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/ArCoreApk$InstallStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wv6$y */
    /* loaded from: classes3.dex */
    public static final class C9239y extends Lambda implements Function1<ArCoreApk.InstallStatus, Unit> {
        public C9239y() {
            super(1);
        }

        /* renamed from: a */
        public final void m77618a(ArCoreApk.InstallStatus installStatus) {
            String str;
            C36956Wv6.this.m42280h(C30013x.f116952a);
            InterfaceC28816tm interfaceC28816tm = C36956Wv6.this.f42303f;
            ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS;
            String str2 = C36956Wv6.this.f42308k;
            String id = C36956Wv6.this.f42307j.getId();
            ParkingNest m77665m0 = C36956Wv6.this.m77665m0();
            Boolean bool = null;
            if (m77665m0 != null) {
                str = m77665m0.getId();
            } else {
                str = null;
            }
            ParkingNest m77665m02 = C36956Wv6.this.m77665m0();
            if (m77665m02 != null) {
                bool = Boolean.valueOf(C36956Wv6.m77667l0(C36956Wv6.this, m77665m02, null, 1, null));
            }
            InterfaceC28816tm.C28817a.startArSession$default(interfaceC28816tm, parkingLocationVerificationMethod, str2, id, str, bool, C36956Wv6.this.f42318u, null, 64, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArCoreApk.InstallStatus installStatus) {
            m77618a(installStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wv6$z */
    /* loaded from: classes3.dex */
    public static final class C9240z extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C9240z f42357g = new C9240z();

        public C9240z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36956Wv6(C36207Tq4 config, InterfaceC12495bn areaManager, InterfaceC28816tm arManager, InterfaceC40001dr4 locationManager, InterfaceC35660Rh6 userStream, InterfaceC40099e13 navigator, WireBird bird, String rideId, Handler handler, C22454gl appPreference, InterfaceC6097Oh appBuildConfig) {
        super(C46038o22.f101248a);
        Lazy lazy;
        Long l;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(arManager, "arManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f42302e = areaManager;
        this.f42303f = arManager;
        this.f42304g = locationManager;
        this.f42305h = userStream;
        this.f42306i = navigator;
        this.f42307j = bird;
        this.f42308k = rideId;
        this.f42309l = handler;
        this.f42310m = appPreference;
        this.f42311n = appBuildConfig;
        this.f42312o = C36441Uq4.m80769c(config, bird).getEnableLocationDebugInfoOnMapScreen();
        ParkingLocationVerificationConfig parkingLocationVerification = C36441Uq4.m80769c(config, bird).getParkingConfig().getParkingLocationVerification();
        this.f42313p = parkingLocationVerification;
        this.f42314q = Intrinsics.areEqual(parkingLocationVerification.getResultRequired(), Boolean.TRUE);
        C0058AG<Unit> m115950h = C0058AG.m115950h(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Unit)");
        this.f42315r = m115950h;
        this.f42316s = EnumC9214b.FLOOR;
        lazy = LazyKt__LazyJVMKt.lazy(new C9212C());
        this.f42317t = lazy;
        Integer timeoutSeconds = parkingLocationVerification.getTimeoutSeconds();
        if (timeoutSeconds != null) {
            l = Long.valueOf(timeoutSeconds.intValue());
        } else {
            l = null;
        }
        this.f42321x = l;
        this.f42322y = Double.MAX_VALUE;
        this.f42323z = true;
    }

    /* renamed from: M */
    public static /* synthetic */ ParkingNest m77693M(C36956Wv6 c36956Wv6, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            location = c36956Wv6.f42304g.mo43616p().m73665a();
        }
        return c36956Wv6.m77694L(location);
    }

    /* renamed from: O */
    public static final void m77691O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m77690P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final boolean m77689Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: R */
    public static final void m77688R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final boolean m77687S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T */
    public static final void m77686T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m77685U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m77684V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m77683W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m77682X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23434B m77681Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m77680Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m77679a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m77678b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m77677c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m77676d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final boolean m77675e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f0 */
    public static final void m77674f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m77673g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final boolean m77672g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: h0 */
    public static final void m77671h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC24574u m77670i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m77669j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static /* synthetic */ boolean m77667l0(C36956Wv6 c36956Wv6, ParkingNest parkingNest, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            location = c36956Wv6.f42304g.mo43616p().m73665a();
        }
        return c36956Wv6.m77668k0(parkingNest, location);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m77661o0(C36956Wv6 c36956Wv6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c36956Wv6.m77663n0(z);
    }

    /* renamed from: p0 */
    public static final void m77659p0(C36956Wv6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, new Pair[0]);
    }

    /* renamed from: q0 */
    public static final void m77657q0(C36956Wv6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42306i.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("arcore_end_ride_regardless", Boolean.TRUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u0 */
    public static /* synthetic */ void m77649u0(C36956Wv6 c36956Wv6, Earth earth, Session session, Optional optional, int i, Object obj) {
        if ((i & 4) != 0) {
            optional = Optional.f63040c.m59034a();
        }
        c36956Wv6.m77651t0(earth, session, optional);
    }

    /* renamed from: L */
    public final ParkingNest m77694L(Location location) {
        Object obj;
        Iterator<T> it = this.f42302e.mo64006V().m73665a().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                float distanceTo = location.distanceTo(((ParkingNest) next).getLocation().fromLocation());
                do {
                    Object next2 = it.next();
                    float distanceTo2 = location.distanceTo(((ParkingNest) next2).getLocation().fromLocation());
                    if (Float.compare(distanceTo, distanceTo2) > 0) {
                        next = next2;
                        distanceTo = distanceTo2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (ParkingNest) obj;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: N */
    public void consume(InterfaceC37424Yv6 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        this.f42303f.mo8190e();
        Observable observeOn = C37279Yf5.m74575T(this.f42303f.mo8193b(), C9225m.f42343g).observeOn(C23454a.m33087a());
        final C9235u c9235u = new C9235u();
        Observable observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: Ov6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77673g(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C9236v c9236v = new C9236v(renderer);
        Observable flatMap = observeOn2.flatMap(new InterfaceC23492o() { // from class: Bv6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m77681Y;
                m77681Y = C36956Wv6.m77681Y(Function1.this, obj);
                return m77681Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Observable observeOn3 = C37279Yf5.m74576S(flatMap).observeOn(C23454a.m33087a());
        final C9237w c9237w = new C9237w();
        Observable doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: Fv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77676d0(Function1.this, obj);
            }
        });
        final C9238x c9238x = C9238x.f42355g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: Gv6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m77675e0;
                m77675e0 = C36956Wv6.m77675e0(Function1.this, obj);
                return m77675e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Object m33094as = filter.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9239y c9239y = new C9239y();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Hv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77674f0(Function1.this, obj);
            }
        });
        Z84<Boolean> mo8189f = this.f42303f.mo8189f();
        final C9240z c9240z = C9240z.f42357g;
        Observable<Boolean> filter2 = mo8189f.filter(new InterfaceC23494q() { // from class: Jv6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m77672g0;
                m77672g0 = C36956Wv6.m77672g0(Function1.this, obj);
                return m77672g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "arManager.arCoreUnavailable\n      .filter { it }");
        Object m33094as2 = filter2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9210A c9210a = new C9210A();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Kv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77671h0(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> flowable = this.f42315r.toFlowable(EnumC23460b.DROP);
        final C9211B c9211b = new C9211B();
        AbstractC24490k m32111s0 = flowable.m32154d0(new InterfaceC23492o() { // from class: Lv6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m77670i0;
                m77670i0 = C36956Wv6.m77670i0(Function1.this, obj);
                return m77670i0;
            }
        }).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9215c c9215c = new C9215c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Mv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77669j0(Function1.this, obj);
            }
        };
        final C9216d c9216d = new C9216d();
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Nv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77691O(Function1.this, obj);
            }
        });
        AbstractC24490k<Optional<Earth>> flowable2 = renderer.mo58902r9().toFlowable(EnumC23460b.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable2, "renderer.earth\n      .to…kpressureStrategy.LATEST)");
        AbstractC24490k m74591D = C37279Yf5.m74591D(C37279Yf5.m74579P(flowable2), new C9217e());
        final C9218f c9218f = new C9218f();
        AbstractC24490k m32125n1 = m74591D.m32191K(new InterfaceC23484g() { // from class: Pv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77690P(Function1.this, obj);
            }
        }).m32125n1(250L, TimeUnit.MILLISECONDS, true);
        final C9219g c9219g = C9219g.f42336g;
        AbstractC24490k m32175S = m32125n1.m32175S(new InterfaceC23494q() { // from class: Qv6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m77689Q;
                m77689Q = C36956Wv6.m77689Q(Function1.this, obj);
                return m77689Q;
            }
        });
        final C9220h c9220h = new C9220h(renderer);
        AbstractC24490k m32191K = m32175S.m32191K(new InterfaceC23484g() { // from class: Rv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77688R(Function1.this, obj);
            }
        });
        final C9221i c9221i = new C9221i();
        AbstractC24490k m32175S2 = m32191K.m32175S(new InterfaceC23494q() { // from class: Sv6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m77687S;
                m77687S = C36956Wv6.m77687S(Function1.this, obj);
                return m77687S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32175S2, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Object m32150f2 = m32175S2.m32150f(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m32150f2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9222j c9222j = new C9222j();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Tv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77686T(Function1.this, obj);
            }
        };
        final C9223k c9223k = new C9223k();
        ((FlowableSubscribeProxy) m32150f2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Uv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77685U(Function1.this, obj);
            }
        });
        Z84<Optional<List<C0774Bx>>> mo58921A6 = renderer.mo58921A6();
        final C9224l c9224l = new C9224l();
        Observable<Optional<List<C0774Bx>>> doOnNext2 = mo58921A6.doOnNext(new InterfaceC23484g() { // from class: Vv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77684V(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun consume(ren…{ }\n        }\n      }\n  }");
        AbstractC24507p firstElement = C37279Yf5.m74575T(doOnNext2, new C9226n(renderer)).firstElement();
        final C9227o c9227o = new C9227o();
        AbstractC24507p m32026s = firstElement.m32026s(new InterfaceC23484g() { // from class: yv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77683W(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Object m32048b = m32026s.m32048b(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9228p c9228p = new C9228p();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: zv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77682X(Function1.this, obj);
            }
        };
        final C9229q c9229q = new C9229q();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Av6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77680Z(Function1.this, obj);
            }
        });
        Observable<DialogResponse> observeOn4 = renderer.mo58918L8().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "renderer\n      .errorDia…dSchedulers.mainThread())");
        Object m33094as3 = observeOn4.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9230r c9230r = new C9230r();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Cv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77679a0(Function1.this, obj);
            }
        });
        Observable<GravityVector> mo58919E8 = renderer.mo58919E8();
        final C9232s c9232s = new C9232s();
        Observable<GravityVector> observeOn5 = mo58919E8.doOnNext(new InterfaceC23484g() { // from class: Dv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77678b0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "override fun consume(ren…{ }\n        }\n      }\n  }");
        Object m33094as4 = observeOn5.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9233t c9233t = new C9233t();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Ev6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36956Wv6.m77677c0(Function1.this, obj);
            }
        });
    }

    /* renamed from: k0 */
    public final boolean m77668k0(ParkingNest parkingNest, Location location) {
        return JX3.contains$default(parkingNest.getShape(), location, 0.0d, 0.0d, 6, null);
    }

    /* renamed from: m0 */
    public final ParkingNest m77665m0() {
        return (ParkingNest) this.f42317t.getValue();
    }

    /* renamed from: n0 */
    public final void m77663n0(boolean z) {
        if (this.f42314q && !z) {
            this.f42309l.postDelayed(new Runnable() { // from class: xv6
                @Override // java.lang.Runnable
                public final void run() {
                    C36956Wv6.m77659p0(C36956Wv6.this);
                }
            }, PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        } else {
            this.f42309l.postDelayed(new Runnable() { // from class: Iv6
                @Override // java.lang.Runnable
                public final void run() {
                    C36956Wv6.m77657q0(C36956Wv6.this);
                }
            }, PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        }
    }

    /* renamed from: r0 */
    public final Pair<Boolean, Double> m77655r0(double d) {
        DateTime dateTime = this.f42318u;
        double d2 = 0.0d;
        Double valueOf = Double.valueOf(0.0d);
        if (dateTime != null) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            double m19253i = C46880pT0.m19253i(now, dateTime);
            if (m19253i < 2.0d) {
                return TuplesKt.m28425to(Boolean.FALSE, valueOf);
            }
            double d3 = m19253i - 2;
            double requiredHorizontalAccuracyMeters = this.f42313p.getRequiredHorizontalAccuracyMeters();
            Double horizontalAccuracyAllowanceMetersPerSecond = this.f42313p.getHorizontalAccuracyAllowanceMetersPerSecond();
            if (horizontalAccuracyAllowanceMetersPerSecond != null) {
                d2 = horizontalAccuracyAllowanceMetersPerSecond.doubleValue() * d3;
            }
            double d4 = requiredHorizontalAccuracyMeters + d2;
            if (d <= d4) {
                return TuplesKt.m28425to(Boolean.TRUE, Double.valueOf(d4));
            }
            Double allowDeviceLocationIfAccurateAfterSeconds = this.f42313p.getAllowDeviceLocationIfAccurateAfterSeconds();
            if (allowDeviceLocationIfAccurateAfterSeconds != null && d3 >= allowDeviceLocationIfAccurateAfterSeconds.doubleValue() && this.f42304g.mo43616p().getValue().getAccuracy() <= d4) {
                return TuplesKt.m28425to(Boolean.TRUE, Double.valueOf(d4));
            }
            return TuplesKt.m28425to(Boolean.FALSE, Double.valueOf(d4));
        }
        return TuplesKt.m28425to(Boolean.FALSE, valueOf);
    }

    /* renamed from: s0 */
    public final void m77653s0() {
        this.f42318u = null;
    }

    /* renamed from: t0 */
    public final void m77651t0(Earth earth, Session session, Optional<String> optional) {
        GeospatialPose geospatialPose;
        double d;
        String str;
        boolean z;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Config.GeospatialMode geospatialMode;
        Config.FocusMode focusMode;
        Config config;
        Config config2;
        Polygon shape;
        TrackingState trackingState;
        Location m73665a = this.f42304g.mo43616p().m73665a();
        if (earth == null || (geospatialPose = earth.getCameraGeospatialPose()) == null) {
            geospatialPose = this.f42320w;
        }
        double d7 = 0.0d;
        if (geospatialPose != null) {
            d = geospatialPose.getLatitude();
        } else {
            d = 0.0d;
        }
        if (geospatialPose != null) {
            d7 = geospatialPose.getLongitude();
        }
        LatLng latLng = new LatLng(d, d7);
        ParkingNest m77694L = m77694L(C39339cm2.m60884e(latLng));
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        if (earth == null || (trackingState = earth.getTrackingState()) == null || (str = trackingState.name()) == null) {
            String m59035e = optional.m59035e();
            if (m59035e != null) {
                if (m59035e.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m59035e = null;
                }
                if (m59035e != null) {
                    str = "SCANNING BARCODES";
                }
            }
            str = "NOT TRACKING";
        }
        stringBuffer.append(str);
        stringBuffer.append("\nArcore lat/lon: ");
        stringBuffer.append("(" + latLng + ")");
        stringBuffer.append("\nArcore heading degrees - altitude: ");
        if (geospatialPose != null) {
            d2 = Double.valueOf(geospatialPose.getHeading());
        } else {
            d2 = null;
        }
        if (geospatialPose != null) {
            d3 = Double.valueOf(geospatialPose.getAltitude());
        } else {
            d3 = null;
        }
        stringBuffer.append(d2 + " - " + d3);
        if (geospatialPose != null) {
            d4 = Double.valueOf(geospatialPose.getHorizontalAccuracy());
        } else {
            d4 = null;
        }
        stringBuffer.append("\nhorizontal accuracy meters: " + d4);
        if (geospatialPose != null) {
            d5 = Double.valueOf(geospatialPose.getVerticalAccuracy());
        } else {
            d5 = null;
        }
        stringBuffer.append("\nvertical (altitude) accuracy meters: " + d5);
        if (geospatialPose != null) {
            d6 = Double.valueOf(geospatialPose.getHeadingAccuracy());
        } else {
            d6 = null;
        }
        stringBuffer.append("\nheading accuracy degrees: " + d6);
        stringBuffer.append("\nrequired accuracy meters: " + this.f42319v);
        stringBuffer.append("\nDevice lat/lon: ");
        stringBuffer.append("(" + m73665a.getLatitude() + "," + m73665a.getLongitude() + ")");
        stringBuffer.append("\nDevice accuracy meters: ");
        stringBuffer.append(m73665a.getAccuracy());
        stringBuffer.append("\ninside: ");
        stringBuffer.append(String.valueOf((m77694L == null || (shape = m77694L.getShape()) == null || !JX3.m100296c(shape, latLng)) ? false : false));
        stringBuffer.append("\ngeospatial mode: ");
        if (session != null && (config2 = session.getConfig()) != null) {
            geospatialMode = config2.getGeospatialMode();
        } else {
            geospatialMode = null;
        }
        stringBuffer.append(geospatialMode);
        stringBuffer.append("\nfocus mode: ");
        if (session != null && (config = session.getConfig()) != null) {
            focusMode = config.getFocusMode();
        } else {
            focusMode = null;
        }
        stringBuffer.append(focusMode);
        if (optional.m59037c()) {
            stringBuffer.append("\nbarcodes: ");
            stringBuffer.append(optional.m59035e());
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "buffer.toString()");
        m42280h(new EU0(stringBuffer2, earth, m73665a));
    }

    /* renamed from: v0 */
    public final void m77647v0(Throwable th) {
        InterfaceC28816tm interfaceC28816tm = this.f42303f;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS;
        String str = this.f42308k;
        String id = this.f42307j.getId();
        ParkingNest m77665m0 = m77665m0();
        ParkingNest m77665m02 = m77665m0();
        boolean z = false;
        if (m77665m02 != null && m77668k0(m77665m02, this.f42304g.mo43616p().m73665a())) {
            z = true;
        }
        InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm, parkingLocationVerificationMethod, str, id, m77665m0, Boolean.valueOf(z), th.getMessage(), Double.valueOf(this.f42322y), null, null, null, 896, null);
        C41318g46.m40159e(th);
    }
}
