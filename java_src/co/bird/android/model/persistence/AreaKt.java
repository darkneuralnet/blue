package co.bird.android.model.persistence;

import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"TEST_AREA", "Lco/bird/android/model/persistence/Area;", "getTEST_AREA", "()Lco/bird/android/model/persistence/Area;", "model-persistence_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AreaKt {
    private static final Area TEST_AREA;

    static {
        AreaIconType areaIconType = AreaIconType.UNKNOWN;
        Polygon polygon = new Polygon();
        ZoomBehavior zoomBehavior = ZoomBehavior.ALWAYS_VISIBLE;
        DateTime now = DateTime.now();
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        TEST_AREA = new Area("", null, null, null, false, false, false, false, false, false, false, false, bool, null, null, areaIconType, null, null, polygon, 0, null, 0, null, 0, null, zoomBehavior, false, null, null, null, null, null, null, null, null, areaIconType, areaIconType, areaIconType, null, null, null, false, null, null, null, null, null, null, "", now, null, bool);
    }

    public static final Area getTEST_AREA() {
        return TEST_AREA;
    }
}
