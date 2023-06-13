package p000;

import co.bird.android.model.persistence.nestedstructures.Coordinate;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Coordinate;", "Lcom/google/android/gms/maps/model/LatLng;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: LB0 */
/* loaded from: classes3.dex */
public final class LB0 {
    /* renamed from: a */
    public static final LatLng m97610a(Coordinate coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "<this>");
        return new LatLng(coordinate.getLatitude(), coordinate.getLongitude());
    }
}
