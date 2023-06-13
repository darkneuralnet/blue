package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.VehicleSpeedMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C37113Xn1;
import p000.F34;
import p000.H31;
import p000.InterfaceC48164rd5;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\u0007B\u0089\u0001\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u00060"}, m28432d2 = {"LF34;", "LtC3;", "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "Lio/reactivex/c;", "a4", "", C17296a.f69688o, "onResume", "Lco/bird/android/model/persistence/Bird;", "bird", "F2", "", "onBackPressed", "LEa;", "analyticsManager", "LpJ;", "bluetoothManager", "Lq54;", "privateBirdsManager", "LWX2;", "myBirdsManager", "LgH;", "birdActionsManager", "LkI;", "birdAirManager", "Lrd5;", "rxBleBirdBluetoothManager", "Ldr4;", "reactiveLocationManager", "LTq4;", "reactiveConfig", "Le13;", "navigator", "LOA3;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUC3;", "ui", "", "birdId", "justPaired", "Ldd3;", "notificationSender", "<init>", "(LEa;LpJ;Lq54;LWX2;LgH;LkI;Lrd5;Ldr4;LTq4;Le13;LOA3;Lcom/uber/autodispose/ScopeProvider;LUC3;Ljava/lang/String;ZLdd3;)V", "z", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdAirDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,284:1\n237#2:285\n237#2:286\n237#2:287\n237#2:288\n237#2:289\n180#2:290\n180#2:291\n180#2:292\n237#2:293\n180#2:294\n180#2:295\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl\n*L\n88#1:285\n124#1:286\n138#1:287\n155#1:288\n172#1:289\n184#1:290\n202#1:291\n212#1:292\n220#1:293\n226#1:294\n261#1:295\n*E\n"})
/* renamed from: F34 */
/* loaded from: classes3.dex */
public final class F34 extends C49101tC3 {

    /* renamed from: z */
    public static final C2073a f8522z = new C2073a(null);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$A */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2065A extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2065A f8523b = new C2065A();

        public C2065A() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$C */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2067C extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2067C f8525b = new C2067C();

        public C2067C() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$D */
    /* loaded from: classes3.dex */
    public static final class C2068D extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Bird>> {
        public C2068D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Bird> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F34.this.m12872H0().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$E */
    /* loaded from: classes3.dex */
    public static final class C2069E extends Lambda implements Function1<Bird, InterfaceC24574u<? extends Pair<? extends Bird, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LH31$b;", "response", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$E$a */
        /* loaded from: classes3.dex */
        public static final class C2070a extends Lambda implements Function1<H31.AbstractC3016b, InterfaceC24574u<? extends Pair<? extends Bird, ? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f8528g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2070a(Bird bird) {
                super(1);
                this.f8528g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Pair<Bird, String>> invoke(H31.AbstractC3016b response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response instanceof H31.AbstractC3016b.C3019c) {
                    return AbstractC24507p.m32068G(TuplesKt.m28425to(this.f8528g, ((H31.AbstractC3016b.C3019c) response).m104470b()));
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C2069E() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m107960c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<Bird, String>> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F<H31.AbstractC3016b> m81840qm = F34.this.m12827W0().m81840qm(Bird_Kt.getPrivateIdentifier(bird));
            final C2070a c2070a = new C2070a(bird);
            return m81840qm.m33163C(new InterfaceC23492o() { // from class: U34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m107960c;
                    m107960c = F34.C2069E.m107960c(Function1.this, obj);
                    return m107960c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$G */
    /* loaded from: classes3.dex */
    public static final class C2072G extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C2072G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F34.this.m12827W0().m81839rm();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LF34$a;", "", "", "FIRMWARE_QUERY_DELAY_AFTER_UPDATE_MS", "J", "<init>", "()V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F34$a */
    /* loaded from: classes3.dex */
    public static final class C2073a {
        public /* synthetic */ C2073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2073a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$b */
    /* loaded from: classes3.dex */
    public static final class C2074b extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C2074b f8531g = new C2074b();

        public C2074b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Bird_Kt.isBirdAir(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$c */
    /* loaded from: classes3.dex */
    public static final class C2075c extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Bird>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$c$a */
        /* loaded from: classes3.dex */
        public static final class C2076a extends Lambda implements Function1<Unit, Bird> {

            /* renamed from: g */
            public final /* synthetic */ Bird f8533g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2076a(Bird bird) {
                super(1);
                this.f8533g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Bird invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f8533g;
            }
        }

        public C2075c() {
            super(1);
        }

        /* renamed from: c */
        public static final Bird m107955c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Bird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Bird> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Observable<Unit> delay = F34.this.m12830V0().delay(500L, TimeUnit.MILLISECONDS);
            final C2076a c2076a = new C2076a(bird);
            return delay.map(new InterfaceC23492o() { // from class: G34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Bird m107955c;
                    m107955c = F34.C2075c.m107955c(Function1.this, obj);
                    return m107955c;
                }
            }).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$d */
    /* loaded from: classes3.dex */
    public static final class C2077d extends Lambda implements Function1<Bird, InterfaceC23496h> {
        public C2077d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F34.this.m12836T0().mo15666t(F34.this.m12874G2(it));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2078e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2078e f8535b = new C2078e();

        public C2078e() {
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
    /* renamed from: F34$f */
    /* loaded from: classes3.dex */
    public static final class C2079f extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C2079f f8536g = new C2079f();

        public C2079f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Bird_Kt.isBirdAir(it));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2085h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2085h f8544b = new C2085h();

        public C2085h() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/constant/VehicleSpeedMode;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$i */
    /* loaded from: classes3.dex */
    public static final class C2086i extends Lambda implements Function1<VehicleSpeedMode, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$i$a */
        /* loaded from: classes3.dex */
        public static final class C2087a extends Lambda implements Function1<Bird, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ F34 f8546g;

            /* renamed from: h */
            public final /* synthetic */ VehicleSpeedMode f8547h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2087a(F34 f34, VehicleSpeedMode vehicleSpeedMode) {
                super(1);
                this.f8546g = f34;
                this.f8547h = vehicleSpeedMode;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(Bird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC48164rd5 m12836T0 = this.f8546g.m12836T0();
                VehicleDescriptor m12874G2 = this.f8546g.m12874G2(it);
                VehicleSpeedMode speedMode = this.f8547h;
                Intrinsics.checkNotNullExpressionValue(speedMode, "speedMode");
                return m12836T0.mo15672n(m12874G2, speedMode);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: F34$i$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C2088b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C2088b f8548b = new C2088b();

            public C2088b() {
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

        public C2086i() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23496h m107940d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m107939e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(VehicleSpeedMode speedMode) {
            Intrinsics.checkNotNullParameter(speedMode, "speedMode");
            AbstractC23442F<Bird> firstOrError = F34.this.m12872H0().firstOrError();
            final C2087a c2087a = new C2087a(F34.this, speedMode);
            AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: L34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m107940d;
                    m107940d = F34.C2086i.m107940d(Function1.this, obj);
                    return m107940d;
                }
            });
            final C2088b c2088b = C2088b.f8548b;
            return m33164B.m33084B(new InterfaceC23484g() { // from class: M34
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    F34.C2086i.m107939e(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$j */
    /* loaded from: classes3.dex */
    public static final class C2089j extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C2089j f8549g = new C2089j();

        public C2089j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$k */
    /* loaded from: classes3.dex */
    public static final class C2090k extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Pair<? extends Bird, ? extends VehicleVersion>>> {
        public C2090k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<Bird, VehicleVersion>> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Bird> firstOrError = F34.this.m12872H0().firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "bird.firstOrError()");
            return C37279Yf5.m74531s0(firstOrError, F34.this.m12824X0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/VehicleVersion;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$l */
    /* loaded from: classes3.dex */
    public static final class C2091l extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleVersion>, InterfaceC23447K<? extends Bird>> {
        public C2091l() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m107933c(F34 this$0, Bird bird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            InterfaceC25134kI m12866J0 = this$0.m12866J0();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            return m12866J0.mo29102b(this$0.m12874G2(bird));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Bird> invoke(Pair<Bird, VehicleVersion> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final Bird bird = pair.component1();
            VehicleVersion vehicleVersion = pair.component2();
            InterfaceC25134kI m12866J0 = F34.this.m12866J0();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            Intrinsics.checkNotNullExpressionValue(vehicleVersion, "vehicleVersion");
            AbstractC23461c mo29099e = m12866J0.mo29099e(bird, vehicleVersion);
            final F34 f34 = F34.this;
            return mo29099e.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: N34
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m107933c;
                    m107933c = F34.C2091l.m107933c(F34.this, bird);
                    return m107933c;
                }
            })).m33042m(AbstractC23442F.m33158H(bird));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$m */
    /* loaded from: classes3.dex */
    public static final class C2092m extends Lambda implements Function1<Bird, Unit> {

        /* renamed from: g */
        public static final C2092m f8552g = new C2092m();

        public C2092m() {
            super(1);
        }

        /* renamed from: a */
        public final void m107932a(Bird bird) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m107932a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2093n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2093n f8553b = new C2093n();

        public C2093n() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u000422\u0010\u0003\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$p */
    /* loaded from: classes3.dex */
    public static final class C2098p extends Lambda implements Function1<Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {
        public C2098p() {
            super(1);
        }

        /* renamed from: a */
        public final void m107924a(Triple<Boolean, Boolean, Boolean> triple) {
            boolean booleanValue = triple.component1().booleanValue();
            boolean booleanValue2 = triple.component2().booleanValue();
            Boolean allowStopUpdate = triple.component3();
            UC3 m12827W0 = F34.this.m12827W0();
            Intrinsics.checkNotNullExpressionValue(allowStopUpdate, "allowStopUpdate");
            m12827W0.m81838sm(booleanValue, allowStopUpdate.booleanValue());
            if (booleanValue2) {
                F34.this.m12827W0().m81836um();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Boolean, ? extends Boolean> triple) {
            m107924a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2099q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2099q f8560b = new C2099q();

        public C2099q() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$r */
    /* loaded from: classes3.dex */
    public static final class C2100r extends Lambda implements Function1<Bird, InterfaceC23434B<? extends Float>> {
        public C2100r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Float> invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F34.this.m12866J0().mo29096h(F34.this.m12874G2(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "updateProgress", "", C17296a.f69688o, "(Ljava/lang/Float;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$s */
    /* loaded from: classes3.dex */
    public static final class C2101s extends Lambda implements Function1<Float, Unit> {
        public C2101s() {
            super(1);
        }

        /* renamed from: a */
        public final void m107922a(Float updateProgress) {
            UC3 m12827W0 = F34.this.m12827W0();
            Intrinsics.checkNotNullExpressionValue(updateProgress, "updateProgress");
            m12827W0.m81837tm(updateProgress.floatValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            m107922a(f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/VehicleDescriptor;", "bird", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$t */
    /* loaded from: classes3.dex */
    public static final class C2102t extends Lambda implements Function1<VehicleDescriptor, InterfaceC24574u<? extends Pair<? extends VehicleDescriptor, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LH31$b;", "response", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/VehicleDescriptor;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$t$a */
        /* loaded from: classes3.dex */
        public static final class C2103a extends Lambda implements Function1<H31.AbstractC3016b, InterfaceC24574u<? extends Pair<? extends VehicleDescriptor, ? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ VehicleDescriptor f8564g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2103a(VehicleDescriptor vehicleDescriptor) {
                super(1);
                this.f8564g = vehicleDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Pair<VehicleDescriptor, String>> invoke(H31.AbstractC3016b response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response instanceof H31.AbstractC3016b.C3019c) {
                    return AbstractC24507p.m32068G(TuplesKt.m28425to(this.f8564g, ((H31.AbstractC3016b.C3019c) response).m104470b()));
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C2102t() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m107919c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<VehicleDescriptor, String>> invoke(VehicleDescriptor bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F<H31.AbstractC3016b> m81835vm = F34.this.m12827W0().m81835vm();
            final C2103a c2103a = new C2103a(bird);
            return m81835vm.m33163C(new InterfaceC23492o() { // from class: Q34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m107919c;
                    m107919c = F34.C2102t.m107919c(Function1.this, obj);
                    return m107919c;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2104u extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2104u f8565b = new C2104u();

        public C2104u() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$v */
    /* loaded from: classes3.dex */
    public static final class C2105v extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C2105v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F34.this.m12866J0().mo29091m();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F34$w */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2106w extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2106w f8567b = new C2106w();

        public C2106w() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1$a;", "kotlin.jvm.PlatformType", "updateComponent", "", C17296a.f69688o, "(LXn1$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$x */
    /* loaded from: classes3.dex */
    public static final class C2107x extends Lambda implements Function1<C37113Xn1.EnumC9493a, Unit> {
        public C2107x() {
            super(1);
        }

        /* renamed from: a */
        public final void m107916a(C37113Xn1.EnumC9493a enumC9493a) {
            F34.this.m12827W0().m81838sm(false, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37113Xn1.EnumC9493a enumC9493a) {
            m107916a(enumC9493a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/B;", "LXn1$a;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$y */
    /* loaded from: classes3.dex */
    public static final class C2108y extends Lambda implements Function1<Bird, InterfaceC23434B<? extends C37113Xn1.EnumC9493a>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "otaCompleted", "Lio/reactivex/K;", "LXn1$a;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$y$a */
        /* loaded from: classes3.dex */
        public static final class C2109a extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends C37113Xn1.EnumC9493a>> {

            /* renamed from: g */
            public final /* synthetic */ F34 f8570g;

            /* renamed from: h */
            public final /* synthetic */ VehicleDescriptor f8571h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: F34$y$a$a */
            /* loaded from: classes3.dex */
            public static final class C2110a extends Lambda implements Function1<DialogResponse, Unit> {

                /* renamed from: g */
                public final /* synthetic */ F34 f8572g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2110a(F34 f34) {
                    super(1);
                    this.f8572g = f34;
                }

                /* renamed from: a */
                public final void m107909a(DialogResponse dialogResponse) {
                    this.f8572g.m12851O0().close();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                    m107909a(dialogResponse);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "LXn1$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)LXn1$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: F34$y$a$b */
            /* loaded from: classes3.dex */
            public static final class C2111b extends Lambda implements Function1<DialogResponse, C37113Xn1.EnumC9493a> {

                /* renamed from: g */
                public final /* synthetic */ C37113Xn1.EnumC9493a f8573g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2111b(C37113Xn1.EnumC9493a enumC9493a) {
                    super(1);
                    this.f8573g = enumC9493a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C37113Xn1.EnumC9493a invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f8573g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2109a(F34 f34, VehicleDescriptor vehicleDescriptor) {
                super(1);
                this.f8570g = f34;
                this.f8571h = vehicleDescriptor;
            }

            /* renamed from: d */
            public static final C37113Xn1.EnumC9493a m107910d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (C37113Xn1.EnumC9493a) tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23447K<? extends C37113Xn1.EnumC9493a> invoke(Boolean otaCompleted) {
                Intrinsics.checkNotNullParameter(otaCompleted, "otaCompleted");
                C37113Xn1.EnumC9493a mo29095i = this.f8570g.m12866J0().mo29095i(this.f8571h);
                if (otaCompleted.booleanValue() && mo29095i == C37113Xn1.EnumC9493a.PCM) {
                    AbstractC23442F<DialogResponse> m33152N = this.f8570g.m12827W0().m81833xm().m33152N(C23454a.m33087a());
                    final C2110a c2110a = new C2110a(this.f8570g);
                    AbstractC23442F<DialogResponse> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: S34
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            F34.C2108y.C2109a.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    final C2111b c2111b = new C2111b(mo29095i);
                    return m33101w.m33157I(new InterfaceC23492o() { // from class: T34
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            C37113Xn1.EnumC9493a m107910d;
                            m107910d = F34.C2108y.C2109a.m107910d(Function1.this, obj);
                            return m107910d;
                        }
                    });
                } else if (otaCompleted.booleanValue()) {
                    return this.f8570g.m107989a4(this.f8571h).m33042m(AbstractC23442F.m33158H(mo29095i));
                } else {
                    return AbstractC23442F.m33158H(mo29095i);
                }
            }
        }

        public C2108y() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends C37113Xn1.EnumC9493a> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            VehicleDescriptor m12874G2 = F34.this.m12874G2(bird);
            Observable<Boolean> mo29093k = F34.this.m12866J0().mo29093k(m12874G2);
            final C2109a c2109a = new C2109a(F34.this, m12874G2);
            return mo29093k.flatMapSingle(new InterfaceC23492o() { // from class: R34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = F34.C2108y.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXn1$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXn1$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$z */
    /* loaded from: classes3.dex */
    public static final class C2112z extends Lambda implements Function1<C37113Xn1.EnumC9493a, Unit> {

        /* renamed from: g */
        public static final C2112z f8574g = new C2112z();

        public C2112z() {
            super(1);
        }

        /* renamed from: a */
        public final void m107907a(C37113Xn1.EnumC9493a enumC9493a) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37113Xn1.EnumC9493a enumC9493a) {
            m107907a(enumC9493a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F34(InterfaceC1880Ea analyticsManager, InterfaceC27246pJ bluetoothManager, InterfaceC47256q54 privateBirdsManager, WX2 myBirdsManager, InterfaceC20792gH birdActionsManager, InterfaceC25134kI birdAirManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC40001dr4 reactiveLocationManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, OA3 converter, ScopeProvider scopeProvider, UC3 ui, String birdId, boolean z, InterfaceC39861dd3 notificationSender) {
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

    /* renamed from: A3 */
    public static final InterfaceC23496h m108035A3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B3 */
    public static final void m108034B3() {
    }

    /* renamed from: C3 */
    public static final void m108033C3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D3 */
    public static final InterfaceC23447K m108032D3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E3 */
    public static final InterfaceC24574u m108031E3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F3 */
    public static final InterfaceC23496h m108030F3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G3 */
    public static final InterfaceC23447K m108029G3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H3 */
    public static final boolean m108027H3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I3 */
    public static final InterfaceC23447K m108025I3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J3 */
    public static final InterfaceC23447K m108023J3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K3 */
    public static final void m108021K3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L3 */
    public static final void m108019L3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M3 */
    public static final InterfaceC23434B m108017M3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N3 */
    public static final void m108015N3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O3 */
    public static final void m108013O3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P3 */
    public static final InterfaceC23434B m108011P3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Q3 */
    public static final void m108009Q3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R3 */
    public static final void m108007R3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S3 */
    public static final InterfaceC23496h m108005S3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: T3 */
    public static final void m108003T3() {
    }

    /* renamed from: U3 */
    public static final void m108001U3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V3 */
    public static final void m107999V3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W3 */
    public static final InterfaceC23434B m107997W3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: X3 */
    public static final void m107995X3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y3 */
    public static final void m107993Y3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z3 */
    public static final InterfaceC23496h m107991Z3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: r3 */
    public static final boolean m107972r3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s3 */
    public static final InterfaceC23447K m107971s3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t3 */
    public static final InterfaceC23496h m107970t3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u2 */
    public static final void m107969u2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u3 */
    public static final void m107968u3() {
    }

    /* renamed from: v3 */
    public static final void m107967v3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w3 */
    public static final boolean m107966w3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x3 */
    public static final InterfaceC23496h m107965x3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y3 */
    public static final void m107964y3() {
    }

    /* renamed from: z3 */
    public static final InterfaceC24574u m107963z3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.C49101tC3
    /* renamed from: F2 */
    public void mo12878F2(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo12878F2(bird);
        m12827W0().m81842om(false);
        m12827W0().m81844mm(false);
        m12827W0().m81834wm(false);
        m12827W0().m81832ym(true);
        m12827W0().m81845lm(false);
    }

    @Override // p000.C49101tC3, p000.RA3
    /* renamed from: a */
    public void mo12816a() {
        super.mo12816a();
        AbstractC23442F<Bird> firstOrError = m12872H0().firstOrError();
        final C2074b c2074b = C2074b.f8531g;
        AbstractC24507p<Bird> m33098z = firstOrError.m33098z(new InterfaceC23494q() { // from class: o34
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m107972r3;
                m107972r3 = F34.m107972r3(Function1.this, obj);
                return m107972r3;
            }
        });
        final C2075c c2075c = new C2075c();
        AbstractC23442F<R> m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: p34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m107971s3;
                m107971s3 = F34.m107971s3(Function1.this, obj);
                return m107971s3;
            }
        });
        final C2077d c2077d = new C2077d();
        AbstractC23461c m33164B = m32072C.m33164B(new InterfaceC23492o() { // from class: q34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107970t3;
                m107970t3 = F34.m107970t3(Function1.this, obj);
                return m107970t3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: s34
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                F34.m107968u3();
            }
        };
        final C2078e c2078e = C2078e.f8535b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: t34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m107967v3(Function1.this, obj);
            }
        });
        C0058AG<Bird> m12872H0 = m12872H0();
        final C2079f c2079f = C2079f.f8536g;
        Observable<Bird> take = m12872H0.filter(new InterfaceC23494q() { // from class: u34
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m107966w3;
                m107966w3 = F34.m107966w3(Function1.this, obj);
                return m107966w3;
            }
        }).take(1L);
        final C2080g c2080g = new C2080g();
        AbstractC23461c switchMapCompletable = take.switchMapCompletable(new InterfaceC23492o() { // from class: v34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107965x3;
                m107965x3 = F34.m107965x3(Function1.this, obj);
                return m107965x3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: w34
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                F34.m107964y3();
            }
        };
        final C2085h c2085h = C2085h.f8544b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: x34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m107969u2(Function1.this, obj);
            }
        });
    }

    /* renamed from: a4 */
    public final AbstractC23461c m107989a4(VehicleDescriptor vehicleDescriptor) {
        AbstractC23461c m33032w = m12836T0().mo15666t(vehicleDescriptor).m33032w(3000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(m33032w, "rxBleBirdBluetoothManage…S, TimeUnit.MILLISECONDS)");
        return m33032w;
    }

    @Override // p000.C49101tC3, p000.RA3
    public boolean onBackPressed() {
        boolean m81861Wl = m12827W0().m81861Wl();
        if (!m81861Wl) {
            return super.onBackPressed();
        }
        return m81861Wl;
    }

    @Override // p000.C49101tC3, p000.RA3
    public void onResume() {
        super.onResume();
        Observable<VehicleSpeedMode> m81876Cm = m12827W0().m81876Cm();
        final C2086i c2086i = new C2086i();
        AbstractC23461c flatMapCompletable = m81876Cm.flatMapCompletable(new InterfaceC23492o() { // from class: V24
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107991Z3;
                m107991Z3 = F34.m107991Z3(Function1.this, obj);
                return m107991Z3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<VehicleDescriptor> observeOn = m12866J0().mo29100d().observeOn(C23454a.m33087a());
        final C2102t c2102t = new C2102t();
        Observable<R> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: X24
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m107963z3;
                m107963z3 = F34.m107963z3(Function1.this, obj);
                return m107963z3;
            }
        });
        final C2066B c2066b = new C2066B();
        AbstractC23461c flatMapCompletable2 = flatMapMaybe.flatMapCompletable(new InterfaceC23492o() { // from class: f34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108035A3;
                m108035A3 = F34.m108035A3(Function1.this, obj);
                return m108035A3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33041n2 = flatMapCompletable2.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: h34
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                F34.m108034B3();
            }
        };
        final C2067C c2067c = C2067C.f8525b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: i34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108033C3(Function1.this, obj);
            }
        });
        Observable<Unit> m81869Jm = m12827W0().m81869Jm();
        final C2068D c2068d = new C2068D();
        Observable<R> flatMapSingle = m81869Jm.flatMapSingle(new InterfaceC23492o() { // from class: j34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108032D3;
                m108032D3 = F34.m108032D3(Function1.this, obj);
                return m108032D3;
            }
        });
        final C2069E c2069e = new C2069E();
        Observable flatMapMaybe2 = flatMapSingle.flatMapMaybe(new InterfaceC23492o() { // from class: k34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m108031E3;
                m108031E3 = F34.m108031E3(Function1.this, obj);
                return m108031E3;
            }
        });
        final C2071F c2071f = new C2071F();
        AbstractC23461c flatMapCompletable3 = flatMapMaybe2.flatMapCompletable(new InterfaceC23492o() { // from class: l34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108030F3;
                m108030F3 = F34.m108030F3(Function1.this, obj);
                return m108030F3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable3, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33041n3 = flatMapCompletable3.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        Observable<Unit> m81862Vl = m12827W0().m81862Vl();
        final C2072G c2072g = new C2072G();
        Observable<R> flatMapSingle2 = m81862Vl.flatMapSingle(new InterfaceC23492o() { // from class: m34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108029G3;
                m108029G3 = F34.m108029G3(Function1.this, obj);
                return m108029G3;
            }
        });
        final C2089j c2089j = C2089j.f8549g;
        Observable filter = flatMapSingle2.filter(new InterfaceC23494q() { // from class: n34
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m108027H3;
                m108027H3 = F34.m108027H3(Function1.this, obj);
                return m108027H3;
            }
        });
        final C2090k c2090k = new C2090k();
        Observable flatMapSingle3 = filter.flatMapSingle(new InterfaceC23492o() { // from class: g34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108025I3;
                m108025I3 = F34.m108025I3(Function1.this, obj);
                return m108025I3;
            }
        });
        final C2091l c2091l = new C2091l();
        Observable flatMapSingle4 = flatMapSingle3.flatMapSingle(new InterfaceC23492o() { // from class: r34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108023J3;
                m108023J3 = F34.m108023J3(Function1.this, obj);
                return m108023J3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle4, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33094as = flatMapSingle4.m33094as(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2092m c2092m = C2092m.f8552g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: y34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108021K3(Function1.this, obj);
            }
        };
        final C2093n c2093n = C2093n.f8553b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: z34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108019L3(Function1.this, obj);
            }
        });
        AbstractC23442F<Bird> firstOrError = m12872H0().firstOrError();
        final C2094o c2094o = new C2094o();
        Observable observeOn2 = firstOrError.m33162D(new InterfaceC23492o() { // from class: A34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m108017M3;
                m108017M3 = F34.m108017M3(Function1.this, obj);
                return m108017M3;
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2098p c2098p = new C2098p();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: B34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108015N3(Function1.this, obj);
            }
        };
        final C2099q c2099q = C2099q.f8560b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: C34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108013O3(Function1.this, obj);
            }
        });
        AbstractC23442F<Bird> firstOrError2 = m12872H0().firstOrError();
        final C2100r c2100r = new C2100r();
        Observable observeOn3 = firstOrError2.m33162D(new InterfaceC23492o() { // from class: D34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m108011P3;
                m108011P3 = F34.m108011P3(Function1.this, obj);
                return m108011P3;
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2101s c2101s = new C2101s();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: E34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108009Q3(Function1.this, obj);
            }
        };
        final C2104u c2104u = C2104u.f8565b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: W24
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108007R3(Function1.this, obj);
            }
        });
        Observable<Unit> m81864Tl = m12827W0().m81864Tl();
        final C2105v c2105v = new C2105v();
        AbstractC23461c m33066T = m81864Tl.flatMapCompletable(new InterfaceC23492o() { // from class: Y24
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108005S3;
                m108005S3 = F34.m108005S3(Function1.this, obj);
                return m108005S3;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33041n4 = m33066T.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: Z24
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                F34.m108003T3();
            }
        };
        final C2106w c2106w = C2106w.f8567b;
        ((CompletableSubscribeProxy) m33041n4).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: a34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m108001U3(Function1.this, obj);
            }
        });
        Observable<C37113Xn1.EnumC9493a> observeOn4 = m12866J0().mo29090n().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "birdAirManager.firmwareU…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2107x c2107x = new C2107x();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: b34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m107999V3(Function1.this, obj);
            }
        });
        C0058AG<Bird> m12872H0 = m12872H0();
        final C2108y c2108y = new C2108y();
        Observable retry = m12872H0.switchMap(new InterfaceC23492o() { // from class: c34
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m107997W3;
                m107997W3 = F34.m107997W3(Function1.this, obj);
                return m107997W3;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onResume() …cribe({ }, Timber::e)\n  }");
        Object m33094as5 = retry.m33094as(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2112z c2112z = C2112z.f8574g;
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: d34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m107995X3(Function1.this, obj);
            }
        };
        final C2065A c2065a = C2065A.f8523b;
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: e34
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F34.m107993Y3(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/VehicleDescriptor;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$B */
    /* loaded from: classes3.dex */
    public static final class C2066B extends Lambda implements Function1<Pair<? extends VehicleDescriptor, ? extends String>, InterfaceC23496h> {
        public C2066B() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<VehicleDescriptor, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            VehicleDescriptor bird = pair.component1();
            InterfaceC25134kI m12866J0 = F34.this.m12866J0();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            return m12866J0.mo29094j(bird, pair.component2());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends VehicleDescriptor, ? extends String> pair) {
            return invoke2((Pair<VehicleDescriptor, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$F */
    /* loaded from: classes3.dex */
    public static final class C2071F extends Lambda implements Function1<Pair<? extends Bird, ? extends String>, InterfaceC23496h> {
        public C2071F() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Bird, String> pair) {
            Bird copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component1();
            String component2 = pair.component2();
            InterfaceC47256q54 m12845Q0 = F34.this.m12845Q0();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            PrivateBird privateBird = bird.getPrivateBird();
            copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : 0, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : 0, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : privateBird != null ? privateBird.copy((r18 & 1) != 0 ? privateBird.f66700id : null, (r18 & 2) != 0 ? privateBird.nickname : component2, (r18 & 4) != 0 ? privateBird.userId : null, (r18 & 8) != 0 ? privateBird.endedAt : null, (r18 & 16) != 0 ? privateBird.userFirstScanAt : null, (r18 & 32) != 0 ? privateBird.ownershipKind : null, (r18 & 64) != 0 ? privateBird.createdAt : null, (r18 & 128) != 0 ? privateBird.updatedAt : null) : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
            return m12845Q0.mo18209e(copy);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Bird, ? extends String> pair) {
            return invoke2((Pair<Bird, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "Lio/reactivex/B;", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdAirDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl$onResume$15\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,284:1\n52#2,2:285\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAirDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdAirDetailsPresenterImpl$onResume$15\n*L\n189#1:285,2\n*E\n"})
    /* renamed from: F34$o */
    /* loaded from: classes3.dex */
    public static final class C2094o extends Lambda implements Function1<Bird, InterfaceC23434B<? extends Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
        /* renamed from: F34$o$b */
        /* loaded from: classes3.dex */
        public static final class C2097b<T1, T2, R> implements InterfaceC23480c {

            /* renamed from: a */
            public static final C2097b<T1, T2, R> f8558a = new C2097b<>();

            @Override // io.reactivex.functions.InterfaceC23480c
            /* renamed from: a */
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                return TuplesKt.m28425to(t1, t2);
            }
        }

        public C2094o() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m107929c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Triple<Boolean, Boolean, Boolean>> invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Observable combineLatest = Observable.combineLatest(F34.this.m12866J0().mo29101c(F34.this.m12874G2(it)), F34.this.m12866J0().mo29093k(F34.this.m12874G2(it)), C2097b.f8558a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
            final C2095a c2095a = new C2095a(F34.this);
            return combineLatest.flatMap(new InterfaceC23492o() { // from class: O34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m107929c;
                    m107929c = F34.C2094o.m107929c(Function1.this, obj);
                    return m107929c;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004 \u0005*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lkotlin/Triple;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$o$a */
        /* loaded from: classes3.dex */
        public static final class C2095a extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, InterfaceC23434B<? extends Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

            /* renamed from: g */
            public final /* synthetic */ F34 f8555g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000 \u0003*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "allowStopUpdate", "Lkotlin/Triple;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: F34$o$a$a */
            /* loaded from: classes3.dex */
            public static final class C2096a extends Lambda implements Function1<Boolean, Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>> {

                /* renamed from: g */
                public final /* synthetic */ boolean f8556g;

                /* renamed from: h */
                public final /* synthetic */ boolean f8557h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2096a(boolean z, boolean z2) {
                    super(1);
                    this.f8556g = z;
                    this.f8557h = z2;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Triple<Boolean, Boolean, Boolean> invoke(Boolean allowStopUpdate) {
                    Intrinsics.checkNotNullParameter(allowStopUpdate, "allowStopUpdate");
                    return new Triple<>(Boolean.valueOf(this.f8556g), Boolean.valueOf(this.f8557h), allowStopUpdate);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2095a(F34 f34) {
                super(1);
                this.f8555g = f34;
            }

            /* renamed from: b */
            public static final Triple m107927b(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Triple) tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23434B<? extends Triple<Boolean, Boolean, Boolean>> invoke2(Pair<Boolean, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                boolean booleanValue = pair.component1().booleanValue();
                boolean booleanValue2 = pair.component2().booleanValue();
                Observable<Boolean> m82790P6 = this.f8555g.m12842R0().m82790P6();
                final C2096a c2096a = new C2096a(booleanValue, booleanValue2);
                return m82790P6.map(new InterfaceC23492o() { // from class: P34
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Triple m107927b;
                        m107927b = F34.C2094o.C2095a.m107927b(Function1.this, obj);
                        return m107927b;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>> invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
                return invoke2((Pair<Boolean, Boolean>) pair);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F34$g */
    /* loaded from: classes3.dex */
    public static final class C2080g extends Lambda implements Function1<Bird, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: F34$g$a */
        /* loaded from: classes3.dex */
        public static final class C2081a extends Lambda implements Function1<Observable<byte[]>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ F34 f8538g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2081a(F34 f34) {
                super(1);
                this.f8538g = f34;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Observable<byte[]> observable) {
                invoke2(observable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Observable<byte[]> observable) {
                this.f8538g.m12830V0().onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$g$b */
        /* loaded from: classes3.dex */
        public static final class C2082b extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {

            /* renamed from: g */
            public static final C2082b f8539g = new C2082b();

            public C2082b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        public C2080g() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23434B m107947e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m107946f(Function1 tmp0, Object obj) {
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
            Observable retry = InterfaceC48164rd5.C27958a.subscribeBleNotifications$default(F34.this.m12836T0(), F34.this.m12874G2(bird), null, 2, null).retry(3L);
            final C2081a c2081a = new C2081a(F34.this);
            Observable doOnNext = retry.doOnNext(new InterfaceC23484g() { // from class: H34
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    F34.C2080g.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C2082b c2082b = C2082b.f8539g;
            Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: I34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m107947e;
                    m107947e = F34.C2080g.m107947e(Function1.this, obj);
                    return m107947e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
            Observable m31949b = C24527f.m31949b(flatMap, F34.this.m12872H0(), F34.this.m12824X0());
            final C2083c c2083c = new C2083c(F34.this);
            return m31949b.flatMapCompletable(new InterfaceC23492o() { // from class: J34
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m107946f;
                    m107946f = F34.C2080g.m107946f(Function1.this, obj);
                    return m107946f;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u000620\u0010\u0005\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/VehicleVersion;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F34$g$c */
        /* loaded from: classes3.dex */
        public static final class C2083c extends Lambda implements Function1<Triple<? extends byte[], ? extends Bird, ? extends VehicleVersion>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ F34 f8540g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2083c(F34 f34) {
                super(1);
                this.f8540g = f34;
            }

            /* renamed from: b */
            public static final InterfaceC23496h m107944b(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Triple<byte[], Bird, VehicleVersion> triple) {
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                byte[] data = triple.component1();
                Bird bird = triple.component2();
                VehicleVersion vehicleVersion = triple.component3();
                InterfaceC25134kI m12866J0 = this.f8540g.m12866J0();
                Intrinsics.checkNotNullExpressionValue(data, "data");
                m12866J0.mo29098f(data);
                InterfaceC47256q54 m12845Q0 = this.f8540g.m12845Q0();
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                Intrinsics.checkNotNullExpressionValue(vehicleVersion, "vehicleVersion");
                AbstractC23442F<Pair<Bird, VehicleVersion>> mo18200n = m12845Q0.mo18200n(bird, vehicleVersion, data);
                final C2084a c2084a = new C2084a(this.f8540g, bird, vehicleVersion);
                return mo18200n.m33164B(new InterfaceC23492o() { // from class: K34
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m107944b;
                        m107944b = F34.C2080g.C2083c.m107944b(Function1.this, obj);
                        return m107944b;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends byte[], ? extends Bird, ? extends VehicleVersion> triple) {
                return invoke2((Triple<byte[], Bird, VehicleVersion>) triple);
            }

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/VehicleVersion;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: F34$g$c$a */
            /* loaded from: classes3.dex */
            public static final class C2084a extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleVersion>, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ F34 f8541g;

                /* renamed from: h */
                public final /* synthetic */ Bird f8542h;

                /* renamed from: i */
                public final /* synthetic */ VehicleVersion f8543i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2084a(F34 f34, Bird bird, VehicleVersion vehicleVersion) {
                    super(1);
                    this.f8541g = f34;
                    this.f8542h = bird;
                    this.f8543i = vehicleVersion;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final InterfaceC23496h invoke2(Pair<Bird, VehicleVersion> pair) {
                    AbstractC23461c m33039p;
                    AbstractC23461c m33039p2;
                    List listOf;
                    Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                    Bird component1 = pair.component1();
                    VehicleVersion component2 = pair.component2();
                    F34 f34 = this.f8541g;
                    Bird bird = this.f8542h;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    boolean z = !f34.m12886D2(bird, component1);
                    F34 f342 = this.f8541g;
                    VehicleVersion vehicleVersion = this.f8543i;
                    Intrinsics.checkNotNullExpressionValue(vehicleVersion, "vehicleVersion");
                    boolean z2 = !f342.m12882E2(vehicleVersion, component2);
                    if (z) {
                        this.f8541g.m12872H0().accept(component1);
                        m33039p = this.f8541g.m12845Q0().mo18209e(component1);
                    } else {
                        m33039p = AbstractC23461c.m33039p();
                        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n                  Comp…plete()\n                }");
                    }
                    if (z2) {
                        this.f8541g.m12824X0().accept(component2);
                        m33039p2 = AbstractC23461c.m33039p();
                    } else {
                        m33039p2 = AbstractC23461c.m33039p();
                    }
                    Intrinsics.checkNotNullExpressionValue(m33039p2, "if (needToUpdateVehicle)…se Completable.complete()");
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{m33039p, m33039p2});
                    return AbstractC23461c.m33037r(listOf);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Bird, ? extends VehicleVersion> pair) {
                    return invoke2((Pair<Bird, VehicleVersion>) pair);
                }
            }
        }
    }
}
