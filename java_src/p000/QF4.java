package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RepairFlowStatus;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.RepairStep;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.QF4;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LQF4;", "", "", "e", "j", "LSF4;", C17296a.f69688o, "LSF4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lrn6;", DateTokenConverter.CONVERTER_KEY, "Lrn6;", "vehicleServicingManager", "LDQ3;", "LDQ3;", "permissionManager", "Lma4;", "kotlin.jvm.PlatformType", "f", "Lma4;", "openScanner", "<init>", "(LSF4;Lcom/uber/autodispose/ScopeProvider;Le13;Lrn6;LDQ3;)V", "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairsOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairsOverviewPresenter.kt\nco/bird/android/feature/repairs/RepairsOverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,71:1\n180#2:72\n*S KotlinDebug\n*F\n+ 1 RepairsOverviewPresenter.kt\nco/bird/android/feature/repairs/RepairsOverviewPresenter\n*L\n51#1:72\n*E\n"})
/* renamed from: QF4 */
/* loaded from: classes3.dex */
public final class QF4 {

    /* renamed from: a */
    public final SF4 f30107a;

    /* renamed from: b */
    public final ScopeProvider f30108b;

    /* renamed from: c */
    public final InterfaceC40099e13 f30109c;

    /* renamed from: d */
    public final InterfaceC48265rn6 f30110d;

    /* renamed from: e */
    public final DQ3 f30111e;

    /* renamed from: f */
    public final C45168ma4<Unit> f30112f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QF4$a */
    /* loaded from: classes3.dex */
    public static final class C6744a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C6744a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return QF4.this.f30111e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QF4$b */
    /* loaded from: classes3.dex */
    public static final class C6745b extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends WireBird>> {
        public C6745b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireBird> invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m107154a()) {
                return QF4.this.f30107a.m85799b(ScanMode.ADMIN, ScanIntention.OPERATOR_ACTION, Integer.valueOf(C45871nl4.operator_scan_instruction_inspection)).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QF4$c */
    /* loaded from: classes3.dex */
    public static final class C6746c extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Pair<? extends WireBird, ? extends RepairStep>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RepairFlowStatus;", "flow", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RepairFlowStatus;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: QF4$c$a */
        /* loaded from: classes3.dex */
        public static final class C6747a extends Lambda implements Function1<RepairFlowStatus, Pair<? extends WireBird, ? extends RepairStep>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f30116g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6747a(WireBird wireBird) {
                super(1);
                this.f30116g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBird, RepairStep> invoke(RepairFlowStatus flow) {
                Intrinsics.checkNotNullParameter(flow, "flow");
                return TuplesKt.m28425to(this.f30116g, flow.getFlow());
            }
        }

        public C6746c() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBird, RepairStep>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F<RepairFlowStatus> mo13671a = QF4.this.f30110d.mo13671a(bird.getId());
            final C6747a c6747a = new C6747a(bird);
            return mo13671a.m33157I(new InterfaceC23492o() { // from class: RF4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = QF4.C6746c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QF4$d */
    /* loaded from: classes3.dex */
    public static final class C6748d extends Lambda implements Function1<Pair<? extends WireBird, ? extends RepairStep>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: QF4$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6749a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RepairStep.values().length];
                try {
                    iArr[RepairStep.INSPECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RepairStep.REPAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C6748d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends RepairStep> pair) {
            invoke2((Pair<WireBird, ? extends RepairStep>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, ? extends RepairStep> pair) {
            WireBird component1 = pair.component1();
            int i = C6749a.$EnumSwitchMapping$0[pair.component2().ordinal()];
            if (i == 1) {
                QF4.this.f30109c.mo36909y4(component1.getId(), InspectionContext.SCANNER, 10035);
            } else if (i != 2) {
            } else {
                InterfaceC40099e13.C19924a.goToRepairV3Overview$default(QF4.this.f30109c, component1.getId(), null, 2, null);
            }
        }
    }

    public QF4(SF4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC48265rn6 vehicleServicingManager, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f30107a = ui;
        this.f30108b = scopeProvider;
        this.f30109c = navigator;
        this.f30110d = vehicleServicingManager;
        this.f30111e = permissionManager;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f30112f = m25409g;
    }

    /* renamed from: f */
    public static final InterfaceC23447K m88692f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final InterfaceC24574u m88691g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m88690h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m88689i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m88693e() {
        Observable merge = Observable.merge(this.f30107a.m85800a(), this.f30112f);
        final C6744a c6744a = new C6744a();
        Observable flatMapSingle = merge.flatMapSingle(new InterfaceC23492o() { // from class: MF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88692f;
                m88692f = QF4.m88692f(Function1.this, obj);
                return m88692f;
            }
        });
        final C6745b c6745b = new C6745b();
        Observable flatMapMaybe = flatMapSingle.flatMapMaybe(new InterfaceC23492o() { // from class: NF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m88691g;
                m88691g = QF4.m88691g(Function1.this, obj);
                return m88691g;
            }
        });
        final C6746c c6746c = new C6746c();
        Observable flatMapSingle2 = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: OF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88690h;
                m88690h = QF4.m88690h(Function1.this, obj);
                return m88690h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "fun onCreate() {\n    Obs…{ }\n        }\n      }\n  }");
        Object m33094as = flatMapSingle2.m33094as(AutoDispose.m45239a(this.f30108b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6748d c6748d = new C6748d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: PF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QF4.m88689i(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public final void m88688j() {
        this.f30112f.accept(Unit.INSTANCE);
    }
}
