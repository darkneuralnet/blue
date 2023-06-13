package p000;

import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.update.BirdMapMarkerUpdate;
import co.bird.android.model.wire.WireBirdLabel;
import co.bird.android.model.wire.WireOperatorBirdMapMarker;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorBirdMapMarker;", "", "filterHash", "Lco/bird/android/model/persistence/BirdMapMarker;", C17296a.f69688o, "Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;", "b", "bird_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: IM */
/* loaded from: classes4.dex */
public final class C3514IM {
    /* renamed from: a */
    public static final BirdMapMarker m102461a(WireOperatorBirdMapMarker wireOperatorBirdMapMarker, String filterHash) {
        Intrinsics.checkNotNullParameter(wireOperatorBirdMapMarker, "<this>");
        Intrinsics.checkNotNullParameter(filterHash, "filterHash");
        String id = wireOperatorBirdMapMarker.getId();
        int batteryLevel = wireOperatorBirdMapMarker.getBatteryLevel();
        Geolocation m17966a = C47311qB0.m17966a(wireOperatorBirdMapMarker.getLocation());
        String code = wireOperatorBirdMapMarker.getCode();
        FleetMarker m17965b = C47311qB0.m17965b(wireOperatorBirdMapMarker.getFleetMarker());
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return new BirdMapMarker(id, batteryLevel, m17966a, code, m17965b, filterHash, now);
    }

    /* renamed from: b */
    public static final BirdMapMarkerUpdate m102460b(WireOperatorBirdMapMarker wireOperatorBirdMapMarker) {
        Intrinsics.checkNotNullParameter(wireOperatorBirdMapMarker, "<this>");
        return new BirdMapMarkerUpdate(wireOperatorBirdMapMarker.getId(), wireOperatorBirdMapMarker.getBatteryLevel(), C47311qB0.m17966a(wireOperatorBirdMapMarker.getLocation()), wireOperatorBirdMapMarker.getCode(), C10235ZK.m73312b(new WireBirdLabel(null, 0, null, null, null, 31, null)));
    }
}
