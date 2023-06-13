package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C40723f44;
import p000.InterfaceC48164rd5;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u0001\tB\u0089\u0001\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u00064"}, m28432d2 = {"Lf44;", "LtC3;", "", "success", "", "b3", "", LegacyRepairType.OTHER_KEY, "R2", C17296a.f69688o, "Lco/bird/android/model/persistence/Bird;", "bird", "F2", "onBackPressed", "Lco/bird/android/model/persistence/VehicleVersion;", "Q2", "()Lco/bird/android/model/persistence/VehicleVersion;", "currentVehicleVersion", "LEa;", "analyticsManager", "LpJ;", "bluetoothManager", "Lq54;", "privateBirdsManager", "LWX2;", "myBirdsManager", "LgH;", "birdActionsManager", "LkI;", "birdAirManager", "Lrd5;", "rxBleBirdBluetoothManager", "Ldr4;", "reactiveLocationManager", "LTq4;", "reactiveConfig", "Le13;", "navigator", "LOA3;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUC3;", "ui", "", "birdId", "justPaired", "Ldd3;", "notificationSender", "<init>", "(LEa;LpJ;Lq54;LWX2;LgH;LkI;Lrd5;Ldr4;LTq4;Le13;LOA3;Lcom/uber/autodispose/ScopeProvider;LUC3;Ljava/lang/String;ZLdd3;)V", "z", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdBikeDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdBikeDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdBikeDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n237#2:274\n237#2:275\n1726#3,3:276\n*S KotlinDebug\n*F\n+ 1 PrivateBirdBikeDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdBikeDetailsPresenterImpl\n*L\n100#1:274\n244#1:275\n270#1:276,3\n*E\n"})
/* renamed from: f44  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40723f44 extends C49101tC3 {

    /* renamed from: z */
    public static final C20193a f79393z = new C20193a(null);

    /* renamed from: A */
    public static final byte[] f79381A = {6, 1};

    /* renamed from: B */
    public static final byte[] f79382B = {1, 4};

    /* renamed from: C */
    public static final byte[] f79383C = {1, 6};

    /* renamed from: D */
    public static final byte[] f79384D = {1, 8};

    /* renamed from: E */
    public static final byte[] f79385E = {2, 1};

    /* renamed from: F */
    public static final byte[] f79386F = {2, 32};

    /* renamed from: G */
    public static final byte[] f79387G = {5, 69};

    /* renamed from: H */
    public static final byte[] f79388H = {5, 71};

    /* renamed from: I */
    public static final byte[] f79389I = {5, 72};

    /* renamed from: J */
    public static final byte[] f79390J = {5, 14};

    /* renamed from: K */
    public static final byte[] f79391K = {5, 12};

    /* renamed from: L */
    public static final byte[] f79392L = {5, 1};

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001f"}, m28432d2 = {"Lf44$a;", "", "", "GET_TOKEN_RESPONSE_PREFIX", "[B", "i", "()[B", "GET_DISPLAY_FIRMWARE_PREFIX", DateTokenConverter.CONVERTER_KEY, "GET_ECU_FIRMWARE_PREFIX", "e", "GET_BMS_FIRMWARE_PREFIX", "c", "GET_BATTERY_LEVEL_PREFIX", "b", "CLEAR_ODOMETER_PREFIX", C17296a.f69688o, "GET_HEADLIGHT_STATE_PREFIX", "f", "SET_HEADLIGHT_STATE_PREFIX", "j", "GET_RIDE_DATA_PREFIX", "h", "GET_MOTOR_LOCK_PREFIX", "g", "SET_MOTOR_LOCK_PREFIX", "k", "SET_MOTOR_LOCK_UNLOCKED_PREFIX", "l", "<init>", "()V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: f44$a */
    /* loaded from: classes3.dex */
    public static final class C20193a {
        public /* synthetic */ C20193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final byte[] m42153a() {
            return C40723f44.f79386F;
        }

        /* renamed from: b */
        public final byte[] m42152b() {
            return C40723f44.f79385E;
        }

        /* renamed from: c */
        public final byte[] m42151c() {
            return C40723f44.f79384D;
        }

        /* renamed from: d */
        public final byte[] m42150d() {
            return C40723f44.f79382B;
        }

        /* renamed from: e */
        public final byte[] m42149e() {
            return C40723f44.f79383C;
        }

        /* renamed from: f */
        public final byte[] m42148f() {
            return C40723f44.f79387G;
        }

        /* renamed from: g */
        public final byte[] m42147g() {
            return C40723f44.f79390J;
        }

        /* renamed from: h */
        public final byte[] m42146h() {
            return C40723f44.f79389I;
        }

        /* renamed from: i */
        public final byte[] m42145i() {
            return C40723f44.f79381A;
        }

        /* renamed from: j */
        public final byte[] m42144j() {
            return C40723f44.f79388H;
        }

        /* renamed from: k */
        public final byte[] m42143k() {
            return C40723f44.f79391K;
        }

        /* renamed from: l */
        public final byte[] m42142l() {
            return C40723f44.f79392L;
        }

        private C20193a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f44$b */
    /* loaded from: classes3.dex */
    public static final class C20194b extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C20194b f79394g = new C20194b();

        public C20194b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Bird_Kt.isBirdBike(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f44$c */
    /* loaded from: classes3.dex */
    public static final class C20195c extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Bird>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f44$c$a */
        /* loaded from: classes3.dex */
        public static final class C20196a extends Lambda implements Function1<Unit, Bird> {

            /* renamed from: g */
            public final /* synthetic */ Bird f79396g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20196a(Bird bird) {
                super(1);
                this.f79396g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Bird invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f79396g;
            }
        }

        public C20195c() {
            super(1);
        }

        /* renamed from: c */
        public static final Bird m42138c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Bird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Bird> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Observable<Unit> delay = C40723f44.this.m12830V0().delay(500L, TimeUnit.MILLISECONDS);
            final C20196a c20196a = new C20196a(bird);
            return delay.map(new InterfaceC23492o() { // from class: g44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Bird m42138c;
                    m42138c = C40723f44.C20195c.m42138c(Function1.this, obj);
                    return m42138c;
                }
            }).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f44$d */
    /* loaded from: classes3.dex */
    public static final class C20197d extends Lambda implements Function1<Bird, InterfaceC23496h> {
        public C20197d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C40723f44.this.m12836T0().mo15674l(C40723f44.this.m12874G2(it));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f44$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20198e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20198e f79398b = new C20198e();

        public C20198e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f44$f */
    /* loaded from: classes3.dex */
    public static final class C20199f extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C20199f f79399g = new C20199f();

        public C20199f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean isBirdBike = Bird_Kt.isBirdBike(it);
            C41318g46.m40163a("filtering if bird bike: " + isBirdBike, new Object[0]);
            return Boolean.valueOf(isBirdBike);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f44$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20205h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20205h f79406b = new C20205h();

        public C20205h() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40723f44(InterfaceC1880Ea analyticsManager, InterfaceC27246pJ bluetoothManager, InterfaceC47256q54 privateBirdsManager, WX2 myBirdsManager, InterfaceC20792gH birdActionsManager, InterfaceC25134kI birdAirManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC40001dr4 reactiveLocationManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, OA3 converter, ScopeProvider scopeProvider, UC3 ui, String birdId, boolean z, InterfaceC39861dd3 notificationSender) {
        super(analyticsManager, bluetoothManager, privateBirdsManager, myBirdsManager, birdActionsManager, birdAirManager, rxBleBirdBluetoothManager, reactiveLocationManager, reactiveConfig, navigator, converter, scopeProvider, ui, birdId, z, notificationSender);
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(myBirdsManager, "myBirdsManager");
        Intrinsics.checkNotNullParameter(birdActionsManager, "birdActionsManager");
        Intrinsics.checkNotNullParameter(birdAirManager, "birdAirManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(notificationSender, "notificationSender");
    }

    /* renamed from: S2 */
    public static final boolean m42164S2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T2 */
    public static final InterfaceC23447K m42163T2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U2 */
    public static final InterfaceC23496h m42162U2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V2 */
    public static final void m42161V2() {
    }

    /* renamed from: W2 */
    public static final void m42160W2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X2 */
    public static final boolean m42159X2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Y2 */
    public static final InterfaceC23496h m42158Y2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Z2 */
    public static final void m42157Z2() {
    }

    /* renamed from: a3 */
    public static final String m42156a3(byte[] bArr) {
        byte b;
        IntRange until;
        byte[] sliceArray;
        if (bArr.length < 3 || (b = bArr[2]) <= 0) {
            return null;
        }
        until = RangesKt___RangesKt.until(3, b + 3);
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, until);
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        return new String(sliceArray, forName);
    }

    /* renamed from: u2 */
    public static final void m42154u2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C49101tC3
    /* renamed from: F2 */
    public void mo12878F2(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo12878F2(bird);
        m12827W0().m81842om(false);
        m12827W0().m81844mm(bird.getLocked());
        m12827W0().m81834wm(Bird_Kt.isBirdBikePairable(bird));
        m12827W0().m81832ym(false);
        m12827W0().m81845lm(false);
    }

    /* renamed from: Q2 */
    public final VehicleVersion m42166Q2() {
        VehicleVersion value = m12824X0().getValue();
        return value == null ? new VehicleVersion("1", null, null, 0, null, null, 62, null) : value;
    }

    /* renamed from: R2 */
    public final boolean m42165R2(byte[] bArr, byte[] bArr2) {
        IntRange indices;
        boolean z;
        if (bArr2.length <= bArr.length) {
            indices = ArraysKt___ArraysKt.getIndices(bArr2);
            if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                Iterator<Integer> it = indices.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    if (bArr[nextInt] == bArr2[nextInt]) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C49101tC3, p000.RA3
    /* renamed from: a */
    public void mo12816a() {
        super.mo12816a();
        AbstractC23442F<Bird> firstOrError = m12872H0().firstOrError();
        final C20194b c20194b = C20194b.f79394g;
        AbstractC24507p<Bird> m33098z = firstOrError.m33098z(new InterfaceC23494q() { // from class: W34
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m42164S2;
                m42164S2 = C40723f44.m42164S2(Function1.this, obj);
                return m42164S2;
            }
        });
        final C20195c c20195c = new C20195c();
        AbstractC23442F<R> m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: X34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m42163T2;
                m42163T2 = C40723f44.m42163T2(Function1.this, obj);
                return m42163T2;
            }
        });
        final C20197d c20197d = new C20197d();
        AbstractC23461c m33164B = m32072C.m33164B(new InterfaceC23492o() { // from class: Y34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m42162U2;
                m42162U2 = C40723f44.m42162U2(Function1.this, obj);
                return m42162U2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Z34
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C40723f44.m42161V2();
            }
        };
        final C20198e c20198e = C20198e.f79398b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: a44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40723f44.m42160W2(Function1.this, obj);
            }
        });
        C0058AG<Bird> m12872H0 = m12872H0();
        final C20199f c20199f = C20199f.f79399g;
        Observable<Bird> take = m12872H0.filter(new InterfaceC23494q() { // from class: b44
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m42159X2;
                m42159X2 = C40723f44.m42159X2(Function1.this, obj);
                return m42159X2;
            }
        }).take(1L);
        final C20200g c20200g = new C20200g();
        AbstractC23461c switchMapCompletable = take.switchMapCompletable(new InterfaceC23492o() { // from class: c44
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m42158Y2;
                m42158Y2 = C40723f44.m42158Y2(Function1.this, obj);
                return m42158Y2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: d44
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C40723f44.m42157Z2();
            }
        };
        final C20205h c20205h = C20205h.f79406b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: e44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40723f44.m42154u2(Function1.this, obj);
            }
        });
    }

    /* renamed from: b3 */
    public final void m42155b3(boolean z) {
        C41318g46.m40163a("update bike clear operation success: " + z, new Object[0]);
    }

    @Override // p000.C49101tC3, p000.RA3
    public boolean onBackPressed() {
        boolean m81861Wl = m12827W0().m81861Wl();
        if (!m81861Wl) {
            return super.onBackPressed();
        }
        return m81861Wl;
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f44$g */
    /* loaded from: classes3.dex */
    public static final class C20200g extends Lambda implements Function1<Bird, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: f44$g$a */
        /* loaded from: classes3.dex */
        public static final class C20201a extends Lambda implements Function1<Observable<byte[]>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C40723f44 f79401g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20201a(C40723f44 c40723f44) {
                super(1);
                this.f79401g = c40723f44;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Observable<byte[]> observable) {
                invoke2(observable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Observable<byte[]> observable) {
                C41318g46.m40163a("received notification observable for bird bike", new Object[0]);
                this.f79401g.m12830V0().onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f44$g$b */
        /* loaded from: classes3.dex */
        public static final class C20202b extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {

            /* renamed from: g */
            public static final C20202b f79402g = new C20202b();

            public C20202b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        public C20200g() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23434B m42130e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m42129f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            String id = bird.getId();
            C41318g46.m40163a("subscribing to ble notifications for bird " + id, new Object[0]);
            Observable retry = InterfaceC48164rd5.C27958a.subscribeBleNotifications$default(C40723f44.this.m12836T0(), C40723f44.this.m12874G2(bird), null, 2, null).retry(3L);
            final C20201a c20201a = new C20201a(C40723f44.this);
            Observable doOnNext = retry.doOnNext(new InterfaceC23484g() { // from class: h44
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C40723f44.C20200g.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C20202b c20202b = C20202b.f79402g;
            Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: i44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m42130e;
                    m42130e = C40723f44.C20200g.m42130e(Function1.this, obj);
                    return m42130e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
            Observable m31950a = C24527f.m31950a(flatMap, C40723f44.this.m12872H0());
            final C20203c c20203c = new C20203c(C40723f44.this);
            return m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: j44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m42129f;
                    m42129f = C40723f44.C20200g.m42129f(Function1.this, obj);
                    return m42129f;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f44$g$c */
        /* loaded from: classes3.dex */
        public static final class C20203c extends Lambda implements Function1<Pair<? extends byte[], ? extends Bird>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C40723f44 f79403g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "decryptedData", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nPrivateBirdBikeDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdBikeDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdBikeDetailsPresenterImpl$onCreate$7$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
            /* renamed from: f44$g$c$a */
            /* loaded from: classes3.dex */
            public static final class C20204a extends Lambda implements Function1<byte[], InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C40723f44 f79404g;

                /* renamed from: h */
                public final /* synthetic */ Bird f79405h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20204a(C40723f44 c40723f44, Bird bird) {
                    super(1);
                    this.f79404g = c40723f44;
                    this.f79405h = bird;
                }

                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC23496h invoke(byte[] decryptedData) {
                    byte[] sliceArray;
                    Bird updatedBird;
                    byte[] sliceArray2;
                    byte b;
                    byte[] sliceArray3;
                    byte[] sliceArray4;
                    Intrinsics.checkNotNullParameter(decryptedData, "decryptedData");
                    sliceArray = ArraysKt___ArraysKt.sliceArray(decryptedData, new IntRange(0, 2));
                    C41318g46.m40163a("decrypted data prefix: " + C3157HY.m103785e(sliceArray), new Object[0]);
                    C40723f44 c40723f44 = this.f79404g;
                    C20193a c20193a = C40723f44.f79393z;
                    if (c40723f44.m42165R2(decryptedData, c20193a.m42145i())) {
                        C0058AG<VehicleVersion> m12824X0 = this.f79404g.m12824X0();
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                        sliceArray3 = ArraysKt___ArraysKt.sliceArray(decryptedData, new IntRange(8, 10));
                        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
                        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
                        m12824X0.accept(new VehicleVersion(uuid, null, new String(sliceArray3, forName), 0, null, null, 58, null));
                        InterfaceC48164rd5 m12836T0 = this.f79404g.m12836T0();
                        C40723f44 c40723f442 = this.f79404g;
                        Bird bird = this.f79405h;
                        Intrinsics.checkNotNullExpressionValue(bird, "bird");
                        VehicleDescriptor m12874G2 = c40723f442.m12874G2(bird);
                        sliceArray4 = ArraysKt___ArraysKt.sliceArray(decryptedData, new IntRange(3, 6));
                        m12836T0.mo15670p(m12874G2, sliceArray4);
                        updatedBird = this.f79405h;
                        r3 = true;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42150d())) {
                        String m42156a3 = C40723f44.m42156a3(decryptedData);
                        C41318g46.m40163a("displayFirmware: " + m42156a3 + " (original: " + C3157HY.m103785e(decryptedData) + ")", new Object[0]);
                        this.f79404g.m12824X0().accept(VehicleVersion.copy$default(this.f79404g.m42166Q2(), null, null, m42156a3, 0, null, null, 59, null));
                        updatedBird = this.f79405h;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42149e())) {
                        String m42156a32 = C40723f44.m42156a3(decryptedData);
                        C41318g46.m40163a("ecuFirmware: " + m42156a32 + " (original: " + C3157HY.m103785e(decryptedData) + ")", new Object[0]);
                        this.f79404g.m12824X0().accept(VehicleVersion.copy$default(this.f79404g.m42166Q2(), null, null, null, 0, m42156a32, null, 47, null));
                        updatedBird = this.f79405h;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42151c())) {
                        String m42156a33 = C40723f44.m42156a3(decryptedData);
                        C41318g46.m40163a("bmsFirmware: " + m42156a33 + " (original: " + C3157HY.m103785e(decryptedData) + ")", new Object[0]);
                        this.f79404g.m12824X0().accept(VehicleVersion.copy$default(this.f79404g.m42166Q2(), null, m42156a33, null, 0, null, null, 61, null));
                        updatedBird = this.f79405h;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42152b())) {
                        byte b2 = decryptedData[3];
                        C41318g46.m40163a("battery level returned: " + ((int) b2) + " (original: " + C3157HY.m103785e(decryptedData) + ")", new Object[0]);
                        Bird bird2 = this.f79405h;
                        Intrinsics.checkNotNullExpressionValue(bird2, "bird");
                        updatedBird = bird2.copy((r88 & 1) != 0 ? bird2.f66670id : null, (r88 & 2) != 0 ? bird2.model : null, (r88 & 4) != 0 ? bird2.taskId : null, (r88 & 8) != 0 ? bird2.batteryLevel : b2, (r88 & 16) != 0 ? bird2.estimatedRange : null, (r88 & 32) != 0 ? bird2.distance : 0, (r88 & 64) != 0 ? bird2.location : null, (r88 & 128) != 0 ? bird2.code : null, (r88 & 256) != 0 ? bird2.stickerId : null, (r88 & 512) != 0 ? bird2.serialNumber : null, (r88 & 1024) != 0 ? bird2.disconnected : false, (r88 & 2048) != 0 ? bird2.collect : false, (r88 & 4096) != 0 ? bird2.submerged : false, (r88 & 8192) != 0 ? bird2.lost : false, (r88 & 16384) != 0 ? bird2.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird2.ackLocked : false, (r88 & 65536) != 0 ? bird2.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird2.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird2.broken : false, (r88 & 524288) != 0 ? bird2.label : null, (r88 & 1048576) != 0 ? bird2.actions : null, (r88 & 2097152) != 0 ? bird2.bountyId : null, (r88 & 4194304) != 0 ? bird2.bountyPrice : null, (r88 & 8388608) != 0 ? bird2.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird2.bountyLost : false, (r88 & 33554432) != 0 ? bird2.bountyOverdue : false, (r88 & 67108864) != 0 ? bird2.bountyKind : null, (r88 & 134217728) != 0 ? bird2.brandName : null, (r88 & 268435456) != 0 ? bird2.taskKind : null, (r88 & 536870912) != 0 ? bird2.gpsAt : null, (r88 & 1073741824) != 0 ? bird2.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird2.token : null, (r89 & 1) != 0 ? bird2.bluetooth : false, (r89 & 2) != 0 ? bird2.cellular : false, (r89 & 4) != 0 ? bird2.startedAt : null, (r89 & 8) != 0 ? bird2.dueAt : null, (r89 & 16) != 0 ? bird2.asleep : false, (r89 & 32) != 0 ? bird2.imei : null, (r89 & 64) != 0 ? bird2.boardProtocol : null, (r89 & 128) != 0 ? bird2.physicalLock : null, (r89 & 256) != 0 ? bird2.physicalLocks : null, (r89 & 512) != 0 ? bird2.priorityCollect : false, (r89 & 1024) != 0 ? bird2.down : false, (r89 & 2048) != 0 ? bird2.needsInspection : false, (r89 & 4096) != 0 ? bird2.partnerId : null, (r89 & 8192) != 0 ? bird2.nestId : null, (r89 & 16384) != 0 ? bird2.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird2.partnerBirdState : null, (r89 & 65536) != 0 ? bird2.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird2.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird2.lifecycle : null, (r89 & 524288) != 0 ? bird2.offline : false, (r89 & 1048576) != 0 ? bird2.license : null, (r89 & 2097152) != 0 ? bird2.areaKey : null, (r89 & 4194304) != 0 ? bird2.nestPurpose : null, (r89 & 8388608) != 0 ? bird2.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird2.scannedAt : null, (r89 & 33554432) != 0 ? bird2.badgeType : null, (r89 & 67108864) != 0 ? bird2.bountyReasons : null, (r89 & 134217728) != 0 ? bird2.ephemeralId : null, (r89 & 268435456) != 0 ? bird2.bleMacAddress : null, (r89 & 536870912) != 0 ? bird2.hasHelmet : null, (r89 & 1073741824) != 0 ? bird2.locationUpdatedAt : null);
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42153a())) {
                        r3 = decryptedData[3] == 0;
                        this.f79404g.m42155b3(r3);
                        updatedBird = this.f79405h;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42148f())) {
                        C41318g46.m40163a("light on response: " + P70.m90797a(decryptedData[3]) + " | " + ((int) b) + " | " + (decryptedData[3] == 1), new Object[0]);
                        Bird bird3 = this.f79405h;
                        bird3.setLightOn(Boolean.valueOf(decryptedData[3] == 1));
                        updatedBird = bird3;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42144j())) {
                        C41318g46.m40163a("set headlight state response received (original: " + C3157HY.m103785e(decryptedData), new Object[0]);
                        updatedBird = this.f79405h;
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42146h())) {
                        int i = ByteBuffer.wrap(new byte[]{0, 0, decryptedData[5], decryptedData[6]}).getInt() * 100;
                        sliceArray2 = ArraysKt___ArraysKt.sliceArray(decryptedData, new IntRange(7, 10));
                        int i2 = ByteBuffer.wrap(sliceArray2).getInt() * 100;
                        C41318g46.m40163a("get ride data response received " + i + " | " + i2 + " (original: " + C3157HY.m103785e(decryptedData) + ")", new Object[0]);
                        Bird bird4 = this.f79405h;
                        Intrinsics.checkNotNullExpressionValue(bird4, "bird");
                        updatedBird = bird4.copy((r88 & 1) != 0 ? bird4.f66670id : null, (r88 & 2) != 0 ? bird4.model : null, (r88 & 4) != 0 ? bird4.taskId : null, (r88 & 8) != 0 ? bird4.batteryLevel : 0, (r88 & 16) != 0 ? bird4.estimatedRange : Integer.valueOf(i), (r88 & 32) != 0 ? bird4.distance : i2, (r88 & 64) != 0 ? bird4.location : null, (r88 & 128) != 0 ? bird4.code : null, (r88 & 256) != 0 ? bird4.stickerId : null, (r88 & 512) != 0 ? bird4.serialNumber : null, (r88 & 1024) != 0 ? bird4.disconnected : false, (r88 & 2048) != 0 ? bird4.collect : false, (r88 & 4096) != 0 ? bird4.submerged : false, (r88 & 8192) != 0 ? bird4.lost : false, (r88 & 16384) != 0 ? bird4.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird4.ackLocked : false, (r88 & 65536) != 0 ? bird4.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird4.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird4.broken : false, (r88 & 524288) != 0 ? bird4.label : null, (r88 & 1048576) != 0 ? bird4.actions : null, (r88 & 2097152) != 0 ? bird4.bountyId : null, (r88 & 4194304) != 0 ? bird4.bountyPrice : null, (r88 & 8388608) != 0 ? bird4.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird4.bountyLost : false, (r88 & 33554432) != 0 ? bird4.bountyOverdue : false, (r88 & 67108864) != 0 ? bird4.bountyKind : null, (r88 & 134217728) != 0 ? bird4.brandName : null, (r88 & 268435456) != 0 ? bird4.taskKind : null, (r88 & 536870912) != 0 ? bird4.gpsAt : null, (r88 & 1073741824) != 0 ? bird4.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird4.token : null, (r89 & 1) != 0 ? bird4.bluetooth : false, (r89 & 2) != 0 ? bird4.cellular : false, (r89 & 4) != 0 ? bird4.startedAt : null, (r89 & 8) != 0 ? bird4.dueAt : null, (r89 & 16) != 0 ? bird4.asleep : false, (r89 & 32) != 0 ? bird4.imei : null, (r89 & 64) != 0 ? bird4.boardProtocol : null, (r89 & 128) != 0 ? bird4.physicalLock : null, (r89 & 256) != 0 ? bird4.physicalLocks : null, (r89 & 512) != 0 ? bird4.priorityCollect : false, (r89 & 1024) != 0 ? bird4.down : false, (r89 & 2048) != 0 ? bird4.needsInspection : false, (r89 & 4096) != 0 ? bird4.partnerId : null, (r89 & 8192) != 0 ? bird4.nestId : null, (r89 & 16384) != 0 ? bird4.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird4.partnerBirdState : null, (r89 & 65536) != 0 ? bird4.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird4.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird4.lifecycle : null, (r89 & 524288) != 0 ? bird4.offline : false, (r89 & 1048576) != 0 ? bird4.license : null, (r89 & 2097152) != 0 ? bird4.areaKey : null, (r89 & 4194304) != 0 ? bird4.nestPurpose : null, (r89 & 8388608) != 0 ? bird4.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird4.scannedAt : null, (r89 & 33554432) != 0 ? bird4.badgeType : null, (r89 & 67108864) != 0 ? bird4.bountyReasons : null, (r89 & 134217728) != 0 ? bird4.ephemeralId : null, (r89 & 268435456) != 0 ? bird4.bleMacAddress : null, (r89 & 536870912) != 0 ? bird4.hasHelmet : null, (r89 & 1073741824) != 0 ? bird4.locationUpdatedAt : null);
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42147g())) {
                        boolean z = decryptedData[3] != 1;
                        C41318g46.m40163a("received get motor lock response " + C3157HY.m103785e(decryptedData) + " (isLocked = " + z + ")", new Object[0]);
                        Bird bird5 = this.f79405h;
                        Intrinsics.checkNotNullExpressionValue(bird5, "bird");
                        updatedBird = bird5.copy((r88 & 1) != 0 ? bird5.f66670id : null, (r88 & 2) != 0 ? bird5.model : null, (r88 & 4) != 0 ? bird5.taskId : null, (r88 & 8) != 0 ? bird5.batteryLevel : 0, (r88 & 16) != 0 ? bird5.estimatedRange : null, (r88 & 32) != 0 ? bird5.distance : 0, (r88 & 64) != 0 ? bird5.location : null, (r88 & 128) != 0 ? bird5.code : null, (r88 & 256) != 0 ? bird5.stickerId : null, (r88 & 512) != 0 ? bird5.serialNumber : null, (r88 & 1024) != 0 ? bird5.disconnected : false, (r88 & 2048) != 0 ? bird5.collect : false, (r88 & 4096) != 0 ? bird5.submerged : false, (r88 & 8192) != 0 ? bird5.lost : false, (r88 & 16384) != 0 ? bird5.locked : z, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird5.ackLocked : false, (r88 & 65536) != 0 ? bird5.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird5.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird5.broken : false, (r88 & 524288) != 0 ? bird5.label : null, (r88 & 1048576) != 0 ? bird5.actions : null, (r88 & 2097152) != 0 ? bird5.bountyId : null, (r88 & 4194304) != 0 ? bird5.bountyPrice : null, (r88 & 8388608) != 0 ? bird5.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird5.bountyLost : false, (r88 & 33554432) != 0 ? bird5.bountyOverdue : false, (r88 & 67108864) != 0 ? bird5.bountyKind : null, (r88 & 134217728) != 0 ? bird5.brandName : null, (r88 & 268435456) != 0 ? bird5.taskKind : null, (r88 & 536870912) != 0 ? bird5.gpsAt : null, (r88 & 1073741824) != 0 ? bird5.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird5.token : null, (r89 & 1) != 0 ? bird5.bluetooth : false, (r89 & 2) != 0 ? bird5.cellular : false, (r89 & 4) != 0 ? bird5.startedAt : null, (r89 & 8) != 0 ? bird5.dueAt : null, (r89 & 16) != 0 ? bird5.asleep : false, (r89 & 32) != 0 ? bird5.imei : null, (r89 & 64) != 0 ? bird5.boardProtocol : null, (r89 & 128) != 0 ? bird5.physicalLock : null, (r89 & 256) != 0 ? bird5.physicalLocks : null, (r89 & 512) != 0 ? bird5.priorityCollect : false, (r89 & 1024) != 0 ? bird5.down : false, (r89 & 2048) != 0 ? bird5.needsInspection : false, (r89 & 4096) != 0 ? bird5.partnerId : null, (r89 & 8192) != 0 ? bird5.nestId : null, (r89 & 16384) != 0 ? bird5.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird5.partnerBirdState : null, (r89 & 65536) != 0 ? bird5.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird5.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird5.lifecycle : null, (r89 & 524288) != 0 ? bird5.offline : false, (r89 & 1048576) != 0 ? bird5.license : null, (r89 & 2097152) != 0 ? bird5.areaKey : null, (r89 & 4194304) != 0 ? bird5.nestPurpose : null, (r89 & 8388608) != 0 ? bird5.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird5.scannedAt : null, (r89 & 33554432) != 0 ? bird5.badgeType : null, (r89 & 67108864) != 0 ? bird5.bountyReasons : null, (r89 & 134217728) != 0 ? bird5.ephemeralId : null, (r89 & 268435456) != 0 ? bird5.bleMacAddress : null, (r89 & 536870912) != 0 ? bird5.hasHelmet : null, (r89 & 1073741824) != 0 ? bird5.locationUpdatedAt : null);
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42143k())) {
                        boolean z2 = decryptedData[3] == 1;
                        C41318g46.m40163a("received motor lock request response (success = " + z2 + ")", new Object[0]);
                        if (z2) {
                            Bird bird6 = this.f79405h;
                            Intrinsics.checkNotNullExpressionValue(bird6, "bird");
                            updatedBird = bird6.copy((r88 & 1) != 0 ? bird6.f66670id : null, (r88 & 2) != 0 ? bird6.model : null, (r88 & 4) != 0 ? bird6.taskId : null, (r88 & 8) != 0 ? bird6.batteryLevel : 0, (r88 & 16) != 0 ? bird6.estimatedRange : null, (r88 & 32) != 0 ? bird6.distance : 0, (r88 & 64) != 0 ? bird6.location : null, (r88 & 128) != 0 ? bird6.code : null, (r88 & 256) != 0 ? bird6.stickerId : null, (r88 & 512) != 0 ? bird6.serialNumber : null, (r88 & 1024) != 0 ? bird6.disconnected : false, (r88 & 2048) != 0 ? bird6.collect : false, (r88 & 4096) != 0 ? bird6.submerged : false, (r88 & 8192) != 0 ? bird6.lost : false, (r88 & 16384) != 0 ? bird6.locked : true, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird6.ackLocked : false, (r88 & 65536) != 0 ? bird6.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird6.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird6.broken : false, (r88 & 524288) != 0 ? bird6.label : null, (r88 & 1048576) != 0 ? bird6.actions : null, (r88 & 2097152) != 0 ? bird6.bountyId : null, (r88 & 4194304) != 0 ? bird6.bountyPrice : null, (r88 & 8388608) != 0 ? bird6.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird6.bountyLost : false, (r88 & 33554432) != 0 ? bird6.bountyOverdue : false, (r88 & 67108864) != 0 ? bird6.bountyKind : null, (r88 & 134217728) != 0 ? bird6.brandName : null, (r88 & 268435456) != 0 ? bird6.taskKind : null, (r88 & 536870912) != 0 ? bird6.gpsAt : null, (r88 & 1073741824) != 0 ? bird6.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird6.token : null, (r89 & 1) != 0 ? bird6.bluetooth : false, (r89 & 2) != 0 ? bird6.cellular : false, (r89 & 4) != 0 ? bird6.startedAt : null, (r89 & 8) != 0 ? bird6.dueAt : null, (r89 & 16) != 0 ? bird6.asleep : false, (r89 & 32) != 0 ? bird6.imei : null, (r89 & 64) != 0 ? bird6.boardProtocol : null, (r89 & 128) != 0 ? bird6.physicalLock : null, (r89 & 256) != 0 ? bird6.physicalLocks : null, (r89 & 512) != 0 ? bird6.priorityCollect : false, (r89 & 1024) != 0 ? bird6.down : false, (r89 & 2048) != 0 ? bird6.needsInspection : false, (r89 & 4096) != 0 ? bird6.partnerId : null, (r89 & 8192) != 0 ? bird6.nestId : null, (r89 & 16384) != 0 ? bird6.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird6.partnerBirdState : null, (r89 & 65536) != 0 ? bird6.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird6.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird6.lifecycle : null, (r89 & 524288) != 0 ? bird6.offline : false, (r89 & 1048576) != 0 ? bird6.license : null, (r89 & 2097152) != 0 ? bird6.areaKey : null, (r89 & 4194304) != 0 ? bird6.nestPurpose : null, (r89 & 8388608) != 0 ? bird6.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird6.scannedAt : null, (r89 & 33554432) != 0 ? bird6.badgeType : null, (r89 & 67108864) != 0 ? bird6.bountyReasons : null, (r89 & 134217728) != 0 ? bird6.ephemeralId : null, (r89 & 268435456) != 0 ? bird6.bleMacAddress : null, (r89 & 536870912) != 0 ? bird6.hasHelmet : null, (r89 & 1073741824) != 0 ? bird6.locationUpdatedAt : null);
                        } else {
                            updatedBird = this.f79405h;
                        }
                    } else if (this.f79404g.m42165R2(decryptedData, c20193a.m42142l())) {
                        boolean z3 = decryptedData[3] == 1;
                        C41318g46.m40163a("received motor unlock request response (success = " + z3 + ")", new Object[0]);
                        if (z3) {
                            Bird bird7 = this.f79405h;
                            Intrinsics.checkNotNullExpressionValue(bird7, "bird");
                            updatedBird = bird7.copy((r88 & 1) != 0 ? bird7.f66670id : null, (r88 & 2) != 0 ? bird7.model : null, (r88 & 4) != 0 ? bird7.taskId : null, (r88 & 8) != 0 ? bird7.batteryLevel : 0, (r88 & 16) != 0 ? bird7.estimatedRange : null, (r88 & 32) != 0 ? bird7.distance : 0, (r88 & 64) != 0 ? bird7.location : null, (r88 & 128) != 0 ? bird7.code : null, (r88 & 256) != 0 ? bird7.stickerId : null, (r88 & 512) != 0 ? bird7.serialNumber : null, (r88 & 1024) != 0 ? bird7.disconnected : false, (r88 & 2048) != 0 ? bird7.collect : false, (r88 & 4096) != 0 ? bird7.submerged : false, (r88 & 8192) != 0 ? bird7.lost : false, (r88 & 16384) != 0 ? bird7.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird7.ackLocked : false, (r88 & 65536) != 0 ? bird7.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird7.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird7.broken : false, (r88 & 524288) != 0 ? bird7.label : null, (r88 & 1048576) != 0 ? bird7.actions : null, (r88 & 2097152) != 0 ? bird7.bountyId : null, (r88 & 4194304) != 0 ? bird7.bountyPrice : null, (r88 & 8388608) != 0 ? bird7.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird7.bountyLost : false, (r88 & 33554432) != 0 ? bird7.bountyOverdue : false, (r88 & 67108864) != 0 ? bird7.bountyKind : null, (r88 & 134217728) != 0 ? bird7.brandName : null, (r88 & 268435456) != 0 ? bird7.taskKind : null, (r88 & 536870912) != 0 ? bird7.gpsAt : null, (r88 & 1073741824) != 0 ? bird7.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird7.token : null, (r89 & 1) != 0 ? bird7.bluetooth : false, (r89 & 2) != 0 ? bird7.cellular : false, (r89 & 4) != 0 ? bird7.startedAt : null, (r89 & 8) != 0 ? bird7.dueAt : null, (r89 & 16) != 0 ? bird7.asleep : false, (r89 & 32) != 0 ? bird7.imei : null, (r89 & 64) != 0 ? bird7.boardProtocol : null, (r89 & 128) != 0 ? bird7.physicalLock : null, (r89 & 256) != 0 ? bird7.physicalLocks : null, (r89 & 512) != 0 ? bird7.priorityCollect : false, (r89 & 1024) != 0 ? bird7.down : false, (r89 & 2048) != 0 ? bird7.needsInspection : false, (r89 & 4096) != 0 ? bird7.partnerId : null, (r89 & 8192) != 0 ? bird7.nestId : null, (r89 & 16384) != 0 ? bird7.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird7.partnerBirdState : null, (r89 & 65536) != 0 ? bird7.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird7.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird7.lifecycle : null, (r89 & 524288) != 0 ? bird7.offline : false, (r89 & 1048576) != 0 ? bird7.license : null, (r89 & 2097152) != 0 ? bird7.areaKey : null, (r89 & 4194304) != 0 ? bird7.nestPurpose : null, (r89 & 8388608) != 0 ? bird7.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird7.scannedAt : null, (r89 & 33554432) != 0 ? bird7.badgeType : null, (r89 & 67108864) != 0 ? bird7.bountyReasons : null, (r89 & 134217728) != 0 ? bird7.ephemeralId : null, (r89 & 268435456) != 0 ? bird7.bleMacAddress : null, (r89 & 536870912) != 0 ? bird7.hasHelmet : null, (r89 & 1073741824) != 0 ? bird7.locationUpdatedAt : null);
                        } else {
                            updatedBird = this.f79405h;
                        }
                    } else {
                        C41318g46.m40163a("unknown notification response from bird bike " + C3157HY.m103785e(decryptedData), new Object[0]);
                        updatedBird = this.f79405h;
                    }
                    C40723f44 c40723f443 = this.f79404g;
                    Bird bird8 = this.f79405h;
                    Intrinsics.checkNotNullExpressionValue(bird8, "bird");
                    Intrinsics.checkNotNullExpressionValue(updatedBird, "updatedBird");
                    if (!c40723f443.m12886D2(bird8, updatedBird)) {
                        this.f79404g.m12872H0().accept(updatedBird);
                        return this.f79404g.m12845Q0().mo18209e(updatedBird);
                    } else if (r3) {
                        InterfaceC48164rd5 m12836T02 = this.f79404g.m12836T0();
                        C40723f44 c40723f444 = this.f79404g;
                        Bird bird9 = this.f79405h;
                        Intrinsics.checkNotNullExpressionValue(bird9, "bird");
                        return m12836T02.mo15664v(c40723f444.m12874G2(bird9));
                    } else {
                        return AbstractC23461c.m33039p();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20203c(C40723f44 c40723f44) {
                super(1);
                this.f79403g = c40723f44;
            }

            /* renamed from: b */
            public static final InterfaceC23496h m42127b(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Pair<byte[], Bird> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                byte[] data = pair.component1();
                Bird bird = pair.component2();
                Intrinsics.checkNotNullExpressionValue(data, "data");
                String m103785e = C3157HY.m103785e(data);
                C41318g46.m40163a("Attempting to decrypt ble notify data: " + m103785e, new Object[0]);
                InterfaceC48164rd5 m12836T0 = this.f79403g.m12836T0();
                C40723f44 c40723f44 = this.f79403g;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                AbstractC23442F<byte[]> mo15667s = m12836T0.mo15667s(c40723f44.m12874G2(bird), data);
                final C20204a c20204a = new C20204a(this.f79403g, bird);
                return mo15667s.m33164B(new InterfaceC23492o() { // from class: k44
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m42127b;
                        m42127b = C40723f44.C20200g.C20203c.m42127b(Function1.this, obj);
                        return m42127b;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends byte[], ? extends Bird> pair) {
                return invoke2((Pair<byte[], Bird>) pair);
            }
        }
    }
}
