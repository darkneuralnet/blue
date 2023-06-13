package co.bird.android.app.feature.map.p008ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "marker", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$destinationFlagClicks$1 */
/* loaded from: classes2.dex */
public final class MapUiImpl$destinationFlagClicks$1 extends Lambda implements Function1<C40889fM2, Boolean> {
    final /* synthetic */ MapUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl$destinationFlagClicks$1(MapUiImpl mapUiImpl) {
        super(1);
        this.this$0 = mapUiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C40889fM2 marker) {
        C40889fM2 destinationMarker;
        Intrinsics.checkNotNullParameter(marker, "marker");
        String m41533a = marker.m41533a();
        destinationMarker = this.this$0.getDestinationMarker();
        return Boolean.valueOf(Intrinsics.areEqual(m41533a, destinationMarker.m41533a()));
    }
}
