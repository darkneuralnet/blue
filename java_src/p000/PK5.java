package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.api.request.ReplacePhysicalLockBody;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m28432d2 = {"LPK5;", "", "", "n", "", "serialNumber", "x", "Lco/bird/android/model/wire/WireBird;", "bird", "m", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "k", "LJy4;", C17296a.f69688o, "LJy4;", "repairClient", "LDQ3;", "b", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LTK5;", DateTokenConverter.CONVERTER_KEY, "LTK5;", "ui", "Le13;", "e", "Le13;", "navigator", "f", "Ljava/lang/String;", "lockSerial", "g", "Lco/bird/android/model/wire/WireBird;", "<init>", "(LJy4;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTK5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockStandaloneAssociationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockStandaloneAssociationPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockStandaloneAssociationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,128:1\n180#2:129\n180#2:130\n180#2:131\n*S KotlinDebug\n*F\n+ 1 SmartlockStandaloneAssociationPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockStandaloneAssociationPresenter\n*L\n52#1:129\n64#1:130\n83#1:131\n*E\n"})
/* renamed from: PK5 */
/* loaded from: classes2.dex */
public final class PK5 {

    /* renamed from: a */
    public final InterfaceC33939Jy4 f28266a;

    /* renamed from: b */
    public final DQ3 f28267b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f28268c;

    /* renamed from: d */
    public final TK5 f28269d;

    /* renamed from: e */
    public final InterfaceC40099e13 f28270e;

    /* renamed from: f */
    public String f28271f;

    /* renamed from: g */
    public WireBird f28272g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$a */
    /* loaded from: classes2.dex */
    public static final class C6316a extends Lambda implements Function1<HM4<WirePhysicalLock>, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {

        /* renamed from: g */
        public static final C6316a f28273g = new C6316a();

        public C6316a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<WirePhysicalLock>> invoke(HM4<WirePhysicalLock> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m103939f()) {
                return AbstractC23442F.m33158H(it);
            }
            return AbstractC23442F.m33100x(new Throwable("Unable to associate lock to Bird"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$b */
    /* loaded from: classes2.dex */
    public static final class C6317b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C6317b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PK5.this.f28267b.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$c */
    /* loaded from: classes2.dex */
    public static final class C6318c extends Lambda implements Function1<FQ3, Unit> {
        public C6318c() {
            super(1);
        }

        /* renamed from: a */
        public final void m90455a(FQ3 fq3) {
            if (fq3.m107154a()) {
                PK5.this.f28270e.mo36931v0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m90455a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$d */
    /* loaded from: classes2.dex */
    public static final class C6319d extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C6319d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PK5.this.f28267b.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$e */
    /* loaded from: classes2.dex */
    public static final class C6320e extends Lambda implements Function1<FQ3, Unit> {
        public C6320e() {
            super(1);
        }

        /* renamed from: a */
        public final void m90454a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToScanBirdForResult$default(PK5.this.f28270e, null, null, null, MapMode.SERVICE_CENTER, null, false, 55, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m90454a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$f */
    /* loaded from: classes2.dex */
    public static final class C6321f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<WirePhysicalLock>>> {
        public C6321f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<WirePhysicalLock>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PK5.this.m90470k();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PK5$g */
    /* loaded from: classes2.dex */
    public static final class C6322g extends Lambda implements Function1<Throwable, Unit> {
        public C6322g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                PK5.this.f28269d.error(C45871nl4.error_network);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "e", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$h */
    /* loaded from: classes2.dex */
    public static final class C6323h extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C6323h f28280g = new C6323h();

        public C6323h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return Boolean.valueOf(S36.m86051a(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PK5$i */
    /* loaded from: classes2.dex */
    public static final class C6324i extends Lambda implements Function1<HM4<WirePhysicalLock>, Unit> {
        public C6324i() {
            super(1);
        }

        /* renamed from: a */
        public final void m90452a(HM4<WirePhysicalLock> hm4) {
            PK5.this.f28269d.success(C45871nl4.smartlock_standalone_associate_success);
            PK5.this.f28270e.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WirePhysicalLock> hm4) {
            m90452a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PK5$j */
    /* loaded from: classes2.dex */
    public static final class C6325j extends Lambda implements Function1<Throwable, Unit> {
        public C6325j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            PK5.this.f28269d.error(th.getMessage());
        }
    }

    public PK5(InterfaceC33939Jy4 repairClient, DQ3 permissionManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, TK5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f28266a = repairClient;
        this.f28267b = permissionManager;
        this.f28268c = scopeProvider;
        this.f28269d = ui;
        this.f28270e = navigator;
    }

    /* renamed from: l */
    public static final InterfaceC23447K m90469l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m90466o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m90465p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m90464q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m90463r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m90462s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m90461t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final boolean m90460u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: v */
    public static final void m90459v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m90458w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final AbstractC23442F<HM4<WirePhysicalLock>> m90470k() {
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f28266a;
        WireBird wireBird = this.f28272g;
        Intrinsics.checkNotNull(wireBird);
        String id = wireBird.getId();
        String str = this.f28271f;
        Intrinsics.checkNotNull(str);
        AbstractC23442F<HM4<WirePhysicalLock>> m99482f = interfaceC33939Jy4.m99482f(new ReplacePhysicalLockBody(id, "smartlock_cable_nokelock_birdv1", "0000", str, null, null, 48, null));
        final C6316a c6316a = C6316a.f28273g;
        AbstractC23442F<HM4<WirePhysicalLock>> m33152N = m99482f.m33165A(new InterfaceC23492o() { // from class: FK5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90469l;
                m90469l = PK5.m90469l(Function1.this, obj);
                return m90469l;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "repairClient.replacePhys…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: m */
    public final void m90468m(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f28272g = bird;
        this.f28269d.m83773m(bird.getCode());
        this.f28269d.m83777Tl(false);
        this.f28269d.m83776Ul(true);
        if (this.f28271f != null) {
            this.f28269d.m83780Ql(true);
        }
    }

    /* renamed from: n */
    public final void m90467n() {
        this.f28269d.m83780Ql(false);
        Observable<Unit> m83779Rl = this.f28269d.m83779Rl();
        final C6317b c6317b = new C6317b();
        Observable<R> flatMapSingle = m83779Rl.flatMapSingle(new InterfaceC23492o() { // from class: GK5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90466o;
                m90466o = PK5.m90466o(Function1.this, obj);
                return m90466o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    ui.…(it.message)\n      })\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f28268c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6318c c6318c = new C6318c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PK5.m90465p(Function1.this, obj);
            }
        });
        Observable<Unit> m83772w = this.f28269d.m83772w();
        final C6319d c6319d = new C6319d();
        Observable<R> flatMapSingle2 = m83772w.flatMapSingle(new InterfaceC23492o() { // from class: IK5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90464q;
                m90464q = PK5.m90464q(Function1.this, obj);
                return m90464q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "fun onCreate() {\n    ui.…(it.message)\n      })\n  }");
        Object m33094as2 = flatMapSingle2.m33094as(AutoDispose.m45239a(this.f28268c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6320e c6320e = new C6320e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: JK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PK5.m90463r(Function1.this, obj);
            }
        });
        Observable<Unit> m83781Pl = this.f28269d.m83781Pl();
        final C6321f c6321f = new C6321f();
        Observable<R> flatMapSingle3 = m83781Pl.flatMapSingle(new InterfaceC23492o() { // from class: KK5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90462s;
                m90462s = PK5.m90462s(Function1.this, obj);
                return m90462s;
            }
        });
        final C6322g c6322g = new C6322g();
        Observable doOnError = flatMapSingle3.doOnError(new InterfaceC23484g() { // from class: LK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PK5.m90461t(Function1.this, obj);
            }
        });
        final C6323h c6323h = C6323h.f28280g;
        Observable retry = doOnError.retry(new InterfaceC23494q() { // from class: MK5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m90460u;
                m90460u = PK5.m90460u(Function1.this, obj);
                return m90460u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate() {\n    ui.…(it.message)\n      })\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f28268c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6324i c6324i = new C6324i();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: NK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PK5.m90459v(Function1.this, obj);
            }
        };
        final C6325j c6325j = new C6325j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: OK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PK5.m90458w(Function1.this, obj);
            }
        });
    }

    /* renamed from: x */
    public final void m90457x(String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.f28271f = serialNumber;
        this.f28269d.m83778Sl(serialNumber);
        this.f28269d.m83775Vl(false);
        this.f28269d.m83774Wl(true);
        if (this.f28272g != null) {
            this.f28269d.m83780Ql(true);
        }
    }
}
