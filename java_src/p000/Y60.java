package p000;

import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.api.response.OpsBatchJobActionKind;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LY60;", "LxE;", "Lio/reactivex/Observable;", "", "m0", "", "LH6;", "sections", "b", "Lco/bird/api/response/OpsBatchJobActionKind;", "Pl", "", "enabled", "Ql", "Lw4;", "Lw4;", "binding", "Lc40;", "c", "Lc40;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lw4;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y60 */
/* loaded from: classes3.dex */
public final class Y60 extends AbstractC30071xE {

    /* renamed from: b */
    public final C29751w4 f44520b;

    /* renamed from: c */
    public final C38923c40 f44521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y60(BaseActivity activity, C29751w4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f44520b = binding;
        C38923c40 c38923c40 = new C38923c40();
        this.f44521c = c38923c40;
        binding.f115231b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f115231b.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        binding.f115231b.setAdapter(c38923c40);
    }

    /* renamed from: Pl */
    public final Observable<OpsBatchJobActionKind> m75740Pl() {
        return this.f44521c.m61983v();
    }

    /* renamed from: Ql */
    public final void m75739Ql(boolean z) {
        this.f44520b.f115233d.setEnabled(z);
    }

    /* renamed from: b */
    public final void m75738b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f44521c.mo24871u(sections);
    }

    /* renamed from: m0 */
    public final Observable<Unit> m75737m0() {
        Button button = this.f44520b.f115233d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.updateButton");
        return C45219mf5.m25214a(button);
    }
}
