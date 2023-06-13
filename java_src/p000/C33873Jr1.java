package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.constant.ChartFillStrategy;
import co.bird.android.model.persistence.FleetStatusSummary;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChartSection;
import co.bird.android.widget.PieChart;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LJr1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetStatusSummary;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "fleetSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33873Jr1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<FleetStatusSummary> f18345c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LJr1$a;", "Lw1;", "", "position", "", "bind", "LRb2;", "b", "LRb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LJr1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n18#2:88\n9#3,4:89\n1549#4:93\n1620#4,3:94\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder\n*L\n54#1:88\n54#1:89,4\n67#1:93\n67#1:94,3\n*E\n"})
    /* renamed from: Jr1$a */
    /* loaded from: classes3.dex */
    public final class C4268a extends C29735w1 {

        /* renamed from: b */
        public final C35602Rb2 f18346b;

        /* renamed from: c */
        public final /* synthetic */ C33873Jr1 f18347c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n18#2:88\n9#3,4:89\n1#4:93\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder$1\n*L\n49#1:88\n49#1:89,4\n*E\n"})
        /* renamed from: Jr1$a$a */
        /* loaded from: classes3.dex */
        public static final class C4269a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C33873Jr1 f18349h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4269a(C33873Jr1 c33873Jr1) {
                super(1);
                this.f18349h = c33873Jr1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C4268a.this.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                Object m105816c = this.f18349h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof FleetStatusSummary)) {
                    m105816c = null;
                }
                FleetStatusSummary fleetStatusSummary = (FleetStatusSummary) m105816c;
                if (fleetStatusSummary != null) {
                    this.f18349h.f18345c.onNext(fleetStatusSummary);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4268a(C33873Jr1 c33873Jr1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f18347c = c33873Jr1;
            C35602Rb2 m86576a = C35602Rb2.m86576a(view);
            Intrinsics.checkNotNullExpressionValue(m86576a, "bind(view)");
            this.f18346b = m86576a;
            ConstraintLayout root = m86576a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C4269a(c33873Jr1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            PieChart.EnumC16552c enumC16552c;
            int collectionSizeOrDefault;
            Object m105816c = this.f18347c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetStatusSummary)) {
                m105816c = null;
            }
            FleetStatusSummary fleetStatusSummary = (FleetStatusSummary) m105816c;
            if (fleetStatusSummary != null) {
                FleetStatusChart chart = fleetStatusSummary.getChart();
                if (chart != null) {
                    PieChart bind$lambda$2$lambda$1 = this.f18346b.f32267d;
                    Intrinsics.checkNotNullExpressionValue(bind$lambda$2$lambda$1, "bind$lambda$2$lambda$1");
                    C49520tu6.m11233r(bind$lambda$2$lambda$1);
                    bind$lambda$2$lambda$1.setStartDegrees(chart.getFromDegrees());
                    if (chart.getFillStrategy() == ChartFillStrategy.FILL_CLOCKWISE) {
                        enumC16552c = PieChart.EnumC16552c.CLOCKWISE;
                    } else {
                        enumC16552c = PieChart.EnumC16552c.COUNTER_CLOCKWISE;
                    }
                    bind$lambda$2$lambda$1.setDirection(enumC16552c);
                    List<FleetStatusChartSection> sections = chart.getSections();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (FleetStatusChartSection fleetStatusChartSection : sections) {
                        arrayList.add(new PieChart.C16551b(fleetStatusChartSection.getId(), fleetStatusChartSection.getPosition(), fleetStatusChartSection.getFillDegrees(), fleetStatusChartSection.getFillColor().getLightMode(), fleetStatusChartSection.getFillHeight(), null, 32, null));
                    }
                    bind$lambda$2$lambda$1.setData(arrayList);
                } else {
                    PieChart pieChart = this.f18346b.f32267d;
                    Intrinsics.checkNotNullExpressionValue(pieChart, "binding.pieChart");
                    C49520tu6.m11239l(pieChart);
                }
                this.f18346b.f32268e.setText(fleetStatusSummary.getTitle());
                this.f18346b.f32266c.setText(fleetStatusSummary.getDescription());
            }
        }
    }

    public C33873Jr1() {
        C24558d<FleetStatusSummary> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<FleetStatusSummary>()");
        this.f18345c = m31902e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C34809Nr1());
        }
    }

    /* renamed from: v */
    public final Observable<FleetStatusSummary> m99624v() {
        Observable<FleetStatusSummary> hide = this.f18345c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C38125aj4.item_fleet_status_summary ? new C4268a(this, m41761u) : new C29735w1(m41761u);
    }
}
