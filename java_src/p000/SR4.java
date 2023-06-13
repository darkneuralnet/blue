package p000;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.api.response.RideSummary;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"LSR4;", "LxE;", "LRR4;", "", "Lco/bird/api/response/RideSummary;", MessageExtension.FIELD_DATA, "", "N1", "Lio/reactivex/Observable;", "Vj", "LI5;", "b", "LI5;", "binding", "LxR4;", "c", "LxR4;", "getAdapter", "()LxR4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "", "billedMinutes", "hideTime", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LI5;ZZ)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SR4 */
/* loaded from: classes2.dex */
public final class SR4 extends AbstractC30071xE implements RR4 {

    /* renamed from: b */
    public final C3320I5 f33675b;

    /* renamed from: c */
    public final C51608xR4 f33676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SR4(BaseActivity activity, C3320I5 binding, boolean z, boolean z2) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f33675b = binding;
        C51608xR4 c51608xR4 = new C51608xR4(activity, z, z2);
        this.f33676c = c51608xR4;
        binding.f14465d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f14465d.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        binding.f14465d.addItemDecoration(new FN5(activity, C37044Xf4.card_spacing));
        binding.f14465d.setAdapter(c51608xR4);
    }

    @Override // p000.RR4
    /* renamed from: N1 */
    public void mo85474N1(List<RideSummary> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f33676c.m44889x() && data.isEmpty()) {
            LinearLayout linearLayout = this.f33675b.f14463b;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyView");
            C49520tu6.show$default(linearLayout, true, 0, 2, null);
            RecyclerView recyclerView = this.f33675b.f14465d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
            C49520tu6.show$default(recyclerView, false, 0, 2, null);
            return;
        }
        if (this.f33675b.f14463b.getVisibility() == 0) {
            LinearLayout linearLayout2 = this.f33675b.f14463b;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.emptyView");
            C49520tu6.show$default(linearLayout2, false, 0, 2, null);
        }
        if (this.f33675b.f14465d.getVisibility() == 8) {
            RecyclerView recyclerView2 = this.f33675b.f14465d;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.recyclerView");
            C49520tu6.show$default(recyclerView2, true, 0, 2, null);
        }
        if (this.f33676c.getItemCount() == 0) {
            this.f33676c.m44899C(data);
        } else {
            this.f33676c.m44896p(data);
        }
    }

    @Override // p000.RR4
    /* renamed from: Vj */
    public Observable<RideSummary> mo85473Vj() {
        return this.f33676c.m44893t();
    }
}
