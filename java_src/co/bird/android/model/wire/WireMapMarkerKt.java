package co.bird.android.model.wire;

import co.bird.android.model.constant.MapMarkerKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"kind", "Lco/bird/android/model/constant/MapMarkerKind;", "Lco/bird/android/model/wire/WireMapMarker;", "getKind", "(Lco/bird/android/model/wire/WireMapMarker;)Lco/bird/android/model/constant/MapMarkerKind;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMapMarkerKt {
    public static final MapMarkerKind getKind(WireMapMarker wireMapMarker) {
        Intrinsics.checkNotNullParameter(wireMapMarker, "<this>");
        return MapMarkerKind.Companion.from(wireMapMarker.getIcon());
    }
}
