package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LHr5;", "Lco/bird/android/model/FlightBanner;", "", "", C17296a.f69688o, "onBannerShown", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "b", "LEa;", "analyticsManager", "LpU4;", "c", "LpU4;", "rideMapStateManager", "LLr5;", DateTokenConverter.CONVERTER_KEY, "LLr5;", "selectedBirdRidePriceBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LTq4;LEa;LpU4;LLr5;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hr5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33409Hr5 implements FlightBanner {

    /* renamed from: a */
    public final C36207Tq4 f13954a;

    /* renamed from: b */
    public final InterfaceC1880Ea f13955b;

    /* renamed from: c */
    public final InterfaceC46893pU4 f13956c;

    /* renamed from: d */
    public final InterfaceC34345Lr5 f13957d;

    /* renamed from: e */
    public final ScopeProvider f13958e;

    /* renamed from: f */
    public final /* synthetic */ C27923rS f13959f;

    public C33409Hr5(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC34345Lr5 selectedBirdRidePriceBannerUi, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(selectedBirdRidePriceBannerUi, "selectedBirdRidePriceBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f13954a = reactiveConfig;
        this.f13955b = analyticsManager;
        this.f13956c = rideMapStateManager;
        this.f13957d = selectedBirdRidePriceBannerUi;
        this.f13958e = scopeProvider;
        this.f13959f = new C27923rS(selectedBirdRidePriceBannerUi, rideMapStateManager, reactiveConfig, scopeProvider);
    }

    /* renamed from: a */
    public void m103377a() {
        this.f13959f.m15940b();
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
        m103377a();
    }
}
