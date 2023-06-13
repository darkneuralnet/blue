package p000;

import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C38161an0;
import p000.C53094zw3;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lcq2;", "LxE;", "Lbq2;", "Lio/reactivex/Observable;", "", "n2", "z", "", "c", "", "LH6;", "sections", "b", "r", "B", "Lco/bird/android/model/wire/WireBird;", "bird", "W8", "", "enabled", "x", "Lc4;", "Lc4;", "binding", "Lvp2;", "Lvp2;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lc4;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39397cq2 extends AbstractC30071xE implements InterfaceC38786bq2 {

    /* renamed from: b */
    public final C13383c4 f75695b;

    /* renamed from: c */
    public final C50651vp2 f75696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39397cq2(BaseActivity activity, C13383c4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f75695b = binding;
        C50651vp2 c50651vp2 = new C50651vp2();
        this.f75696c = c50651vp2;
        binding.f60021d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f60021d.setAdapter(c50651vp2);
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: B */
    public Observable<Unit> mo44998B() {
        return this.f75696c.m7971w();
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: W8 */
    public void mo44997W8(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C38161an0.C10859c.newInstance$default(C38161an0.f51230c, bird, false, false, false, 14, null).show(getActivity().getSupportFragmentManager(), "CommandsBottomSheetDialog");
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: b */
    public void mo44996b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f75696c.mo24871u(sections);
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: c */
    public Observable<Unit> mo44995c() {
        Button button = this.f75695b.f60022e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: n2 */
    public Observable<String> mo44994n2() {
        return this.f75696c.m7972v();
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: r */
    public void mo44993r() {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.work_order_toast_success);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…work_order_toast_success)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 1, 0, null, 24, null);
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: x */
    public void mo44992x(boolean z) {
        this.f75695b.f60022e.setEnabled(z);
    }

    @Override // p000.InterfaceC38786bq2
    /* renamed from: z */
    public Observable<String> mo44991z() {
        return this.f75696c.m7970z();
    }
}
