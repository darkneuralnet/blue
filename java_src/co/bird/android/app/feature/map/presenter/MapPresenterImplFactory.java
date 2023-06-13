package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.constant.MapMode;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "", "create", "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;", "scopeProvider", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "ui", "Lco/bird/android/app/feature/map/ui/MapUi;", "mapMode", "Lco/bird/android/model/constant/MapMode;", "moveLocation", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public interface MapPresenterImplFactory {
    MapPresenterImpl create(LifecycleScopeProvider<?> lifecycleScopeProvider, MapUi mapUi, MapMode mapMode, boolean z);
}
