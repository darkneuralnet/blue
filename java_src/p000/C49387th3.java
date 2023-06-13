package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.UserKt;
import co.bird.android.model.constant.RideRequirementReason;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC48572sJ4;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lth3;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "Lgl;", "b", "Lgl;", "preference", "Lxh3;", "c", "Lxh3;", "onboardingBannerUi", "LsJ4;", DateTokenConverter.CONVERTER_KEY, "LsJ4;", "requirementPresenter", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lth3$a;", "f", "Lth3$a;", "bannerState", "<init>", "(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnboardingBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/OnboardingBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,49:1\n180#2:50\n*S KotlinDebug\n*F\n+ 1 OnboardingBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/OnboardingBannerPresenterImpl\n*L\n37#1:50\n*E\n"})
/* renamed from: th3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49387th3 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC1880Ea f110872a;

    /* renamed from: b */
    public final C22454gl f110873b;

    /* renamed from: c */
    public final InterfaceC51758xh3 f110874c;

    /* renamed from: d */
    public final InterfaceC48572sJ4 f110875d;

    /* renamed from: e */
    public final ScopeProvider f110876e;

    /* renamed from: f */
    public final EnumC28800a f110877f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lth3$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: th3$a */
    /* loaded from: classes2.dex */
    public enum EnumC28800a {
        UNTOUCHED,
        IN_PROGRESS
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: th3$b */
    /* loaded from: classes2.dex */
    public static final class C28801b extends Lambda implements Function1<Unit, Unit> {
        public C28801b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49387th3.this.f110872a.mo55905y(new C34596Mt4(null, null, null, Boolean.valueOf(UserKt.isInRegistration(C49387th3.this.f110873b.m37750B0())), C49387th3.this.f110877f.name(), "banner", 7, null));
            InterfaceC48572sJ4.C28260a.checkRequirementsSilently$default(C49387th3.this.f110875d, null, RideRequirementReason.ONBOARDING_BANNER, null, 4, null);
        }
    }

    public C49387th3(InterfaceC1880Ea analyticsManager, C22454gl preference, InterfaceC51758xh3 onboardingBannerUi, InterfaceC48572sJ4 requirementPresenter, ScopeProvider scopeProvider, EnumC28800a bannerState) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(onboardingBannerUi, "onboardingBannerUi");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        this.f110872a = analyticsManager;
        this.f110873b = preference;
        this.f110874c = onboardingBannerUi;
        this.f110875d = requirementPresenter;
        this.f110876e = scopeProvider;
        this.f110877f = bannerState;
    }

    /* renamed from: b */
    public static final void m11918b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Object m33094as = this.f110874c.mo2897a().m33094as(AutoDispose.m45239a(this.f110876e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28801b c28801b = new C28801b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sh3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49387th3.m11918b(Function1.this, obj);
            }
        });
    }
}
