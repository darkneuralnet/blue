package p000;

import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.IssueType;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LFF6;", "LxE;", "LEF6;", "Lio/reactivex/Observable;", "", "l", "Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "", "Jl", "", "count", "Cc", "", "LH6;", "sections", "b", "issues", "I2", "Ld4;", "Ld4;", "binding", "LmF6;", "c", "LmF6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ld4;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FF6 */
/* loaded from: classes3.dex */
public final class FF6 extends AbstractC30071xE implements EF6 {

    /* renamed from: b */
    public final C19672d4 f9097b;

    /* renamed from: c */
    public final C44981mF6 f9098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FF6(BaseActivity activity, C19672d4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f9097b = binding;
        C44981mF6 c44981mF6 = new C44981mF6();
        this.f9098c = c44981mF6;
        binding.f76092c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f76092c.setAdapter(c44981mF6);
    }

    @Override // p000.EF6
    /* renamed from: Cc */
    public void mo107380Cc(int i) {
        this.f9097b.f76091b.setText(getActivity().getString(C45871nl4.add_count_format, Integer.valueOf(i)));
    }

    @Override // p000.EF6
    /* renamed from: I2 */
    public Observable<Boolean> mo107379I2(List<IssueType> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        NF6 m94126a = NF6.f24352d.m94126a(issues);
        m94126a.show(getActivity().getSupportFragmentManager(), "WorkOrderIssuesUncheckConfirmationDialogFragment");
        return m94126a.m94127a5();
    }

    @Override // p000.EF6
    /* renamed from: Jl */
    public Observable<Pair<IssueType, Boolean>> mo107378Jl() {
        return this.f9098c.m25862v();
    }

    @Override // p000.EF6
    /* renamed from: b */
    public void mo107377b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f9098c.mo24871u(sections);
    }

    @Override // p000.EF6
    /* renamed from: l */
    public Observable<Unit> mo107376l() {
        Button button = this.f9097b.f76091b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.add");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
