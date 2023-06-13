package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Ll31;", "LxE;", "", "LH6;", "sections", "", "b", "Lw3;", "Lw3;", "binding", "Le31;", "c", "Le31;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lw3;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: l31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44268l31 extends AbstractC30071xE {

    /* renamed from: b */
    public final C29744w3 f95395b;

    /* renamed from: c */
    public final C40117e31 f95396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44268l31(BaseActivity activity, C29744w3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f95395b = binding;
        C40117e31 c40117e31 = new C40117e31();
        this.f95396c = c40117e31;
        RecyclerView recyclerView = binding.f115201c;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c40117e31);
    }

    /* renamed from: b */
    public final void m27993b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f95396c.mo24871u(sections);
    }
}
