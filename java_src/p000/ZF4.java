package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.RepairFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LZF4;", "LUF4;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Liy6;", "Liy6;", "warehouseChecker", "LTq4;", "b", "LTq4;", "reactiveConfig", "LbG4;", "c", "LbG4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "LDQ3;", "f", "LDQ3;", "permissionManager", "<init>", "(Liy6;LTq4;LbG4;Lcom/uber/autodispose/ScopeProvider;Le13;LDQ3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairsScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairsScanPresenter.kt\nco/bird/android/feature/servicecenter/repairs/landing/RepairsScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,72:1\n180#2:73\n180#2:74\n180#2:75\n*S KotlinDebug\n*F\n+ 1 RepairsScanPresenter.kt\nco/bird/android/feature/servicecenter/repairs/landing/RepairsScanPresenterImpl\n*L\n40#1:73\n48#1:74\n52#1:75\n*E\n"})
/* renamed from: ZF4 */
/* loaded from: classes3.dex */
public final class ZF4 implements UF4, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final C43038iy6 f48077a;

    /* renamed from: b */
    public final C36207Tq4 f48078b;

    /* renamed from: c */
    public final InterfaceC38448bG4 f48079c;

    /* renamed from: d */
    public final ScopeProvider f48080d;

    /* renamed from: e */
    public final InterfaceC40099e13 f48081e;

    /* renamed from: f */
    public final DQ3 f48082f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZF4$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10176a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RepairFlow.values().length];
            try {
                iArr[RepairFlow.CARDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZF4$b */
    /* loaded from: classes3.dex */
    public static final class C10177b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C10177b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ZF4.this.f48082f.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZF4$c */
    /* loaded from: classes3.dex */
    public static final class C10178c extends Lambda implements Function1<FQ3, Unit> {
        public C10178c() {
            super(1);
        }

        /* renamed from: a */
        public final void m73477a(FQ3 fq3) {
            if (fq3.m107154a()) {
                InterfaceC40099e13.C19924a.goToScanCode$default(ZF4.this.f48081e, null, null, null, null, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m73477a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZF4$d */
    /* loaded from: classes3.dex */
    public static final class C10179d extends Lambda implements Function1<Unit, Unit> {
        public C10179d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(ZF4.this.f48081e, null, null, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZF4$e */
    /* loaded from: classes3.dex */
    public static final class C10180e extends Lambda implements Function1<Unit, Unit> {
        public C10180e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(ZF4.this.f48081e, true, null, null, null, null, null, null, null, 254, null);
        }
    }

    public ZF4(C43038iy6 warehouseChecker, C36207Tq4 reactiveConfig, InterfaceC38448bG4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f48077a = warehouseChecker;
        this.f48078b = reactiveConfig;
        this.f48079c = ui;
        this.f48080d = scopeProvider;
        this.f48081e = navigator;
        this.f48082f = permissionManager;
        warehouseChecker.m31479B(ui);
    }

    /* renamed from: i */
    public static final InterfaceC23447K m73481i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m73480j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m73479k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m73478l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.UF4
    /* renamed from: a */
    public void mo73486a() {
        Observable<Unit> mo61628h = this.f48079c.mo61628h();
        final C10177b c10177b = new C10177b();
        Observable<R> flatMapSingle = mo61628h.flatMapSingle(new InterfaceC23492o() { // from class: VF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73481i;
                m73481i = ZF4.m73481i(Function1.this, obj);
                return m73481i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate() …ctingResult = true) }\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f48080d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10178c c10178c = new C10178c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: WF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZF4.m73480j(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f48079c.mo61627n().m33094as(AutoDispose.m45239a(this.f48080d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10179d c10179d = new C10179d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: XF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZF4.m73479k(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f48079c.mo61629d0().m33094as(AutoDispose.m45239a(this.f48080d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10180e c10180e = new C10180e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: YF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZF4.m73478l(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f48077a.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.UF4
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        if ((i == 10000 || i == 10001 || i == 10003) && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null && i2 == -1) {
            if (C10176a.$EnumSwitchMapping$0[this.f48078b.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getRepairFlow().ordinal()] == 1) {
                this.f48081e.mo37176E3(wireBird);
            } else {
                this.f48081e.mo36999j4(wireBird);
            }
        }
    }
}
