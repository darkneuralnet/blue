package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lps6;", "invoke", "()Lps6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterRenderer$selectedBinding$2 extends Lambda implements Function0<C47129ps6> {
    final /* synthetic */ WarehouseMarkerClusterRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarehouseMarkerClusterRenderer$selectedBinding$2(WarehouseMarkerClusterRenderer warehouseMarkerClusterRenderer) {
        super(0);
        this.this$0 = warehouseMarkerClusterRenderer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C47129ps6 invoke() {
        Context context;
        context = this.this$0.context;
        return C47129ps6.m18572a(C47722qs6.m16818c(C40788fB0.m41772j(context)).getRoot());
    }
}
