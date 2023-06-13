package p000;

import android.view.View;
import co.bird.android.model.Banner;
import co.bird.android.widget.BannerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, m28432d2 = {"LLP4;", "LKP4;", "LfP4;", "presenter", "", "b", "Lco/bird/android/model/Banner;", "banner", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Lco/bird/android/widget/BannerView;", "Lco/bird/android/widget/BannerView;", "bannerView", "<init>", "(LEa;Lco/bird/android/widget/BannerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LP4 */
/* loaded from: classes2.dex */
public final class LP4 implements KP4 {

    /* renamed from: a */
    public final InterfaceC1880Ea f21380a;

    /* renamed from: b */
    public final BannerView f21381b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LP4$a */
    /* loaded from: classes2.dex */
    public static final class C4909a extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC40918fP4 f21382g;

        /* renamed from: h */
        public final /* synthetic */ LP4 f21383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4909a(InterfaceC40918fP4 interfaceC40918fP4, LP4 lp4) {
            super(1);
            this.f21382g = interfaceC40918fP4;
            this.f21383h = lp4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            this.f21382g.mo41419e(this.f21383h.f21381b.m54774a());
        }
    }

    public LP4(InterfaceC1880Ea analyticsManager, BannerView bannerView) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f21380a = analyticsManager;
        this.f21381b = bannerView;
    }

    @Override // p000.KP4
    /* renamed from: a */
    public void mo96963a(Banner banner) {
        boolean z;
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f21381b.setBannerStep(banner);
        BannerView bannerView = this.f21381b;
        if (banner != Banner.NONE) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(bannerView, z, 0, 2, null);
    }

    /* renamed from: b */
    public void m96962b(InterfaceC40918fP4 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        C34585Ms2.m94661j(this.f21381b, new C4909a(presenter, this));
    }
}
