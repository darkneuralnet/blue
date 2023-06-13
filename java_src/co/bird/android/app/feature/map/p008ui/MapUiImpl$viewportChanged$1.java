package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$viewportChanged$1 */
/* loaded from: classes2.dex */
public final class MapUiImpl$viewportChanged$1 extends Lambda implements Function1<Unit, Pair<? extends List<? extends LatLng>, ? extends Float>> {
    final /* synthetic */ MapUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl$viewportChanged$1(MapUiImpl mapUiImpl) {
        super(1);
        this.this$0 = mapUiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<List<LatLng>, Float> invoke(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<LatLng> latLngViewport = this.this$0.latLngViewport();
        Float m59035e = this.this$0.getZoomLevelObservable().m73665a().m59035e();
        return TuplesKt.m28425to(latLngViewport, Float.valueOf(m59035e != null ? m59035e.floatValue() : 17.0f));
    }
}
