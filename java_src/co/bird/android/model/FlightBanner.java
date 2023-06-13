package co.bird.android.model;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/FlightBanner;", "", "closeImmediately", "Lio/reactivex/Observable;", "", "onBannerRemoved", "onBannerShown", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface FlightBanner {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> closeImmediately(FlightBanner flightBanner) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }

        public static void onBannerRemoved(FlightBanner flightBanner) {
        }
    }

    Observable<Unit> closeImmediately();

    void onBannerRemoved();

    void onBannerShown();
}
