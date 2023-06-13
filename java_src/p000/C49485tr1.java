package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.fleetstatus.kpi.views.SquareFrameLayout;
import co.bird.android.model.constant.ChartFillStrategy;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChartSection;
import co.bird.android.model.persistence.nestedstructures.FleetStatusKind;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import co.bird.android.widget.PieChart;
import com.facebook.share.internal.C17296a;
import com.google.android.material.appbar.AppBarLayout;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b@\u0010AJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0014\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0014\u0010\u001a\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010\u000b0\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006C"}, m28432d2 = {"Ltr1;", "LxE;", "", "fleetName", "", "t", "", "enabled", "Wl", "fm", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetStatus;", "em", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "Yl", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "Zl", "", "Vl", "Ul", "LH6;", "sections", "dm", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "chart", "cm", "bm", "show", "gm", "Lfy1;", "b", "Lfy1;", "binding", "LKZ3;", "c", "LKZ3;", "predictionAdapter", "Landroidx/recyclerview/widget/r;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/r;", "snapHelper", "Lmq1;", "e", "Lmq1;", "stateAdapter", "", "f", "F", "targetElevation", "Landroid/animation/ObjectAnimator;", "g", "Landroid/animation/ObjectAnimator;", "predictionFrameElevationAnimator", "Landroid/animation/AnimatorSet;", "h", "Landroid/animation/AnimatorSet;", "pieChartAnimator", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/d;", "predictionSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lfy1;)V", "j", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1549#2:256\n1620#2,3:257\n1#3:260\n*S KotlinDebug\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi\n*L\n204#1:256\n204#1:257,3\n*E\n"})
/* renamed from: tr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49485tr1 extends AbstractC30071xE {

    /* renamed from: j */
    public static final C28839b f111137j = new C28839b(null);

    /* renamed from: k */
    public static final OvershootInterpolator f111138k = new OvershootInterpolator();

    /* renamed from: b */
    public final C41254fy1 f111139b;

    /* renamed from: c */
    public final KZ3 f111140c;

    /* renamed from: d */
    public final C11947r f111141d;

    /* renamed from: e */
    public final C45325mq1 f111142e;

    /* renamed from: f */
    public float f111143f;

    /* renamed from: g */
    public ObjectAnimator f111144g;

    /* renamed from: h */
    public AnimatorSet f111145h;

    /* renamed from: i */
    public final C24558d<FleetStatus> f111146i;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"tr1$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", C17296a.f69688o, "I", "currentPosition", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi$2$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n18#2:256\n9#3,4:257\n1#4:261\n*S KotlinDebug\n*F\n+ 1 FleetStatusUi.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusUi$2$1\n*L\n140#1:256\n140#1:257,4\n*E\n"})
    /* renamed from: tr1$a */
    /* loaded from: classes3.dex */
    public static final class C28838a extends RecyclerView.AbstractC11863t {

        /* renamed from: a */
        public int f111147a = -1;

        public C28838a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View mo65647g;
            Integer m40591a;
            int intValue;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i != 0 || (mo65647g = C49485tr1.this.f111141d.mo65647g(recyclerView.getLayoutManager())) == null || (m40591a = C41207ft4.m40591a(recyclerView, mo65647g)) == null || (intValue = m40591a.intValue()) == this.f111147a) {
                return;
            }
            this.f111147a = intValue;
            Object m105816c = C49485tr1.this.f111140c.m94544p(intValue).m105816c();
            if (!(m105816c instanceof FleetStatus)) {
                m105816c = null;
            }
            FleetStatus fleetStatus = (FleetStatus) m105816c;
            if (fleetStatus != null) {
                C49485tr1.this.f111146i.onNext(fleetStatus);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Ltr1$b;", "", "", "ANIMATION_DURATION_MS", "J", "", "CHART_MIN_HEIGHT_SCALE", "F", "Landroid/view/animation/OvershootInterpolator;", "OVERSHOOT_INTERPOLATOR", "Landroid/view/animation/OvershootInterpolator;", "", "PREDICTION_CARD_ELEVATION_DP", "I", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tr1$b */
    /* loaded from: classes3.dex */
    public static final class C28839b {
        public /* synthetic */ C28839b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28839b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49485tr1(final BaseActivity activity, C41254fy1 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f111139b = binding;
        KZ3 kz3 = new KZ3();
        this.f111140c = kz3;
        C11947r c11947r = new C11947r();
        this.f111141d = c11947r;
        C45325mq1 c45325mq1 = new C45325mq1();
        this.f111142e = c45325mq1;
        C24558d<FleetStatus> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<FleetStatus>()");
        this.f111146i = m31902e;
        binding.f81228e.post(new Runnable() { // from class: pr1
            @Override // java.lang.Runnable
            public final void run() {
                C49485tr1.m11610Tl(C49485tr1.this, activity);
            }
        });
        RecyclerView recyclerView = binding.f81231h;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        recyclerView.setItemAnimator(new C11894g());
        c11947r.m66132b(recyclerView);
        recyclerView.setAdapter(kz3);
        recyclerView.addOnScrollListener(new C28838a());
        RecyclerView recyclerView2 = binding.f81233j;
        recyclerView2.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView2.setItemAnimator(new C11894g());
        recyclerView2.setAdapter(c45325mq1);
        ActionBar supportActionBar = activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(activity.getString(C45871nl4.fleet_status_label));
        }
    }

    /* renamed from: Tl */
    public static final void m11610Tl(final C49485tr1 this$0, final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        final int measuredHeight = this$0.f111139b.f81227d.getMeasuredHeight();
        this$0.f111139b.f81225b.m50469e(new AppBarLayout.InterfaceC17664f() { // from class: qr1
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC17660b
            /* renamed from: a */
            public final void mo16909a(AppBarLayout appBarLayout, int i) {
                C49485tr1.m11603am(measuredHeight, this$0, activity, appBarLayout, i);
            }
        });
    }

    /* renamed from: Xl */
    public static final void m11606Xl(C49485tr1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f111139b.f81225b.setPaddingRelative(0, this$0.f111139b.f81232i.getMeasuredHeight(), 0, 0);
    }

    /* renamed from: am */
    public static final void m11603am(int i, C49485tr1 this$0, BaseActivity activity, AppBarLayout appBarLayout, int i2) {
        float f;
        float m12002a;
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        float f2 = i;
        float max = Math.max((int) (f2 * 0.6f), i + i2);
        float f3 = max / f2;
        float f4 = 1;
        float f5 = f4 - ((f4 - f3) / 0.39999998f);
        PieChart pieChart = this$0.f111139b.f81228e;
        ViewGroup.LayoutParams layoutParams = pieChart.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i3 = ((FrameLayout.LayoutParams) layoutParams).topMargin;
        pieChart.setTranslationY((i3 / f3) - i3);
        Float valueOf = Float.valueOf(Math.max(f3, 0.6f));
        if (!Boolean.valueOf(!Float.isNaN(valueOf.floatValue())).booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            f = valueOf.floatValue();
        } else {
            f = 0.6f;
        }
        pieChart.setScaleX(f);
        pieChart.setLabelAlpha(f5);
        float f6 = f2 - max;
        SquareFrameLayout squareFrameLayout = this$0.f111139b.f81227d;
        squareFrameLayout.setScaleY(f3);
        int i4 = (f3 > 0.6f ? 1 : (f3 == 0.6f ? 0 : -1));
        if (i4 > 0) {
            f6 = -i2;
        }
        squareFrameLayout.setTranslationY(f6 / 2);
        ViewGroup.LayoutParams layoutParams2 = this$0.f111139b.f81230g.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this$0.f111139b.f81230g.setScaleY(f4 / f3);
        LinearLayout linearLayout = this$0.f111139b.f81230g;
        int i5 = ((FrameLayout.LayoutParams) layoutParams2).topMargin;
        linearLayout.setTranslationY((i5 / f3) - (i5 * f3));
        if (i4 > 0) {
            m12002a = 0.0f;
        } else {
            m12002a = C49347td3.m12002a(2, activity);
        }
        if (this$0.f111143f == m12002a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        this$0.f111143f = m12002a;
        ObjectAnimator objectAnimator = this$0.f111144g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        CardView cardView = this$0.f111139b.f81232i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, "cardElevation", cardView.m68898i(), m12002a);
        ofFloat.setDuration(200L);
        ofFloat.start();
        this$0.f111144g = ofFloat;
    }

    /* renamed from: hm */
    public static final void m11596hm(FrameLayout.LayoutParams params, C49485tr1 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(params, "$params");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        params.topMargin = ((Integer) animatedValue).intValue();
        this$0.f111139b.f81228e.setLayoutParams(params);
    }

    /* renamed from: Ul */
    public final Observable<Unit> m11609Ul() {
        LinearLayout linearLayout = this.f111139b.f81230g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.predictionButton");
        return C44626lf5.clicksThrottle$default(linearLayout, 0L, 1, null);
    }

    /* renamed from: Vl */
    public final Observable<List<String>> m11608Vl() {
        return this.f111142e.m24870v();
    }

    /* renamed from: Wl */
    public final void m11607Wl(boolean z) {
        CardView cardView = this.f111139b.f81232i;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.predictionsFrame");
        C49520tu6.m11232s(cardView, z, 4);
        if (z) {
            this.f111139b.f81232i.post(new Runnable() { // from class: rr1
                @Override // java.lang.Runnable
                public final void run() {
                    C49485tr1.m11606Xl(C49485tr1.this);
                }
            });
        } else {
            this.f111139b.f81225b.setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* renamed from: Yl */
    public final Observable<FleetStatusKind> m11605Yl() {
        return this.f111142e.m24868x();
    }

    /* renamed from: Zl */
    public final Observable<FleetSubstate> m11604Zl() {
        return this.f111142e.m24869w();
    }

    /* renamed from: bm */
    public final void m11602bm(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f111142e.mo24871u(sections);
    }

    /* renamed from: cm */
    public final void m11601cm(FleetStatusChart chart) {
        PieChart.EnumC16552c enumC16552c;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(chart, "chart");
        SquareFrameLayout squareFrameLayout = this.f111139b.f81227d;
        Intrinsics.checkNotNullExpressionValue(squareFrameLayout, "binding.chartFrame");
        C49520tu6.m11233r(squareFrameLayout);
        PieChart pieChart = this.f111139b.f81228e;
        pieChart.setTitle(chart.getTitle());
        pieChart.setStartDegrees(chart.getFromDegrees());
        if (chart.getFillStrategy() == ChartFillStrategy.FILL_CLOCKWISE) {
            enumC16552c = PieChart.EnumC16552c.CLOCKWISE;
        } else {
            enumC16552c = PieChart.EnumC16552c.COUNTER_CLOCKWISE;
        }
        pieChart.setDirection(enumC16552c);
        List<FleetStatusChartSection> sections = chart.getSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetStatusChartSection fleetStatusChartSection : sections) {
            arrayList.add(new PieChart.C16551b(fleetStatusChartSection.getId(), fleetStatusChartSection.getPosition(), fleetStatusChartSection.getFillDegrees(), fleetStatusChartSection.getFillColor().getLightMode(), fleetStatusChartSection.getFillHeight(), fleetStatusChartSection.getLabel()));
        }
        this.f111139b.f81228e.m54499d(arrayList, 500L, f111138k);
    }

    /* renamed from: dm */
    public final void m11600dm(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f111140c.mo24871u(sections);
        this.f111139b.f81231h.smoothScrollToPosition(0);
        this.f111139b.f81231h.scrollToPosition(0);
    }

    /* renamed from: em */
    public final Observable<FleetStatus> m11599em() {
        Observable<FleetStatus> hide = this.f111146i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "predictionSubject.hide()");
        return hide;
    }

    /* renamed from: fm */
    public final void m11598fm() {
        this.f111139b.f81231h.smoothScrollToPosition(0);
    }

    /* renamed from: gm */
    public final void m11597gm(boolean z) {
        boolean z2;
        int i;
        float f = 1.0f;
        if (this.f111139b.f81230g.getAlpha() == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        AnimatorSet animatorSet = this.f111145h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ViewGroup.LayoutParams layoutParams = this.f111139b.f81228e.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            i = this.f111139b.f81230g.getHeight();
        } else {
            i = 0;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams2.topMargin, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sr1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C49485tr1.m11596hm(layoutParams2, this, valueAnimator);
            }
        });
        if (!z) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f111139b.f81230g, "alpha", f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(400L);
        animatorSet2.playTogether(ofInt, ofFloat);
        animatorSet2.start();
        this.f111145h = animatorSet2;
    }

    /* renamed from: t */
    public final void m11595t(String fleetName) {
        Intrinsics.checkNotNullParameter(fleetName, "fleetName");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(fleetName);
        }
    }
}
