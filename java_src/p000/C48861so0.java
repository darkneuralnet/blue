package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.InspectButton;
import co.bird.android.model.QualityControlButton;
import co.bird.android.model.RepairButton;
import co.bird.android.model.ScrapCompletionButton;
import co.bird.android.model.ScrapInspectionButton;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.C17914b;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FBU\b\u0007\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 \u0012\b\b\u0001\u0010%\u001a\u00020 \u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\bC\u0010DJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J.\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R(\u0010;\u001a\u0004\u0018\u00010\u00122\b\u00106\u001a\u0004\u0018\u00010\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010@\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006G"}, m28432d2 = {"Lso0;", "LxE;", "Lpo0;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/ServiceCenterStatus;", "status", "", "yj", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequest", "ek", "", "visible", "Oj", "Lio/reactivex/Observable;", "Lco/bird/android/model/CommandCenterButton;", "oh", "C0", "Lio/reactivex/F;", "K", "Vl", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "tabs", "Landroidx/viewpager2/widget/ViewPager2;", "c", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "nextStep", "e", "reroute", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "chargeContainer", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "charge", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "chargeIcon", "Lvn0;", "i", "Lvn0;", "adapter", "value", "j", "Lco/bird/android/model/CommandCenterButton;", "Tl", "(Lco/bird/android/model/CommandCenterButton;)V", "button", "k", "Z", "Ul", "(Z)V", "showRerouteOnly", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lvn0;)V", "l", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterUi.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterUiImpl\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n9#2,4:215\n9#2,4:219\n*S KotlinDebug\n*F\n+ 1 CommandCenterUi.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterUiImpl\n*L\n93#1:215,4\n96#1:219,4\n*E\n"})
/* renamed from: so0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48861so0 extends AbstractC30071xE implements InterfaceC47083po0 {

    /* renamed from: l */
    public static final C28392a f109273l = new C28392a(null);

    /* renamed from: m */
    public static final Set<ServiceCenterStatus> f109274m;

    /* renamed from: n */
    public static final Set<ServiceCenterStatus> f109275n;

    /* renamed from: b */
    public final TabLayout f109276b;

    /* renamed from: c */
    public final ViewPager2 f109277c;

    /* renamed from: d */
    public final Button f109278d;

    /* renamed from: e */
    public final Button f109279e;

    /* renamed from: f */
    public final LinearLayout f109280f;

    /* renamed from: g */
    public final TextView f109281g;

    /* renamed from: h */
    public final ImageView f109282h;

    /* renamed from: i */
    public final C50629vn0 f109283i;

    /* renamed from: j */
    public CommandCenterButton f109284j;

    /* renamed from: k */
    public boolean f109285k;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\f"}, m28432d2 = {"Lso0$a;", "", "", "Lco/bird/android/model/constant/ServiceCenterStatus;", "CHARGING_BANNER_STATUSES", "Ljava/util/Set;", "", "REROUTE_DEFAULT_TOP_MARGIN_DP", "I", "REROUTE_ONLY_STATUSES", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: so0$a */
    /* loaded from: classes3.dex */
    public static final class C28392a {
        public /* synthetic */ C28392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28392a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: so0$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28393b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceCenterStatus.values().length];
            try {
                iArr[ServiceCenterStatus.CHARGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceCenterStatus.SERVICE_COMPLETE_AWAITING_EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/CommandCenterButton;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/CommandCenterButton;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: so0$c */
    /* loaded from: classes3.dex */
    public static final class C28394c extends Lambda implements Function1<Unit, CommandCenterButton> {
        public C28394c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CommandCenterButton invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C48861so0.this.f109284j;
        }
    }

    static {
        Set<ServiceCenterStatus> of;
        Set<ServiceCenterStatus> of2;
        ServiceCenterStatus serviceCenterStatus = ServiceCenterStatus.CHARGING;
        ServiceCenterStatus serviceCenterStatus2 = ServiceCenterStatus.SERVICE_COMPLETE_AWAITING_EXIT;
        of = SetsKt__SetsKt.setOf((Object[]) new ServiceCenterStatus[]{serviceCenterStatus, ServiceCenterStatus.HIBERNATE, serviceCenterStatus2});
        f109274m = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new ServiceCenterStatus[]{serviceCenterStatus, serviceCenterStatus2});
        f109275n = of2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48861so0(final BaseActivity activity, TabLayout tabs, ViewPager2 viewPager, Button nextStep, Button reroute, LinearLayout chargeContainer, TextView charge, ImageView chargeIcon, C50629vn0 adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(reroute, "reroute");
        Intrinsics.checkNotNullParameter(chargeContainer, "chargeContainer");
        Intrinsics.checkNotNullParameter(charge, "charge");
        Intrinsics.checkNotNullParameter(chargeIcon, "chargeIcon");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f109276b = tabs;
        this.f109277c = viewPager;
        this.f109278d = nextStep;
        this.f109279e = reroute;
        this.f109280f = chargeContainer;
        this.f109281g = charge;
        this.f109282h = chargeIcon;
        this.f109283i = adapter;
        viewPager.setAdapter(adapter);
        new C17914b(tabs, viewPager, new C17914b.InterfaceC17916b() { // from class: qo0
            @Override // com.google.android.material.tabs.C17914b.InterfaceC17916b
            /* renamed from: a */
            public final void mo4558a(TabLayout.C17910g c17910g, int i) {
                C48861so0.m13649Rl(BaseActivity.this, c17910g, i);
            }
        }).m48699a();
        ViewParent parent = tabs.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLayoutTransition().enableTransitionType(4);
    }

    /* renamed from: Rl */
    public static final void m13649Rl(BaseActivity activity, TabLayout.C17910g tab, int i) {
        String string;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i != 0) {
            if (i != 1) {
                string = null;
            } else {
                string = activity.getString(C45871nl4.routing_on_rails_vehicle_details);
            }
        } else {
            string = activity.getString(C45871nl4.routing_on_rails_route_progress);
        }
        tab.m48705r(string);
    }

    /* renamed from: Sl */
    public static final CommandCenterButton m13648Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CommandCenterButton) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: C0 */
    public Observable<Unit> mo13654C0() {
        return C44626lf5.clicksThrottle$default(this.f109279e, 0L, 1, null);
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: K */
    public AbstractC23442F<Unit> mo13653K() {
        C42334hn5 c42334hn5 = new C42334hn5();
        c42334hn5.show(getActivity().getSupportFragmentManager(), "ScrapCompleteBottomSheetDialog");
        AbstractC23442F<Unit> firstOrError = c42334hn5.m35867a5().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "dialog.dismissClicks().firstOrError()");
        return firstOrError;
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: Oj */
    public void mo13652Oj(boolean z) {
        ViewParent parent = this.f109278d.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        C49520tu6.show$default((ViewGroup) parent, z, 0, 2, null);
    }

    /* renamed from: Tl */
    public final void m13647Tl(CommandCenterButton commandCenterButton) {
        String str;
        this.f109284j = commandCenterButton;
        Button button = this.f109278d;
        if (commandCenterButton != null) {
            str = commandCenterButton.getText();
        } else {
            str = null;
        }
        button.setText(str);
    }

    /* renamed from: Ul */
    public final void m13646Ul(boolean z) {
        this.f109285k = z;
        LinearLayout.LayoutParams layoutParams = null;
        C49520tu6.show$default(this.f109278d, !z, 0, 2, null);
        if (this.f109285k) {
            C49520tu6.show$default(this.f109279e, true, 0, 2, null);
            ViewGroup.LayoutParams layoutParams2 = this.f109279e.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = layoutParams2;
                }
                layoutParams = layoutParams;
            }
            if (layoutParams != null) {
                layoutParams.topMargin = C40788fB0.m41774h(getActivity(), C37044Xf4.activity_vertical_margin);
            }
            this.f109279e.setBackground(NA0.m94299e(getActivity(), C33309Hg4.button_flat_outline));
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f109279e.getLayoutParams();
            if (layoutParams3 != null) {
                if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                    layoutParams = layoutParams3;
                }
                layoutParams = layoutParams;
            }
            if (layoutParams != null) {
                layoutParams.topMargin = (int) C49347td3.m12002a(-12, getActivity());
            }
            this.f109279e.setBackground(NA0.m94299e(getActivity(), C33309Hg4.button_flat_background));
        }
        this.f109279e.requestLayout();
    }

    /* renamed from: Vl */
    public final void m13645Vl(ServiceCenterStatus serviceCenterStatus) {
        boolean contains;
        int i;
        LinearLayout linearLayout = this.f109280f;
        contains = CollectionsKt___CollectionsKt.contains(f109275n, serviceCenterStatus);
        C49520tu6.show$default(linearLayout, contains, 0, 2, null);
        if (serviceCenterStatus == null) {
            i = -1;
        } else {
            i = C28393b.$EnumSwitchMapping$0[serviceCenterStatus.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                this.f109280f.setBackground(new ColorDrawable(NA0.m94301c(getActivity(), C32364Df4.birdGreen)));
                this.f109281g.setText(getActivity().getString(C45871nl4.routing_on_rails_ready));
                this.f109282h.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_check_xs));
                return;
            }
            return;
        }
        this.f109280f.setBackground(new ColorDrawable(NA0.m94301c(getActivity(), C32364Df4.birdYellow)));
        this.f109281g.setText(getActivity().getString(C45871nl4.routing_on_rails_charge));
        this.f109282h.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_filled_bolt));
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: ek */
    public void mo13644ek(WireBird bird, ServiceCenterStatus serviceCenterStatus, WorkOrder workOrder, VehicleScrapRequest vehicleScrapRequest) {
        boolean contains;
        boolean contains2;
        Intrinsics.checkNotNullParameter(bird, "bird");
        contains = CollectionsKt___CollectionsKt.contains(f109274m, serviceCenterStatus);
        if (contains) {
            m13646Ul(true);
        } else if (this.f109285k) {
            m13646Ul(false);
        }
        m13645Vl(serviceCenterStatus);
        this.f109283i.m8038R(serviceCenterStatus);
        if (serviceCenterStatus == ServiceCenterStatus.AWAITING_INSPECTION) {
            m13647Tl(new InspectButton(getActivity().getString(C45871nl4.routing_on_rails_start_inspection), bird, workOrder));
            C49520tu6.show$default(this.f109279e, true, 0, 2, null);
            return;
        }
        contains2 = CollectionsKt___CollectionsKt.contains(ServiceCenterRoute.Companion.getREPAIR_ROUTE_STATUSES(), serviceCenterStatus);
        if (contains2) {
            m13647Tl(new RepairButton(getActivity().getString(C45871nl4.routing_on_rails_start_repair), bird));
            C49520tu6.show$default(this.f109279e, true, 0, 2, null);
        } else if (serviceCenterStatus != ServiceCenterStatus.AWAITING_SCRAP_INSPECTION && serviceCenterStatus != ServiceCenterStatus.SCRAP_REJECTED) {
            if (serviceCenterStatus == ServiceCenterStatus.AWAITING_QUALITY_CONTROL) {
                m13647Tl(new QualityControlButton(getActivity().getString(C45871nl4.routing_on_rails_start_quality_control), bird, workOrder));
                C49520tu6.show$default(this.f109279e, true, 0, 2, null);
            } else if ((serviceCenterStatus == ServiceCenterStatus.AWAITING_SCRAP || serviceCenterStatus == ServiceCenterStatus.AWAITING_SCRAP_SUBMERGED) && vehicleScrapRequest != null) {
                m13647Tl(new ScrapCompletionButton(getActivity().getString(C45871nl4.routing_on_rails_complete_scrap), bird, vehicleScrapRequest));
            } else if (serviceCenterStatus == ServiceCenterStatus.CHARGING || serviceCenterStatus == ServiceCenterStatus.SERVICE_COMPLETE_AWAITING_EXIT) {
                m13647Tl(null);
            }
        } else {
            m13647Tl(new ScrapInspectionButton(getActivity().getString(C45871nl4.routing_on_rails_start_scrap_inspection), bird, vehicleScrapRequest));
            C49520tu6.show$default(this.f109279e, true, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: oh */
    public Observable<CommandCenterButton> mo13643oh() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f109278d, 0L, 1, null);
        final C28394c c28394c = new C28394c();
        Observable<CommandCenterButton> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: ro0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                CommandCenterButton m13648Sl;
                m13648Sl = C48861so0.m13648Sl(Function1.this, obj);
                return m13648Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun nextStepCli…      .map { button }\n  }");
        return map;
    }

    @Override // p000.InterfaceC47083po0
    /* renamed from: yj */
    public void mo13642yj(WireBird bird, ServiceCenterStatus serviceCenterStatus) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f109283i.m8040P(bird, serviceCenterStatus);
    }
}
