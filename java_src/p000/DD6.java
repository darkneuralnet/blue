package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LDD6;", "LxE;", "LCD6;", "Lio/reactivex/Observable;", "", "l", "", "LH6;", "sections", "b", "Lx6;", "Lx6;", "binding", "LiD6;", "c", "LiD6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lx6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DD6 */
/* loaded from: classes3.dex */
public final class DD6 extends AbstractC30071xE implements CD6 {

    /* renamed from: b */
    public final C30038x6 f5399b;

    /* renamed from: c */
    public final C42591iD6 f5400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD6(BaseActivity activity, C30038x6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5399b = binding;
        C42591iD6 c42591iD6 = new C42591iD6();
        this.f5400c = c42591iD6;
        binding.f117098c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f117098c.setAdapter(c42591iD6);
        binding.f117098c.setItemAnimator(new C11894g());
    }

    @Override // p000.CD6
    /* renamed from: b */
    public void mo110667b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f5400c.mo24871u(sections);
    }

    @Override // p000.CD6
    /* renamed from: l */
    public Observable<Unit> mo110666l() {
        return this.f5400c.m34331v();
    }
}
