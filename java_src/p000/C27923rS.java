package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LrS;", "", "", "b", "Lco/bird/android/model/wire/configs/Config;", DateTokenConverter.CONVERTER_KEY, "LsS;", C17296a.f69688o, "LsS;", "f", "()LsS;", "ui", "LpU4;", "LpU4;", "getRideMapStateManager", "()LpU4;", "rideMapStateManager", "LTq4;", "c", "LTq4;", "e", "()LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LsS;LpU4;LTq4;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRidePriceBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRidePriceBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdRidePriceBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,61:1\n180#2:62\n*S KotlinDebug\n*F\n+ 1 BirdRidePriceBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdRidePriceBannerPresenterImpl\n*L\n53#1:62\n*E\n"})
/* renamed from: rS */
/* loaded from: classes2.dex */
public final class C27923rS {

    /* renamed from: a */
    public final InterfaceC28321sS f107087a;

    /* renamed from: b */
    public final InterfaceC46893pU4 f107088b;

    /* renamed from: c */
    public final C36207Tq4 f107089c;

    /* renamed from: d */
    public final ScopeProvider f107090d;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rS$a */
    /* loaded from: classes2.dex */
    public static final class C27924a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {

        /* renamed from: g */
        public final /* synthetic */ WireRidePrice f107091g;

        /* renamed from: h */
        public final /* synthetic */ C27923rS f107092h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27924a(WireRidePrice wireRidePrice, C27923rS c27923rS) {
            super(1);
            this.f107091g = wireRidePrice;
            this.f107092h = c27923rS;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            String str;
            Intrinsics.checkNotNullParameter(it, "it");
            WireRidePrice wireRidePrice = this.f107091g;
            if (wireRidePrice == null) {
                wireRidePrice = C32972Fv0.m106251a(this.f107092h.m15937e().m82623f8().m73665a());
            }
            String string = this.f107092h.m15936f().getString(C45871nl4.payment_quick_deposit_promos_text, new Object[0]);
            Long authChargeAmount = this.f107092h.m15937e().m82623f8().m73665a().getFraudConfig().getAuthChargeAmount();
            if (authChargeAmount != null) {
                C27923rS c27923rS = this.f107092h;
                str = c27923rS.m15936f().getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(c27923rS.m15937e().m82623f8().getValue().getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO));
            } else {
                str = null;
            }
            return this.f107092h.m15936f().mo12372af(wireRidePrice, string, str);
        }
    }

    public C27923rS(InterfaceC28321sS ui, InterfaceC46893pU4 rideMapStateManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f107087a = ui;
        this.f107088b = rideMapStateManager;
        this.f107089c = reactiveConfig;
        this.f107090d = scopeProvider;
    }

    /* renamed from: c */
    public static final InterfaceC23447K m15939c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b */
    public void m15940b() {
        WireRidePrice wireRidePrice;
        Config m15938d = m15938d();
        if (this.f107088b.mo15902g().m73665a().m59037c() && m15938d.getPricingUiConfig().getFlightBarPricing().getShowRidePriceInBanners()) {
            wireRidePrice = C32972Fv0.m106251a(m15938d);
        } else {
            wireRidePrice = null;
        }
        this.f107087a.mo12373Ji(wireRidePrice, m15938d.getPricingUiConfig().getFlightBarPricing().getAndroidSpecificBannerRidePriceMaxNumberOfLines());
        Observable<Unit> mo12374G1 = this.f107087a.mo12374G1();
        final C27924a c27924a = new C27924a(wireRidePrice, this);
        Observable<R> flatMapSingle = mo12374G1.flatMapSingle(new InterfaceC23492o() { // from class: qS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m15939c;
                m15939c = C27923rS.m15939c(Function1.this, obj);
                return m15939c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun configurePr…r)\n      .subscribe()\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f107090d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: d */
    public final Config m15938d() {
        return C36441Uq4.m80769c(this.f107089c, this.f107088b.mo15902g().getValue().m59035e());
    }

    /* renamed from: e */
    public final C36207Tq4 m15937e() {
        return this.f107089c;
    }

    /* renamed from: f */
    public final InterfaceC28321sS m15936f() {
        return this.f107087a;
    }
}
