package p000;

import co.bird.android.model.FlightBanner;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LKH3;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "LOH3;", "b", "LOH3;", "parkingSuccessBannerUi", "<init>", "(LTq4;LOH3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KH3 */
/* loaded from: classes2.dex */
public final class KH3 implements FlightBanner {

    /* renamed from: a */
    public final C36207Tq4 f19341a;

    /* renamed from: b */
    public final OH3 f19342b;

    public KH3(C36207Tq4 reactiveConfig, OH3 parkingSuccessBannerUi) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(parkingSuccessBannerUi, "parkingSuccessBannerUi");
        this.f19341a = reactiveConfig;
        this.f19342b = parkingSuccessBannerUi;
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
        long parkingIncentiveValue = this.f19341a.m82623f8().getValue().getParkingConfig().getParkingIncentiveValue();
        Currency m25591o = C45097mS5.m25591o(this.f19341a.m82623f8().getValue().getRideConfig().getCurrency());
        if (parkingIncentiveValue > 0) {
            this.f19342b.mo90509c(parkingIncentiveValue, m25591o);
        } else if (this.f19341a.m82623f8().getValue().getEnforceNoParkingV0()) {
            this.f19342b.mo90510b(C45871nl4.enforce_no_parking_nest_success_subtitle);
            this.f19342b.mo90511a(C48193rg4.ic_checkmark_purple);
        } else {
            this.f19342b.mo90510b(C45871nl4.parking_nest_no_incentive_success_subtitle);
        }
    }
}
