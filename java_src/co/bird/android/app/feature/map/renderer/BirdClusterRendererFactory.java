package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BirdClusterRendererFactory;", "", "Lco/bird/android/app/feature/map/renderer/IconLoader;", "iconLoader", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LcD1;", "map", "LGl0;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "clusterManager", "Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;", "create", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface BirdClusterRendererFactory {
    BirdClusterRenderer create(IconLoader iconLoader, Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0);
}
