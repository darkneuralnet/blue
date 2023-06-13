package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LBK2;", "markerOverridesManager", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/model/constant/MapMode;", "mode", "", "hourly", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager;", "create", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface BirdClusterManagerFactory {
    BirdClusterManager create(BaseActivity baseActivity, BK2 bk2, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapMode mapMode, boolean z);
}
