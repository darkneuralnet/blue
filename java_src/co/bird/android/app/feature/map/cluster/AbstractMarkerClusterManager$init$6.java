package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042*\u0010\u0005\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0003H\u0003 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0003H\u0003\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "K", "T", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "markerAction", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManager$init$6 extends Lambda implements Function1<AbstractMarkerClusterManager.MarkerAction<T>, Unit> {
    final /* synthetic */ AbstractMarkerClusterManager<K, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMarkerClusterManager$init$6(AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager) {
        super(1);
        this.this$0 = abstractMarkerClusterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AbstractMarkerClusterManager.MarkerAction) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(AbstractMarkerClusterManager.MarkerAction<T> markerAction) {
        if (markerAction instanceof AbstractMarkerClusterManager.MarkerAction.RemoveMarkers) {
            this.this$0.getClusterManager().m104795q(((AbstractMarkerClusterManager.MarkerAction.RemoveMarkers) markerAction).getMarkers());
        } else if (markerAction instanceof AbstractMarkerClusterManager.MarkerAction.AddMarkers) {
            this.this$0.getClusterManager().m104804h(((AbstractMarkerClusterManager.MarkerAction.AddMarkers) markerAction).getMarkers());
        } else if (markerAction instanceof AbstractMarkerClusterManager.MarkerAction.ClearMarkers) {
            this.this$0.getClusterManager().m104803i();
        }
        this.this$0.getClusterManager().m104802j();
    }
}
