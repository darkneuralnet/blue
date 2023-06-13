package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LcF;", "LXE;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", C17296a.f69688o, "LTq4;", "LTq4;", "reactiveConfig", "LdF;", "b", "LdF;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "Liy6;", "e", "Liy6;", "warehouseChecker", "<init>", "(LTq4;LdF;Lcom/uber/autodispose/ScopeProvider;Le13;Liy6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBatchLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchLandingPresenter.kt\nco/bird/android/feature/servicecenter/batches/landing/BatchLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n180#2:57\n180#2:58\n161#2:59\n161#2:60\n*S KotlinDebug\n*F\n+ 1 BatchLandingPresenter.kt\nco/bird/android/feature/servicecenter/batches/landing/BatchLandingPresenterImpl\n*L\n33#1:57\n38#1:58\n43#1:59\n50#1:60\n*E\n"})
/* renamed from: cF */
/* loaded from: classes3.dex */
public final class C13476cF implements InterfaceC9385XE, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final C36207Tq4 f60320a;

    /* renamed from: b */
    public final InterfaceC19703dF f60321b;

    /* renamed from: c */
    public final ScopeProvider f60322c;

    /* renamed from: d */
    public final InterfaceC40099e13 f60323d;

    /* renamed from: e */
    public final C43038iy6 f60324e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cF$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13477a extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C13477a(Object obj) {
            super(1, obj, InterfaceC19703dF.class, "showAddToBatch", "showAddToBatch(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC19703dF) this.receiver).mo43078xf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cF$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13478b extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C13478b(Object obj) {
            super(1, obj, InterfaceC19703dF.class, "showSearchAllBatches", "showSearchAllBatches(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC19703dF) this.receiver).mo43080B9(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cF$c */
    /* loaded from: classes3.dex */
    public static final class C13479c extends Lambda implements Function1<Unit, Unit> {
        public C13479c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C13476cF.this.f60323d.mo37130M1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cF$d */
    /* loaded from: classes3.dex */
    public static final class C13480d extends Lambda implements Function1<Unit, Unit> {
        public C13480d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C13476cF.this.f60323d.mo37123N2();
        }
    }

    public C13476cF(C36207Tq4 reactiveConfig, InterfaceC19703dF ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C43038iy6 warehouseChecker) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        this.f60320a = reactiveConfig;
        this.f60321b = ui;
        this.f60322c = scopeProvider;
        this.f60323d = navigator;
        this.f60324e = warehouseChecker;
        warehouseChecker.m31479B(ui);
    }

    /* renamed from: i */
    public static final void m61643i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m61642j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m61641k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m61640l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC9385XE
    /* renamed from: a */
    public void mo61648a() {
        Observable<Boolean> observeOn = this.f60320a.m82584j3().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.enableAdd…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f60322c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13477a c13477a = new C13477a(this.f60321b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C13476cF.m61643i(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn2 = this.f60320a.m82749T7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig.enableVie…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f60322c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13478b c13478b = new C13478b(this.f60321b);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ZE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C13476cF.m61642j(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> m32111s0 = this.f60321b.mo43079Tf().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "ui.addToBatchClicks()\n  …dSchedulers.mainThread())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f60322c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13479c c13479c = new C13479c();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: aF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C13476cF.m61641k(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> m32111s02 = this.f60321b.mo43077yi().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "ui.searchAllBatchesClick…dSchedulers.mainThread())");
        Object m32150f2 = m32111s02.m32150f(AutoDispose.m45239a(this.f60322c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13480d c13480d = new C13480d();
        ((FlowableSubscribeProxy) m32150f2).subscribe(new InterfaceC23484g() { // from class: bF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C13476cF.m61640l(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f60324e.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f60324e.onResume();
    }
}
