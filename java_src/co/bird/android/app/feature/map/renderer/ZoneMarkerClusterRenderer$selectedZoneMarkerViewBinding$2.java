package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lrs6;", "invoke", "()Lrs6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2 extends Lambda implements Function0<C48315rs6> {
    final /* synthetic */ ZoneMarkerClusterRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2(ZoneMarkerClusterRenderer zoneMarkerClusterRenderer) {
        super(0);
        this.this$0 = zoneMarkerClusterRenderer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C48315rs6 invoke() {
        Context context;
        context = this.this$0.context;
        return C48315rs6.m15145a(C48907ss6.m13557c(C40788fB0.m41772j(context)).getRoot());
    }
}
