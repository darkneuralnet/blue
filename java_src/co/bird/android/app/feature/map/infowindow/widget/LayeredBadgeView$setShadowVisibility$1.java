package co.bird.android.app.feature.map.infowindow.widget;

import android.widget.ImageView;
import co.bird.android.app.feature.map.renderer.ShadowInitParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "it", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LayeredBadgeView$setShadowVisibility$1 extends Lambda implements Function1<ImageView, ShadowInitParams> {
    final /* synthetic */ LayeredBadgeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayeredBadgeView$setShadowVisibility$1(LayeredBadgeView layeredBadgeView) {
        super(1);
        this.this$0 = layeredBadgeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ShadowInitParams invoke(ImageView it) {
        ShadowInitParams computeShadowParams;
        Intrinsics.checkNotNullParameter(it, "it");
        computeShadowParams = this.this$0.computeShadowParams(it);
        return computeShadowParams;
    }
}
