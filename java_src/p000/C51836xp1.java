package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.persistence.FleetReportSection;
import co.bird.android.model.persistence.FleetTargetScoreboard;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportPanel;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¨\u0006\u0012"}, m28432d2 = {"Lxp1;", "", "Lco/bird/android/model/persistence/FleetReport;", "report", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "b", "Lco/bird/android/model/persistence/FleetTargetScoreboard;", "scoreboard", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/FleetReportSection;", "reportSections", "c", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportConverter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportConverter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n37#2,2:75\n37#2,2:78\n37#2,2:81\n1#3:77\n26#4:80\n1549#5:83\n1620#5,2:84\n766#5:86\n857#5,2:87\n1549#5:89\n1620#5,3:90\n1622#5:93\n*S KotlinDebug\n*F\n+ 1 FleetReportConverter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportConverter\n*L\n21#1:75,2\n22#1:78,2\n23#1:81,2\n22#1:80\n53#1:83\n53#1:84,2\n54#1:86\n54#1:87,2\n60#1:89\n60#1:90,3\n53#1:93\n*E\n"})
/* renamed from: xp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51836xp1 {
    /* renamed from: a */
    public final List<C3023H6> m4592a(FleetReport report) {
        Object firstOrNull;
        C3023H6[] c3023h6Arr;
        List<C3023H6> listOfNotNull;
        List<C3023H6> m4589d;
        Intrinsics.checkNotNullParameter(report, "report");
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.addSpread(m4591b(report.getPeriod()).toArray(new C3023H6[0]));
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) report.getScoreboards());
        FleetTargetScoreboard fleetTargetScoreboard = (FleetTargetScoreboard) firstOrNull;
        if (fleetTargetScoreboard == null || (m4589d = m4589d(fleetTargetScoreboard)) == null || (c3023h6Arr = (C3023H6[]) m4589d.toArray(new C3023H6[0])) == null) {
            c3023h6Arr = new C3023H6[0];
        }
        spreadBuilder.addSpread(c3023h6Arr);
        spreadBuilder.addSpread(m4590c(report.getSections()).toArray(new C3023H6[0]));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull;
    }

    /* renamed from: b */
    public final List<C3023H6> m4591b(FleetReportPeriod fleetReportPeriod) {
        List listOf;
        List mutableList;
        List<C3023H6> mutableListOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(fleetReportPeriod, C38125aj4.item_report_period, false, 4, null));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C3023H6(mutableList, new C2637G6(null, C38125aj4.header_reporting_period, false, 4, null), null, 4, null));
        return mutableListOf;
    }

    /* renamed from: c */
    public final List<C3023H6> m4590c(List<FleetReportSection> list) {
        int collectionSizeOrDefault;
        List flatten;
        List mutableList;
        Object firstOrNull;
        String str;
        List listOf;
        List mutableList2;
        List<C3023H6> mutableListOf;
        int collectionSizeOrDefault2;
        boolean z;
        C3023H6[] c3023h6Arr = new C3023H6[2];
        List<FleetReportSection> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetReportSection fleetReportSection : list2) {
            ArrayList<FleetReportPanel> arrayList2 = new ArrayList();
            for (Object obj : fleetReportSection.getPanels()) {
                FleetReportChart chart = ((FleetReportPanel) obj).getChart();
                if (!(chart instanceof FleetReportBarChart) ? !(!(chart instanceof FleetReportLineChart) || ((FleetReportLineChart) chart).getLines().isEmpty()) : !((FleetReportBarChart) chart).getValues().isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (FleetReportPanel fleetReportPanel : arrayList2) {
                arrayList3.add(new C2637G6(fleetReportPanel, C38125aj4.item_report_panel, false, 4, null));
            }
            arrayList.add(arrayList3);
        }
        flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) flatten);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        FleetReportSection fleetReportSection2 = (FleetReportSection) firstOrNull;
        if (fleetReportSection2 != null) {
            str = fleetReportSection2.getTitle();
        } else {
            str = null;
        }
        c3023h6Arr[0] = new C3023H6(mutableList, new C2637G6(str, C38125aj4.header_panel, false, 4, null), null, 4, null);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(null, C38125aj4.footer_panel, false, 4, null));
        mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        c3023h6Arr[1] = new C3023H6(mutableList2, null, null, 6, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c3023h6Arr);
        return mutableListOf;
    }

    /* renamed from: d */
    public final List<C3023H6> m4589d(FleetTargetScoreboard fleetTargetScoreboard) {
        List listOf;
        List mutableList;
        List<C3023H6> mutableListOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(fleetTargetScoreboard, C38125aj4.item_target_scoreboard, false, 4, null));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C3023H6(mutableList, new C2637G6(fleetTargetScoreboard.getTitle(), C38125aj4.header_scoreboard, false, 4, null), null, 4, null));
        return mutableListOf;
    }
}
