package p000;

import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireQuickLink;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"LY82;", "LvI3;", "Lio/reactivex/Observable;", "", "Sl", "", "category", "Oi", "", "LH6;", "sections", "Vl", "", "Ul", "Lco/bird/android/model/wire/WireQuickLink;", "Wl", "LaI3;", "b", "LaI3;", "partDetailsAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LX3;", "inventoryCategoryBinding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LX3;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y82 */
/* loaded from: classes3.dex */
public final class Y82 extends AbstractC50340vI3 {

    /* renamed from: b */
    public final C37872aI3 f44666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y82(BaseActivity activity, C9290X3 inventoryCategoryBinding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inventoryCategoryBinding, "inventoryCategoryBinding");
        C37872aI3 c37872aI3 = new C37872aI3();
        this.f44666b = c37872aI3;
        RecyclerView recyclerView = inventoryCategoryBinding.f42579b;
        recyclerView.setAdapter(c37872aI3);
        recyclerView.addItemDecoration(new C39669dI3());
    }

    /* renamed from: Oi */
    public final void m75556Oi(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        getActivity().setTitle(category);
    }

    @Override // p000.AbstractC50340vI3
    /* renamed from: Sl */
    public Observable<Unit> mo5780Sl() {
        Observable<Unit> observeOn = this.f44666b.m71694x().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "partDetailsAdapter\n    .…dSchedulers.mainThread())");
        return observeOn;
    }

    /* renamed from: Ul */
    public final Observable<Integer> m75555Ul() {
        Observable<Integer> debounce = this.f44666b.m71696v().distinctUntilChanged().debounce(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(debounce, "partDetailsAdapter\n    .…unce(1, TimeUnit.SECONDS)");
        return debounce;
    }

    /* renamed from: Vl */
    public final void m75554Vl(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f44666b.mo24871u(sections);
    }

    /* renamed from: Wl */
    public final Observable<WireQuickLink> m75553Wl() {
        return this.f44666b.m71695w();
    }
}
