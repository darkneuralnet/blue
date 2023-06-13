package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.BaseUnreadyMarkerOverrides;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;", "invoke", "(Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BaseUnreadyMarkerOverrides$removeHeldItem$1 extends Lambda implements Function1<BaseUnreadyMarkerOverrides.HeldClusterItem<T>, Boolean> {
    final /* synthetic */ T $marker;
    final /* synthetic */ BaseUnreadyMarkerOverrides<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUnreadyMarkerOverrides$removeHeldItem$1(BaseUnreadyMarkerOverrides<T> baseUnreadyMarkerOverrides, T t) {
        super(1);
        this.this$0 = baseUnreadyMarkerOverrides;
        this.$marker = t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BaseUnreadyMarkerOverrides.HeldClusterItem<T> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.getItem().getId(), this.this$0.markerId(this.$marker)));
    }
}
