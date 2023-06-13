package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$listenForAreaUpdates$7 extends Lambda implements Function1<Pair<? extends List<? extends LatLng>, ? extends Float>, Unit> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$listenForAreaUpdates$7(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends LatLng>, ? extends Float> pair) {
        invoke2((Pair<? extends List<LatLng>, Float>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends List<LatLng>, Float> pair) {
        MapUi mapUi;
        float floatValue = pair.component2().floatValue();
        mapUi = this.this$0.f61617ui;
        mapUi.updateAreasUi(floatValue, pair.component1());
    }
}
