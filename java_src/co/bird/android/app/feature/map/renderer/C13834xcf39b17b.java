package co.bird.android.app.feature.map.renderer;

import android.graphics.PointF;
import android.util.LruCache;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.persistence.BirdMapMarker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "anchor", "Landroid/graphics/PointF;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$2 */
/* loaded from: classes2.dex */
public final class C13834xcf39b17b extends Lambda implements Function1<PointF, Unit> {
    final /* synthetic */ BirdMarkerClusterItem<BirdMapMarker> $this_createBitmapDescriptor;
    final /* synthetic */ BirdMarkerClusterItemOptionProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13834xcf39b17b(BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider, BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        super(1);
        this.this$0 = birdMarkerClusterItemOptionProvider;
        this.$this_createBitmapDescriptor = birdMarkerClusterItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointF pointF) {
        invoke2(pointF);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PointF anchor) {
        LruCache lruCache;
        String anchorKey;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        lruCache = this.this$0.anchorCache;
        anchorKey = this.this$0.getAnchorKey(this.$this_createBitmapDescriptor);
        C50896wE2.m7191b(lruCache, anchorKey, anchor);
    }
}
