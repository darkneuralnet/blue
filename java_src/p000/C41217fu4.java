package p000;

import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedZoneReservation;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"Lfu4;", "", "", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "assignmentGroups", "LH6;", C17296a.f69688o, "<init>", "()V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseAssignmentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentConverter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,2:70\n1549#2:73\n1620#2,3:74\n1549#2:77\n1620#2,2:78\n1549#2:80\n1620#2,3:81\n1622#2:84\n1622#2:87\n1#3:72\n37#4,2:85\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentConverter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentConverter\n*L\n12#1:69\n12#1:70,2\n27#1:73\n27#1:74,3\n39#1:77\n39#1:78,2\n45#1:80\n45#1:81,3\n39#1:84\n12#1:87\n61#1:85,2\n*E\n"})
/* renamed from: fu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41217fu4 {
    /* renamed from: a */
    public final List<C3023H6> m40577a(List<ZoneAssignmentGroup> assignmentGroups) {
        int collectionSizeOrDefault;
        List list;
        List<C3023H6> flatten;
        boolean z;
        Collection emptyList;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        List mutableList;
        List listOf;
        int collectionSizeOrDefault4;
        Intrinsics.checkNotNullParameter(assignmentGroups, "assignmentGroups");
        List<ZoneAssignmentGroup> list2 = assignmentGroups;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ZoneAssignmentGroup zoneAssignmentGroup : list2) {
            C3023H6 c3023h6 = new C3023H6(new ArrayList(), new C2637G6(zoneAssignmentGroup, C50001uj4.item_group_header, false, 4, null), new C2637G6(zoneAssignmentGroup.getEmptyText(), C50001uj4.item_group_empty_text, false, 4, null));
            if (zoneAssignmentGroup.getReleaseAssignments().isEmpty() && zoneAssignmentGroup.getCappedZoneReservationGroups().isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            c3023h6.m104406g(z);
            if (!zoneAssignmentGroup.getReleaseAssignments().isEmpty()) {
                List<ZoneAssignmentReleaseAssignment> releaseAssignments = zoneAssignmentGroup.getReleaseAssignments();
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(releaseAssignments, 10);
                emptyList = new ArrayList(collectionSizeOrDefault4);
                for (ZoneAssignmentReleaseAssignment zoneAssignmentReleaseAssignment : releaseAssignments) {
                    emptyList.add(new C3023H6(new ArrayList(), new C2637G6(TuplesKt.m28425to(zoneAssignmentReleaseAssignment, zoneAssignmentGroup), C50001uj4.item_release_assignment, false, 4, null), null, 4, null));
                }
            } else if (!zoneAssignmentGroup.getCappedZoneReservationGroups().isEmpty()) {
                List<ZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups = zoneAssignmentGroup.getCappedZoneReservationGroups();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cappedZoneReservationGroups, 10);
                emptyList = new ArrayList(collectionSizeOrDefault2);
                for (ZoneAssignmentCappedReservationGroup zoneAssignmentCappedReservationGroup : cappedZoneReservationGroups) {
                    C2637G6 c2637g6 = new C2637G6(TuplesKt.m28425to(zoneAssignmentCappedReservationGroup, zoneAssignmentGroup), C50001uj4.item_capped_zone_reservation_group_header, false, 4, null);
                    List<ZoneAssignmentCappedZoneReservation> cappedZoneReservations = zoneAssignmentCappedReservationGroup.getCappedZoneReservations();
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cappedZoneReservations, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault3);
                    for (ZoneAssignmentCappedZoneReservation zoneAssignmentCappedZoneReservation : cappedZoneReservations) {
                        arrayList2.add(new C2637G6(zoneAssignmentCappedZoneReservation, C50001uj4.item_capped_zone_reservation, false, 4, null));
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    emptyList.add(new C3023H6(mutableList, c2637g6, null, 4, null));
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(c3023h6);
            spreadBuilder.addSpread(emptyList.toArray(new C3023H6[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
            arrayList.add(listOf);
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        flatten = CollectionsKt__IterablesKt.flatten(list);
        return flatten;
    }
}
