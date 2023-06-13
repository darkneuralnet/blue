package p000;

import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.FleetStatusSummary;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LUr1;", "LxE;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetStatusSummary;", "Pl", "Ql", "Lhy1;", "Lhy1;", "binding", "LJr1;", "c", "LJr1;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lhy1;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ur1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36447Ur1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C42440hy1 f38116b;

    /* renamed from: c */
    public final C33873Jr1 f38117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36447Ur1(BaseActivity activity, C42440hy1 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f38116b = binding;
        C33873Jr1 c33873Jr1 = new C33873Jr1();
        this.f38117c = c33873Jr1;
        RecyclerView recyclerView = binding.f86236b;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c33873Jr1);
        m80759Ql();
    }

    /* renamed from: Pl */
    public final Observable<FleetStatusSummary> m80760Pl() {
        return this.f38117c.m99624v();
    }

    /* renamed from: Ql */
    public final void m80759Ql() {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getString(C45871nl4.fleets_overview_label));
    }

    /* renamed from: b */
    public final void m80758b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f38117c.mo24871u(sections);
    }
}
