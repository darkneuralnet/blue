package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.LineStroke;
import co.bird.android.model.persistence.nestedstructures.FleetReportChartAxis;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChartLine;
import com.facebook.share.internal.C17296a;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C45336mr2;
import p000.C49149tH6;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0013\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;", "chart", "", "x0", "", "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;", "J0", "Ljava/util/List;", "values", "", "K0", "Lkotlin/Lazy;", "w0", "()I", "xAxisTextColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "L0", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTargetLineChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1179#2,2:120\n1253#2,4:122\n1963#2,14:126\n1549#2:140\n1620#2,2:141\n1569#2,11:143\n1864#2,2:154\n1866#2:157\n1580#2:158\n1622#2:159\n1#3:156\n*S KotlinDebug\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart\n*L\n49#1:120,2\n49#1:122,4\n56#1:126,14\n60#1:140\n60#1:141,2\n61#1:143,11\n61#1:154,2\n61#1:157\n61#1:158\n60#1:159\n61#1:156\n*E\n"})
/* loaded from: classes3.dex */
public class TargetLineChart extends LineChart {

    /* renamed from: L0 */
    public static final C14814a f63968L0 = new C14814a(null);

    /* renamed from: J0 */
    public List<FleetReportLineChartLine> f63969J0;

    /* renamed from: K0 */
    public final Lazy f63970K0;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;", "", "", "X_AXIS_MINIMUM", "F", "X_AXIS_MIN_MAX", "Y_AXIS_MINIMUM", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetLineChart$a */
    /* loaded from: classes3.dex */
    public static final class C14814a {
        public /* synthetic */ C14814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14814a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetLineChart$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14815b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LineStroke.values().length];
            try {
                iArr[LineStroke.DOTTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineStroke.SOLID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c", "LJj6;", "", "value", "LXu;", "axis", "", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetLineChart$c */
    /* loaded from: classes3.dex */
    public static final class C14816c extends AbstractC33806Jj6 {

        /* renamed from: a */
        public final /* synthetic */ Map<Float, String> f63971a;

        public C14816c(Map<Float, String> map) {
            this.f63971a = map;
        }

        @Override // p000.AbstractC33806Jj6
        /* renamed from: a */
        public String mo58186a(float f, AbstractC9544Xu abstractC9544Xu) {
            String m85293a;
            m85293a = SY5.m85293a(this.f63971a, f);
            return m85293a == null ? "" : m85293a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetLineChart$d */
    /* loaded from: classes3.dex */
    public static final class C14817d extends Lambda implements Function0<Integer> {
        public C14817d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(NA0.m94301c(TargetLineChart.this.getContext(), C32364Df4.primaryText));
        }
    }

    public TargetLineChart(Context context) {
        super(context);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14817d());
        this.f63970K0 = lazy;
    }

    /* renamed from: w0 */
    public final int m58188w0() {
        return ((Number) this.f63970K0.getValue()).intValue();
    }

    /* renamed from: x0 */
    public void m58187x0(FleetReportLineChart chart) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Object next;
        float f;
        int collectionSizeOrDefault2;
        Entry entry;
        Intrinsics.checkNotNullParameter(chart, "chart");
        m52007s();
        this.f63969J0 = chart.getLines();
        mo51991M().m76138O(new C48399s12(chart.getXAxisLabels()));
        mo51991M().m93266h(m58188w0());
        List<FleetReportChartAxis> yAxis = chart.getYAxis();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(yAxis, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (FleetReportChartAxis fleetReportChartAxis : yAxis) {
            Pair m28425to = TuplesKt.m28425to(Float.valueOf((float) fleetReportChartAxis.getValue()), fleetReportChartAxis.getLabel());
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        m52044d0().m76138O(new C14816c(linkedHashMap));
        m52044d0().m76146G(0.0f);
        C37875aI6 m52044d0 = m52044d0();
        Iterator<T> it = chart.getYAxis().iterator();
        List<FleetReportLineChartLine> list = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                double value = ((FleetReportChartAxis) next).getValue();
                do {
                    Object next2 = it.next();
                    double value2 = ((FleetReportChartAxis) next2).getValue();
                    if (Double.compare(value, value2) < 0) {
                        next = next2;
                        value = value2;
                    }
                } while (it.hasNext());
            }
        }
        FleetReportChartAxis fleetReportChartAxis2 = (FleetReportChartAxis) next;
        if (fleetReportChartAxis2 != null) {
            f = (float) fleetReportChartAxis2.getValue();
        } else {
            f = Float.MAX_VALUE;
        }
        m52044d0.m76147F(f);
        m52044d0().m76141L(linkedHashMap.size(), true);
        List<FleetReportLineChartLine> lines = chart.getLines();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(lines, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
        for (FleetReportLineChartLine fleetReportLineChartLine : lines) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : fleetReportLineChartLine.getValues()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                double doubleValue = ((Number) obj).doubleValue();
                if (fleetReportLineChartLine.getNullValueIndexes().contains(Integer.valueOf(i))) {
                    entry = null;
                } else {
                    entry = new Entry(i, (float) doubleValue, null);
                }
                if (entry != null) {
                    arrayList2.add(entry);
                }
                i = i2;
            }
            C45336mr2 c45336mr2 = new C45336mr2(arrayList2, "");
            c45336mr2.m4021R0(fleetReportLineChartLine.getColor().getLightMode());
            c45336mr2.m6220Z0(C49347td3.m12001b(1));
            int i3 = C14815b.$EnumSwitchMapping$0[fleetReportLineChartLine.getStroke().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c45336mr2.m24853a1();
                }
            } else {
                c45336mr2.m24852b1(C49347td3.m12001b(4), C49347td3.m12001b(4), 0.0f);
            }
            c45336mr2.m4020S0(false);
            c45336mr2.m24849d1(false);
            c45336mr2.m24847e1(C45336mr2.EnumC26273a.CUBIC_BEZIER);
            c45336mr2.m24850c1(0.1f);
            arrayList.add(c45336mr2);
        }
        setData(new C44150kr2(arrayList));
        m52044d0().m76143J(false);
        mo51991M().m76146G(-1.0f);
        C49149tH6 mo51991M = mo51991M();
        List<FleetReportLineChartLine> list2 = this.f63969J0;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        } else {
            list = list2;
        }
        mo51991M.m76147F(Math.max(7.0f, list.size()));
        mo51991M().m12528S(C49149tH6.EnumC28671a.BOTTOM);
        mo51991M().m76145H(false);
        m52044d0().m76145H(false);
        m52042f0().m76145H(false);
        m52042f0().m71675e0(false);
        m52042f0().m76144I(false);
        m52026A().m93267g(false);
        m52019I().m93267g(false);
        setTouchEnabled(false);
    }

    public TargetLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14817d());
        this.f63970K0 = lazy;
    }

    public TargetLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14817d());
        this.f63970K0 = lazy;
    }
}
