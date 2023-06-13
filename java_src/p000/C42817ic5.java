package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "", "mapViewHeight", "", C17296a.f69688o, "(Lcom/google/android/gms/maps/MapView;Ljava/lang/Integer;)V", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ic5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42817ic5 {
    /* renamed from: a */
    public static final void m33750a(MapView mapView, Integer num) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        if (num != null) {
            mapView.getLayoutParams().height = num.intValue();
            mapView.setLayoutParams(mapView.getLayoutParams());
        }
    }
}
