package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LHB4;", "LDB4;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Intent;", "intent", "b", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "Liy6;", C17296a.f69688o, "Liy6;", "warehouseChecker", "LJB4;", "LJB4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LDQ3;", "e", "LDQ3;", "permissionManager", "<init>", "(Liy6;LJB4;Lcom/uber/autodispose/ScopeProvider;Le13;LDQ3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerScanPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n180#2:57\n*S KotlinDebug\n*F\n+ 1 RepairLoggerScanPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanPresenterImpl\n*L\n38#1:57\n*E\n"})
/* renamed from: HB4 */
/* loaded from: classes3.dex */
public final class HB4 implements DB4, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final C43038iy6 f13061a;

    /* renamed from: b */
    public final JB4 f13062b;

    /* renamed from: c */
    public final ScopeProvider f13063c;

    /* renamed from: d */
    public final InterfaceC40099e13 f13064d;

    /* renamed from: e */
    public final DQ3 f13065e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HB4$a */
    /* loaded from: classes3.dex */
    public static final class C3086a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C3086a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return HB4.this.f13065e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HB4$b */
    /* loaded from: classes3.dex */
    public static final class C3087b extends Lambda implements Function1<FQ3, Unit> {
        public C3087b() {
            super(1);
        }

        /* renamed from: a */
        public final void m104183a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToScanBirdForResult$default(HB4.this.f13064d, null, null, null, MapMode.OPERATOR, null, false, 55, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m104183a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HB4$c */
    /* loaded from: classes3.dex */
    public static final class C3088c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3088c f13068g = new C3088c();

        public C3088c() {
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
        }
    }

    public HB4(C43038iy6 warehouseChecker, JB4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f13061a = warehouseChecker;
        this.f13062b = ui;
        this.f13063c = scopeProvider;
        this.f13064d = navigator;
        this.f13065e = permissionManager;
        warehouseChecker.m31479B(ui);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m104186h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m104185i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m104184j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.DB4
    /* renamed from: b */
    public void mo104190b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Observable<Unit> mo99107w = this.f13062b.mo99107w();
        final C3086a c3086a = new C3086a();
        Observable<R> flatMapSingle = mo99107w.flatMapSingle(new InterfaceC23492o() { // from class: EB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104186h;
                m104186h = HB4.m104186h(Function1.this, obj);
                return m104186h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(in…Timber.e(it)\n      })\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f13063c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3087b c3087b = new C3087b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: FB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HB4.m104185i(Function1.this, obj);
            }
        };
        final C3088c c3088c = C3088c.f13068g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: GB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HB4.m104184j(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f13061a.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.DB4
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10006 && i2 == -1 && intent != null) {
            this.f13062b.vibrate(1000L);
            InterfaceC40099e13 interfaceC40099e13 = this.f13064d;
            Parcelable parcelableExtra = intent.getParcelableExtra("bird");
            Intrinsics.checkNotNull(parcelableExtra);
            interfaceC40099e13.mo37101R1((WireBird) parcelableExtra);
        }
    }
}
