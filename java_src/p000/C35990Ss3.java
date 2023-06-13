package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DemandAreaAnalyticsInfo;
import co.bird.android.model.OperatorScanIntent;
import co.bird.android.model.ScanType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireReleaseAssignmentMapBanner;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C35990Ss3;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m28432d2 = {"LSs3;", "", "", "k", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "m", "", "count", "l", "h", "Lbn;", C17296a.f69688o, "Lbn;", "areaManager", "Liu4;", "b", "Liu4;", "releaseAssignmentManager", "LEa;", "c", "LEa;", "analyticsManager", "LDQ3;", DateTokenConverter.CONVERTER_KEY, "LDQ3;", "permissionManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "Lgl;", "f", "Lgl;", "preference", "LWs3;", "g", "LWs3;", "ui", "Le13;", "Le13;", "navigator", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lbn;Liu4;LEa;LDQ3;LTq4;Lgl;LWs3;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorReleasePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorReleasePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorReleasePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n180#2:126\n180#2:128\n237#2:129\n271#3:127\n1#4:130\n*S KotlinDebug\n*F\n+ 1 OperatorReleasePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorReleasePresenter\n*L\n57#1:126\n88#1:128\n117#1:129\n80#1:127\n*E\n"})
/* renamed from: Ss3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35990Ss3 {

    /* renamed from: a */
    public final InterfaceC12495bn f34371a;

    /* renamed from: b */
    public final InterfaceC42996iu4 f34372b;

    /* renamed from: c */
    public final InterfaceC1880Ea f34373c;

    /* renamed from: d */
    public final DQ3 f34374d;

    /* renamed from: e */
    public final C36207Tq4 f34375e;

    /* renamed from: f */
    public final C22454gl f34376f;

    /* renamed from: g */
    public final InterfaceC36926Ws3 f34377g;

    /* renamed from: h */
    public final InterfaceC40099e13 f34378h;

    /* renamed from: i */
    public ScopeProvider f34379i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ss3$a */
    /* loaded from: classes2.dex */
    public static final class C7560a extends Lambda implements Function1<Throwable, Unit> {
        public C7560a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            InterfaceC36926Ws3 interfaceC36926Ws3 = C35990Ss3.this.f34377g;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            C38689bg5.m64175f(interfaceC36926Ws3, e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 OperatorReleasePresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorReleasePresenter\n*L\n1#1,304:1\n85#2:305\n*E\n"})
    /* renamed from: Ss3$b */
    /* loaded from: classes2.dex */
    public static final class C7561b<T1, T2, T3, T4, R> implements InterfaceC23486i<OperatorScanIntent, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(OperatorScanIntent operatorScanIntent, T1 t1, T2 t2, T3 t3) {
            return (R) new C51106wb4(operatorScanIntent, (Boolean) t1, (Boolean) t2, (Boolean) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "nestV3Enabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ss3$c */
    /* loaded from: classes2.dex */
    public static final class C7562c extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C7562c f34381g = new C7562c();

        public C7562c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean nestV3Enabled) {
            Intrinsics.checkNotNullParameter(nestV3Enabled, "nestV3Enabled");
            return Boolean.valueOf(!nestV3Enabled.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ss3$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7563d extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C7563d(Object obj) {
            super(1, obj, InterfaceC36926Ws3.class, "showReleaseAnywhere", "showReleaseAnywhere(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC36926Ws3) this.receiver).mo77763G7(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/DemandAreaAnalyticsInfo;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ss3$e */
    /* loaded from: classes2.dex */
    public static final class C7564e extends Lambda implements Function1<Pair<? extends OperatorScanIntent, ? extends DemandAreaAnalyticsInfo>, Unit> {
        public C7564e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends OperatorScanIntent, ? extends DemandAreaAnalyticsInfo> pair) {
            invoke2((Pair<? extends OperatorScanIntent, DemandAreaAnalyticsInfo>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends OperatorScanIntent, DemandAreaAnalyticsInfo> pair) {
            DemandAreaAnalyticsInfo component2 = pair.component2();
            InterfaceC1880Ea interfaceC1880Ea = C35990Ss3.this.f34373c;
            String invoke = pair.component1().invoke();
            Float m59035e = component2.getDistanceToNearestDemandArea().m59035e();
            interfaceC1880Ea.mo55905y(new C34532Mm3(null, null, null, invoke, m59035e != null ? Double.valueOf(m59035e.floatValue()) : null, component2.getDemandLevel().m59035e(), Integer.valueOf(C35990Ss3.this.f34376f.m37614i1()), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/DemandAreaAnalyticsInfo;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ss3$f */
    /* loaded from: classes2.dex */
    public static final class C7565f extends Lambda implements Function1<Pair<? extends OperatorScanIntent, ? extends DemandAreaAnalyticsInfo>, InterfaceC24574u<? extends OperatorScanIntent>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "it", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ss3$f$a */
        /* loaded from: classes2.dex */
        public static final class C7566a extends Lambda implements Function1<FQ3, Boolean> {

            /* renamed from: g */
            public static final C7566a f34384g = new C7566a();

            public C7566a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(FQ3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.m107154a());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "it", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lco/bird/android/model/OperatorScanIntent;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ss3$f$b */
        /* loaded from: classes2.dex */
        public static final class C7567b extends Lambda implements Function1<FQ3, OperatorScanIntent> {

            /* renamed from: g */
            public final /* synthetic */ OperatorScanIntent f34385g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7567b(OperatorScanIntent operatorScanIntent) {
                super(1);
                this.f34385g = operatorScanIntent;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OperatorScanIntent invoke(FQ3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f34385g;
            }
        }

        public C7565f() {
            super(1);
        }

        /* renamed from: d */
        public static final OperatorScanIntent m84697d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (OperatorScanIntent) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends OperatorScanIntent> invoke(Pair<? extends OperatorScanIntent, DemandAreaAnalyticsInfo> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC23442F<FQ3> m110485l = C35990Ss3.this.f34374d.m110485l(Permission.CAMERA);
            final C7566a c7566a = C7566a.f34384g;
            AbstractC24507p<FQ3> m33098z = m110485l.m33098z(new InterfaceC23494q() { // from class: Ts3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C35990Ss3.C7565f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C7567b c7567b = new C7567b(pair.component1());
            return m33098z.m32067H(new InterfaceC23492o() { // from class: Us3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    OperatorScanIntent m84697d;
                    m84697d = C35990Ss3.C7565f.m84697d(Function1.this, obj);
                    return m84697d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052~\u0010\u0004\u001az\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*<\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ss3$g */
    /* loaded from: classes2.dex */
    public static final class C7568g extends Lambda implements Function1<C51106wb4<? extends OperatorScanIntent, ? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {
        public C7568g() {
            super(1);
        }

        /* renamed from: a */
        public final void m84694a(C51106wb4<? extends OperatorScanIntent, Boolean, Boolean, Boolean> c51106wb4) {
            OperatorScanIntent m6614a = c51106wb4.m6614a();
            Boolean enableNewCaptureFlow = c51106wb4.m6613b();
            Boolean enableNestV3ReleaseAnywhere = c51106wb4.m6612c();
            Boolean enableBulkScanner = c51106wb4.m6611d();
            if (m6614a == OperatorScanIntent.RELEASE) {
                Intrinsics.checkNotNullExpressionValue(enableNestV3ReleaseAnywhere, "enableNestV3ReleaseAnywhere");
                if (enableNestV3ReleaseAnywhere.booleanValue()) {
                    InterfaceC40099e13.C19924a.goToNestRelease$default(C35990Ss3.this.f34378h, null, null, 10073, 2, null);
                    return;
                }
            }
            if (m6614a == OperatorScanIntent.CAPTURE) {
                Intrinsics.checkNotNullExpressionValue(enableNewCaptureFlow, "enableNewCaptureFlow");
                if (enableNewCaptureFlow.booleanValue()) {
                    C35990Ss3.this.f34378h.mo37028f(10078);
                    return;
                }
            }
            Intrinsics.checkNotNullExpressionValue(enableBulkScanner, "enableBulkScanner");
            if (enableBulkScanner.booleanValue()) {
                InterfaceC40099e13.C19924a.goToBulkScanner$default(C35990Ss3.this.f34378h, null, m6614a, null, null, 13, null);
            } else {
                InterfaceC40099e13.C19924a.goToLegacyScanBird$default(C35990Ss3.this.f34378h, ScanType.EXISTING_QR_CODE, null, null, MapMode.OPERATOR, null, false, 54, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends OperatorScanIntent, ? extends Boolean, ? extends Boolean, ? extends Boolean> c51106wb4) {
            m84694a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    public C35990Ss3(InterfaceC12495bn areaManager, InterfaceC42996iu4 releaseAssignmentManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC36926Ws3 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(releaseAssignmentManager, "releaseAssignmentManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f34371a = areaManager;
        this.f34372b = releaseAssignmentManager;
        this.f34373c = analyticsManager;
        this.f34374d = permissionManager;
        this.f34375e = reactiveConfig;
        this.f34376f = preference;
        this.f34377g = ui;
        this.f34378h = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if ((!r2) != false) goto L5;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m84710i(C35990Ss3 this$0) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC36926Ws3 interfaceC36926Ws3 = this$0.f34377g;
        WireReleaseAssignmentMapBanner m37583q0 = this$0.f34376f.m37583q0();
        if (m37583q0 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m37583q0.getTitle());
        }
        m37583q0 = null;
        interfaceC36926Ws3.mo77765F3(m37583q0);
    }

    /* renamed from: j */
    public static final void m84709j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final Boolean m84705n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m84704o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m84703p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC24574u m84702q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m84701r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final void m84711h() {
        AbstractC23461c m33070P = this.f34372b.mo29771o0().m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "releaseAssignmentManager…dSchedulers.mainThread())");
        ScopeProvider scopeProvider = this.f34379i;
        if (scopeProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scopeProvider");
            scopeProvider = null;
        }
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Qs3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C35990Ss3.m84710i(C35990Ss3.this);
            }
        };
        final C7560a c7560a = new C7560a();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Rs3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35990Ss3.m84709j(Function1.this, obj);
            }
        });
    }

    /* renamed from: k */
    public final void m84708k() {
        this.f34377g.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
    }

    /* renamed from: l */
    public final void m84707l(int i) {
        this.f34377g.mo18680R0(i);
    }

    /* renamed from: m */
    public final void m84706m(ScopeProvider scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f34379i = scope;
        if (this.f34375e.m82623f8().getValue().getOperatorConfig().getFeatures().getRelease().getReleaseAssignments().getEnabled()) {
            m84711h();
        }
        Observable<Boolean> m82561l4 = this.f34375e.m82561l4();
        final C7562c c7562c = C7562c.f34381g;
        Observable observeOn = m82561l4.map(new InterfaceC23492o() { // from class: Ls3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m84705n;
                m84705n = C35990Ss3.m84705n(Function1.this, obj);
                return m84705n;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.enableNes…dSchedulers.mainThread())");
        ScopeProvider scopeProvider = this.f34379i;
        ScopeProvider scopeProvider2 = null;
        if (scopeProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scopeProvider");
            scopeProvider = null;
        }
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7563d c7563d = new C7563d(this.f34377g);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ms3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35990Ss3.m84704o(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f34377g.mo77764G2(), this.f34377g.mo77762id());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(ui.captureButtonCl…ui.releaseButtonClicks())");
        Observable<DemandAreaAnalyticsInfo> m33123k0 = this.f34371a.mo63991y(false).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "areaManager.getDemandAre…n = false).toObservable()");
        Observable m31950a = C24527f.m31950a(merge, m33123k0);
        final C7564e c7564e = new C7564e();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: Ns3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35990Ss3.m84703p(Function1.this, obj);
            }
        });
        final C7565f c7565f = new C7565f();
        Observable flatMapMaybe = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: Os3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m84702q;
                m84702q = C35990Ss3.m84702q(Function1.this, obj);
                return m84702q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun onResume(scope: Scop…  )\n        }\n      }\n  }");
        Observable withLatestFrom = flatMapMaybe.withLatestFrom(this.f34375e.m82539n4(), this.f34375e.m82583j4(), this.f34375e.m82732V4(), new C7561b());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        Observable observeOn2 = withLatestFrom.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume(scope: Scop…  )\n        }\n      }\n  }");
        ScopeProvider scopeProvider3 = this.f34379i;
        if (scopeProvider3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scopeProvider");
        } else {
            scopeProvider2 = scopeProvider3;
        }
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7568g c7568g = new C7568g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ps3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35990Ss3.m84701r(Function1.this, obj);
            }
        });
    }
}
