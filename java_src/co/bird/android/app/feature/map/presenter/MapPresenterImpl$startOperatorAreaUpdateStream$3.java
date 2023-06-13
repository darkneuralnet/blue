package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00010\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bH\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "Lkotlin/Triple;", "Landroid/location/Location;", "", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startOperatorAreaUpdateStream$3 extends Lambda implements Function1<Pair<? extends Location, ? extends Double>, Triple<? extends Location, ? extends Double, ? extends List<? extends Geolocation>>> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$startOperatorAreaUpdateStream$3(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Triple<? extends Location, ? extends Double, ? extends List<? extends Geolocation>> invoke(Pair<? extends Location, ? extends Double> pair) {
        return invoke2((Pair<? extends Location, Double>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Triple<Location, Double, List<Geolocation>> invoke2(Pair<? extends Location, Double> pair) {
        MapUi mapUi;
        double nearbyRadius;
        MapUi mapUi2;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        Location component1 = pair.component1();
        Double component2 = pair.component2();
        if (component2 != null) {
            nearbyRadius = component2.doubleValue();
        } else {
            mapUi = this.this$0.f61617ui;
            nearbyRadius = mapUi.nearbyRadius();
        }
        Double valueOf = Double.valueOf(nearbyRadius);
        mapUi2 = this.this$0.f61617ui;
        return new Triple<>(component1, valueOf, mapUi2.viewport());
    }
}
