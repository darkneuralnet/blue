package co.bird.android.app.feature.map.renderer.nestmarker;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterItem;
import co.bird.android.model.constant.NestIcon;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class NestMarkerClusterRenderer$bitmapDescriptor$drawable$1 extends Lambda implements Function0<Drawable> {
    final /* synthetic */ NestMarkerClusterItem $this_bitmapDescriptor;
    final /* synthetic */ NestMarkerClusterRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerClusterRenderer$bitmapDescriptor$drawable$1(NestMarkerClusterItem nestMarkerClusterItem, NestMarkerClusterRenderer nestMarkerClusterRenderer) {
        super(0);
        this.$this_bitmapDescriptor = nestMarkerClusterItem;
        this.this$0 = nestMarkerClusterRenderer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Context context;
        Context context2;
        Drawable mutate;
        if (this.$this_bitmapDescriptor.getClaimedProgress() <= 0) {
            NestIcon icon = this.$this_bitmapDescriptor.getMarker().getIcon();
            if (icon != null) {
                context = this.this$0.context;
                return S33.m86052a(icon, context);
            }
            return null;
        }
        context2 = this.this$0.context;
        Drawable m94299e = NA0.m94299e(context2, C48193rg4.ic_filled_clock);
        if (m94299e == null || (mutate = m94299e.mutate()) == null) {
            return null;
        }
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        return mutate;
    }
}
