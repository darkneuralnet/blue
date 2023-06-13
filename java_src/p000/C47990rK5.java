package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LrK5;", "LaM5;", "LH31;", "LxE;", "", "LlI5;", "items", "", "Pl", "LEF5;", "b", "LEF5;", "adapter", "LiI5;", "c", "LiI5;", "converter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lh6;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lh6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rK5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47990rK5 extends AbstractC30071xE {

    /* renamed from: b */
    public final EF5 f106873b;

    /* renamed from: c */
    public final C42635iI5 f106874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47990rK5(BaseActivity activity, C22550h6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        EF5 ef5 = new EF5();
        this.f106873b = ef5;
        this.f106874c = new C42635iI5(activity);
        binding.f84702b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f84702b.setItemAnimator(new C11894g());
        binding.f84702b.addItemDecoration(new FN5(activity, C37044Xf4.activity_vertical_margin));
        binding.f84702b.setAdapter(ef5);
    }

    /* renamed from: Pl */
    public final void m16050Pl(List<C44414lI5> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f106873b.mo24871u(this.f106874c.m34237a(items));
    }
}
