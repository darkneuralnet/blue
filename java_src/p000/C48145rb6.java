package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lrb6;", "LxE;", "Lqb6;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "LRa6;", "I0", "", "nk", "LVa6;", "LVa6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lp6;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lp6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rb6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48145rb6 extends AbstractC30071xE implements InterfaceC47552qb6 {

    /* renamed from: b */
    public final C36533Va6 f107309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48145rb6(BaseActivity activity, C27140p6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        C36533Va6 c36533Va6 = new C36533Va6();
        this.f107309b = c36533Va6;
        binding.f103129b.setAdapter(c36533Va6);
        binding.f103129b.setLayoutManager(new LinearLayoutManager(activity));
    }

    @Override // p000.InterfaceC47552qb6
    /* renamed from: I0 */
    public Observable<C35597Ra6<?>> mo15714I0() {
        return this.f107309b.m79725y();
    }

    @Override // p000.InterfaceC47552qb6
    /* renamed from: b */
    public void mo15713b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f107309b.mo24871u(sections);
    }

    @Override // p000.InterfaceC47552qb6
    /* renamed from: nk */
    public Observable<String> mo15712nk() {
        return this.f107309b.m79727w();
    }
}
