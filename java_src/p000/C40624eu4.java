package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedZoneReservation;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Leu4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseAssignmentAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapterDiff.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,28:1\n18#2:29\n18#2:34\n18#2:39\n18#2:44\n18#2:49\n9#3,4:30\n9#3,4:35\n9#3,4:40\n9#3,4:45\n9#3,4:50\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapterDiff.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapterDiff\n*L\n15#1:29\n16#1:34\n17#1:39\n18#1:44\n19#1:49\n15#1:30,4\n16#1:35,4\n17#1:40,4\n18#1:45,4\n19#1:50,4\n*E\n"})
/* renamed from: eu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40624eu4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String id;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        ZoneAssignmentGroup zoneAssignmentGroup = null;
        if (m105817b == C50001uj4.item_group_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof ZoneAssignmentGroup) {
                zoneAssignmentGroup = m105816c;
            }
            ZoneAssignmentGroup zoneAssignmentGroup2 = zoneAssignmentGroup;
            if (zoneAssignmentGroup2 == null || (id = zoneAssignmentGroup2.getTitle()) == null) {
                return "";
            }
        } else if (m105817b == C50001uj4.item_group_empty_text) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof String) {
                zoneAssignmentGroup = m105816c2;
            }
            String str = zoneAssignmentGroup;
            if (str == null) {
                return "";
            }
            return str;
        } else if (m105817b == C50001uj4.item_release_assignment) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof ZoneAssignmentReleaseAssignment) {
                zoneAssignmentGroup = m105816c3;
            }
            ZoneAssignmentReleaseAssignment zoneAssignmentReleaseAssignment = zoneAssignmentGroup;
            if (zoneAssignmentReleaseAssignment == null || (id = zoneAssignmentReleaseAssignment.getId()) == null) {
                return "";
            }
        } else if (m105817b == C50001uj4.item_capped_zone_reservation_group_header) {
            Object m105816c4 = adapterItem.m105816c();
            if (m105816c4 instanceof ZoneAssignmentCappedReservationGroup) {
                zoneAssignmentGroup = m105816c4;
            }
            ZoneAssignmentCappedReservationGroup zoneAssignmentCappedReservationGroup = zoneAssignmentGroup;
            if (zoneAssignmentCappedReservationGroup == null || (id = zoneAssignmentCappedReservationGroup.getTitle()) == null) {
                return "";
            }
        } else if (m105817b != C50001uj4.item_capped_zone_reservation) {
            return "";
        } else {
            Object m105816c5 = adapterItem.m105816c();
            if (m105816c5 instanceof ZoneAssignmentCappedZoneReservation) {
                zoneAssignmentGroup = m105816c5;
            }
            ZoneAssignmentCappedZoneReservation zoneAssignmentCappedZoneReservation = zoneAssignmentGroup;
            if (zoneAssignmentCappedZoneReservation == null || (id = zoneAssignmentCappedZoneReservation.getId()) == null) {
                return "";
            }
        }
        return id;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
