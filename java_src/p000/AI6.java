package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.ZoneData;
import co.bird.android.model.persistence.ZoneRegion;
import co.bird.android.model.persistence.nestedstructures.Icon;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotationLabel;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import co.bird.android.model.wire.WireIcon;
import co.bird.android.model.wire.WireZoneAnnotation;
import co.bird.android.model.wire.WireZoneAnnotationLabel;
import co.bird.android.model.wire.WireZoneData;
import co.bird.android.model.wire.WireZoneOverlay;
import co.bird.android.model.wire.WireZoneRegion;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneRegion;", "Lco/bird/android/model/persistence/ZoneRegion;", "b", "Lco/bird/android/model/wire/WireZoneData;", "Lco/bird/android/model/persistence/ZoneData;", C17296a.f69688o, "Lco/bird/android/model/wire/WireZoneOverlay;", "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "e", "Lco/bird/android/model/wire/WireZoneAnnotation;", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "c", "Lco/bird/android/model/wire/WireZoneAnnotationLabel;", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;", DateTokenConverter.CONVERTER_KEY, "zone_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: AI6 */
/* loaded from: classes4.dex */
public final class AI6 {
    /* renamed from: a */
    public static final ZoneData m115927a(WireZoneData wireZoneData) {
        ZoneAnnotation zoneAnnotation;
        Intrinsics.checkNotNullParameter(wireZoneData, "<this>");
        String zoneId = wireZoneData.getZoneId();
        ZoneOverlay m115923e = m115923e(wireZoneData.getOverlay());
        WireZoneAnnotation annotation = wireZoneData.getAnnotation();
        if (annotation != null) {
            zoneAnnotation = m115925c(annotation);
        } else {
            zoneAnnotation = null;
        }
        OperatorMapZoneSelectability selectability = wireZoneData.getSelectability();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return new ZoneData(zoneId, m115923e, zoneAnnotation, selectability, now);
    }

    /* renamed from: b */
    public static final ZoneRegion m115926b(WireZoneRegion wireZoneRegion) {
        Intrinsics.checkNotNullParameter(wireZoneRegion, "<this>");
        String zoneId = wireZoneRegion.getZoneId();
        Polygon region = wireZoneRegion.getRegion();
        Point centerPoint = wireZoneRegion.getCenterPoint();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return new ZoneRegion(zoneId, region, centerPoint, now);
    }

    /* renamed from: c */
    public static final ZoneAnnotation m115925c(WireZoneAnnotation wireZoneAnnotation) {
        ZoneAnnotationLabel zoneAnnotationLabel;
        Icon icon;
        Intrinsics.checkNotNullParameter(wireZoneAnnotation, "<this>");
        ThemedColors m17961f = C47311qB0.m17961f(wireZoneAnnotation.getColor());
        ThemedColors m17961f2 = C47311qB0.m17961f(wireZoneAnnotation.getBorderColor());
        WireZoneAnnotationLabel label = wireZoneAnnotation.getLabel();
        if (label != null) {
            zoneAnnotationLabel = m115924d(label);
        } else {
            zoneAnnotationLabel = null;
        }
        WireIcon icon2 = wireZoneAnnotation.getIcon();
        if (icon2 != null) {
            icon = C47311qB0.m17962e(icon2);
        } else {
            icon = null;
        }
        return new ZoneAnnotation(m17961f, m17961f2, zoneAnnotationLabel, icon, wireZoneAnnotation.getColoredIcon());
    }

    /* renamed from: d */
    public static final ZoneAnnotationLabel m115924d(WireZoneAnnotationLabel wireZoneAnnotationLabel) {
        Intrinsics.checkNotNullParameter(wireZoneAnnotationLabel, "<this>");
        return new ZoneAnnotationLabel(wireZoneAnnotationLabel.getText(), C47311qB0.m17961f(wireZoneAnnotationLabel.getColor()));
    }

    /* renamed from: e */
    public static final ZoneOverlay m115923e(WireZoneOverlay wireZoneOverlay) {
        Intrinsics.checkNotNullParameter(wireZoneOverlay, "<this>");
        return new ZoneOverlay(C47311qB0.m17961f(wireZoneOverlay.getColor()), C47311qB0.m17961f(wireZoneOverlay.getBorderColor()));
    }
}
