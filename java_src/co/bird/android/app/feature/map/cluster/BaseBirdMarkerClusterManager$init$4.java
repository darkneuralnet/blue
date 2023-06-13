package co.bird.android.app.feature.map.cluster;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014 \u0006*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "T", "overrideId", "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BaseBirdMarkerClusterManager$init$4 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ BaseBirdMarkerClusterManager<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBirdMarkerClusterManager$init$4(BaseBirdMarkerClusterManager<T> baseBirdMarkerClusterManager) {
        super(1);
        this.this$0 = baseBirdMarkerClusterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String overrideId) {
        UnreadyMarkerOverrides markerOverrides = this.this$0.getMarkerOverrides();
        Intrinsics.checkNotNullExpressionValue(overrideId, "overrideId");
        if (markerOverrides.ready(overrideId)) {
            this.this$0.reload();
        } else {
            this.this$0.setOverrideReadyToRender(overrideId);
        }
    }
}
