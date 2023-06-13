package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.analytics.RentalConfirmedShown;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Lzz2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LEa;", "b", "LEa;", "analyticsManager", "LQA2;", "c", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDz2;", "e", "LDz2;", "ui", "<init>", "(LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;LDz2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupConfirmedPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupConfirmedPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupConfirmedPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,59:1\n180#2:60\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupConfirmedPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupConfirmedPresenter\n*L\n45#1:60\n*E\n"})
/* renamed from: zz2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53123zz2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC1880Ea f122549b;

    /* renamed from: c */
    public final QA2 f122550c;

    /* renamed from: d */
    public final ScopeProvider f122551d;

    /* renamed from: e */
    public final C32542Dz2 f122552e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/DeliveryWindow;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zz2$a */
    /* loaded from: classes2.dex */
    public static final class C31603a extends Lambda implements Function1<Optional<DeliveryWindow>, Boolean> {

        /* renamed from: g */
        public static final C31603a f122553g = new C31603a();

        public C31603a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<DeliveryWindow> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/DeliveryWindow;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/DeliveryWindow;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zz2$b */
    /* loaded from: classes2.dex */
    public static final class C31604b extends Lambda implements Function1<Optional<DeliveryWindow>, DeliveryWindow> {

        /* renamed from: g */
        public static final C31604b f122554g = new C31604b();

        public C31604b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DeliveryWindow invoke(Optional<DeliveryWindow> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DeliveryWindow;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zz2$c */
    /* loaded from: classes2.dex */
    public static final class C31605c extends Lambda implements Function1<DeliveryWindow, Unit> {
        public C31605c() {
            super(1);
        }

        /* renamed from: a */
        public final void m7a(DeliveryWindow it) {
            C32542Dz2 c32542Dz2 = C53123zz2.this.f122552e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c32542Dz2.m109522Pl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeliveryWindow deliveryWindow) {
            m7a(deliveryWindow);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zz2$d */
    /* loaded from: classes2.dex */
    public static final class C31606d extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C31606d f122556g = new C31606d();

        public C31606d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public C53123zz2(InterfaceC1880Ea analyticsManager, QA2 model, ScopeProvider scopeProvider, C32542Dz2 ui) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f122549b = analyticsManager;
        this.f122550c = model;
        this.f122551d = scopeProvider;
        this.f122552e = ui;
    }

    /* renamed from: e */
    public static final boolean m17e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f */
    public static final DeliveryWindow m16f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DeliveryWindow) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m15g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final Object m13h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        Observable<Unit> doneClicks = this.f122552e.doneClicks();
        final C31606d c31606d = C31606d.f122556g;
        Observable<R> map = doneClicks.map(new InterfaceC23492o() { // from class: yz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m13h;
                m13h = C53123zz2.m13h(Function1.this, obj);
                return m13h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.doneClicks().map { true }");
        return map;
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
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f122549b.mo55956N(new RentalConfirmedShown());
        this.f122549b.mo55905y(new C31833Ay4(null, null, null, this.f122550c.m88823p().toString(), 7, null));
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
        InterfaceC44782lv1.C25814a.m26676g(this);
        Observable<Optional<DeliveryWindow>> m88841F = this.f122550c.m88841F();
        final C31603a c31603a = C31603a.f122553g;
        Observable<Optional<DeliveryWindow>> filter = m88841F.filter(new InterfaceC23494q() { // from class: vz2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m17e;
                m17e = C53123zz2.m17e(Function1.this, obj);
                return m17e;
            }
        });
        final C31604b c31604b = C31604b.f122554g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: wz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DeliveryWindow m16f;
                m16f = C53123zz2.m16f(Function1.this, obj);
                return m16f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.selectedWindow()\n …}\n      .map { it.get() }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f122551d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31605c c31605c = new C31605c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53123zz2.m15g(Function1.this, obj);
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
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.CLOSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.CLOSE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
