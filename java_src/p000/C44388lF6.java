package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u0016\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00040\u0003H\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LlF6;", "LxE;", "LkF6;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "K0", "", "I", "", "LH6;", "sections", "b", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "fi", "", "o5", "Ly6;", "Ly6;", "binding", "LGD6;", "c", "LGD6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ly6;LGD6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lF6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44388lF6 extends AbstractC30071xE implements InterfaceC43795kF6 {

    /* renamed from: b */
    public final C30417y6 f95794b;

    /* renamed from: c */
    public final GD6 f95795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44388lF6(BaseActivity activity, C30417y6 binding, GD6 adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f95794b = binding;
        this.f95795c = adapter;
        binding.f118748c.setAdapter(adapter);
        binding.f118748c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f118748c.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC43795kF6
    /* renamed from: I */
    public Observable<Unit> mo27624I() {
        return this.f95795c.m105634I();
    }

    @Override // p000.InterfaceC43795kF6
    /* renamed from: K0 */
    public Observable<Pair<Issue, Boolean>> mo27623K0() {
        return this.f95795c.m105633v();
    }

    @Override // p000.InterfaceC43795kF6
    /* renamed from: b */
    public void mo27622b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f95795c.mo24871u(sections);
    }

    @Override // p000.InterfaceC43795kF6
    /* renamed from: fi */
    public Observable<Unit> mo27621fi(WireBird bird, WorkOrder workOrder, ServiceCenterRoute serviceCenterRoute) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        RD6 m87023a = RD6.f31748d.m87023a(bird, workOrder, serviceCenterRoute);
        m87023a.show(getActivity().getSupportFragmentManager(), "WorkOrderInspectionCompleteBottomSheetDialog");
        return m87023a.m87025N6();
    }

    @Override // p000.InterfaceC43795kF6
    /* renamed from: o5 */
    public Observable<Pair<Issue, String>> mo27620o5() {
        return this.f95795c.m105632w();
    }
}
