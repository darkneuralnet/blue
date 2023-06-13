package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.flightsheet.FlightSheet;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.constant.FleetListActionKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C53094zw3;
import p000.H31;
import p000.InterfaceC36924Ws1;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001#B\u0019\b\u0007\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0014J\u0014\u0010#\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$J\u0006\u0010'\u001a\u00020\u0005R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010:\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010>\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00050\u00050;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006L"}, m28432d2 = {"Lcp1;", "LxE;", "LWs1;", "", "show", "", "Xl", "", "LH6;", "sections", "be", "Lio/reactivex/Observable;", "Lco/bird/android/model/FlightSheetButton;", "O6", "Qc", "Lco/bird/android/model/persistence/Bird;", "bird", "ui", "Lio/reactivex/F;", "Pd", "", "birdId", "K5", "Lco/bird/android/model/DialogResponse;", "Qh", "LuN5;", "Zl", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "am", "Lco/bird/android/model/persistence/FleetListVehicle;", "bm", "Rl", "Sl", "title", "t", "b", "Lco/bird/android/model/constant/FleetListActionKind;", "kind", "Wl", "Vl", "LC3;", "LC3;", "binding", "LYs1;", "c", "LYs1;", "Ul", "()LYs1;", "adapter", "Lso1;", DateTokenConverter.CONVERTER_KEY, "Lso1;", "fleetListAdapter", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lco/bird/android/flightsheet/FlightSheet;", "kotlin.jvm.PlatformType", "e", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "flightSheetBehavior", "Lio/reactivex/subjects/d;", "f", "Lio/reactivex/subjects/d;", "flightSheetDismissSubject", "Landroid/animation/ValueAnimator;", "g", "Landroid/animation/ValueAnimator;", "actionButtonAnimator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "h", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "interpolator", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LC3;)V", "i", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39386cp1 extends AbstractC30071xE implements InterfaceC36924Ws1 {

    /* renamed from: i */
    public static final C19601b f75652i = new C19601b(null);

    /* renamed from: j */
    public static final Set<Integer> f75653j;

    /* renamed from: k */
    public static final Set<Integer> f75654k;

    /* renamed from: b */
    public final C0846C3 f75655b;

    /* renamed from: c */
    public final C37392Ys1 f75656c;

    /* renamed from: d */
    public final C48862so1 f75657d;

    /* renamed from: e */
    public final BottomSheetBehavior<FlightSheet> f75658e;

    /* renamed from: f */
    public final C24558d<Unit> f75659f;

    /* renamed from: g */
    public ValueAnimator f75660g;

    /* renamed from: h */
    public final AccelerateDecelerateInterpolator f75661h;

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"cp1$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "", "slideOffset", "onSlide", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cp1$a */
    /* loaded from: classes3.dex */
    public static final class C19600a extends BottomSheetBehavior.AbstractC17702f {
        public C19600a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i == 5) {
                C39386cp1.this.f75659f.onNext(Unit.INSTANCE);
            }
            if (C39386cp1.f75653j.contains(Integer.valueOf(i))) {
                C39386cp1.this.f75658e.m50082p0(3);
            } else if (C39386cp1.f75654k.contains(Integer.valueOf(i))) {
                C39386cp1.this.f75658e.m50082p0(5);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, m28432d2 = {"Lcp1$b;", "", "", "ANIMATION_DURATION_MS", "J", "", "", "EXPANDED_STATES", "Ljava/util/Set;", "HIDDEN_STATES", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cp1$b */
    /* loaded from: classes3.dex */
    public static final class C19601b {
        public /* synthetic */ C19601b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19601b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cp1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19602c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FleetListActionKind.values().length];
            try {
                iArr[FleetListActionKind.RELEASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FleetListActionKind.REPAIR_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LOZ;", "event", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LOZ;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cp1$d */
    /* loaded from: classes3.dex */
    public static final class C19603d extends Lambda implements Function1<AbstractC6031OZ, Boolean> {

        /* renamed from: g */
        public static final C19603d f75663g = new C19603d();

        public C19603d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC6031OZ event) {
            boolean z;
            Intrinsics.checkNotNullParameter(event, "event");
            if ((event instanceof C43051j00) && C45423n00.m24596a(((C43051j00) event).m31275c())) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Set<Integer> of;
        Set<Integer> of2;
        of = SetsKt__SetsJVMKt.setOf(6);
        f75653j = of;
        of2 = SetsKt__SetsJVMKt.setOf(4);
        f75654k = of2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39386cp1(BaseActivity activity, C0846C3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f75655b = binding;
        AbstractC29912wZ<? extends FlightSheetButton> m59056v = binding.f3330d.m59056v();
        Intrinsics.checkNotNull(m59056v);
        AbstractC52206yS0 adapter = m59056v.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type co.bird.android.flightsheet.v2.adapters.FlightSheetV2Adapter");
        this.f75656c = (C37392Ys1) adapter;
        C48862so1 c48862so1 = new C48862so1();
        this.f75657d = c48862so1;
        BottomSheetBehavior<FlightSheet> m50133G = BottomSheetBehavior.m50133G(binding.f3330d);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.flightSheet)");
        this.f75658e = m50133G;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f75659f = m31902e;
        this.f75661h = new AccelerateDecelerateInterpolator();
        RecyclerView recyclerView = binding.f3332f;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c48862so1);
        m50133G.m50073u(new C19600a());
        m50133G.m50082p0(5);
    }

    /* renamed from: Tl */
    public static final Boolean m45088Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Yl */
    public static final void m45083Yl(C39386cp1 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        FrameLayout frameLayout = this$0.f75655b.f3329c;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        frameLayout.setTranslationY(((Float) animatedValue).floatValue());
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC36924Ws1.C9191a.m77772c(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC36924Ws1.C9191a.m77771d(this, vehicleCommand);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: K5 */
    public void mo45097K5(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C33512Id0.f15943l.m101879a(birdId).show(getActivity().getSupportFragmentManager(), "CannotAccessReportsBottomSheet");
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: M3 */
    public void mo17126M3(VehicleCommand vehicleCommand) {
        InterfaceC36924Ws1.C9191a.m77768g(this, vehicleCommand);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: O6 */
    public Observable<FlightSheetButton> mo45096O6() {
        return this.f75655b.f3330d.m59059s();
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Pd */
    public AbstractC23442F<Unit> mo45095Pd() {
        C33882Js1 c33882Js1 = new C33882Js1();
        c33882Js1.show(getActivity().getSupportFragmentManager(), "FlightSheetQuickCaptureReadyFragment");
        return c33882Js1.m99617a5();
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Qc */
    public Observable<Boolean> mo45093Qc() {
        Observable<AbstractC6031OZ> m13412c = C48927su6.m13412c(this.f75658e);
        final C19603d c19603d = C19603d.f75663g;
        Observable map = m13412c.map(new InterfaceC23492o() { // from class: bp1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m45088Tl;
                m45088Tl = C39386cp1.m45088Tl(Function1.this, obj);
                return m45088Tl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "flightSheetBehavior.bott…wState.isVisibleState() }");
        return map;
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Qh */
    public AbstractC23442F<DialogResponse> mo45092Qh() {
        String string = getActivity().getString(C45871nl4.inspection_label);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.inspection_label)");
        return H31.C3014a.showBottomSheetAlert$default(this, new NI4(string), null, 2, null);
    }

    /* renamed from: Rl */
    public final Observable<Unit> m45090Rl() {
        Button button = this.f75655b.f3328b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.action");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC36924Ws1.C9191a.m77769f(this, list);
    }

    /* renamed from: Sl */
    public final Observable<Unit> m45089Sl() {
        Observable<Unit> hide = this.f75659f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "flightSheetDismissSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Ul */
    public C37392Ys1 getAdapter() {
        return this.f75656c;
    }

    /* renamed from: Vl */
    public final void m45086Vl() {
        m45084Xl(false);
    }

    /* renamed from: Wl */
    public final void m45085Wl(FleetListActionKind kind) {
        String string;
        Intrinsics.checkNotNullParameter(kind, "kind");
        int i = C19602c.$EnumSwitchMapping$0[kind.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                string = null;
            } else {
                string = getActivity().getString(C45871nl4.fleet_list_action_label_repair_flow);
            }
        } else {
            string = getActivity().getString(C45871nl4.fleet_list_action_label_release);
        }
        if (string == null) {
            z = false;
        }
        m45084Xl(z);
        this.f75655b.f3328b.setText(string);
    }

    /* renamed from: Xl */
    public final void m45084Xl(boolean z) {
        float measuredHeight;
        int i;
        ValueAnimator valueAnimator = this.f75660g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float[] fArr = new float[2];
        fArr[0] = this.f75655b.f3329c.getTranslationY();
        if (z) {
            measuredHeight = 0.0f;
        } else {
            measuredHeight = this.f75655b.f3329c.getMeasuredHeight();
        }
        fArr[1] = measuredHeight;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(this.f75661h);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ap1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C39386cp1.m45083Yl(C39386cp1.this, valueAnimator2);
            }
        });
        ofFloat.start();
        this.f75660g = ofFloat;
        ViewGroup.LayoutParams layoutParams = this.f75655b.f3330d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        if (z) {
            i = this.f75655b.f3329c.getMeasuredHeight();
        } else {
            i = 0;
        }
        c11529e.setMargins(0, 0, 0, i);
        this.f75655b.f3330d.setLayoutParams(c11529e);
    }

    /* renamed from: Zl */
    public final Observable<EnumC49795uN5> m45082Zl() {
        return this.f75657d.m13640v();
    }

    /* renamed from: am */
    public final Observable<FleetListAction> m45081am() {
        return this.f75657d.m13639w();
    }

    /* renamed from: b */
    public final void m45080b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f75657d.mo24871u(sections);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: be */
    public void mo45079be(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f75655b.f3330d.m56203Y(sections);
        this.f75658e.m50082p0(3);
    }

    /* renamed from: bm */
    public final Observable<FleetListVehicle> m45078bm() {
        return this.f75657d.m13638x();
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public /* bridge */ /* synthetic */ BaseCoreActivity getActivity() {
        return getActivity();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC36924Ws1.C9191a.m77770e(this, collection);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: q2 */
    public void mo45077q2() {
        InterfaceC36924Ws1.C9191a.m77773b(this);
    }

    /* renamed from: t */
    public final void m45076t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(title);
        }
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC36924Ws1.C9191a.m77774a(this);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: ui */
    public void mo45075ui(Bird bird) {
        String string;
        Intrinsics.checkNotNullParameter(bird, "bird");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        if (C0613BT.m114031b(bird)) {
            string = getActivity().getString(C45871nl4.flight_sheet_toast_marked_damaged, bird.getCode());
        } else {
            string = getActivity().getString(C45871nl4.flight_sheet_toast_unmarked_damaged, bird.getCode());
        }
        String str = string;
        Intrinsics.checkNotNullExpressionValue(str, "if (bird.isDamaged()) {\n…maged, bird.code)\n      }");
        C53094zw3.C31593a.makeText$default(c31593a, activity, str, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: v9 */
    public void mo17121v9(VehicleCommand vehicleCommand) {
        InterfaceC36924Ws1.C9191a.m77767h(this, vehicleCommand);
    }
}
