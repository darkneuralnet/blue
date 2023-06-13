package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$centerLocationChanged$1 */
/* loaded from: classes2.dex */
public final class MapUiImpl$centerLocationChanged$1 extends Lambda implements Function1<Unit, LatLng> {
    final /* synthetic */ MapUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl$centerLocationChanged$1(MapUiImpl mapUiImpl) {
        super(1);
        this.this$0 = mapUiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LatLng invoke(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.getMap().m61679i().f71394b;
    }
}
