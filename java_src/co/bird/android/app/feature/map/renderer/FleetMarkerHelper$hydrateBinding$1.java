package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class FleetMarkerHelper$hydrateBinding$1 extends Lambda implements Function0<Drawable> {
    final /* synthetic */ FleetMarkerHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerHelper$hydrateBinding$1(FleetMarkerHelper fleetMarkerHelper) {
        super(0);
        this.this$0 = fleetMarkerHelper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Context context;
        context = this.this$0.context;
        return NA0.m94299e(context, C48193rg4.ic_scooter);
    }
}
