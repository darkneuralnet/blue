package p000;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.flightsheet.common.adapters.FlightSheetGridLayoutManager;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.persistence.Bird;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.H31;
import p000.InterfaceC36924Ws1;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010%\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00040\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"LVs1;", "LxE;", "LWs1;", "Lio/reactivex/Observable;", "Lco/bird/android/model/FlightSheetButton;", "O6", "", "Qc", "", "LH6;", "sections", "", "be", "Lco/bird/android/model/persistence/Bird;", "bird", "ui", "Lio/reactivex/F;", "Pd", "", "birdId", "K5", "Lco/bird/android/model/DialogResponse;", "Qh", "LYs1;", "b", "LYs1;", "Pl", "()LYs1;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lio/reactivex/subjects/d;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "buttonSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36690Vs1 extends AbstractC30071xE implements InterfaceC36924Ws1 {

    /* renamed from: b */
    public final C37392Ys1 f39856b;

    /* renamed from: c */
    public final RecyclerView f39857c;

    /* renamed from: d */
    public final C24558d<FlightSheetButton> f39858d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vs1$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8803a extends FunctionReferenceImpl implements Function1<FlightSheetButton, Unit> {
        public C8803a(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m79327a(FlightSheetButton p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetButton flightSheetButton) {
            m79327a(flightSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36690Vs1(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f39856b = new C37392Ys1(null, null, 3, null);
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(C45248mi4.recyclerView);
        this.f39857c = recyclerView;
        C24558d<FlightSheetButton> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<FlightSheetButton>()");
        this.f39858d = m31902e;
        recyclerView.setLayoutManager(new FlightSheetGridLayoutManager(activity, getAdapter()));
        recyclerView.setAdapter(getAdapter());
        getAdapter().m74080C(new C8803a(m31902e));
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
        Observable<FlightSheetButton> hide = this.f39858d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "buttonSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Pd */
    public AbstractC23442F<Unit> mo45095Pd() {
        C33882Js1 c33882Js1 = new C33882Js1();
        c33882Js1.show(getActivity().getSupportFragmentManager(), "FlightSheetQuickCaptureReadyFragment");
        return c33882Js1.m99617a5();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Pl */
    public C37392Ys1 getAdapter() {
        return this.f39856b;
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
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.inspection_label)");
        return H31.C3014a.showBottomSheetAlert$default(this, new NI4(string), null, 2, null);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC36924Ws1.C9191a.m77769f(this, list);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: be */
    public void mo45079be(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        getAdapter().mo24871u(sections);
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
