package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.feature.fleetstatus.kpi.views.FleetReportChartLegendView;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.LineStroke;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportLineChartLine;
import co.bird.android.model.persistence.nestedstructures.FleetReportPanel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;", "Landroidx/cardview/widget/CardView;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;", "panel", "", "w", "r", "s", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;", "chart", "u", "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;", "v", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "t", "Lbr6;", "k", "Lbr6;", "binding", "Landroid/view/View;", "l", "Landroid/view/View;", "chartView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportPanelView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportPanelView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1#2:127\n1549#3:128\n1620#3,3:129\n*S KotlinDebug\n*F\n+ 1 FleetReportPanelView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView\n*L\n102#1:128\n102#1:129,3\n*E\n"})
/* loaded from: classes3.dex */
public final class FleetReportPanelView extends CardView {

    /* renamed from: k */
    public final C38800br6 f63952k;

    /* renamed from: l */
    public View f63953l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportPanelView$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14805a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LineStroke.values().length];
            try {
                iArr[LineStroke.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineStroke.DOTTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LineStroke.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportPanelView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38800br6 m62274b = C38800br6.m62274b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62274b, "inflate(context.layoutInflater, this)");
        this.f63952k = m62274b;
    }

    /* renamed from: r */
    public final void m58201r() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        FleetReportBarChartView fleetReportBarChartView = new FleetReportBarChartView(context);
        fleetReportBarChartView.setLayoutParams(m58199t());
        ConstraintLayout constraintLayout = this.f63952k.f59643d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.constraintLayout");
        constraintLayout.addView(fleetReportBarChartView);
        this.f63953l = fleetReportBarChartView;
    }

    /* renamed from: s */
    public final void m58200s() {
        FleetReportLineChartView fleetReportLineChartView = new FleetReportLineChartView(getContext());
        fleetReportLineChartView.setLayoutParams(m58199t());
        ConstraintLayout constraintLayout = this.f63952k.f59643d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.constraintLayout");
        constraintLayout.addView(fleetReportLineChartView);
        this.f63953l = fleetReportLineChartView;
    }

    /* renamed from: t */
    public final ConstraintLayout.LayoutParams m58199t() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, 0);
        layoutParams.f53989j = C45831nh4.legend;
        layoutParams.f53993l = C45831nh4.constraintLayout;
        layoutParams.setMarginStart((int) C49347td3.m12001b(8));
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) C49347td3.m12001b(4);
        layoutParams.setMarginEnd((int) C49347td3.m12001b(8));
        layoutParams.f54017x = (int) C49347td3.m12001b(12);
        layoutParams.f53953I = "H,309:236";
        return layoutParams;
    }

    /* renamed from: u */
    public final void m58198u(FleetReportBarChart fleetReportBarChart) {
        FleetReportBarChartView fleetReportBarChartView;
        View view = this.f63953l;
        if (view instanceof FleetReportBarChartView) {
            fleetReportBarChartView = (FleetReportBarChartView) view;
        } else {
            fleetReportBarChartView = null;
        }
        if (fleetReportBarChartView != null) {
            fleetReportBarChartView.m58213C0(fleetReportBarChart);
        }
        FleetReportChartLegendView fleetReportChartLegendView = this.f63952k.f59646g;
        Intrinsics.checkNotNullExpressionValue(fleetReportChartLegendView, "binding.legend");
        C49520tu6.show$default(fleetReportChartLegendView, false, 0, 2, null);
    }

    /* renamed from: v */
    public final void m58197v(FleetReportLineChart fleetReportLineChart) {
        FleetReportLineChartView fleetReportLineChartView;
        int collectionSizeOrDefault;
        FleetReportChartLegendView.EnumC14804c enumC14804c;
        View view = this.f63953l;
        if (view instanceof FleetReportLineChartView) {
            fleetReportLineChartView = (FleetReportLineChartView) view;
        } else {
            fleetReportLineChartView = null;
        }
        if (fleetReportLineChartView != null) {
            fleetReportLineChartView.m58187x0(fleetReportLineChart);
        }
        FleetReportChartLegendView fleetReportChartLegendView = this.f63952k.f59646g;
        Intrinsics.checkNotNullExpressionValue(fleetReportChartLegendView, "binding.legend");
        C49520tu6.show$default(fleetReportChartLegendView, true, 0, 2, null);
        List<FleetReportLineChartLine> lines = fleetReportLineChart.getLines();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(lines, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetReportLineChartLine fleetReportLineChartLine : lines) {
            int i = C14805a.$EnumSwitchMapping$0[fleetReportLineChartLine.getStroke().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC14804c = FleetReportChartLegendView.EnumC14804c.SOLID;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    enumC14804c = FleetReportChartLegendView.EnumC14804c.DOTTED;
                }
            } else {
                enumC14804c = FleetReportChartLegendView.EnumC14804c.SOLID;
            }
            arrayList.add(new FleetReportChartLegendView.C14803b(fleetReportLineChartLine.getColor().getLightMode(), fleetReportLineChartLine.getLabel(), enumC14804c));
        }
        FleetReportChartLegendView fleetReportChartLegendView2 = this.f63952k.f59646g;
        Intrinsics.checkNotNullExpressionValue(fleetReportChartLegendView2, "binding.legend");
        fleetReportChartLegendView2.setEntries(arrayList);
    }

    /* renamed from: w */
    public final void m58196w(FleetReportPanel panel) {
        Unit unit;
        Intrinsics.checkNotNullParameter(panel, "panel");
        this.f63952k.f59650k.setText(panel.getTitle());
        this.f63952k.f59650k.setTextColor(panel.getColor().getLightMode());
        this.f63952k.f59651l.setBackgroundTintList(ColorStateList.valueOf(panel.getColor().getLightMode()));
        ImageView imageView = this.f63952k.f59651l;
        ClientIcon icon = panel.getIcon();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
        String targetValue = panel.getTargetValue();
        Unit unit2 = null;
        if (targetValue != null) {
            this.f63952k.f59648i.setText(targetValue);
            this.f63952k.f59649j.setText(getContext().getString(C45871nl4.target));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            TextView textView = this.f63952k.f59648i;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.targetValue");
            C49520tu6.m11239l(textView);
            ImageView imageView2 = this.f63952k.f59647h;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.targetIcon");
            C49520tu6.m11239l(imageView2);
            TextView textView2 = this.f63952k.f59649j;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.targetValueMessage");
            C49520tu6.m11239l(textView2);
            this.f63952k.f59644e.setVisibility(4);
        }
        String actualValue = panel.getActualValue();
        if (actualValue != null) {
            this.f63952k.f59641b.setText(actualValue);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            TextView textView3 = this.f63952k.f59641b;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.actualValue");
            C49520tu6.m11239l(textView3);
            TextView textView4 = this.f63952k.f59642c;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.actualValueMessage");
            C49520tu6.m11239l(textView4);
        }
        String actualValueMessage = panel.getActualValueMessage();
        if (actualValueMessage != null) {
            this.f63952k.f59642c.setText(actualValueMessage);
        }
        if (panel.getTargetValue() == null && panel.getActualValue() == null) {
            View view = this.f63952k.f59644e;
            Intrinsics.checkNotNullExpressionValue(view, "binding.divider");
            C49520tu6.m11239l(view);
        }
        FleetReportChart chart = panel.getChart();
        boolean z = chart instanceof FleetReportBarChart;
        if (z) {
            View view2 = this.f63953l;
            if (!(view2 instanceof FleetReportBarChartView)) {
                this.f63952k.f59643d.removeView(view2);
                m58201r();
                m58198u((FleetReportBarChart) chart);
                return;
            }
        }
        boolean z2 = chart instanceof FleetReportLineChart;
        if (z2) {
            View view3 = this.f63953l;
            if (!(view3 instanceof FleetReportLineChartView)) {
                this.f63952k.f59643d.removeView(view3);
                m58200s();
                m58197v((FleetReportLineChart) chart);
                return;
            }
        }
        if (z) {
            m58198u((FleetReportBarChart) chart);
        } else if (z2) {
            m58197v((FleetReportLineChart) chart);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportPanelView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38800br6 m62274b = C38800br6.m62274b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62274b, "inflate(context.layoutInflater, this)");
        this.f63952k = m62274b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportPanelView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38800br6 m62274b = C38800br6.m62274b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62274b, "inflate(context.layoutInflater, this)");
        this.f63952k = m62274b;
    }
}
