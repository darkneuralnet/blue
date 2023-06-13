package co.bird.android.app.feature.map.presenter;

import android.os.Bundle;
import co.bird.android.model.LocationSelectionModel;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.UX0;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "LUX0;", "", "hint", "", "setAddressHint", "Lio/reactivex/Observable;", "Lco/bird/android/model/LocationSelectionModel;", "observeDone", "", "observeCompleteRevGeoCodeAddress", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LocationSelectionPresenter extends UX0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onCreate(LocationSelectionPresenter locationSelectionPresenter, Bundle bundle) {
            UX0.C8308a.m81389a(locationSelectionPresenter, bundle);
        }

        public static void onDestroy(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81388b(locationSelectionPresenter);
        }

        public static void onLowMemory(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81387c(locationSelectionPresenter);
        }

        public static void onPause(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81386d(locationSelectionPresenter);
        }

        public static void onResume(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81385e(locationSelectionPresenter);
        }

        public static void onSaveInstanceState(LocationSelectionPresenter locationSelectionPresenter, Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            UX0.C8308a.m81384f(locationSelectionPresenter, outState);
        }

        public static void onStart(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81383g(locationSelectionPresenter);
        }

        public static void onStop(LocationSelectionPresenter locationSelectionPresenter) {
            UX0.C8308a.m81382h(locationSelectionPresenter);
        }
    }

    Observable<String> observeCompleteRevGeoCodeAddress();

    Observable<LocationSelectionModel> observeDone();

    @Override // p000.UX0
    /* synthetic */ void onCreate(Bundle bundle);

    @Override // p000.UX0
    /* synthetic */ void onDestroy();

    @Override // p000.UX0
    /* synthetic */ void onLowMemory();

    @Override // p000.UX0
    /* synthetic */ void onPause();

    @Override // p000.UX0
    /* synthetic */ void onResume();

    @Override // p000.UX0
    /* synthetic */ void onSaveInstanceState(Bundle bundle);

    @Override // p000.UX0
    /* synthetic */ void onStart();

    @Override // p000.UX0
    /* synthetic */ void onStop();

    void setAddressHint(int i);
}
