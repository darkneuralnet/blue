package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RepairType;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LoD4;", "LxE;", "LnD4;", "", "count", "", "mj", "", "LH6;", "adapterSections", "Uk", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "j6", "ae", "Lj5;", "b", "Lj5;", "binding", "LZC4;", "c", "LZC4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lj5;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46147oD4 extends AbstractC30071xE implements InterfaceC45554nD4 {

    /* renamed from: b */
    public final C24709j5 f101615b;

    /* renamed from: c */
    public final ZC4 f101616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46147oD4(BaseActivity activity, C24709j5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f101615b = binding;
        ZC4 zc4 = new ZC4();
        this.f101616c = zc4;
        binding.f92118d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f92118d.setItemAnimator(new C11894g());
        binding.f92118d.setAdapter(zc4);
    }

    @Override // p000.InterfaceC45554nD4
    /* renamed from: Uk */
    public void mo21620Uk(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f101616c.mo24871u(adapterSections);
    }

    @Override // p000.InterfaceC45554nD4
    /* renamed from: ae */
    public Observable<Unit> mo21619ae() {
        Button button = this.f101615b.f92116b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC45554nD4
    /* renamed from: j6 */
    public Observable<Pair<RepairType, Boolean>> mo21618j6() {
        return this.f101616c.m73618w();
    }

    @Override // p000.InterfaceC45554nD4
    /* renamed from: mj */
    public void mo21617mj(int i) {
        String string = getActivity().getResources().getString(C45871nl4.repair_logger_add_repairs, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…ogger_add_repairs, count)");
        if (i == 0) {
            string = getActivity().getResources().getString(C45871nl4.add);
            Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getString(L.string.add)");
        }
        this.f101615b.f92116b.setText(string);
    }
}
