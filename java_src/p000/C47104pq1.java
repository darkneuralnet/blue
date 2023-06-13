package p000;

import co.bird.android.model.constant.FleetStatusActionKind;
import co.bird.android.model.persistence.nestedstructures.FleetState;
import co.bird.android.model.persistence.nestedstructures.FleetStatusAction;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lpq1;", "", "", "Lco/bird/android/model/persistence/nestedstructures/FleetState;", "states", "LH6;", C17296a.f69688o, TransferTable.COLUMN_STATE, "b", "LTq4;", "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStateConverter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,3:39\n1549#2:42\n1620#2,2:43\n766#2:45\n857#2,2:46\n1622#2:48\n*S KotlinDebug\n*F\n+ 1 FleetStateConverter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetStateConverter\n*L\n16#1:38\n16#1:39,3\n23#1:42\n23#1:43,2\n25#1:45\n25#1:46,2\n23#1:48\n*E\n"})
/* renamed from: pq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47104pq1 {

    /* renamed from: a */
    public final C36207Tq4 f104150a;

    public C47104pq1(C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f104150a = reactiveConfig;
    }

    /* renamed from: a */
    public final List<C3023H6> m18646a(List<FleetState> states) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(states, "states");
        List<FleetState> list = states;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetState fleetState : list) {
            arrayList.add(m18645b(fleetState));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C3023H6 m18645b(FleetState fleetState) {
        int collectionSizeOrDefault;
        List mutableList;
        List<FleetStatusAction> emptyList;
        boolean z;
        boolean enableActions = this.f104150a.m82623f8().getValue().getOperatorConfig().getFeatures().getFleetStatus().getEnableActions();
        boolean enableFleetList = this.f104150a.m82623f8().getValue().getOperatorConfig().getFeatures().getFleetStatus().getEnableFleetList();
        C2637G6 c2637g6 = new C2637G6(fleetState, C38125aj4.item_fleet_state, false, 4, null);
        List<FleetSubstate> substates = fleetState.getSubstates();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(substates, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetSubstate fleetSubstate : substates) {
            if (enableActions) {
                emptyList = fleetSubstate.getActions();
                if (!enableFleetList) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : emptyList) {
                        if (((FleetStatusAction) obj).getKind() != FleetStatusActionKind.FLEET_LIST) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList2.add(obj);
                        }
                    }
                    emptyList = arrayList2;
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.add(new C2637G6(FleetSubstate.copy$default(fleetSubstate, null, null, null, null, null, emptyList, null, 95, null), C38125aj4.item_fleet_substate, false));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }
}
