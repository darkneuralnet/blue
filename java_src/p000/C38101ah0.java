package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u000e\b\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, m28432d2 = {"Lah0;", "LxC;", "", "Landroid/content/Intent;", "intent", "", "b", "B", "G", "LFO2;", "c", "LFO2;", "manager", "LEg1;", DateTokenConverter.CONVERTER_KEY, "LEg1;", "eventBus", "Leh0;", "e", "Leh0;", "ui", "Le13;", "f", "Le13;", "navigator", "", "g", "Ljava/lang/String;", "repairId", "Lco/bird/android/model/wire/WireBird;", "h", "Lco/bird/android/model/wire/WireBird;", "bird", "", "i", "Z", "escalate", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFO2;LEg1;Leh0;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCertifyRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertifyRepairPresenter.kt\nco/bird/android/app/feature/legacyrepair/certifyrepair/CertifyRepairPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,94:1\n180#2:95\n180#2:96\n*S KotlinDebug\n*F\n+ 1 CertifyRepairPresenter.kt\nco/bird/android/app/feature/legacyrepair/certifyrepair/CertifyRepairPresenterImpl\n*L\n57#1:95\n72#1:96\n*E\n"})
/* renamed from: ah0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38101ah0 extends C30060xC {

    /* renamed from: c */
    public final FO2 f50937c;

    /* renamed from: d */
    public final InterfaceC32604Eg1 f50938d;

    /* renamed from: e */
    public final InterfaceC40490eh0 f50939e;

    /* renamed from: f */
    public final InterfaceC40099e13 f50940f;

    /* renamed from: g */
    public String f50941g;

    /* renamed from: h */
    public WireBird f50942h;

    /* renamed from: i */
    public boolean f50943i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ah0$a */
    /* loaded from: classes2.dex */
    public static final class C10813a extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends BirdRepair>> {
        public C10813a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends BirdRepair> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C38101ah0.this.f50942h = it;
            FO2 fo2 = C38101ah0.this.f50937c;
            String str = C38101ah0.this.f50941g;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repairId");
                str = null;
            }
            return fo2.mo93952i(str, Resolution.COMPLETED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ah0$b */
    /* loaded from: classes2.dex */
    public static final class C10814b extends Lambda implements Function1<BirdRepair, Unit> {
        public C10814b() {
            super(1);
        }

        /* renamed from: a */
        public final void m70860a(BirdRepair birdRepair) {
            C38101ah0.this.f50939e.showProgress(false, 4);
            InterfaceC32604Eg1 interfaceC32604Eg1 = C38101ah0.this.f50938d;
            WireBird wireBird = C38101ah0.this.f50942h;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            interfaceC32604Eg1.mo104915c(new C29560vT(wireBird));
            C38101ah0.this.m70866G();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdRepair birdRepair) {
            m70860a(birdRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ah0$c */
    /* loaded from: classes2.dex */
    public static final class C10815c extends Lambda implements Function1<Throwable, Unit> {
        public C10815c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C38101ah0.this.f50939e.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ah0$d */
    /* loaded from: classes2.dex */
    public static final class C10816d extends Lambda implements Function1<Unit, Unit> {
        public C10816d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38101ah0.this.m70871B();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ah0$e */
    /* loaded from: classes2.dex */
    public static final class C10817e extends Lambda implements Function0<Unit> {
        public C10817e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C38101ah0.this.f50940f.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ah0$f */
    /* loaded from: classes2.dex */
    public static final class C10818f extends Lambda implements Function0<Unit> {
        public C10818f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C38101ah0.this.f50940f.mo37030e3();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38101ah0(LifecycleScopeProvider<EnumC7097RE> scopeProvider, FO2 manager, InterfaceC32604Eg1 eventBus, InterfaceC40490eh0 ui, InterfaceC40099e13 navigator) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f50937c = manager;
        this.f50938d = eventBus;
        this.f50939e = ui;
        this.f50940f = navigator;
    }

    /* renamed from: C */
    public static final InterfaceC23434B m70870C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m70869D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m70868E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m70867F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final void m70871B() {
        Observable<WireBird> mo93974F;
        this.f50939e.showProgress(true, 4);
        WireBird wireBird = null;
        if (this.f50943i) {
            FO2 fo2 = this.f50937c;
            WireBird wireBird2 = this.f50942h;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            String taskId = wireBird.getTaskId();
            Intrinsics.checkNotNull(taskId);
            mo93974F = fo2.mo93975D(taskId);
        } else {
            FO2 fo22 = this.f50937c;
            WireBird wireBird3 = this.f50942h;
            if (wireBird3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird3;
            }
            String taskId2 = wireBird.getTaskId();
            Intrinsics.checkNotNull(taskId2);
            mo93974F = fo22.mo93974F(taskId2);
        }
        final C10813a c10813a = new C10813a();
        Observable<R> flatMap = mo93974F.flatMap(new InterfaceC23492o() { // from class: Wg0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m70870C;
                m70870C = C38101ah0.m70870C(Function1.this, obj);
                return m70870C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun onCertifyCli…r(e.message)\n      })\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10814b c10814b = new C10814b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Xg0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38101ah0.m70869D(Function1.this, obj);
            }
        };
        final C10815c c10815c = new C10815c();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Yg0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38101ah0.m70868E(Function1.this, obj);
            }
        });
    }

    /* renamed from: G */
    public final void m70866G() {
        if (this.f50943i) {
            H31.C3014a.showDialog$default(this.f50939e, C37490Zd0.f48850d, false, false, new C10817e(), null, null, null, 116, null);
        } else {
            H31.C3014a.showDialog$default(this.f50939e, C34173Ky4.f20475d, false, false, new C10818f(), null, null, null, 116, null);
        }
    }

    /* renamed from: b */
    public void m70865b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f50942h = (WireBird) parcelableExtra;
        String stringExtra = intent.getStringExtra("repair_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f50941g = stringExtra;
        this.f50943i = intent.getBooleanExtra("should_escalate", false);
        InterfaceC40490eh0 interfaceC40490eh0 = this.f50939e;
        WireBird wireBird = this.f50942h;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        interfaceC40490eh0.mo37905m(wireBird.getCode());
        Observable<Unit> observeOn = this.f50939e.mo37906Z5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.certifyClicks()\n     …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10816d c10816d = new C10816d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Zg0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38101ah0.m70867F(Function1.this, obj);
            }
        });
    }
}
