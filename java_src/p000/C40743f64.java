package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BluetoothEncryptionPermissionStatus;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.configs.WebHelpCenterConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
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
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C40743f64;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R.\u00109\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020, 1*\n\u0012\u0004\u0012\u00020,\u0018\u00010606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020: 1*\n\u0012\u0004\u0012\u00020:\u0018\u00010606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108¨\u0006?"}, m28432d2 = {"Lf64;", "", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;", "", "B", "t", "D", "E", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lj64;", DateTokenConverter.CONVERTER_KEY, "Lj64;", "overviewUi", "Lrd5;", "e", "Lrd5;", "rxBleBirdManager", "LL54;", "f", "LL54;", "converter", "Lq54;", "g", "Lq54;", "privateBirdsManager", "LDQ3;", "h", "LDQ3;", "permissionManager", "", "", "LTk5;", "i", "Ljava/util/Map;", "nearbyDevices", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/d;", "nearbyDevicesScanSubject", "Lio/reactivex/subjects/a;", "", "k", "Lio/reactivex/subjects/a;", "nearbyDevicesSubject", "Lco/bird/android/model/persistence/Bird;", "l", "privateBirdsSubject", "<init>", "(LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;Lj64;Lrd5;LL54;Lq54;LDQ3;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdsOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewPresenter.kt\nco/bird/android/feature/ownedbirds/presenters/PrivateBirdsOverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,236:1\n237#2:237\n161#2:238\n180#2:239\n180#2:242\n180#2:243\n180#2:244\n180#2:245\n180#2:246\n180#2:247\n237#2:248\n82#3,2:240\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewPresenter.kt\nco/bird/android/feature/ownedbirds/presenters/PrivateBirdsOverviewPresenter\n*L\n59#1:237\n64#1:238\n89#1:239\n109#1:242\n121#1:243\n127#1:244\n133#1:245\n155#1:246\n165#1:247\n228#1:248\n102#1:240,2\n*E\n"})
/* renamed from: f64  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40743f64 {

    /* renamed from: a */
    public final C36207Tq4 f79442a;

    /* renamed from: b */
    public final ScopeProvider f79443b;

    /* renamed from: c */
    public final InterfaceC40099e13 f79444c;

    /* renamed from: d */
    public final C43115j64 f79445d;

    /* renamed from: e */
    public final InterfaceC48164rd5 f79446e;

    /* renamed from: f */
    public final L54 f79447f;

    /* renamed from: g */
    public final InterfaceC47256q54 f79448g;

    /* renamed from: h */
    public final DQ3 f79449h;

    /* renamed from: i */
    public final Map<String, C36154Tk5> f79450i;

    /* renamed from: j */
    public final C24558d<Unit> f79451j;

    /* renamed from: k */
    public final C24552a<List<C36154Tk5>> f79452k;

    /* renamed from: l */
    public final C24552a<List<Bird>> f79453l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20210a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BluetoothEncryptionPermissionStatus.values().length];
            try {
                iArr[BluetoothEncryptionPermissionStatus.PUBLIC_ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$b */
    /* loaded from: classes3.dex */
    public static final class C20211b extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C20211b f79454g = new C20211b();

        public C20211b() {
            super(1);
        }

        /* renamed from: a */
        public final void m42044a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m42044a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$c */
    /* loaded from: classes3.dex */
    public static final class C20212c extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C20212c f79455g = new C20212c();

        public C20212c() {
            super(1);
        }

        /* renamed from: a */
        public final void m42043a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m42043a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$d */
    /* loaded from: classes3.dex */
    public static final class C20213d extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C20213d f79456g = new C20213d();

        public C20213d() {
            super(1);
        }

        /* renamed from: a */
        public final void m42042a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post notification permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m42042a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$e */
    /* loaded from: classes3.dex */
    public static final class C20214e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20214e f79457g = new C20214e();

        public C20214e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while checking for required permissions, invoking onCompleteAction", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: f64$f */
    /* loaded from: classes3.dex */
    public static final class C20215f<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C20215f<T1, T2, T3, T4, T5, R> f79458a = new C20215f<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$g */
    /* loaded from: classes3.dex */
    public static final class C20216g extends Lambda implements Function1<C36154Tk5, InterfaceC23447K<? extends Bird>> {
        public C20216g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> invoke(C36154Tk5 scanResult) {
            String str;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            if (C36388Uk5.m80948C(scanResult)) {
                str = Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED;
            } else {
                str = Bird_Kt.MODEL_BIRD_AIR;
            }
            Bird mo18203k = C40743f64.this.f79448g.mo18203k(scanResult, str);
            return C40743f64.this.f79448g.mo18209e(mo18203k).m33065U(3L).m33046j0(mo18203k).m33148R(mo18203k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$h */
    /* loaded from: classes3.dex */
    public static final class C20217h extends Lambda implements Function1<Bird, Unit> {
        public C20217h() {
            super(1);
        }

        /* renamed from: a */
        public final void m42039a(Bird bird) {
            InterfaceC40099e13.C19924a.goToOwnedBirdDetails$default(C40743f64.this.f79444c, bird.getId(), 0, false, bird.getModel(), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m42039a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$i */
    /* loaded from: classes3.dex */
    public static final class C20218i extends Lambda implements Function1<Unit, Unit> {
        public C20218i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C40743f64.this.m42085C();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20219j extends FunctionReferenceImpl implements Function1<List<? extends Bird>, Unit> {
        public C20219j(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Bird> list) {
            invoke2((List<Bird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Bird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$k */
    /* loaded from: classes3.dex */
    public static final class C20220k extends Lambda implements Function1<Unit, Unit> {
        public C20220k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List emptyList;
            C40743f64.this.f79450i.clear();
            C24552a c24552a = C40743f64.this.f79452k;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c24552a.onNext(emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$l */
    /* loaded from: classes3.dex */
    public static final class C20221l extends Lambda implements Function1<Unit, Boolean> {
        public C20221l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!C40743f64.this.f79442a.m82623f8().m73665a().getPrivateBirdConfig().getEnableBirdAir() && !C40743f64.this.f79442a.m82623f8().m73665a().getPrivateBirdConfig().getEnableBirdBike()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$m */
    /* loaded from: classes3.dex */
    public static final class C20222m extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Optional<C36154Tk5>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f64$m$a */
        /* loaded from: classes3.dex */
        public static final class C20223a extends Lambda implements Function1<C36154Tk5, Optional<C36154Tk5>> {

            /* renamed from: g */
            public static final C20223a f79465g = new C20223a();

            public C20223a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C36154Tk5> invoke(C36154Tk5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59032c(it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f64$m$b */
        /* loaded from: classes3.dex */
        public static final class C20224b extends Lambda implements Function1<Throwable, Optional<C36154Tk5>> {

            /* renamed from: g */
            public static final C20224b f79466g = new C20224b();

            public C20224b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C36154Tk5> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59034a();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "scanResultOptional", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: f64$m$c */
        /* loaded from: classes3.dex */
        public static final class C20225c extends Lambda implements Function1<Optional<C36154Tk5>, InterfaceC24574u<? extends Optional<C36154Tk5>>> {

            /* renamed from: g */
            public final /* synthetic */ C40743f64 f79467g;

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BluetoothEncryptionPermissionStatus;", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/buava/Optional;", "LTk5;", C17296a.f69688o, "(Lco/bird/android/model/BluetoothEncryptionPermissionStatus;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: f64$m$c$a */
            /* loaded from: classes3.dex */
            public static final class C20226a extends Lambda implements Function1<BluetoothEncryptionPermissionStatus, Optional<C36154Tk5>> {

                /* renamed from: g */
                public final /* synthetic */ C40743f64 f79468g;

                /* renamed from: h */
                public final /* synthetic */ Optional<C36154Tk5> f79469h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20226a(C40743f64 c40743f64, Optional<C36154Tk5> optional) {
                    super(1);
                    this.f79468g = c40743f64;
                    this.f79469h = optional;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Optional<C36154Tk5> invoke(BluetoothEncryptionPermissionStatus it) {
                    C40743f64 c40743f64 = this.f79468g;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (c40743f64.m42086B(it)) {
                        return this.f79469h;
                    }
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20225c(C40743f64 c40743f64) {
                super(1);
                this.f79467g = c40743f64;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Optional<C36154Tk5>> invoke(Optional<C36154Tk5> scanResultOptional) {
                Intrinsics.checkNotNullParameter(scanResultOptional, "scanResultOptional");
                C36154Tk5 m59035e = scanResultOptional.m59035e();
                boolean z = false;
                if (m59035e != null && C36388Uk5.m80948C(m59035e)) {
                    z = true;
                }
                if (z) {
                    InterfaceC47256q54 interfaceC47256q54 = this.f79467g.f79448g;
                    C36154Tk5 m59038b = scanResultOptional.m59038b();
                    Intrinsics.checkNotNullExpressionValue(m59038b, "scanResultOptional.get()");
                    Observable<BluetoothEncryptionPermissionStatus> m33123k0 = interfaceC47256q54.mo18212b(C36388Uk5.m80910o(m59038b)).m33123k0();
                    Intrinsics.checkNotNullExpressionValue(m33123k0, "privateBirdsManager.getB…          .toObservable()");
                    return C37279Yf5.m74575T(m33123k0, new C20226a(this.f79467g, scanResultOptional)).firstElement();
                }
                return AbstractC24507p.m32068G(scanResultOptional);
            }
        }

        public C20222m() {
            super(1);
        }

        /* renamed from: d */
        public static final Optional m42034d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Optional m42033e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC24574u m42032f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<C36154Tk5>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable<C36154Tk5> m32113r1 = C40743f64.this.f79446e.mo15685a(1L, TimeUnit.SECONDS).m32113r1();
            final C20223a c20223a = C20223a.f79465g;
            Observable<R> map = m32113r1.map(new InterfaceC23492o() { // from class: g64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m42034d;
                    m42034d = C40743f64.C20222m.m42034d(Function1.this, obj);
                    return m42034d;
                }
            });
            final C20224b c20224b = C20224b.f79466g;
            Observable onErrorReturn = map.onErrorReturn(new InterfaceC23492o() { // from class: h64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m42033e;
                    m42033e = C40743f64.C20222m.m42033e(Function1.this, obj);
                    return m42033e;
                }
            });
            final C20225c c20225c = new C20225c(C40743f64.this);
            return onErrorReturn.flatMapMaybe(new InterfaceC23492o() { // from class: i64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m42032f;
                    m42032f = C40743f64.C20222m.m42032f(Function1.this, obj);
                    return m42032f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", "scanResultOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$n */
    /* loaded from: classes3.dex */
    public static final class C20227n extends Lambda implements Function1<Optional<C36154Tk5>, Unit> {
        public C20227n() {
            super(1);
        }

        /* renamed from: a */
        public final void m42027a(Optional<C36154Tk5> optional) {
            List list;
            boolean z;
            if (optional.m59037c()) {
                C36154Tk5 m59038b = optional.m59038b();
                Intrinsics.checkNotNullExpressionValue(m59038b, "scanResultOptional.get()");
                C36154Tk5 c36154Tk5 = m59038b;
                boolean z2 = true;
                if (C36388Uk5.m80950A(c36154Tk5) && C40743f64.this.f79442a.m82623f8().m73665a().getPrivateBirdConfig().getEnableBirdAir()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C36388Uk5.m80948C(c36154Tk5) || !C40743f64.this.f79442a.m82623f8().m73665a().getPrivateBirdConfig().getEnableBirdBike()) {
                    z2 = false;
                }
                if (z || z2) {
                    Map map = C40743f64.this.f79450i;
                    String mo17280e = c36154Tk5.m83016a().mo17280e();
                    Intrinsics.checkNotNullExpressionValue(mo17280e, "scanResult.bleDevice.macAddress");
                    map.put(mo17280e, c36154Tk5);
                }
            }
            C24552a c24552a = C40743f64.this.f79452k;
            list = CollectionsKt___CollectionsKt.toList(C40743f64.this.f79450i.values());
            c24552a.onNext(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C36154Tk5> optional) {
            m42027a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00012·\u0001\u0010\t\u001a²\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u0006 \u0002*X\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/buava/Optional;", "", "", "LTk5;", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$o */
    /* loaded from: classes3.dex */
    public static final class C20228o extends Lambda implements Function1<C35631Re4<? extends Unit, ? extends Boolean, ? extends Optional<String>, ? extends List<? extends C36154Tk5>, ? extends List<? extends Bird>>, Unit> {
        public C20228o() {
            super(1);
        }

        /* renamed from: a */
        public final void m42026a(C35631Re4<Unit, Boolean, Optional<String>, ? extends List<? extends C36154Tk5>, ? extends List<Bird>> c35631Re4) {
            boolean z;
            c35631Re4.m86500a();
            boolean booleanValue = c35631Re4.m86499b().booleanValue();
            Optional<String> m86498c = c35631Re4.m86498c();
            List<? extends C36154Tk5> nearbyBirdVehicles = c35631Re4.m86497d();
            List<Bird> privateBirds = c35631Re4.m86496e();
            boolean z2 = false;
            if (booleanValue && m86498c.m59037c()) {
                String m59038b = m86498c.m59038b();
                if (m59038b != null && m59038b.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    z2 = true;
                }
            }
            List<VehicleConnection> mo15683c = C40743f64.this.f79446e.mo15683c();
            C43115j64 c43115j64 = C40743f64.this.f79445d;
            L54 l54 = C40743f64.this.f79447f;
            Intrinsics.checkNotNullExpressionValue(privateBirds, "privateBirds");
            Intrinsics.checkNotNullExpressionValue(nearbyBirdVehicles, "nearbyBirdVehicles");
            c43115j64.m31113b(l54.m97788b(z2, mo15683c, privateBirds, nearbyBirdVehicles));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends Unit, ? extends Boolean, ? extends Optional<String>, ? extends List<? extends C36154Tk5>, ? extends List<? extends Bird>> c35631Re4) {
            m42026a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$p */
    /* loaded from: classes3.dex */
    public static final class C20229p extends Lambda implements Function1<Unit, Unit> {
        public C20229p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C40743f64.this.f79451j.onNext(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f64$q */
    /* loaded from: classes3.dex */
    public static final class C20230q extends Lambda implements Function1<Unit, Unit> {
        public C20230q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C40743f64.this.f79444c.mo37110P3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f64$r */
    /* loaded from: classes3.dex */
    public static final class C20231r extends Lambda implements Function1<Bird, Unit> {
        public C20231r() {
            super(1);
        }

        /* renamed from: a */
        public final void m42025a(Bird bird) {
            InterfaceC40099e13.C19924a.goToOwnedBirdDetails$default(C40743f64.this.f79444c, bird.getId(), 0, false, bird.getModel(), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m42025a(bird);
            return Unit.INSTANCE;
        }
    }

    public C40743f64(C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C43115j64 overviewUi, InterfaceC48164rd5 rxBleBirdManager, L54 converter, InterfaceC47256q54 privateBirdsManager, DQ3 permissionManager) {
        List emptyList;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(overviewUi, "overviewUi");
        Intrinsics.checkNotNullParameter(rxBleBirdManager, "rxBleBirdManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f79442a = reactiveConfig;
        this.f79443b = scopeProvider;
        this.f79444c = navigator;
        this.f79445d = overviewUi;
        this.f79446e = rxBleBirdManager;
        this.f79447f = converter;
        this.f79448g = privateBirdsManager;
        this.f79449h = permissionManager;
        this.f79450i = new LinkedHashMap();
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f79451j = m31902e;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<C36154Tk5>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(listOf<ScanResult>())");
        this.f79452k = m31921g;
        C24552a<List<Bird>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<Bird>>()");
        this.f79453l = m31922e;
    }

    /* renamed from: A */
    public static final void m42087A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m42082F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m42081G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m42080H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m42079I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final boolean m42078J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: K */
    public static final InterfaceC23434B m42077K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m42076L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m42075M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m42074N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m42073O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m42072P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m42071Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m42050u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23496h m42049v(C40743f64 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth connect permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f79449h.m110485l(Permission.BLUETOOTH_CONNECT);
        final C20212c c20212c = C20212c.f79455g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: V54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42048w(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: w */
    public static final void m42048w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m42047x(C40743f64 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required notification permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f79449h.m110485l(Permission.POST_NOTIFICATION);
        final C20213d c20213d = C20213d.f79456g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: U54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42046y(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: y */
    public static final void m42046y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m42045z() {
        C41318g46.m40163a("permissions requested if necessary in private birds overview, invoking onCompleteAction", new Object[0]);
    }

    /* renamed from: B */
    public final boolean m42086B(BluetoothEncryptionPermissionStatus bluetoothEncryptionPermissionStatus) {
        return C20210a.$EnumSwitchMapping$0[bluetoothEncryptionPermissionStatus.ordinal()] == 1;
    }

    /* renamed from: C */
    public final void m42085C() {
        boolean z;
        WebHelpCenterConfig webHelpCenter = this.f79442a.m82623f8().m73665a().getZendeskConfig().getWebHelpCenter();
        String riderHelpCenterUrl = webHelpCenter.getRiderHelpCenterUrl();
        if (webHelpCenter.getEnabled()) {
            if (riderHelpCenterUrl != null && riderHelpCenterUrl.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (webHelpCenter.getLaunchInExternalBrowser()) {
                    this.f79444c.mo36983m2(riderHelpCenterUrl);
                    return;
                } else {
                    InterfaceC40099e13.C19924a.goToWebView$default(this.f79444c, riderHelpCenterUrl, null, Integer.valueOf(C45871nl4.common_help), true, 2, null);
                    return;
                }
            }
        }
        InterfaceC40099e13.C19924a.goToHelp$default(this.f79444c, MapMode.RIDER, null, false, 6, null);
    }

    /* renamed from: D */
    public final void m42084D() {
        m42051t();
    }

    /* renamed from: E */
    public final void m42083E() {
        Object m33041n = this.f79448g.mo18206h().m33041n(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m32150f = this.f79448g.mo18195r0().m32150f(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20219j c20219j = new C20219j(this.f79453l);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: M54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42082F(Function1.this, obj);
            }
        });
        C24558d<Unit> c24558d = this.f79451j;
        final C20220k c20220k = new C20220k();
        Observable<Unit> doOnNext = c24558d.doOnNext(new InterfaceC23484g() { // from class: Y54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42081G(Function1.this, obj);
            }
        });
        final C20221l c20221l = new C20221l();
        Observable<Unit> filter = doOnNext.filter(new InterfaceC23494q() { // from class: Z54
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m42078J;
                m42078J = C40743f64.m42078J(Function1.this, obj);
                return m42078J;
            }
        });
        final C20222m c20222m = new C20222m();
        Observable<R> switchMap = filter.switchMap(new InterfaceC23492o() { // from class: a64
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m42077K;
                m42077K = C40743f64.m42077K(Function1.this, obj);
                return m42077K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "fun onResume() {\n    // …nSubject.onNext(Unit)\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20227n c20227n = new C20227n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: b64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42076L(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        C24558d<Unit> c24558d2 = this.f79451j;
        Observable<Boolean> m82794P2 = this.f79442a.m82794P2();
        Observable<Optional<String>> m82814N2 = this.f79442a.m82814N2();
        Observable<List<C36154Tk5>> distinctUntilChanged = this.f79452k.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "nearbyDevicesSubject.distinctUntilChanged()");
        Observable<List<Bird>> distinctUntilChanged2 = this.f79453l.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "privateBirdsSubject.distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(c24558d2, m82794P2, m82814N2, distinctUntilChanged, distinctUntilChanged2, C20215f.f79458a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20228o c20228o = new C20228o();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: c64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42075M(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f79445d.m31116Ql().m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20229p c20229p = new C20229p();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: d64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42074N(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f79445d.m31114Sl().m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20230q c20230q = new C20230q();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: e64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42073O(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f79445d.m31115Rl().m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20231r c20231r = new C20231r();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: N54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42072P(Function1.this, obj);
            }
        });
        Observable<C36154Tk5> m31117Pl = this.f79445d.m31117Pl();
        final C20216g c20216g = new C20216g();
        Observable observeOn2 = m31117Pl.flatMapSingle(new InterfaceC23492o() { // from class: O54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m42071Q;
                m42071Q = C40743f64.m42071Q(Function1.this, obj);
                return m42071Q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    // …nSubject.onNext(Unit)\n  }");
        Object m33094as6 = observeOn2.m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20217h c20217h = new C20217h();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: W54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42080H(Function1.this, obj);
            }
        });
        Object m33094as7 = this.f79445d.m31112ul().m33094as(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20218i c20218i = new C20218i();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: X54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42079I(Function1.this, obj);
            }
        });
        this.f79451j.onNext(Unit.INSTANCE);
    }

    /* renamed from: t */
    public final void m42051t() {
        C41318g46.m40163a("checking for required bluetooth scan permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this.f79449h.m110485l(Permission.BLUETOOTH_SCAN);
        final C20211b c20211b = C20211b.f79454g;
        AbstractC23461c m33070P = m110485l.m33101w(new InterfaceC23484g() { // from class: P54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42050u(Function1.this, obj);
            }
        }).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Q54
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m42049v;
                m42049v = C40743f64.m42049v(C40743f64.this);
                return m42049v;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: R54
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m42047x;
                m42047x = C40743f64.m42047x(C40743f64.this);
                return m42047x;
            }
        })).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "permissionManager.reques…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f79443b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: S54
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C40743f64.m42045z();
            }
        };
        final C20214e c20214e = C20214e.f79457g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: T54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40743f64.m42087A(Function1.this, obj);
            }
        });
    }
}
