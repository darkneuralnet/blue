package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34902Ob4;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LOb4;", "LEb4;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "Lco/bird/android/model/wire/WireBird;", "bird", "c", "LQb4;", C17296a.f69688o, "LQb4;", "ui", "LTq4;", "b", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LaG6;", "LaG6;", "workOrderManager", "LDQ3;", "e", "LDQ3;", "permissionManager", "Le13;", "f", "Le13;", "navigator", "Liy6;", "g", "Liy6;", "warehouseChecker", "<init>", "(LQb4;LTq4;Lcom/uber/autodispose/ScopeProvider;LaG6;LDQ3;Le13;Liy6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlLandingPresenter.kt\nco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n180#2:83\n180#2:84\n180#2:85\n218#2:86\n*S KotlinDebug\n*F\n+ 1 QualityControlLandingPresenter.kt\nco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingPresenterImpl\n*L\n43#1:83\n48#1:84\n53#1:85\n70#1:86\n*E\n"})
/* renamed from: Ob4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34902Ob4 implements InterfaceC32562Eb4, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final InterfaceC35370Qb4 f26872a;

    /* renamed from: b */
    public final C36207Tq4 f26873b;

    /* renamed from: c */
    public final ScopeProvider f26874c;

    /* renamed from: d */
    public final InterfaceC37857aG6 f26875d;

    /* renamed from: e */
    public final DQ3 f26876e;

    /* renamed from: f */
    public final InterfaceC40099e13 f26877f;

    /* renamed from: g */
    public final C43038iy6 f26878g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ob4$a */
    /* loaded from: classes3.dex */
    public static final class C6044a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C6044a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34902Ob4.this.f26876e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ob4$b */
    /* loaded from: classes3.dex */
    public static final class C6045b extends Lambda implements Function1<FQ3, Boolean> {

        /* renamed from: g */
        public static final C6045b f26880g = new C6045b();

        public C6045b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return Boolean.valueOf(response.m107154a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ob4$c */
    /* loaded from: classes3.dex */
    public static final class C6046c extends Lambda implements Function1<FQ3, Unit> {
        public C6046c() {
            super(1);
        }

        /* renamed from: a */
        public final void m91867a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToScanCode$default(C34902Ob4.this.f26877f, null, null, null, null, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m91867a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ob4$d */
    /* loaded from: classes3.dex */
    public static final class C6047d extends Lambda implements Function1<Unit, Unit> {
        public C6047d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(C34902Ob4.this.f26877f, null, null, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ob4$e */
    /* loaded from: classes3.dex */
    public static final class C6048e extends Lambda implements Function1<Unit, Unit> {
        public C6048e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(C34902Ob4.this.f26877f, true, null, null, null, null, null, null, null, 254, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ob4$f */
    /* loaded from: classes3.dex */
    public static final class C6049f extends Lambda implements Function1<Optional<WorkOrder>, Boolean> {

        /* renamed from: g */
        public static final C6049f f26884g = new C6049f();

        public C6049f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WorkOrder> workOrderOptional) {
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            return Boolean.valueOf(workOrderOptional.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "isPresent", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ob4$g */
    /* loaded from: classes3.dex */
    public static final class C6050g extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ob4$g$a */
        /* loaded from: classes3.dex */
        public static final class C6051a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C6051a f26886g = new C6051a();

            public C6051a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C6050g() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m91863c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Boolean isPresent) {
            Intrinsics.checkNotNullParameter(isPresent, "isPresent");
            if (!isPresent.booleanValue()) {
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(C34902Ob4.this.f26872a, C5977OM.f26416d, false, false, 6, null);
                final C6051a c6051a = C6051a.f26886g;
                return dialog$default.m33163C(new InterfaceC23492o() { // from class: Pb4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m91863c;
                        m91863c = C34902Ob4.C6050g.m91863c(Function1.this, obj);
                        return m91863c;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ob4$h */
    /* loaded from: classes3.dex */
    public static final class C6052h extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f26888h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ob4$h$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C6053a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QualityControlFlow.values().length];
                try {
                    iArr[QualityControlFlow.SWIPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QualityControlFlow.LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6052h(WireBird wireBird) {
            super(1);
            this.f26888h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            int i = C6053a.$EnumSwitchMapping$0[C34902Ob4.this.f26873b.m82623f8().getValue().getServiceCenterConfig().getQualityControl().getFlow().ordinal()];
            if (i == 1) {
                InterfaceC40099e13.C19924a.goToSwipeQualityControl$default(C34902Ob4.this.f26877f, this.f26888h, null, 2, null);
            } else if (i != 2) {
            } else {
                InterfaceC40099e13.C19924a.goToListQualityControl$default(C34902Ob4.this.f26877f, this.f26888h, null, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ob4$i */
    /* loaded from: classes3.dex */
    public static final class C6054i extends Lambda implements Function1<Throwable, Unit> {
        public C6054i() {
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
            C34902Ob4.this.f26872a.error(C45871nl4.error_generic_body);
        }
    }

    public C34902Ob4(InterfaceC35370Qb4 ui, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC37857aG6 workOrderManager, DQ3 permissionManager, InterfaceC40099e13 navigator, C43038iy6 warehouseChecker) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        this.f26872a = ui;
        this.f26873b = reactiveConfig;
        this.f26874c = scopeProvider;
        this.f26875d = workOrderManager;
        this.f26876e = permissionManager;
        this.f26877f = navigator;
        this.f26878g = warehouseChecker;
        warehouseChecker.m31479B(ui);
        Observable<Unit> mo86572h = ui.mo86572h();
        final C6044a c6044a = new C6044a();
        Observable<R> flatMapSingle = mo86572h.flatMapSingle(new InterfaceC23492o() { // from class: Fb4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m91877n;
                m91877n = C34902Ob4.m91877n(Function1.this, obj);
                return m91877n;
            }
        });
        final C6045b c6045b = C6045b.f26880g;
        Observable observeOn = flatMapSingle.filter(new InterfaceC23494q() { // from class: Gb4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m91876o;
                m91876o = C34902Ob4.m91876o(Function1.this, obj);
                return m91876o;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.scanClicks()\n      .f…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6046c c6046c = new C6046c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Hb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34902Ob4.m91875p(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = ui.mo86571n().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.enterCodeClicks()\n   …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6047d c6047d = new C6047d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ib4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34902Ob4.m91874q(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = ui.mo86573G().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.bluetoothClicks()\n   …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6048e c6048e = new C6048e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Jb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34902Ob4.m91873r(Function1.this, obj);
            }
        });
    }

    /* renamed from: n */
    public static final InterfaceC23447K m91877n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final boolean m91876o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p */
    public static final void m91875p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m91874q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m91873r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final Boolean m91872s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m91871t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m91870u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m91869v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32562Eb4
    /* renamed from: c */
    public void mo91887c(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F m70887h = C38096ag5.m70887h(this.f26875d.mo19637p(bird.getId()));
        final C6049f c6049f = C6049f.f26884g;
        AbstractC23442F m33152N = m70887h.m33157I(new InterfaceC23492o() { // from class: Kb4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m91872s;
                m91872s = C34902Ob4.m91872s(Function1.this, obj);
                return m91872s;
            }
        }).m33152N(C23454a.m33087a());
        final C6050g c6050g = new C6050g();
        AbstractC24507p m33163C = m33152N.m33163C(new InterfaceC23492o() { // from class: Lb4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m91871t;
                m91871t = C34902Ob4.m91871t(Function1.this, obj);
                return m91871t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun onBirdIdent…eneric_body)\n      })\n  }");
        Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this.f26874c));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6052h c6052h = new C6052h(bird);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Mb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34902Ob4.m91870u(Function1.this, obj);
            }
        };
        final C6054i c6054i = new C6054i();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Nb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34902Ob4.m91869v(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f26878g.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f26878g.onResume();
    }
}
