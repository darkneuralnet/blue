package co.bird.android.app.feature.map.cluster;

import com.google.android.gms.maps.model.VisibleRegion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/VisibleRegion;", "kotlin.jvm.PlatformType", "K", "T", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/VisibleRegion;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManager$init$3 extends Lambda implements Function1<Unit, VisibleRegion> {
    final /* synthetic */ AbstractMarkerClusterManager<K, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMarkerClusterManager$init$3(AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager) {
        super(1);
        this.this$0 = abstractMarkerClusterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VisibleRegion invoke(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.getMap().m61677k().m81934b();
    }
}
