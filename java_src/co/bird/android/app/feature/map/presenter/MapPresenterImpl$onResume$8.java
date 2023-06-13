package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.model.persistence.Area;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1789#2,3:624\n*S KotlinDebug\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$8\n*L\n208#1:624,3\n*E\n"})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$8 extends Lambda implements Function1<LatLng, Boolean> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$8(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LatLng point) {
        InterfaceC12495bn interfaceC12495bn;
        Intrinsics.checkNotNullParameter(point, "point");
        interfaceC12495bn = this.this$0.areaManager;
        Boolean bool = Boolean.TRUE;
        for (Area area : interfaceC12495bn.mo63995r().m73665a()) {
            bool = Boolean.valueOf(bool.booleanValue() && !GoogleMap_Kt.contains(area, point.f71430b, point.f71431c));
        }
        return bool;
    }
}
