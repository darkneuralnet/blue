package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.nestedstructures.FleetRating;
import co.bird.android.model.persistence.nestedstructures.FleetRatingGroup;
import co.bird.android.model.persistence.nestedstructures.FleetState;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Loq1;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStateAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n*S KotlinDebug\n*F\n+ 1 FleetStateAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateAdapterDiff\n*L\n15#1:50\n16#1:55\n17#1:60\n18#1:65\n26#1:70\n32#1:75\n38#1:80\n42#1:85\n15#1:51,4\n16#1:56,4\n17#1:61,4\n18#1:66,4\n26#1:71,4\n32#1:76,4\n38#1:81,4\n42#1:86,4\n*E\n"})
/* renamed from: oq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46511oq1 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String title;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        FleetState fleetState = null;
        if (m105817b == C38125aj4.item_fleet_state) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof FleetState) {
                fleetState = m105816c;
            }
            FleetState fleetState2 = fleetState;
            if (fleetState2 == null || (title = fleetState2.getTitle()) == null) {
                return "";
            }
        } else if (m105817b == C38125aj4.item_fleet_substate) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof FleetSubstate) {
                fleetState = m105816c2;
            }
            FleetSubstate fleetSubstate = fleetState;
            if (fleetSubstate == null || (title = fleetSubstate.getTitle()) == null) {
                return "";
            }
        } else if (m105817b == C38125aj4.item_fleet_rating_average) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof FleetRating) {
                fleetState = m105816c3;
            }
            FleetRating fleetRating = fleetState;
            if (fleetRating == null || (title = fleetRating.getDescription()) == null) {
                return "";
            }
        } else if (m105817b != C38125aj4.item_fleet_rating_group) {
            return "";
        } else {
            Object m105816c4 = adapterItem.m105816c();
            if (m105816c4 instanceof FleetRatingGroup) {
                fleetState = m105816c4;
            }
            FleetRatingGroup fleetRatingGroup = fleetState;
            if (fleetRatingGroup == null || (title = fleetRatingGroup.getTitle()) == null) {
                return "";
            }
        }
        return title;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        FleetRatingGroup fleetRatingGroup = null;
        String str = null;
        String str2 = null;
        Double d = null;
        if (m105816c instanceof FleetState) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof FleetState)) {
                m105816c2 = null;
            }
            FleetState fleetState = (FleetState) m105816c2;
            FleetState fleetState2 = (FleetState) m105816c;
            String title = fleetState2.getTitle();
            if (fleetState != null) {
                str = fleetState.getTitle();
            }
            if (!Intrinsics.areEqual(title, str) || !Intrinsics.areEqual(fleetState2.getDescription(), fleetState.getDescription()) || !Intrinsics.areEqual(fleetState2.getSubstates(), fleetState.getSubstates())) {
                return true;
            }
        } else if (m105816c instanceof FleetSubstate) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof FleetSubstate)) {
                m105816c3 = null;
            }
            FleetSubstate fleetSubstate = (FleetSubstate) m105816c3;
            FleetSubstate fleetSubstate2 = (FleetSubstate) m105816c;
            String title2 = fleetSubstate2.getTitle();
            if (fleetSubstate != null) {
                str2 = fleetSubstate.getTitle();
            }
            if (!Intrinsics.areEqual(title2, str2) || fleetSubstate2.getIcon() != fleetSubstate.getIcon() || !Intrinsics.areEqual(fleetSubstate2.getActions(), fleetSubstate.getActions())) {
                return true;
            }
        } else if (m105816c instanceof FleetRating) {
            Object m105816c4 = newItem.m105816c();
            if (!(m105816c4 instanceof FleetRating)) {
                m105816c4 = null;
            }
            FleetRating fleetRating = (FleetRating) m105816c4;
            double rating = ((FleetRating) m105816c).getRating();
            if (fleetRating != null) {
                d = Double.valueOf(fleetRating.getRating());
            }
            if (!Intrinsics.areEqual(rating, d)) {
                return true;
            }
        } else if (m105816c instanceof FleetRatingGroup) {
            Object m105816c5 = newItem.m105816c();
            if (m105816c5 instanceof FleetRatingGroup) {
                fleetRatingGroup = m105816c5;
            }
            FleetRatingGroup fleetRatingGroup2 = fleetRatingGroup;
            if (fleetRatingGroup2 != null && ((FleetRatingGroup) m105816c).getCount() == fleetRatingGroup2.getCount()) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (objArr == null || !Intrinsics.areEqual(((FleetRatingGroup) m105816c).getBirdIds(), fleetRatingGroup2.getBirdIds())) {
                return true;
            }
        }
        return false;
    }
}
