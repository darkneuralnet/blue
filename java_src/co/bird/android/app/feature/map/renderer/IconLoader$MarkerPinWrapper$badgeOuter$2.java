package co.bird.android.app.feature.map.renderer;

import android.widget.ImageView;
import co.bird.android.app.feature.map.renderer.IconLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class IconLoader$MarkerPinWrapper$badgeOuter$2 extends Lambda implements Function0<ImageView> {
    final /* synthetic */ IconLoader.MarkerPinWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconLoader$MarkerPinWrapper$badgeOuter$2(IconLoader.MarkerPinWrapper markerPinWrapper) {
        super(0);
        this.this$0 = markerPinWrapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        return (ImageView) C49520tu6.m11238m(this.this$0.getView(), C31680Ah4.badgeOuter);
    }
}
