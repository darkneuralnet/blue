package p000;

import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LaJ3;", "LxE;", "", "title", "", "t", "", "LH6;", "sections", "b", "LJ4;", "LJ4;", "binding", "LQI3;", "c", "LQI3;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LJ4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aJ3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37881aJ3 extends AbstractC30071xE {

    /* renamed from: b */
    public final C3880J4 f50286b;

    /* renamed from: c */
    public final QI3 f50287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37881aJ3(BaseActivity activity, C3880J4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f50286b = binding;
        QI3 qi3 = new QI3();
        this.f50287c = qi3;
        RecyclerView recyclerView = binding.f16745c;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(qi3);
    }

    /* renamed from: b */
    public final void m71664b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f50287c.mo24871u(sections);
    }

    /* renamed from: t */
    public final void m71663t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(title);
        }
    }
}
