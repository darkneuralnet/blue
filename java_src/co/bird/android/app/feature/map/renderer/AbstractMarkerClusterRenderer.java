package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.MarkerClusterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "K", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "T", "LEW0;", "item", "LfM2;", "marker", "", "updateItem", "(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LcD1;", "map", "LGl0;", "clusterManager", "<init>", "(Landroid/content/Context;LcD1;LGl0;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class AbstractMarkerClusterRenderer<K, T extends MarkerClusterItem<K>> extends EW0<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMarkerClusterRenderer(Context context, C39011cD1 map, C33116Gl0<T> clusterManager) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
    }

    public abstract void updateItem(T t, C40889fM2 c40889fM2);
}
