package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.FleetIconAnimation;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.Coordinate;
import co.bird.android.model.persistence.nestedstructures.FleetMarkerPinShape;
import co.bird.android.model.persistence.nestedstructures.FormattedFlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Icon;
import co.bird.android.model.persistence.nestedstructures.MultiSelectFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.persistence.nestedstructures.OperatorMapMultiSelectFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorMapRangeSelectFilter;
import co.bird.android.model.persistence.nestedstructures.RangeSelectFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireCoordinate;
import co.bird.android.model.wire.WireFleetMarker;
import co.bird.android.model.wire.WireFormattedFlightSheetDetail;
import co.bird.android.model.wire.WireIcon;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMultiSelectFilterOption;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.android.model.wire.WireOperatorMapMultiSelectFilter;
import co.bird.android.model.wire.WireOperatorMapRangeSelectFilter;
import co.bird.android.model.wire.WireRangeSelectFilterOption;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0019\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u001c\u001a\n\u0010!\u001a\u00020 *\u00020\u001f¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireThemedColors;", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "f", "Lco/bird/android/model/wire/WireLocation;", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", C17296a.f69688o, "g", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "i", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;", "Lco/bird/android/model/wire/WireOperatorMapMultiSelectFilter;", "j", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;", "Lco/bird/android/model/wire/WireOperatorMapRangeSelectFilter;", "k", "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;", "Lco/bird/android/model/wire/WireMultiSelectFilterOption;", "h", "Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;", "Lco/bird/android/model/wire/WireRangeSelectFilterOption;", "l", "Lco/bird/android/model/wire/WireIcon;", "Lco/bird/android/model/persistence/nestedstructures/Icon;", "e", "Lco/bird/android/model/wire/WireCoordinate;", "Lco/bird/android/model/persistence/nestedstructures/Coordinate;", "c", "Lco/bird/android/model/wire/WireFormattedFlightSheetDetail;", "Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireFleetMarker;", "Lco/bird/android/model/persistence/FleetMarker;", "b", "co.bird.android.repository.common"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Conversions.kt\nco/bird/android/repository/common/ConversionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1549#2:136\n1620#2,3:137\n1549#2:140\n1620#2,3:141\n1#3:144\n*S KotlinDebug\n*F\n+ 1 Conversions.kt\nco/bird/android/repository/common/ConversionsKt\n*L\n66#1:136\n66#1:137,3\n67#1:140\n67#1:141,3\n*E\n"})
/* renamed from: qB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47311qB0 {
    /* renamed from: a */
    public static final Geolocation m17966a(WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(wireLocation, "<this>");
        return new Geolocation(wireLocation.getLatitude(), wireLocation.getLongitude(), wireLocation.getHeading(), wireLocation.getSpeed(), wireLocation.getAltitude(), wireLocation.getAccuracy(), wireLocation.getMocked(), wireLocation.getTimestamp(), wireLocation.getSource());
    }

    /* renamed from: b */
    public static final FleetMarker m17965b(WireFleetMarker wireFleetMarker) {
        FleetMarkerPinShape fleetMarkerPinShape;
        FleetIconAnimation fleetIconAnimation;
        Intrinsics.checkNotNullParameter(wireFleetMarker, "<this>");
        ClientIcon fleetIcon = wireFleetMarker.getFleetIcon();
        ThemedColors m17961f = m17961f(wireFleetMarker.getStandardPinColor());
        ThemedColors m17961f2 = m17961f(wireFleetMarker.getBackgroundPinColor());
        ThemedColors m17961f3 = m17961f(wireFleetMarker.getIconColor());
        int prominence = wireFleetMarker.getProminence();
        String shape = wireFleetMarker.getShape();
        if (shape == null || (fleetMarkerPinShape = FleetMarkerPinShape.valueOf(shape)) == null) {
            fleetMarkerPinShape = FleetMarkerPinShape.CIRCLE;
        }
        FleetMarkerPinShape fleetMarkerPinShape2 = fleetMarkerPinShape;
        String iconAnimation = wireFleetMarker.getIconAnimation();
        if (iconAnimation == null || (fleetIconAnimation = FleetIconAnimation.Companion.fromString(iconAnimation)) == null) {
            fleetIconAnimation = FleetIconAnimation.UNKNOWN;
        }
        return new FleetMarker(fleetIcon, m17961f, m17961f2, m17961f3, prominence, fleetMarkerPinShape2, fleetIconAnimation, wireFleetMarker.getOpacity(), wireFleetMarker.getLabel());
    }

    /* renamed from: c */
    public static final Coordinate m17964c(WireCoordinate wireCoordinate) {
        Intrinsics.checkNotNullParameter(wireCoordinate, "<this>");
        return new Coordinate(wireCoordinate.getLatitude(), wireCoordinate.getLongitude());
    }

    /* renamed from: d */
    public static final FormattedFlightSheetDetail m17963d(WireFormattedFlightSheetDetail wireFormattedFlightSheetDetail) {
        Intrinsics.checkNotNullParameter(wireFormattedFlightSheetDetail, "<this>");
        return new FormattedFlightSheetDetail(wireFormattedFlightSheetDetail.getTitle(), wireFormattedFlightSheetDetail.getDetail(), wireFormattedFlightSheetDetail.getFormat());
    }

    /* renamed from: e */
    public static final Icon m17962e(WireIcon wireIcon) {
        Intrinsics.checkNotNullParameter(wireIcon, "<this>");
        return new Icon(wireIcon.getIcon(), m17961f(wireIcon.getColor()));
    }

    /* renamed from: f */
    public static final ThemedColors m17961f(WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(wireThemedColors, "<this>");
        return new ThemedColors(wireThemedColors.getLightMode(), wireThemedColors.getDarkMode());
    }

    /* renamed from: g */
    public static final WireLocation m17960g(Geolocation geolocation) {
        Intrinsics.checkNotNullParameter(geolocation, "<this>");
        double latitude = geolocation.getLatitude();
        double longitude = geolocation.getLongitude();
        Double heading = geolocation.getHeading();
        Double speed = geolocation.getSpeed();
        Double altitude = geolocation.getAltitude();
        Double accuracy = geolocation.getAccuracy();
        boolean mocked = geolocation.getMocked();
        DateTime time = geolocation.getTime();
        String source = geolocation.getSource();
        if (source == null) {
            source = "";
        }
        return new WireLocation(latitude, longitude, heading, speed, altitude, accuracy, mocked, time, source);
    }

    /* renamed from: h */
    public static final WireMultiSelectFilterOption m17959h(MultiSelectFilterOption multiSelectFilterOption) {
        Intrinsics.checkNotNullParameter(multiSelectFilterOption, "<this>");
        return new WireMultiSelectFilterOption(multiSelectFilterOption.getSelections());
    }

    /* renamed from: i */
    public static final WireOperatorMapFilterBundle m17958i(OperatorMapFilterBundle operatorMapFilterBundle) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(operatorMapFilterBundle, "<this>");
        List<OperatorMapMultiSelectFilter> multiSelectFilters = operatorMapFilterBundle.getMultiSelectFilters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(multiSelectFilters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OperatorMapMultiSelectFilter operatorMapMultiSelectFilter : multiSelectFilters) {
            arrayList.add(m17957j(operatorMapMultiSelectFilter));
        }
        List<OperatorMapRangeSelectFilter> rangeSelectFilters = operatorMapFilterBundle.getRangeSelectFilters();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(rangeSelectFilters, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (OperatorMapRangeSelectFilter operatorMapRangeSelectFilter : rangeSelectFilters) {
            arrayList2.add(m17956k(operatorMapRangeSelectFilter));
        }
        return new WireOperatorMapFilterBundle(arrayList, arrayList2, operatorMapFilterBundle.getToggleFilters());
    }

    /* renamed from: j */
    public static final WireOperatorMapMultiSelectFilter m17957j(OperatorMapMultiSelectFilter operatorMapMultiSelectFilter) {
        Intrinsics.checkNotNullParameter(operatorMapMultiSelectFilter, "<this>");
        return new WireOperatorMapMultiSelectFilter(operatorMapMultiSelectFilter.getId(), m17959h(operatorMapMultiSelectFilter.getOptions()));
    }

    /* renamed from: k */
    public static final WireOperatorMapRangeSelectFilter m17956k(OperatorMapRangeSelectFilter operatorMapRangeSelectFilter) {
        Intrinsics.checkNotNullParameter(operatorMapRangeSelectFilter, "<this>");
        return new WireOperatorMapRangeSelectFilter(operatorMapRangeSelectFilter.getId(), m17955l(operatorMapRangeSelectFilter.getOptions()), operatorMapRangeSelectFilter.getLogicOperator());
    }

    /* renamed from: l */
    public static final WireRangeSelectFilterOption m17955l(RangeSelectFilterOption rangeSelectFilterOption) {
        Intrinsics.checkNotNullParameter(rangeSelectFilterOption, "<this>");
        return new WireRangeSelectFilterOption(rangeSelectFilterOption.getStart(), rangeSelectFilterOption.getEnd());
    }
}
