package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdPart;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C35006On0;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, m28432d2 = {"LOn0;", "Lxn0;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "c", "onResume", "onPause", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, DateTokenConverter.CONVERTER_KEY, "", "raw", "Lio/reactivex/p;", "E", "LHM4;", "response", "L", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "Ldr4;", "b", "Ldr4;", "locationManager", "LSM;", "LSM;", "birdPartManager", "Lom3;", "Lom3;", "operatorManager", "Liy6;", "e", "Liy6;", "warehouseChecker", "LQn0;", "f", "LQn0;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "h", "Le13;", "navigator", "Len0;", "i", "Len0;", "commandCenterAnalyticsManager", "<init>", "(LTq4;Ldr4;LSM;Lom3;Liy6;LQn0;Lcom/uber/autodispose/ScopeProvider;Le13;Len0;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterLandingPresenter.kt\nco/bird/android/feature/commandcenter/landing/CommandCenterLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,163:1\n180#2:164\n180#2:165\n180#2:166\n161#2:167\n237#2:168\n*S KotlinDebug\n*F\n+ 1 CommandCenterLandingPresenter.kt\nco/bird/android/feature/commandcenter/landing/CommandCenterLandingPresenterImpl\n*L\n53#1:164\n58#1:165\n63#1:166\n85#1:167\n93#1:168\n*E\n"})
/* renamed from: On0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35006On0 implements InterfaceC51815xn0 {

    /* renamed from: a */
    public final C36207Tq4 f27303a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f27304b;

    /* renamed from: c */
    public final InterfaceC7381SM f27305c;

    /* renamed from: d */
    public final InterfaceC46473om3 f27306d;

    /* renamed from: e */
    public final C43038iy6 f27307e;

    /* renamed from: f */
    public final InterfaceC35474Qn0 f27308f;

    /* renamed from: g */
    public final ScopeProvider f27309g;

    /* renamed from: h */
    public final InterfaceC40099e13 f27310h;

    /* renamed from: i */
    public final InterfaceC40550en0 f27311i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6139a extends FunctionReferenceImpl implements Function1<WireBird, Unit> {
        public C6139a(Object obj) {
            super(1, obj, C35006On0.class, "onBirdIdentified", "onBirdIdentified(Lco/bird/android/model/wire/WireBird;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            invoke2(wireBird);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35006On0) this.receiver).mo4713c(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$b */
    /* loaded from: classes3.dex */
    public static final class C6140b extends Lambda implements Function1<Unit, Unit> {
        public C6140b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35006On0.this.f27308f.mo84845B6();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$c */
    /* loaded from: classes3.dex */
    public static final class C6141c extends Lambda implements Function1<Unit, Unit> {
        public C6141c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(C35006On0.this.f27310h, null, null, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$d */
    /* loaded from: classes3.dex */
    public static final class C6142d extends Lambda implements Function1<Unit, Unit> {
        public C6142d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(C35006On0.this.f27310h, true, null, null, null, null, null, null, null, 254, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$e */
    /* loaded from: classes3.dex */
    public static final class C6143e extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, Unit> {
        public C6143e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends EnumC48419s32> pair) {
            invoke2((Pair<String, ? extends EnumC48419s32>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends EnumC48419s32> pair) {
            C35006On0.this.f27308f.mo84835p3();
            C35006On0.this.f27308f.mo84842O3(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$f */
    /* loaded from: classes3.dex */
    public static final class C6144f extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, InterfaceC24574u<? extends WireBird>> {
        public C6144f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireBird> invoke(Pair<String, ? extends EnumC48419s32> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C35006On0.this.m91440E(pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$g */
    /* loaded from: classes3.dex */
    public static final class C6145g extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends WireBird>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: On0$g$a */
        /* loaded from: classes3.dex */
        public static final class C6146a extends Lambda implements Function1<HM4<Boolean>, WireBird> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f27318g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6146a(WireBird wireBird) {
                super(1);
                this.f27318g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBird invoke(HM4<Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f27318g;
            }
        }

        public C6145g() {
            super(1);
        }

        /* renamed from: c */
        public static final WireBird m91406c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WireBird> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F<HM4<Boolean>> mo8115b1 = C35006On0.this.f27306d.mo8115b1(bird.getId());
            final C6146a c6146a = new C6146a(bird);
            return mo8115b1.m33157I(new InterfaceC23492o() { // from class: Pn0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireBird m91406c;
                    m91406c = C35006On0.C6145g.m91406c(Function1.this, obj);
                    return m91406c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$h */
    /* loaded from: classes3.dex */
    public static final class C6147h extends Lambda implements Function1<WireBird, Unit> {
        public C6147h() {
            super(1);
        }

        /* renamed from: a */
        public final void m91404a(WireBird wireBird) {
            C35006On0.this.f27304b.mo43630b(wireBird.getLocation().fromLocation());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m91404a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$i */
    /* loaded from: classes3.dex */
    public static final class C6148i extends Lambda implements Function1<Throwable, Unit> {
        public C6148i() {
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
            C35006On0.m91432M(C35006On0.this, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$j */
    /* loaded from: classes3.dex */
    public static final class C6149j extends Lambda implements Function1<WireBird, Unit> {
        public C6149j() {
            super(1);
        }

        /* renamed from: a */
        public final void m91403a(WireBird wireBird) {
            C35006On0.this.f27308f.vibrate(250L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m91403a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", "response", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/wire/WireBirdPart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$k */
    /* loaded from: classes3.dex */
    public static final class C6150k extends Lambda implements Function1<HM4<WireBirdPart>, WireBirdPart> {

        /* renamed from: g */
        public static final C6150k f27322g = new C6150k();

        public C6150k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBirdPart invoke(HM4<WireBirdPart> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.m103944a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdPart;", "wireBirdPart", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdPart;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$l */
    /* loaded from: classes3.dex */
    public static final class C6151l extends Lambda implements Function1<WireBirdPart, InterfaceC23447K<? extends HM4<WireBird>>> {
        public C6151l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<WireBird>> invoke(WireBirdPart wireBirdPart) {
            Intrinsics.checkNotNullParameter(wireBirdPart, "wireBirdPart");
            return C35006On0.this.f27306d.mo8116b(wireBirdPart.getBirdId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$m */
    /* loaded from: classes3.dex */
    public static final class C6152m extends Lambda implements Function1<HM4<WireBird>, Unit> {
        public C6152m() {
            super(1);
        }

        /* renamed from: a */
        public final void m91400a(HM4<WireBird> hm4) {
            if (!hm4.m103939f() || hm4.m103944a() == null) {
                C35006On0.this.m91433L(hm4);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WireBird> hm4) {
            m91400a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBird;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: On0$n */
    /* loaded from: classes3.dex */
    public static final class C6153n extends Lambda implements Function1<HM4<WireBird>, InterfaceC24574u<? extends WireBird>> {

        /* renamed from: g */
        public static final C6153n f27325g = new C6153n();

        public C6153n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireBird> invoke(HM4<WireBird> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            WireBird m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                return AbstractC24507p.m32068G(m103944a);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On0$o */
    /* loaded from: classes3.dex */
    public static final class C6154o extends Lambda implements Function1<Throwable, Unit> {
        public C6154o() {
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
            C35006On0.this.f27308f.mo84842O3(true);
        }
    }

    public C35006On0(C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, InterfaceC7381SM birdPartManager, InterfaceC46473om3 operatorManager, C43038iy6 warehouseChecker, InterfaceC35474Qn0 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC40550en0 commandCenterAnalyticsManager) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(commandCenterAnalyticsManager, "commandCenterAnalyticsManager");
        this.f27303a = reactiveConfig;
        this.f27304b = locationManager;
        this.f27305c = birdPartManager;
        this.f27306d = operatorManager;
        this.f27307e = warehouseChecker;
        this.f27308f = ui;
        this.f27309g = scopeProvider;
        this.f27310h = navigator;
        this.f27311i = commandCenterAnalyticsManager;
        ui.init();
        warehouseChecker.m31479B(ui);
        commandCenterAnalyticsManager.mo37486d();
        Observable<Unit> observeOn = ui.mo84843M9().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.flashlightClicks()\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6140b c6140b = new C6140b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Kn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91415u(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = ui.mo84832v0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.codeClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6141c c6141c = new C6141c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ln0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91414v(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = ui.mo84844G().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.bluetoothClicks()\n   …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6142d c6142d = new C6142d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Mn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91413w(Function1.this, obj);
            }
        });
        AbstractC24490k<Pair<String, EnumC48419s32>> flowable = ui.mo84837T().toFlowable(EnumC23460b.DROP);
        final C6143e c6143e = new C6143e();
        AbstractC24490k<Pair<String, EnumC48419s32>> m32191K = flowable.m32191K(new InterfaceC23484g() { // from class: Nn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91412x(Function1.this, obj);
            }
        });
        final C6144f c6144f = new C6144f();
        AbstractC24490k<R> m32154d0 = m32191K.m32154d0(new InterfaceC23492o() { // from class: zn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m91411y;
                m91411y = C35006On0.m91411y(Function1.this, obj);
                return m91411y;
            }
        });
        final C6145g c6145g = new C6145g();
        AbstractC24490k m32149f0 = m32154d0.m32149f0(new InterfaceC23492o() { // from class: An0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91410z;
                m91410z = C35006On0.m91410z(Function1.this, obj);
                return m91410z;
            }
        });
        final C6147h c6147h = new C6147h();
        AbstractC24490k m32191K2 = m32149f0.m32191K(new InterfaceC23484g() { // from class: Bn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91444A(Function1.this, obj);
            }
        });
        final C6148i c6148i = new C6148i();
        AbstractC24490k m32192J0 = m32191K2.m32195I(new InterfaceC23484g() { // from class: Cn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91443B(Function1.this, obj);
            }
        }).m32192J0();
        final C6149j c6149j = new C6149j();
        AbstractC24490k m32108t0 = m32192J0.m32191K(new InterfaceC23484g() { // from class: Dn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91442C(Function1.this, obj);
            }
        }).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "ui.scans()\n      .toFlow…s.mainThread(), false, 1)");
        Object m32150f = m32108t0.m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6139a c6139a = new C6139a(this);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: En0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91441D(Function1.this, obj);
            }
        });
        ui.mo84834tf(reactiveConfig.m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport());
    }

    /* renamed from: A */
    public static final void m91444A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m91443B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m91442C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m91441D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final WireBirdPart m91439F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBirdPart) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m91438G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m91437H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC24574u m91436I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m91435J(C35006On0 this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        if (this$0.f27303a.m82623f8().getValue().getServiceCenterConfig().getRoutingOnRails().getEnabled()) {
            this$0.f27310h.mo37135L2(bird);
        } else {
            this$0.f27310h.mo37015h0(bird);
        }
    }

    /* renamed from: K */
    public static final void m91434K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public static /* synthetic */ void m91432M(C35006On0 c35006On0, HM4 hm4, int i, Object obj) {
        if ((i & 1) != 0) {
            hm4 = null;
        }
        c35006On0.m91433L(hm4);
    }

    /* renamed from: u */
    public static final void m91415u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m91414v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m91413w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m91412x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC24574u m91411y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m91410z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final AbstractC24507p<WireBird> m91440E(String str) {
        PartKind partKind;
        String m99597e = C33894Jt4.f18402a.m99597e(str);
        if (m99597e != null) {
            str = null;
        } else {
            m99597e = null;
        }
        InterfaceC7381SM interfaceC7381SM = this.f27305c;
        if (m99597e == null) {
            partKind = PartKind.CHASSIS;
        } else {
            partKind = PartKind.STICKER;
        }
        AbstractC23442F progress$default = C28237sD.progress$default(interfaceC7381SM.mo78565a(m99597e, str, partKind), this.f27308f, 0, 2, (Object) null);
        final C6150k c6150k = C6150k.f27322g;
        AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: Gn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBirdPart m91439F;
                m91439F = C35006On0.m91439F(Function1.this, obj);
                return m91439F;
            }
        });
        final C6151l c6151l = new C6151l();
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: Hn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91438G;
                m91438G = C35006On0.m91438G(Function1.this, obj);
                return m91438G;
            }
        });
        final C6152m c6152m = new C6152m();
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: In0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91437H(Function1.this, obj);
            }
        });
        final C6153n c6153n = C6153n.f27325g;
        AbstractC24507p<WireBird> m33163C = m33101w.m33163C(new InterfaceC23492o() { // from class: Jn0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m91436I;
                m91436I = C35006On0.m91436I(Function1.this, obj);
                return m91436I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "private fun identifyBird…y()\n        }\n      }\n  }");
        return m33163C;
    }

    /* renamed from: L */
    public final void m91433L(HM4<?> hm4) {
        this.f27308f.vibrate(1000L);
        this.f27308f.mo84842O3(true);
        Unit unit = null;
        String str = null;
        if (hm4 != null) {
            InterfaceC35474Qn0 interfaceC35474Qn0 = this.f27308f;
            C49375tg1 m94017d = NM4.m94017d(hm4);
            if (m94017d != null) {
                str = m94017d.m11932c();
            }
            interfaceC35474Qn0.error(str);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f27308f.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC51815xn0
    /* renamed from: c */
    public void mo4713c(final WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Object m33041n = this.f27311i.mo37485e(bird).m33041n(AutoDispose.m45239a(this.f27309g));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: yn0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C35006On0.m91435J(C35006On0.this, bird);
            }
        };
        final C6154o c6154o = new C6154o();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Fn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35006On0.m91434K(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f27307e.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC51815xn0
    public void onPause() {
        this.f27308f.onPause();
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f27311i.mo37487c();
        this.f27307e.onResume();
        this.f27308f.onResume();
    }
}
