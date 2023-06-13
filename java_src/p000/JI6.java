package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneDetail;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneFlightSheetIcon;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import co.bird.android.model.wire.WireThemedColors;
import co.bird.android.model.wire.WireZoneDetail;
import co.bird.android.model.wire.WireZoneDetails;
import co.bird.android.model.wire.WireZoneFlightSheetDetails;
import co.bird.android.model.wire.WireZoneFlightSheetIcon;
import co.bird.android.model.wire.WireZoneStatus;
import co.bird.android.model.wire.WireZoneSummary;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneFlightSheetDetails;", "", "zoneId", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", C17296a.f69688o, "Lco/bird/android/model/wire/WireZoneSummary;", "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;", "f", "Lco/bird/android/model/wire/WireZoneStatus;", "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "e", "Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireZoneDetails;", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;", "c", "Lco/bird/android/model/wire/WireZoneDetail;", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;", "b", "zone_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneFlightSheetConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetConversions.kt\nco/bird/android/repository/zone/conversion/ZoneFlightSheetConversionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetConversions.kt\nco/bird/android/repository/zone/conversion/ZoneFlightSheetConversionsKt\n*L\n22#1:69\n22#1:70,3\n55#1:73\n55#1:74,3\n*E\n"})
/* renamed from: JI6 */
/* loaded from: classes4.dex */
public final class JI6 {
    /* renamed from: a */
    public static final ZoneFlightSheetDetails m100721a(WireZoneFlightSheetDetails wireZoneFlightSheetDetails, String zoneId) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireZoneFlightSheetDetails, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ZoneSummary m100716f = m100716f(wireZoneFlightSheetDetails.getZoneSummary());
        ZoneStatus m100717e = m100717e(wireZoneFlightSheetDetails.getZoneStatus());
        List<WireZoneDetails> detailSections = wireZoneFlightSheetDetails.getDetailSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(detailSections, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireZoneDetails wireZoneDetails : detailSections) {
            arrayList.add(m100719c(wireZoneDetails));
        }
        return new ZoneFlightSheetDetails(zoneId, m100716f, m100717e, arrayList);
    }

    /* renamed from: b */
    public static final ZoneDetail m100720b(WireZoneDetail wireZoneDetail) {
        ZoneFlightSheetIcon zoneFlightSheetIcon;
        Intrinsics.checkNotNullParameter(wireZoneDetail, "<this>");
        String title = wireZoneDetail.getTitle();
        String details = wireZoneDetail.getDetails();
        String description = wireZoneDetail.getDescription();
        WireZoneFlightSheetIcon icon = wireZoneDetail.getIcon();
        if (icon != null) {
            zoneFlightSheetIcon = m100718d(icon);
        } else {
            zoneFlightSheetIcon = null;
        }
        return new ZoneDetail(title, details, description, zoneFlightSheetIcon, wireZoneDetail.getColoredIcon());
    }

    /* renamed from: c */
    public static final ZoneDetails m100719c(WireZoneDetails wireZoneDetails) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireZoneDetails, "<this>");
        int idx = wireZoneDetails.getIdx();
        String title = wireZoneDetails.getTitle();
        List<WireZoneDetail> details = wireZoneDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireZoneDetail wireZoneDetail : details) {
            arrayList.add(m100720b(wireZoneDetail));
        }
        return new ZoneDetails(idx, title, arrayList);
    }

    /* renamed from: d */
    public static final ZoneFlightSheetIcon m100718d(WireZoneFlightSheetIcon wireZoneFlightSheetIcon) {
        Intrinsics.checkNotNullParameter(wireZoneFlightSheetIcon, "<this>");
        return new ZoneFlightSheetIcon(wireZoneFlightSheetIcon.getIcon(), C47311qB0.m17961f(wireZoneFlightSheetIcon.getIconColor()));
    }

    /* renamed from: e */
    public static final ZoneStatus m100717e(WireZoneStatus wireZoneStatus) {
        ZoneFlightSheetIcon zoneFlightSheetIcon;
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireZoneStatus, "<this>");
        int idx = wireZoneStatus.getIdx();
        String title = wireZoneStatus.getTitle();
        String details = wireZoneStatus.getDetails();
        WireZoneFlightSheetIcon icon = wireZoneStatus.getIcon();
        if (icon != null) {
            zoneFlightSheetIcon = m100718d(icon);
        } else {
            zoneFlightSheetIcon = null;
        }
        ColoredIcon coloredIcon = wireZoneStatus.getColoredIcon();
        WireThemedColors iconBackgroundColor = wireZoneStatus.getIconBackgroundColor();
        if (iconBackgroundColor != null) {
            themedColors = C47311qB0.m17961f(iconBackgroundColor);
        } else {
            themedColors = null;
        }
        return new ZoneStatus(idx, title, details, zoneFlightSheetIcon, coloredIcon, themedColors);
    }

    /* renamed from: f */
    public static final ZoneSummary m100716f(WireZoneSummary wireZoneSummary) {
        Intrinsics.checkNotNullParameter(wireZoneSummary, "<this>");
        return new ZoneSummary(wireZoneSummary.getIdx(), wireZoneSummary.getTitle());
    }
}
