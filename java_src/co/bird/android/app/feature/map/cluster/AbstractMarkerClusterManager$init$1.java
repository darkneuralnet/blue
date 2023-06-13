package co.bird.android.app.feature.map.cluster;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"K", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "T", "LfM2;", "marker", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManager$init$1 extends Lambda implements Function1<C40889fM2, Boolean> {
    final /* synthetic */ AbstractMarkerClusterManager<K, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMarkerClusterManager$init$1(AbstractMarkerClusterManager<K, T> abstractMarkerClusterManager) {
        super(1);
        this.this$0 = abstractMarkerClusterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return Boolean.valueOf(this.this$0.filterClickable(marker));
    }
}
