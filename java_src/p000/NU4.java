package p000;

import co.bird.android.feature.ridepass.view.RidePassBannerView;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, m28432d2 = {"LNU4;", "LMU4;", "Lio/reactivex/Observable;", "", C17296a.f69688o, "", "Lco/bird/android/model/persistence/RidePassView;", "ridePasses", "", "alwaysShowStaticTitle", "b", "Lco/bird/android/feature/ridepass/view/RidePassBannerView;", "Lco/bird/android/feature/ridepass/view/RidePassBannerView;", "ridePassBannerView", "<init>", "(Lco/bird/android/feature/ridepass/view/RidePassBannerView;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NU4 */
/* loaded from: classes3.dex */
public final class NU4 implements MU4 {

    /* renamed from: a */
    public final RidePassBannerView f24651a;

    public NU4(RidePassBannerView ridePassBannerView) {
        Intrinsics.checkNotNullParameter(ridePassBannerView, "ridePassBannerView");
        this.f24651a = ridePassBannerView;
    }

    @Override // p000.MU4
    /* renamed from: a */
    public Observable<Unit> mo93855a() {
        return C44626lf5.clicksThrottle$default(this.f24651a, 0L, 1, null);
    }

    @Override // p000.MU4
    /* renamed from: b */
    public void mo93854b(List<RidePassView> ridePasses, boolean z) {
        Intrinsics.checkNotNullParameter(ridePasses, "ridePasses");
        C49520tu6.m11233r(this.f24651a);
        this.f24651a.m57369e(ridePasses, z);
    }
}
