package co.bird.android.app.feature.map.cluster;

import com.google.android.gms.maps.model.VisibleRegion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "K", "Lcom/google/android/gms/maps/model/VisibleRegion;", "T", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "markers", "viewport", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManager$init$4 extends Lambda implements Function2<List<? extends K>, VisibleRegion, Pair<? extends List<? extends K>, ? extends VisibleRegion>> {
    public static final AbstractMarkerClusterManager$init$4 INSTANCE = new AbstractMarkerClusterManager$init$4();

    public AbstractMarkerClusterManager$init$4() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<List<K>, VisibleRegion> invoke(List<? extends K> markers, VisibleRegion viewport) {
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        return TuplesKt.m28425to(markers, viewport);
    }
}
