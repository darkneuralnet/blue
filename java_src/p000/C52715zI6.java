package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedZoneReservation;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import co.bird.android.model.wire.WireThemedColors;
import co.bird.android.model.wire.WireZoneAssignmentCappedReservationGroup;
import co.bird.android.model.wire.WireZoneAssignmentCappedZoneReservation;
import co.bird.android.model.wire.WireZoneAssignmentGroup;
import co.bird.android.model.wire.WireZoneAssignmentReleaseAssignment;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAssignmentGroup;", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", C17296a.f69688o, "Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;", "b", "Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;", "c", "co.bird.android.repository.release-assignment"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneAssignmentGroupConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneAssignmentGroupConversion.kt\nco/bird/android/repository/releaseassignment/converters/ZoneAssignmentGroupConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1549#2:58\n1620#2,3:59\n1549#2:62\n1620#2,3:63\n1549#2:66\n1620#2,3:67\n*S KotlinDebug\n*F\n+ 1 ZoneAssignmentGroupConversion.kt\nco/bird/android/repository/releaseassignment/converters/ZoneAssignmentGroupConversionKt\n*L\n19#1:58\n19#1:59,3\n20#1:62\n20#1:63,3\n45#1:66\n45#1:67,3\n*E\n"})
/* renamed from: zI6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52715zI6 {
    /* renamed from: a */
    public static final ZoneAssignmentGroup m1550a(WireZoneAssignmentGroup wireZoneAssignmentGroup) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireZoneAssignmentGroup, "<this>");
        String title = wireZoneAssignmentGroup.getTitle();
        ThemedColors m17961f = C47311qB0.m17961f(wireZoneAssignmentGroup.getColor());
        String description = wireZoneAssignmentGroup.getDescription();
        String emptyText = wireZoneAssignmentGroup.getEmptyText();
        List<WireZoneAssignmentReleaseAssignment> releaseAssignments = wireZoneAssignmentGroup.getReleaseAssignments();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(releaseAssignments, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireZoneAssignmentReleaseAssignment wireZoneAssignmentReleaseAssignment : releaseAssignments) {
            arrayList.add(m1547d(wireZoneAssignmentReleaseAssignment));
        }
        List<WireZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups = wireZoneAssignmentGroup.getCappedZoneReservationGroups();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cappedZoneReservationGroups, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireZoneAssignmentCappedReservationGroup wireZoneAssignmentCappedReservationGroup : cappedZoneReservationGroups) {
            arrayList2.add(m1549b(wireZoneAssignmentCappedReservationGroup));
        }
        return new ZoneAssignmentGroup(title, m17961f, description, emptyText, arrayList, arrayList2);
    }

    /* renamed from: b */
    public static final ZoneAssignmentCappedReservationGroup m1549b(WireZoneAssignmentCappedReservationGroup wireZoneAssignmentCappedReservationGroup) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireZoneAssignmentCappedReservationGroup, "<this>");
        String zoneId = wireZoneAssignmentCappedReservationGroup.getZoneId();
        Point zoneCenterPoint = wireZoneAssignmentCappedReservationGroup.getZoneCenterPoint();
        String title = wireZoneAssignmentCappedReservationGroup.getTitle();
        List<WireZoneAssignmentCappedZoneReservation> cappedZoneReservations = wireZoneAssignmentCappedReservationGroup.getCappedZoneReservations();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cappedZoneReservations, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireZoneAssignmentCappedZoneReservation wireZoneAssignmentCappedZoneReservation : cappedZoneReservations) {
            arrayList.add(m1548c(wireZoneAssignmentCappedZoneReservation));
        }
        return new ZoneAssignmentCappedReservationGroup(zoneId, zoneCenterPoint, title, arrayList);
    }

    /* renamed from: c */
    public static final ZoneAssignmentCappedZoneReservation m1548c(WireZoneAssignmentCappedZoneReservation wireZoneAssignmentCappedZoneReservation) {
        Intrinsics.checkNotNullParameter(wireZoneAssignmentCappedZoneReservation, "<this>");
        return new ZoneAssignmentCappedZoneReservation(wireZoneAssignmentCappedZoneReservation.getId(), wireZoneAssignmentCappedZoneReservation.getBirdCode(), wireZoneAssignmentCappedZoneReservation.getTimeRemaining(), wireZoneAssignmentCappedZoneReservation.getBatteryLevel());
    }

    /* renamed from: d */
    public static final ZoneAssignmentReleaseAssignment m1547d(WireZoneAssignmentReleaseAssignment wireZoneAssignmentReleaseAssignment) {
        ThemedColors themedColors;
        ThemedColors themedColors2;
        Intrinsics.checkNotNullParameter(wireZoneAssignmentReleaseAssignment, "<this>");
        String id = wireZoneAssignmentReleaseAssignment.getId();
        String zoneId = wireZoneAssignmentReleaseAssignment.getZoneId();
        Point zoneCenterPoint = wireZoneAssignmentReleaseAssignment.getZoneCenterPoint();
        String title = wireZoneAssignmentReleaseAssignment.getTitle();
        ClientIcon descriptionLeadingIcon = wireZoneAssignmentReleaseAssignment.getDescriptionLeadingIcon();
        WireThemedColors descriptionLeadingIconColor = wireZoneAssignmentReleaseAssignment.getDescriptionLeadingIconColor();
        if (descriptionLeadingIconColor != null) {
            themedColors = C47311qB0.m17961f(descriptionLeadingIconColor);
        } else {
            themedColors = null;
        }
        String description = wireZoneAssignmentReleaseAssignment.getDescription();
        String descriptionSubtitle = wireZoneAssignmentReleaseAssignment.getDescriptionSubtitle();
        String dueAt = wireZoneAssignmentReleaseAssignment.getDueAt();
        ClientIcon dueAtTrailingIcon = wireZoneAssignmentReleaseAssignment.getDueAtTrailingIcon();
        WireThemedColors dueAtTrailingIconColor = wireZoneAssignmentReleaseAssignment.getDueAtTrailingIconColor();
        if (dueAtTrailingIconColor != null) {
            themedColors2 = C47311qB0.m17961f(dueAtTrailingIconColor);
        } else {
            themedColors2 = null;
        }
        return new ZoneAssignmentReleaseAssignment(id, zoneId, zoneCenterPoint, title, descriptionLeadingIcon, themedColors, description, descriptionSubtitle, dueAt, dueAtTrailingIcon, themedColors2);
    }
}
