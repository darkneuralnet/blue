package p000;

import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.Bird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lj64;", "LxE;", "Lio/reactivex/Observable;", "", "ul", "LTk5;", "Pl", "Ql", "Lco/bird/android/model/persistence/Bird;", "Rl", "Sl", "", "LH6;", "sections", "b", "LR4;", "LR4;", "binding", "LK54;", "c", "LK54;", "overviewAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LR4;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j64  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43115j64 extends AbstractC30071xE {

    /* renamed from: b */
    public final C7060R4 f92153b;

    /* renamed from: c */
    public final K54 f92154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43115j64(BaseActivity activity, C7060R4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f92153b = binding;
        K54 k54 = new K54();
        this.f92154c = k54;
        RecyclerView recyclerView = binding.f31466c;
        recyclerView.setAdapter(k54);
        recyclerView.addItemDecoration(new FA3());
    }

    /* renamed from: Pl */
    public final Observable<C36154Tk5> m31117Pl() {
        return this.f92154c.m99245v();
    }

    /* renamed from: Ql */
    public final Observable<Unit> m31116Ql() {
        return this.f92154c.m99244w();
    }

    /* renamed from: Rl */
    public final Observable<Bird> m31115Rl() {
        return this.f92154c.m99243x();
    }

    /* renamed from: Sl */
    public final Observable<Unit> m31114Sl() {
        return this.f92154c.m99242y();
    }

    /* renamed from: b */
    public final void m31113b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f92154c.mo24871u(sections);
    }

    /* renamed from: ul */
    public final Observable<Unit> m31112ul() {
        Button button = this.f92153b.f31465b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(button, 0L, 1, null), this.f92154c.m99246g0());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(binding.helpButton…viewAdapter.infoClicks())");
        return merge;
    }
}
