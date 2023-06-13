package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
import p000.WS3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0015\u0010'¨\u0006+"}, m28432d2 = {"Lo65;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LaT3;", "b", "LaT3;", "presenterFactory", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lt65;", DateTokenConverter.CONVERTER_KEY, "Lt65;", "ui", "Le13;", "e", "Le13;", "navigator", "Lco/bird/android/model/wire/WirePhysicalLock;", "f", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "LWS3;", "g", "Lkotlin/Lazy;", "()LWS3;", "presenter", "<init>", "(LaT3;Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartedPhysicalLockTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartedPhysicalLockTutorialPresenter.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedPhysicalLockTutorialPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,61:1\n180#2:62\n*S KotlinDebug\n*F\n+ 1 RideStartedPhysicalLockTutorialPresenter.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedPhysicalLockTutorialPresenter\n*L\n47#1:62\n*E\n"})
/* renamed from: o65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46081o65 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC37971aT3 f101382b;

    /* renamed from: c */
    public final ScopeProvider f101383c;

    /* renamed from: d */
    public final C49045t65 f101384d;

    /* renamed from: e */
    public final InterfaceC40099e13 f101385e;

    /* renamed from: f */
    public final WirePhysicalLock f101386f;

    /* renamed from: g */
    public final Lazy f101387g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o65$a */
    /* loaded from: classes2.dex */
    public static final class C26819a extends Lambda implements Function1<Unit, Unit> {
        public C26819a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C46081o65.this.f101385e.mo36922w3(360027921692L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZS3;", "b", "()LZS3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o65$b */
    /* loaded from: classes2.dex */
    public static final class C26820b extends Lambda implements Function0<ZS3> {
        public C26820b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ZS3 invoke() {
            return C46081o65.this.f101382b.mo64516a(C46081o65.this.f101383c, C46081o65.this.f101384d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o65$c */
    /* loaded from: classes2.dex */
    public static final class C26821c extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C26821c f101390g = new C26821c();

        public C26821c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public C46081o65(InterfaceC37971aT3 presenterFactory, ScopeProvider scopeProvider, C49045t65 ui, InterfaceC40099e13 navigator, WirePhysicalLock wirePhysicalLock) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f101382b = presenterFactory;
        this.f101383c = scopeProvider;
        this.f101384d = ui;
        this.f101385e = navigator;
        this.f101386f = wirePhysicalLock;
        lazy = LazyKt__LazyJVMKt.lazy(new C26820b());
        this.f101387g = lazy;
    }

    /* renamed from: d */
    public static final void m21775d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final Object m21774e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        Observable<Unit> observeDone = m21776c().observeDone();
        final C26821c c26821c = C26821c.f101390g;
        Observable<R> map = observeDone.map(new InterfaceC23492o() { // from class: m65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m21774e;
                m21774e = C46081o65.m21774e(Function1.this, obj);
                return m21774e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "presenter.observeDone().map { true }");
        return map;
    }

    /* renamed from: c */
    public final WS3 m21776c() {
        return (WS3) this.f101387g.getValue();
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "just(true)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        WS3.C9041a.onCreate$default(m21776c(), this.f101386f, false, 2, null);
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        this.f101384d.m13062c();
        Object m33094as = this.f101384d.m13063b().m33094as(AutoDispose.m45239a(this.f101383c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26819a c26819a = new C26819a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: n65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46081o65.m21775d(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
