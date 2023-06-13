package co.bird.android.app.feature.map.cluster;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class AbstractMarkerClusterManager$init$2 extends AdaptedFunctionReference implements Function1<C40889fM2, Unit> {
    public AbstractMarkerClusterManager$init$2(Object obj) {
        super(1, obj, C33116Gl0.class, "onMarkerClick", "onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
        invoke2(c40889fM2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C40889fM2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((C33116Gl0) this.receiver).mo27413c(p0);
    }
}
