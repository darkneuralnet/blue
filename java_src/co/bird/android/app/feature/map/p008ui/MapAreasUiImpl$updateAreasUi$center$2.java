package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,681:1\n1855#2,2:682\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2\n*L\n368#1:682,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$updateAreasUi$center$2 */
/* loaded from: classes2.dex */
public final class MapAreasUiImpl$updateAreasUi$center$2 extends Lambda implements Function0<Location> {
    final /* synthetic */ List<LatLng> $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAreasUiImpl$updateAreasUi$center$2(List<LatLng> list) {
        super(0);
        this.$viewport = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Location invoke() {
        Double d;
        Double d2;
        Double d3;
        LatLng latLng;
        List<LatLng> list = this.$viewport;
        Double d4 = null;
        if (list != null) {
            d = null;
            d2 = null;
            d3 = null;
            for (LatLng latLng2 : list) {
                if (d4 == null || latLng2.f71430b > d4.doubleValue()) {
                    d4 = Double.valueOf(latLng2.f71430b);
                }
                if (d == null || latLng2.f71430b < d.doubleValue()) {
                    d = Double.valueOf(latLng2.f71430b);
                }
                if (d2 == null || latLng2.f71431c > d2.doubleValue()) {
                    d2 = Double.valueOf(latLng2.f71431c);
                }
                if (d3 == null || latLng2.f71431c < d3.doubleValue()) {
                    d3 = Double.valueOf(latLng2.f71431c);
                }
            }
        } else {
            d = null;
            d2 = null;
            d3 = null;
        }
        if (d4 != null) {
            Intrinsics.checkNotNull(d);
            Intrinsics.checkNotNull(d3);
            double doubleValue = d3.doubleValue();
            Intrinsics.checkNotNull(d2);
            latLng = new LatLng((d.doubleValue() + d4.doubleValue()) / 2.0d, (doubleValue + d2.doubleValue()) / 2.0d);
        } else {
            latLng = new LatLng(0.0d, 0.0d);
        }
        return C39339cm2.m60884e(latLng);
    }
}
