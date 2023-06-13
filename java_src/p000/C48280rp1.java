package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.fleetstatus.kpi.views.FleetReportPanelView;
import co.bird.android.feature.fleetstatus.kpi.views.PeriodView;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.persistence.FleetTargetScoreboard;
import co.bird.android.model.persistence.nestedstructures.FleetReportPanel;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0005\u001c\u001d\u000b\u000f\u0012B\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001e"}, m28432d2 = {"Lrp1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lma4;", "", "kotlin.jvm.PlatformType", "c", "Lma4;", "mutableReportClicks", "", DateTokenConverter.CONVERTER_KEY, "mutableInfoClicks", "Lio/reactivex/Observable;", "e", "Lkotlin/Lazy;", "v", "()Lio/reactivex/Observable;", "periodClicks", "f", "getInfoClicks", "infoClicks", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48280rp1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Unit> f107685c;

    /* renamed from: d */
    public final C45168ma4<String> f107686d;

    /* renamed from: e */
    public final Lazy f107687e;

    /* renamed from: f */
    public final Lazy f107688f;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lrp1$a;", "Lw1;", "", "position", "", "bind", "Ljf2;", "b", "Ljf2;", "binding", "", "c", "Ljava/lang/String;", "info", "Landroid/view/View;", "view", "<init>", "(Lrp1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportChartViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportChartViewHolder\n*L\n97#1:105\n97#1:106,4\n*E\n"})
    /* renamed from: rp1$a */
    /* loaded from: classes3.dex */
    public final class C28008a extends C29735w1 {

        /* renamed from: b */
        public final C43437jf2 f107689b;

        /* renamed from: c */
        public String f107690c;

        /* renamed from: d */
        public final /* synthetic */ C48280rp1 f107691d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportChartViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
        /* renamed from: rp1$a$a */
        /* loaded from: classes3.dex */
        public static final class C28009a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C48280rp1 f107693h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28009a(C48280rp1 c48280rp1) {
                super(1);
                this.f107693h = c48280rp1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str = C28008a.this.f107690c;
                if (str != null) {
                    this.f107693h.f107686d.accept(str);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28008a(C48280rp1 c48280rp1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f107691d = c48280rp1;
            C43437jf2 m30130a = C43437jf2.m30130a(view);
            Intrinsics.checkNotNullExpressionValue(m30130a, "bind(view)");
            this.f107689b = m30130a;
            FleetReportPanelView root = m30130a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C28009a(c48280rp1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f107691d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetReportPanel)) {
                m105816c = null;
            }
            FleetReportPanel fleetReportPanel = (FleetReportPanel) m105816c;
            if (fleetReportPanel != null) {
                this.f107690c = fleetReportPanel.getInfo();
                this.f107689b.getRoot().m58196w(fleetReportPanel);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lrp1$b;", "Lw1;", "", "position", "", "bind", "Lkf2;", "b", "Lkf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lrp1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportPeriodViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportPeriodViewHolder\n*L\n70#1:105\n70#1:106,4\n*E\n"})
    /* renamed from: rp1$b */
    /* loaded from: classes3.dex */
    public final class C28010b extends C29735w1 {

        /* renamed from: b */
        public final C44030kf2 f107694b;

        /* renamed from: c */
        public final /* synthetic */ C48280rp1 f107695c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: rp1$b$a */
        /* loaded from: classes3.dex */
        public static final class C28011a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48280rp1 f107696g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28011a(C48280rp1 c48280rp1) {
                super(1);
                this.f107696g = c48280rp1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f107696g.f107685c.accept(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28010b(C48280rp1 c48280rp1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f107695c = c48280rp1;
            C44030kf2 m28687a = C44030kf2.m28687a(view);
            Intrinsics.checkNotNullExpressionValue(m28687a, "bind(view)");
            this.f107694b = m28687a;
            PeriodView root = m28687a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C28011a(c48280rp1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f107695c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetReportPeriod)) {
                m105816c = null;
            }
            FleetReportPeriod fleetReportPeriod = (FleetReportPeriod) m105816c;
            if (fleetReportPeriod != null) {
                this.f107694b.getRoot().m58195r(fleetReportPeriod);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lrp1$c;", "Lw1;", "", "position", "", "bind", "LGH1;", "b", "LGH1;", "binding", "Landroid/view/View;", "view", "<init>", "(Lrp1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ScoreboardTitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ScoreboardTitleViewHolder\n*L\n56#1:105\n56#1:106,4\n*E\n"})
    /* renamed from: rp1$c */
    /* loaded from: classes3.dex */
    public final class C28012c extends C29735w1 {

        /* renamed from: b */
        public final GH1 f107697b;

        /* renamed from: c */
        public final /* synthetic */ C48280rp1 f107698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28012c(C48280rp1 c48280rp1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f107698c = c48280rp1;
            GH1 m105533a = GH1.m105533a(view);
            Intrinsics.checkNotNullExpressionValue(m105533a, "bind(view)");
            this.f107697b = m105533a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f107698c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                this.f107697b.f11482c.setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lrp1$d;", "Lw1;", "", "position", "", "bind", "LOf2;", "b", "LOf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lrp1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$TargetScoreboardViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$TargetScoreboardViewHolder\n*L\n80#1:105\n80#1:106,4\n*E\n"})
    /* renamed from: rp1$d */
    /* loaded from: classes3.dex */
    public final class C28013d extends C29735w1 {

        /* renamed from: b */
        public final C34936Of2 f107699b;

        /* renamed from: c */
        public final /* synthetic */ C48280rp1 f107700c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28013d(C48280rp1 c48280rp1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f107700c = c48280rp1;
            C34936Of2 m91721a = C34936Of2.m91721a(view);
            Intrinsics.checkNotNullExpressionValue(m91721a, "bind(view)");
            this.f107699b = m91721a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f107700c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetTargetScoreboard)) {
                m105816c = null;
            }
            FleetTargetScoreboard fleetTargetScoreboard = (FleetTargetScoreboard) m105816c;
            if (fleetTargetScoreboard != null) {
                this.f107699b.getRoot().m58194r(fleetTargetScoreboard.getTargets());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lrp1$e;", "Lw1;", "", "position", "", "bind", "LFH1;", "b", "LFH1;", "binding", "Landroid/view/View;", "view", "<init>", "(Lrp1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$TitleViewHolder\n*L\n46#1:105\n46#1:106,4\n*E\n"})
    /* renamed from: rp1$e */
    /* loaded from: classes3.dex */
    public final class C28014e extends C29735w1 {

        /* renamed from: b */
        public final FH1 f107701b;

        /* renamed from: c */
        public final /* synthetic */ C48280rp1 f107702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28014e(C48280rp1 c48280rp1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f107702c = c48280rp1;
            FH1 m107361a = FH1.m107361a(view);
            Intrinsics.checkNotNullExpressionValue(m107361a, "bind(view)");
            this.f107701b = m107361a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f107702c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                this.f107701b.f9121b.setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rp1$f */
    /* loaded from: classes3.dex */
    public static final class C28015f extends Lambda implements Function0<Observable<String>> {
        public C28015f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return C48280rp1.this.f107686d.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rp1$g */
    /* loaded from: classes3.dex */
    public static final class C28016g extends Lambda implements Function0<Observable<Unit>> {
        public C28016g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C48280rp1.this.f107685c.hide();
        }
    }

    public C48280rp1() {
        Lazy lazy;
        Lazy lazy2;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f107685c = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f107686d = m25409g2;
        lazy = LazyKt__LazyJVMKt.lazy(new C28016g());
        this.f107687e = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C28015f());
        this.f107688f = lazy2;
    }

    /* renamed from: v */
    public final Observable<Unit> m15318v() {
        Object value = this.f107687e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-periodClicks>(...)");
        return (Observable) value;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C38125aj4.header_scoreboard ? new C28012c(this, m41761u) : i == C38125aj4.header_panel ? new C28014e(this, m41761u) : i == C38125aj4.item_report_period ? new C28010b(this, m41761u) : i == C38125aj4.item_target_scoreboard ? new C28013d(this, m41761u) : i == C38125aj4.item_report_panel ? new C28008a(this, m41761u) : new C29735w1(m41761u);
    }
}
