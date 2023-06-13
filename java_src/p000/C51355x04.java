package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.api.response.AutoReloadFromPreloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lx04;", "Lf1;", "Ly04;", "Lz04;", "renderer", "", "n", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "o", "p", "Le13;", "e", "Le13;", "navigator", "Lgl;", "f", "Lgl;", "preference", "LTq4;", "g", "LTq4;", "reactiveConfig", "LVM3;", "h", "LVM3;", "paymentManagerV3", "<init>", "(Le13;Lgl;LTq4;LVM3;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2LandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2LandingPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n180#2:83\n*S KotlinDebug\n*F\n+ 1 PreloadV2LandingPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingPresenter\n*L\n49#1:83\n*E\n"})
/* renamed from: x04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51355x04 extends AbstractC20169f1<InterfaceC51948y04, InterfaceC52541z04> {

    /* renamed from: e */
    public final InterfaceC40099e13 f116968e;

    /* renamed from: f */
    public final C22454gl f116969f;

    /* renamed from: g */
    public final C36207Tq4 f116970g;

    /* renamed from: h */
    public final VM3 f116971h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x04$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30015a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[R04.values().length];
            try {
                iArr[R04.POST_PAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x04$b */
    /* loaded from: classes3.dex */
    public static final class C30016b extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>>, Unit> {
        public C30016b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>> pair) {
            invoke2((Pair<Unit, Optional<ReloadConfigResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<ReloadConfigResponse>> pair) {
            AutoReloadFromPreloadConfig autoReloadFromPreload;
            Optional<ReloadConfigResponse> component2 = pair.component2();
            boolean z = C51355x04.this.f116971h.mo25729m() != R04.PREPAY_MANDATORY;
            ReloadConfigResponse m59035e = component2.m59035e();
            C51355x04.this.f116968e.mo36953r2(z, Intrinsics.areEqual((m59035e == null || (autoReloadFromPreload = m59035e.getAutoReloadFromPreload()) == null) ? null : Boolean.valueOf(autoReloadFromPreload.getEnabled()), Boolean.TRUE), 10074, "landing");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51355x04(InterfaceC40099e13 navigator, C22454gl preference, C36207Tq4 reactiveConfig, VM3 paymentManagerV3) {
        super(C43666k22.f93806a);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        this.f116968e = navigator;
        this.f116969f = preference;
        this.f116970g = reactiveConfig;
        this.f116971h = paymentManagerV3;
    }

    /* renamed from: f */
    public static final void m5997f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: n */
    public void consume(InterfaceC51948y04 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        if (C30015a.$EnumSwitchMapping$0[this.f116971h.mo25729m().ordinal()] == 1) {
            renderer.render(new HY3(0, this.f116970g.m82623f8().m73665a().getRideConfig().getLocalizedDynamicPriceString(), 1, null));
        } else {
            renderer.render(new C41276g04(0, this.f116970g.m82623f8().m73665a().getRideConfig().getLocalizedDynamicPriceString(), 1, null));
        }
        Object m33094as = C24527f.m31950a(renderer.mo4246u0(), this.f116971h.mo25737i()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30016b c30016b = new C30016b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: w04
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51355x04.m5997f(Function1.this, obj);
            }
        });
    }

    /* renamed from: o */
    public final String m5994o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long authChargeAmount = this.f116970g.m82623f8().getValue().getFraudConfig().getAuthChargeAmount();
        if (authChargeAmount != null) {
            return context.getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(this.f116970g.m82623f8().getValue().getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO));
        }
        return null;
    }

    /* renamed from: p */
    public final void m5993p() {
        this.f116969f.m37549y2();
        this.f116968e.mo37050b1(-1);
    }
}
