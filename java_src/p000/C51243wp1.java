package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FleetReportChartType;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.persistence.FleetReportSection;
import co.bird.android.model.persistence.FleetTargetScoreboard;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChartLine;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChartValue;
import co.bird.android.model.persistence.nestedstructures.FleetReportChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportChartAxis;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChartLine;
import co.bird.android.model.persistence.nestedstructures.FleetReportPanel;
import co.bird.android.model.persistence.nestedstructures.FleetTarget;
import co.bird.android.model.wire.WireFleetReport;
import co.bird.android.model.wire.WireFleetReportBarChart;
import co.bird.android.model.wire.WireFleetReportBarChartLine;
import co.bird.android.model.wire.WireFleetReportBarChartValue;
import co.bird.android.model.wire.WireFleetReportChart;
import co.bird.android.model.wire.WireFleetReportChartAxis;
import co.bird.android.model.wire.WireFleetReportLineChart;
import co.bird.android.model.wire.WireFleetReportLineChartLine;
import co.bird.android.model.wire.WireFleetReportPanel;
import co.bird.android.model.wire.WireFleetReportPeriod;
import co.bird.android.model.wire.WireFleetReportSection;
import co.bird.android.model.wire.WireFleetTarget;
import co.bird.android.model.wire.WireFleetTargetScoreboard;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0019\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u001c\u001a\n\u0010!\u001a\u00020 *\u00020\u001f\u001a\n\u0010$\u001a\u00020#*\u00020\"\u001a\n\u0010'\u001a\u00020&*\u00020%\u001a\n\u0010*\u001a\u00020)*\u00020(¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReport;", "", "fleetId", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lco/bird/android/model/persistence/FleetReport;", C17296a.f69688o, "Lco/bird/android/model/wire/WireFleetReportPeriod;", "Lco/bird/android/model/persistence/FleetReportPeriod;", "b", "Lco/bird/android/model/wire/WireFleetTargetScoreboard;", "Lco/bird/android/model/persistence/FleetTargetScoreboard;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireFleetTarget;", "Lco/bird/android/model/persistence/nestedstructures/FleetTarget;", "m", "Lco/bird/android/model/wire/WireFleetReportSection;", "Lco/bird/android/model/persistence/FleetReportSection;", "c", "Lco/bird/android/model/wire/WireFleetReportPanel;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;", "l", "Lco/bird/android/model/wire/WireFleetReportChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportChart;", "h", "Lco/bird/android/model/wire/WireFleetReportBarChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;", "e", "Lco/bird/android/model/wire/WireFleetReportLineChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;", "j", "Lco/bird/android/model/wire/WireFleetReportChartAxis;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;", "i", "Lco/bird/android/model/wire/WireFleetReportBarChartLine;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;", "f", "Lco/bird/android/model/wire/WireFleetReportBarChartValue;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartValue;", "g", "Lco/bird/android/model/wire/WireFleetReportLineChartLine;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;", "k", "co.bird.android.repository.fleet-report"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportConversion.kt\nco/bird/android/repository/fleetreport/converters/FleetReportConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1549#2:146\n1620#2,3:147\n1549#2:150\n1620#2,3:151\n1549#2:154\n1620#2,3:155\n1549#2:158\n1620#2,3:159\n1549#2:162\n1620#2,3:163\n1549#2:166\n1620#2,3:167\n1549#2:170\n1620#2,3:171\n1549#2:174\n1620#2,3:175\n1549#2:178\n1620#2,3:179\n*S KotlinDebug\n*F\n+ 1 FleetReportConversion.kt\nco/bird/android/repository/fleetreport/converters/FleetReportConversionKt\n*L\n38#1:146\n38#1:147,3\n39#1:150\n39#1:151,3\n57#1:154\n57#1:155,3\n71#1:158\n71#1:159,3\n99#1:162\n99#1:163,3\n100#1:166\n100#1:167,3\n101#1:170\n101#1:171,3\n108#1:174\n108#1:175,3\n109#1:178\n109#1:179,3\n*E\n"})
/* renamed from: wp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51243wp1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wp1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29964a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FleetReportChartType.values().length];
            try {
                iArr[FleetReportChartType.BAR_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FleetReportChartType.LINE_CHART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FleetReportChartType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final FleetReport m6300a(WireFleetReport wireFleetReport, String fleetId, FleetReportPage page) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireFleetReport, "<this>");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        FleetReportPeriod m6299b = m6299b(wireFleetReport.getPeriod(), fleetId, page);
        String subheading = wireFleetReport.getSubheading();
        List<WireFleetTargetScoreboard> scoreboards = wireFleetReport.getScoreboards();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(scoreboards, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetTargetScoreboard wireFleetTargetScoreboard : scoreboards) {
            arrayList.add(m6297d(wireFleetTargetScoreboard));
        }
        List<WireFleetReportSection> sections = wireFleetReport.getSections();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFleetReportSection wireFleetReportSection : sections) {
            arrayList2.add(m6298c(wireFleetReportSection));
        }
        return new FleetReport(m6299b, subheading, arrayList, arrayList2, fleetId, page);
    }

    /* renamed from: b */
    public static final FleetReportPeriod m6299b(WireFleetReportPeriod wireFleetReportPeriod, String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(wireFleetReportPeriod, "<this>");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        return new FleetReportPeriod(wireFleetReportPeriod.getStartDate(), wireFleetReportPeriod.getEndDate(), wireFleetReportPeriod.getGranularity(), fleetId, page);
    }

    /* renamed from: c */
    public static final FleetReportSection m6298c(WireFleetReportSection wireFleetReportSection) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetReportSection, "<this>");
        String title = wireFleetReportSection.getTitle();
        List<WireFleetReportPanel> panels = wireFleetReportSection.getPanels();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(panels, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetReportPanel wireFleetReportPanel : panels) {
            arrayList.add(m6289l(wireFleetReportPanel));
        }
        return new FleetReportSection(0L, title, arrayList, 1, null);
    }

    /* renamed from: d */
    public static final FleetTargetScoreboard m6297d(WireFleetTargetScoreboard wireFleetTargetScoreboard) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireFleetTargetScoreboard, "<this>");
        String title = wireFleetTargetScoreboard.getTitle();
        List<WireFleetTarget> targets = wireFleetTargetScoreboard.getTargets();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(targets, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetTarget wireFleetTarget : targets) {
            arrayList.add(m6288m(wireFleetTarget));
        }
        return new FleetTargetScoreboard(0L, title, arrayList, 1, null);
    }

    /* renamed from: e */
    public static final FleetReportBarChart m6296e(WireFleetReportBarChart wireFleetReportBarChart) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.checkNotNullParameter(wireFleetReportBarChart, "<this>");
        List<WireFleetReportChartAxis> yAxis = wireFleetReportBarChart.getYAxis();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(yAxis, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetReportChartAxis wireFleetReportChartAxis : yAxis) {
            arrayList.add(m6292i(wireFleetReportChartAxis));
        }
        List<WireFleetReportBarChartLine> lines = wireFleetReportBarChart.getLines();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(lines, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFleetReportBarChartLine wireFleetReportBarChartLine : lines) {
            arrayList2.add(m6295f(wireFleetReportBarChartLine));
        }
        List<WireFleetReportBarChartValue> values = wireFleetReportBarChart.getValues();
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (WireFleetReportBarChartValue wireFleetReportBarChartValue : values) {
            arrayList3.add(m6294g(wireFleetReportBarChartValue));
        }
        return new FleetReportBarChart(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: f */
    public static final FleetReportBarChartLine m6295f(WireFleetReportBarChartLine wireFleetReportBarChartLine) {
        Intrinsics.checkNotNullParameter(wireFleetReportBarChartLine, "<this>");
        return new FleetReportBarChartLine(wireFleetReportBarChartLine.getValue(), C47311qB0.m17961f(wireFleetReportBarChartLine.getColor()), wireFleetReportBarChartLine.getFillDirection());
    }

    /* renamed from: g */
    public static final FleetReportBarChartValue m6294g(WireFleetReportBarChartValue wireFleetReportBarChartValue) {
        Intrinsics.checkNotNullParameter(wireFleetReportBarChartValue, "<this>");
        return new FleetReportBarChartValue(wireFleetReportBarChartValue.getLabel(), wireFleetReportBarChartValue.getValue(), C47311qB0.m17961f(wireFleetReportBarChartValue.getColor()));
    }

    /* renamed from: h */
    public static final FleetReportChart m6293h(WireFleetReportChart wireFleetReportChart) {
        Intrinsics.checkNotNullParameter(wireFleetReportChart, "<this>");
        int i = C29964a.$EnumSwitchMapping$0[wireFleetReportChart.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                FleetReportChartType type = wireFleetReportChart.getType();
                throw new UnsupportedOperationException("Cannot convert FleetReportChart for type: " + type);
            }
            WireFleetReportLineChart lineChart = wireFleetReportChart.getLineChart();
            Intrinsics.checkNotNull(lineChart);
            return m6291j(lineChart);
        }
        WireFleetReportBarChart barChart = wireFleetReportChart.getBarChart();
        Intrinsics.checkNotNull(barChart);
        return m6296e(barChart);
    }

    /* renamed from: i */
    public static final FleetReportChartAxis m6292i(WireFleetReportChartAxis wireFleetReportChartAxis) {
        Intrinsics.checkNotNullParameter(wireFleetReportChartAxis, "<this>");
        return new FleetReportChartAxis(wireFleetReportChartAxis.getLabel(), wireFleetReportChartAxis.getValue());
    }

    /* renamed from: j */
    public static final FleetReportLineChart m6291j(WireFleetReportLineChart wireFleetReportLineChart) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireFleetReportLineChart, "<this>");
        List<String> xAxisLabels = wireFleetReportLineChart.getXAxisLabels();
        List<WireFleetReportChartAxis> yAxis = wireFleetReportLineChart.getYAxis();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(yAxis, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFleetReportChartAxis wireFleetReportChartAxis : yAxis) {
            arrayList.add(m6292i(wireFleetReportChartAxis));
        }
        List<WireFleetReportLineChartLine> lines = wireFleetReportLineChart.getLines();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(lines, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFleetReportLineChartLine wireFleetReportLineChartLine : lines) {
            arrayList2.add(m6290k(wireFleetReportLineChartLine));
        }
        return new FleetReportLineChart(xAxisLabels, arrayList, arrayList2);
    }

    /* renamed from: k */
    public static final FleetReportLineChartLine m6290k(WireFleetReportLineChartLine wireFleetReportLineChartLine) {
        Intrinsics.checkNotNullParameter(wireFleetReportLineChartLine, "<this>");
        return new FleetReportLineChartLine(wireFleetReportLineChartLine.getValues(), C47311qB0.m17961f(wireFleetReportLineChartLine.getColor()), wireFleetReportLineChartLine.getStroke(), wireFleetReportLineChartLine.getLabel(), wireFleetReportLineChartLine.getNullValueIndexes());
    }

    /* renamed from: l */
    public static final FleetReportPanel m6289l(WireFleetReportPanel wireFleetReportPanel) {
        Intrinsics.checkNotNullParameter(wireFleetReportPanel, "<this>");
        return new FleetReportPanel(wireFleetReportPanel.getTitle(), wireFleetReportPanel.getIcon(), C47311qB0.m17961f(wireFleetReportPanel.getColor()), wireFleetReportPanel.getInfo(), wireFleetReportPanel.getActualValue(), wireFleetReportPanel.getActualValueMessage(), wireFleetReportPanel.getTargetValue(), m6293h(wireFleetReportPanel.getChart()));
    }

    /* renamed from: m */
    public static final FleetTarget m6288m(WireFleetTarget wireFleetTarget) {
        Intrinsics.checkNotNullParameter(wireFleetTarget, "<this>");
        return new FleetTarget(wireFleetTarget.getName(), wireFleetTarget.getTargetMet());
    }
}
