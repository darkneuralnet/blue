package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.LocationSelectionModel;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "createRadius", "Lco/bird/android/model/LocationSelectionModel;", RequestHeadersFactory.MODEL, "Lio/reactivex/c;", "doNotEnableDoneButtonUntil", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;", "create", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LocationSelectionPresenterImplFactory {
    LocationSelectionPresenterImpl create(LocationSelectionUi locationSelectionUi, ScopeProvider scopeProvider, double d, LocationSelectionModel locationSelectionModel, AbstractC23461c abstractC23461c);
}
