package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39873de5;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LbL5;", "", "", "g", "Lde5;", C17296a.f69688o, "Lde5;", "rxBleClient", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "b", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LfL5;", "c", "LfL5;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "<init>", "(Lde5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfL5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockToolsLauncherPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockToolsLauncherPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockToolsLauncherPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,76:1\n180#2:77\n180#2:78\n180#2:79\n180#2:80\n180#2:81\n180#2:82\n*S KotlinDebug\n*F\n+ 1 SmartlockToolsLauncherPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockToolsLauncherPresenter\n*L\n32#1:77\n42#1:78\n52#1:79\n58#1:80\n64#1:81\n70#1:82\n*E\n"})
/* renamed from: bL5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38494bL5 {

    /* renamed from: a */
    public final AbstractC39873de5 f57314a;

    /* renamed from: b */
    public final LifecycleScopeProvider<EnumC7097RE> f57315b;

    /* renamed from: c */
    public final InterfaceC40883fL5 f57316c;

    /* renamed from: d */
    public final InterfaceC40099e13 f57317d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$a */
    /* loaded from: classes2.dex */
    public static final class C12367a extends Lambda implements Function1<Unit, Unit> {
        public C12367a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (C38494bL5.this.f57314a.mo33641c() != AbstractC39873de5.EnumC19828a.READY) {
                C38494bL5.this.f57316c.error(C45871nl4.smartlock_tools_launcher_bluetooth_disabled);
            } else {
                C38494bL5.this.f57317d.mo37086U1();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$b */
    /* loaded from: classes2.dex */
    public static final class C12368b extends Lambda implements Function1<Unit, Unit> {
        public C12368b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (C38494bL5.this.f57314a.mo33641c() != AbstractC39873de5.EnumC19828a.READY) {
                C38494bL5.this.f57316c.error(C45871nl4.smartlock_tools_launcher_bluetooth_disabled);
            } else {
                C38494bL5.this.f57317d.mo37032e1();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$c */
    /* loaded from: classes2.dex */
    public static final class C12369c extends Lambda implements Function1<Unit, Unit> {
        public C12369c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38494bL5.this.f57317d.mo37083V();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$d */
    /* loaded from: classes2.dex */
    public static final class C12370d extends Lambda implements Function1<Unit, Unit> {
        public C12370d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38494bL5.this.f57317d.mo36938u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$e */
    /* loaded from: classes2.dex */
    public static final class C12371e extends Lambda implements Function1<Unit, Unit> {
        public C12371e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38494bL5.this.f57317d.mo36917x2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL5$f */
    /* loaded from: classes2.dex */
    public static final class C12372f extends Lambda implements Function1<Unit, Unit> {
        public C12372f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToLegacyScanBird$default(C38494bL5.this.f57317d, null, null, BirdAction.UNLOCK_SMARTLOCK, MapMode.OPERATOR, null, false, 51, null);
        }
    }

    public C38494bL5(AbstractC39873de5 rxBleClient, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40883fL5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f57314a = rxBleClient;
        this.f57315b = scopeProvider;
        this.f57316c = ui;
        this.f57317d = navigator;
    }

    /* renamed from: h */
    public static final void m64651h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m64650i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m64649j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m64648k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m64647l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m64646m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public final void m64652g() {
        Object m33094as = this.f57316c.mo39597u8().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12367a c12367a = new C12367a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: VK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64651h(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f57316c.mo39602Aa().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12368b c12368b = new C12368b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: WK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64650i(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f57316c.mo39599Uc().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12369c c12369c = new C12369c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: XK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64649j(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f57316c.mo39601Na().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12370d c12370d = new C12370d();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: YK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64648k(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f57316c.mo39598k9().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12371e c12371e = new C12371e();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: ZK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64647l(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f57316c.mo39600Rd().m33094as(AutoDispose.m45239a(this.f57315b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12372f c12372f = new C12372f();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: aL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38494bL5.m64646m(Function1.this, obj);
            }
        });
    }
}
