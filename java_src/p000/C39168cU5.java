package p000;

import co.bird.android.model.Point;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005H\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/Point;", "Lcom/google/android/gms/maps/model/LatLng;", "b", "Lco/bird/android/model/wire/WireLocation;", "c", "LBj6;", "", C17296a.f69688o, "suggest-a-nest_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: cU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39168cU5 {
    /* renamed from: a */
    public static final boolean m61283a(EnumC31934Bj6 enumC31934Bj6) {
        return enumC31934Bj6 == EnumC31934Bj6.VALID;
    }

    /* renamed from: b */
    public static final LatLng m61282b(Point point) {
        return new LatLng(point.f66612y, point.f66611x);
    }

    /* renamed from: c */
    public static final LatLng m61281c(WireLocation wireLocation) {
        return new LatLng(wireLocation.getLatitude(), wireLocation.getLongitude());
    }
}
