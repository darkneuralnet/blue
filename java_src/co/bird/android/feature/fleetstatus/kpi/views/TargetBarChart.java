package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.TargetDirection;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChartLine;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChartValue;
import co.bird.android.model.persistence.nestedstructures.FleetReportChartAxis;
import com.facebook.share.internal.C17296a;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37875aI6;
import p000.C49149tH6;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001)B\u0013\b\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B\u001d\b\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b!\u0010%B%\b\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b!\u0010'J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006*"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;", "Lcom/github/mikephil/charting/charts/BarChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;", "chart", "", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartValue;", "values", "", "z0", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;", "line", "Lkotlin/Pair;", "Landroid/graphics/Rect;", "A0", "N0", "Ljava/util/List;", "", "O0", "Lkotlin/Lazy;", "w0", "()I", "leftOffset", "P0", "x0", "topOffset", "Q0", "I", "targetMarkerSize", "R0", "y0", "xAxisTextColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "S0", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTargetBarChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetBarChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n1549#2:129\n1620#2,3:130\n1054#2:133\n1559#2:134\n1590#2,4:135\n1855#2,2:140\n1#3:139\n*S KotlinDebug\n*F\n+ 1 TargetBarChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart\n*L\n51#1:125\n51#1:126,3\n56#1:129\n56#1:130,3\n63#1:133\n67#1:134\n67#1:135,4\n79#1:140,2\n*E\n"})
/* loaded from: classes3.dex */
public class TargetBarChart extends BarChart {

    /* renamed from: S0 */
    public static final C14807a f63958S0 = new C14807a(null);

    /* renamed from: N0 */
    public List<FleetReportBarChartValue> f63959N0;

    /* renamed from: O0 */
    public final Lazy f63960O0;

    /* renamed from: P0 */
    public final Lazy f63961P0;

    /* renamed from: Q0 */
    public final int f63962Q0;

    /* renamed from: R0 */
    public final Lazy f63963R0;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\r"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$a;", "", "", "TARGET_MARKER_SIZE_DP", "I", "", "VERTICAL_BAR_WIDTH", "F", "X_AXIS_MINIMUM", "X_AXIS_MIN_MAX", "Y_AXIS_MINIMUM", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$a */
    /* loaded from: classes3.dex */
    public static final class C14807a {
        public /* synthetic */ C14807a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14807a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14808b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetDirection.values().length];
            try {
                iArr[TargetDirection.ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetDirection.BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 TargetBarChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart\n*L\n1#1,328:1\n63#2:329\n*E\n"})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$c */
    /* loaded from: classes3.dex */
    public static final class C14809c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((FleetReportChartAxis) t2).getValue()), Double.valueOf(((FleetReportChartAxis) t).getValue()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$d", "LJj6;", "", "value", "LXu;", "axis", "", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$d */
    /* loaded from: classes3.dex */
    public static final class C14810d extends AbstractC33806Jj6 {

        /* renamed from: a */
        public final /* synthetic */ Map<Float, String> f63964a;

        public C14810d(Map<Float, String> map) {
            this.f63964a = map;
        }

        @Override // p000.AbstractC33806Jj6
        /* renamed from: a */
        public String mo58186a(float f, AbstractC9544Xu abstractC9544Xu) {
            String str = this.f63964a.get(Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$e */
    /* loaded from: classes3.dex */
    public static final class C14811e extends Lambda implements Function0<Integer> {
        public C14811e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf((int) TargetBarChart.this.m52017L().m106401G());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$f */
    /* loaded from: classes3.dex */
    public static final class C14812f extends Lambda implements Function0<Integer> {
        public C14812f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf((int) TargetBarChart.this.m52017L().m106399I());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.TargetBarChart$g */
    /* loaded from: classes3.dex */
    public static final class C14813g extends Lambda implements Function0<Integer> {
        public C14813g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(NA0.m94301c(TargetBarChart.this.getContext(), C32364Df4.primaryText));
        }
    }

    public TargetBarChart(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C14811e());
        this.f63960O0 = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14812f());
        this.f63961P0 = lazy2;
        this.f63962Q0 = (int) C49347td3.m12001b(30);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14813g());
        this.f63963R0 = lazy3;
    }

    /* renamed from: A0 */
    public final Pair<Rect, Rect> m58193A0(FleetReportBarChartLine line) {
        int i;
        Rect rect;
        Intrinsics.checkNotNullParameter(line, "line");
        List<FleetReportBarChartValue> list = this.f63959N0;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
            list = null;
        }
        OE2 m110833e = mo2231d(C37875aI6.EnumC10624a.LEFT).m110833e(Math.max(7.0f, list.size()), (float) line.getValue());
        int i2 = (int) m110833e.f26254c;
        int i3 = (int) m110833e.f26255d;
        TargetDirection fillDirection = line.getFillDirection();
        if (fillDirection == null) {
            i = -1;
        } else {
            i = C14808b.$EnumSwitchMapping$0[fillDirection.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                rect = new Rect(0, 0, 0, 0);
            } else {
                rect = new Rect(m58192w0(), i3, i2, ((int) m52017L().m106375l()) - m58191x0());
            }
        } else {
            rect = new Rect(m58192w0(), 0, i2, i3);
        }
        int i4 = this.f63962Q0;
        return TuplesKt.m28425to(rect, new Rect(i2 - (i4 / 2), i3 - (i4 / 2), i2 + (i4 / 2), i3 + (i4 / 2)));
    }

    /* renamed from: w0 */
    public final int m58192w0() {
        return ((Number) this.f63960O0.getValue()).intValue();
    }

    /* renamed from: x0 */
    public final int m58191x0() {
        return ((Number) this.f63961P0.getValue()).intValue();
    }

    /* renamed from: y0 */
    public final int m58190y0() {
        return ((Number) this.f63963R0.getValue()).intValue();
    }

    /* renamed from: z0 */
    public final void m58189z0(FleetReportBarChart chart, List<FleetReportBarChartValue> values) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Map map;
        List sortedWith;
        Object first;
        int collectionSizeOrDefault3;
        float f;
        List listOf;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(values, "values");
        m52007s();
        this.f63959N0 = values;
        List<FleetReportBarChartValue> list = values;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetReportBarChartValue fleetReportBarChartValue : list) {
            arrayList.add(fleetReportBarChartValue.getLabel());
        }
        mo51991M().m76138O(new C48399s12(arrayList));
        mo51991M().m93266h(m58190y0());
        List<FleetReportChartAxis> yAxis = chart.getYAxis();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(yAxis, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (FleetReportChartAxis fleetReportChartAxis : yAxis) {
            arrayList2.add(TuplesKt.m28425to(Float.valueOf((float) fleetReportChartAxis.getValue()), fleetReportChartAxis.getLabel()));
        }
        map = MapsKt__MapsKt.toMap(arrayList2);
        m52044d0().m76138O(new C14810d(map));
        m52044d0().m76146G(0.0f);
        C37875aI6 m52044d0 = m52044d0();
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(chart.getYAxis(), new C14809c());
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) sortedWith);
        m52044d0.m76147F((float) ((FleetReportChartAxis) first).getValue());
        m52044d0().m76141L(map.size(), true);
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FleetReportBarChartValue fleetReportBarChartValue2 = (FleetReportBarChartValue) obj;
            float f2 = i;
            Double value = fleetReportBarChartValue2.getValue();
            if (value != null) {
                f = (float) value.doubleValue();
            } else {
                f = 0.0f;
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(new BarEntry(f2, f));
            C29345ux c29345ux = new C29345ux(listOf, "");
            c29345ux.m4021R0(fleetReportBarChartValue2.getColor().getLightMode());
            c29345ux.m4020S0(false);
            arrayList3.add(c29345ux);
            i = i2;
        }
        C28485sx c28485sx = new C28485sx(arrayList3);
        c28485sx.m13372t(0.7f);
        setData(c28485sx);
        m52044d0().m76148E();
        for (FleetReportBarChartLine fleetReportBarChartLine : chart.getLines()) {
            C37875aI6 m52044d02 = m52044d0();
            C38203ar2 c38203ar2 = new C38203ar2((float) fleetReportBarChartLine.getValue());
            c38203ar2.m65381q(fleetReportBarChartLine.getColor().getLightMode());
            c38203ar2.m65389i(10.0f, 10.0f, 10.0f);
            m52044d02.m76137i(c38203ar2);
        }
        m52044d0().m76143J(false);
        mo51991M().m76146G(-1.0f);
        mo51991M().m76147F(Math.max(7.0f, values.size()));
        mo51991M().m12528S(C49149tH6.EnumC28671a.BOTTOM);
        mo51991M().m76145H(false);
        m52044d0().m76145H(false);
        m52042f0().m76145H(false);
        m52042f0().m71675e0(false);
        m52042f0().m76144I(false);
        m52026A().m93267g(false);
        m52019I().m93267g(false);
    }

    public TargetBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C14811e());
        this.f63960O0 = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14812f());
        this.f63961P0 = lazy2;
        this.f63962Q0 = (int) C49347td3.m12001b(30);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14813g());
        this.f63963R0 = lazy3;
    }

    public TargetBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C14811e());
        this.f63960O0 = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14812f());
        this.f63961P0 = lazy2;
        this.f63962Q0 = (int) C49347td3.m12001b(30);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14813g());
        this.f63963R0 = lazy3;
    }
}
