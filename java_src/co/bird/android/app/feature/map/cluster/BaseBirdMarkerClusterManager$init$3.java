package co.bird.android.app.feature.map.cluster;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LfM2;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BaseBirdMarkerClusterManager$init$3 extends Lambda implements Function1<C40889fM2, Unit> {
    final /* synthetic */ BaseBirdMarkerClusterManager<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBirdMarkerClusterManager$init$3(BaseBirdMarkerClusterManager<T> baseBirdMarkerClusterManager) {
        super(1);
        this.this$0 = baseBirdMarkerClusterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
        invoke2(c40889fM2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C40889fM2 it) {
        this.this$0.getClusterManager().mo27414b(it);
        BaseBirdMarkerClusterManager<T> baseBirdMarkerClusterManager = this.this$0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        baseBirdMarkerClusterManager.notifyInfoWindowClickListener(it);
    }
}
