package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.nestedstructures.Icon;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRenderer$bitmapDescriptor$icon$1$1 extends Lambda implements Function0<Drawable> {
    final /* synthetic */ Icon $icon;
    final /* synthetic */ ZoneMarkerClusterRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerClusterRenderer$bitmapDescriptor$icon$1$1(Icon icon, ZoneMarkerClusterRenderer zoneMarkerClusterRenderer) {
        super(0);
        this.$icon = icon;
        this.this$0 = zoneMarkerClusterRenderer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Context context;
        ClientIcon icon = this.$icon.getIcon();
        context = this.this$0.context;
        return C33341Hk0.m103484a(icon, context);
    }
}
