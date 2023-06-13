package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.TargetDirection;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChart;
import co.bird.android.model.persistence.nestedstructures.FleetReportBarChartLine;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;", "Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;", "chart", "", "C0", "", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;", "barChart", "B0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "T0", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportBarChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportBarChartView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1855#2:83\n1856#2:85\n1#3:84\n*S KotlinDebug\n*F\n+ 1 FleetReportBarChartView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView\n*L\n37#1:83\n37#1:85\n*E\n"})
/* loaded from: classes3.dex */
public final class FleetReportBarChartView extends TargetBarChart {

    /* renamed from: T0 */
    public static final C14799a f63933T0 = new C14799a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;", "", "", "DARK_ALPHA_LEVEL", "I", "LIGHT_ALPHA_LEVEL", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportBarChartView$a */
    /* loaded from: classes3.dex */
    public static final class C14799a {
        public /* synthetic */ C14799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14799a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportBarChartView$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14800b {
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

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportBarChartView$c */
    /* loaded from: classes3.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC14801c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        public final /* synthetic */ TargetBarChart f63935c;

        /* renamed from: d */
        public final /* synthetic */ FleetReportBarChartLine f63936d;

        /* renamed from: e */
        public final /* synthetic */ View f63937e;

        /* renamed from: f */
        public final /* synthetic */ View f63938f;

        public ViewTreeObserver$OnPreDrawListenerC14801c(TargetBarChart targetBarChart, FleetReportBarChartLine fleetReportBarChartLine, View view, View view2) {
            this.f63935c = targetBarChart;
            this.f63936d = fleetReportBarChartLine;
            this.f63937e = view;
            this.f63938f = view2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            FleetReportBarChartView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            Pair<Rect, Rect> m58193A0 = this.f63935c.m58193A0(this.f63936d);
            View view = this.f63937e;
            if (view != null) {
                Rect first = m58193A0.getFirst();
                view.layout(first.left, first.top, first.right, first.bottom);
                C49520tu6.m11233r(view);
            }
            Rect second = m58193A0.getSecond();
            this.f63938f.layout(second.left, second.top, second.right, second.bottom);
            View targetMarkView = this.f63938f;
            Intrinsics.checkNotNullExpressionValue(targetMarkView, "targetMarkView");
            C49520tu6.m11233r(targetMarkView);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportBarChartView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: B0 */
    public final void m58214B0(List<FleetReportBarChartLine> list, TargetBarChart targetBarChart) {
        View view;
        int[] iArr;
        removeAllViews();
        for (FleetReportBarChartLine fleetReportBarChartLine : list) {
            TargetDirection fillDirection = fleetReportBarChartLine.getFillDirection();
            if (fillDirection != null) {
                View view2 = new View(getContext());
                view2.setVisibility(4);
                addView(view2, 0);
                Drawable m94299e = NA0.m94299e(getContext(), C33777Jg4.report_chart_line_fill);
                Intrinsics.checkNotNull(m94299e, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) m94299e;
                int m99845p = C33827Jm0.m99845p(fleetReportBarChartLine.getColor().getLightMode(), 0);
                int m99845p2 = C33827Jm0.m99845p(fleetReportBarChartLine.getColor().getLightMode(), 54);
                gradientDrawable.mutate();
                int i = C14800b.$EnumSwitchMapping$0[fillDirection.ordinal()];
                if (i != 1) {
                    iArr = i != 2 ? null : new int[]{m99845p2, m99845p};
                } else {
                    iArr = new int[]{m99845p, m99845p2};
                }
                gradientDrawable.setColors(iArr);
                view2.setBackground(gradientDrawable);
                view = view2;
            } else {
                view = null;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            View inflate = C40788fB0.m41772j(context).inflate(C38125aj4.view_line_target_mark, (ViewGroup) null);
            inflate.setBackgroundTintList(ColorStateList.valueOf(fleetReportBarChartLine.getColor().getLightMode()));
            addView(inflate);
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC14801c(targetBarChart, fleetReportBarChartLine, view, inflate));
        }
    }

    /* renamed from: C0 */
    public final void m58213C0(FleetReportBarChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        m58189z0(chart, chart.getValues());
        Unit unit = Unit.INSTANCE;
        m58214B0(chart.getLines(), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportBarChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportBarChartView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
