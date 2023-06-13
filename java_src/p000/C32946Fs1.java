package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.flightsheet.common.adapters.FlightSheetGridLayoutManager;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.persistence.Bird;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.H31;
import p000.InterfaceC36924Ws1;
import p000.InterfaceC44721lp0;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B)\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b4\u00105J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\n0\n0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00067"}, m28432d2 = {"LFs1;", "LxA;", "Llp0;", "LWs1;", "", "LH6;", "sections", "", "be", "Lio/reactivex/Observable;", "Lco/bird/android/model/FlightSheetButton;", "O6", "", "Qc", "Lco/bird/android/model/persistence/Bird;", "bird", "ui", "Lio/reactivex/F;", "Pd", "", "birdId", "K5", "Lco/bird/android/model/DialogResponse;", "Qh", "", "newElevation", "Ql", "LoA;", "c", "LoA;", "getAdapter", "()LoA;", "adapter", "LPZ;", DateTokenConverter.CONVERTER_KEY, "LPZ;", "binding", "LYs1;", "e", "LYs1;", "flightSheetAdapter", "Landroid/animation/ValueAnimator;", "f", "Landroid/animation/ValueAnimator;", "elevationAnimator", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "flightSheetButtonClicks", "Lco/bird/android/core/base/BaseCoreActivity;", "activity", "<init>", "(LoA;Lco/bird/android/core/base/BaseCoreActivity;LPZ;LYs1;)V", "h", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fs1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32946Fs1 extends AbstractC30055xA implements InterfaceC44721lp0, InterfaceC36924Ws1 {

    /* renamed from: h */
    public static final C2496d f10362h = new C2496d(null);

    /* renamed from: c */
    public final AbstractC26846oA f10363c;

    /* renamed from: d */
    public final C6408PZ f10364d;

    /* renamed from: e */
    public final C37392Ys1 f10365e;

    /* renamed from: f */
    public ValueAnimator f10366f;

    /* renamed from: g */
    public final C45168ma4<FlightSheetButton> f10367g;

    @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Fs1$a", "Ly0;", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fs1$a */
    /* loaded from: classes3.dex */
    public static final class C2493a extends AbstractC30391y0 {
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Fs1$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fs1$b */
    /* loaded from: classes3.dex */
    public static final class C2494b extends RecyclerView.AbstractC11863t {

        /* renamed from: a */
        public final /* synthetic */ BaseCoreActivity f10368a;

        /* renamed from: b */
        public final /* synthetic */ C32946Fs1 f10369b;

        public C2494b(BaseCoreActivity baseCoreActivity, C32946Fs1 c32946Fs1) {
            this.f10368a = baseCoreActivity;
            this.f10369b = c32946Fs1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            float f;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (recyclerView.canScrollVertically(-1)) {
                f = C49347td3.m12002a(2, this.f10368a);
            } else {
                f = 0.0f;
            }
            this.f10369b.m106410Ql(f);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fs1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2495c extends FunctionReferenceImpl implements Function1<FlightSheetButton, Unit> {
        public C2495c(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m106408a(FlightSheetButton p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetButton flightSheetButton) {
            m106408a(flightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFs1$d;", "", "", "ARROW_ELEVATION_DP", "I", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fs1$d */
    /* loaded from: classes3.dex */
    public static final class C2496d {
        public /* synthetic */ C2496d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2496d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32946Fs1(AbstractC26846oA adapter, BaseCoreActivity activity, C6408PZ binding, C37392Ys1 flightSheetAdapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(flightSheetAdapter, "flightSheetAdapter");
        this.f10363c = adapter;
        this.f10364d = binding;
        this.f10365e = flightSheetAdapter;
        C45168ma4<FlightSheetButton> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<FlightSheetButton>()");
        this.f10367g = m25409g;
        RecyclerView recyclerView = binding.f28690d;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        recyclerView.setLayoutManager(new FlightSheetGridLayoutManager(context, getAdapter()));
        recyclerView.setItemAnimator(new C2493a());
        recyclerView.setAdapter(getAdapter());
        recyclerView.addOnScrollListener(new C2494b(activity, this));
        flightSheetAdapter.m74080C(new C2495c(m25409g));
    }

    /* renamed from: Rl */
    public static final void m106409Rl(C32946Fs1 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        FrameLayout frameLayout = this$0.f10364d.f28689c;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C38790bq6.m62545E0(frameLayout, ((Float) animatedValue).floatValue());
        this$0.f10364d.f28689c.invalidate();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC44721lp0.C25796a.m26777c(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC44721lp0.C25796a.m26776d(this, vehicleCommand);
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
        InterfaceC44721lp0.C25796a.m26772h(this, vehicleCommand);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: O6 */
    public Observable<FlightSheetButton> mo45096O6() {
        Observable<FlightSheetButton> hide = this.f10367g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "flightSheetButtonClicks.hide()");
        return hide;
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
        Observable<Boolean> just = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "just(true)");
        return just;
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Qh */
    public AbstractC23442F<DialogResponse> mo45092Qh() {
        String string = getActivity().getString(C45871nl4.inspection_label);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.inspection_label)");
        return H31.C3014a.showBottomSheetAlert$default(this, new NI4(string), null, 2, null);
    }

    /* renamed from: Ql */
    public final void m106410Ql(float f) {
        boolean z;
        if (this.f10364d.f28689c.getElevation() == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        ValueAnimator valueAnimator = this.f10366f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f10364d.f28689c.getElevation(), f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Es1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C32946Fs1.m106409Rl(C32946Fs1.this, valueAnimator2);
            }
        });
        this.f10366f = ofFloat;
        ofFloat.start();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC44721lp0.C25796a.m26774f(this, list);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: be */
    public void mo45079be(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        getAdapter().mo24871u(sections);
    }

    @Override // p000.InterfaceC44721lp0
    public AbstractC26846oA getAdapter() {
        return this.f10363c;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC44721lp0.C25796a.m26775e(this, collection);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: q2 */
    public void mo45077q2() {
        InterfaceC36924Ws1.C9191a.m77773b(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC44721lp0.C25796a.m26778b(this);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: ui */
    public void mo45075ui(Bird bird) {
        String string;
        Intrinsics.checkNotNullParameter(bird, "bird");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseCoreActivity activity = getActivity();
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
        InterfaceC44721lp0.C25796a.m26771i(this, vehicleCommand);
    }
}
