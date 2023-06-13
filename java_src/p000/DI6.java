package p000;

import co.bird.android.model.Point;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "Lco/bird/android/model/Point;", "point", "", C17296a.f69688o, "co.bird.android.lib.persistence.zone.api"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: DI6 */
/* loaded from: classes4.dex */
public final class DI6 {
    /* renamed from: a */
    public static final boolean m110597a(LatLngBounds latLngBounds, Point point) {
        Intrinsics.checkNotNullParameter(latLngBounds, "<this>");
        return latLngBounds.m50669u(new LatLng(point.f66612y, point.f66611x));
    }
}
