package p000;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LRU0;", "LxE;", "LQU0;", "LOU0;", "presenter", "", "Pl", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LNU0;", "c", "LNU0;", "getAdapter", "()LNU0;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RU0 */
/* loaded from: classes2.dex */
public final class RU0 extends AbstractC30071xE implements QU0 {

    /* renamed from: b */
    public final RecyclerView f32087b;

    /* renamed from: c */
    public final NU0 f32088c;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "", "position", "LLU0;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILLU0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: RU0$a */
    /* loaded from: classes2.dex */
    public static final class C7178a extends Lambda implements Function3<View, Integer, LU0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU0 f32089g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7178a(OU0 ou0) {
            super(3);
            this.f32089g = ou0;
        }

        /* renamed from: a */
        public final void m86726a(View view, int i, LU0 item) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(item, "item");
            this.f32089g.mo90203q(view, i, item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, LU0 lu0) {
            m86726a(view, num.intValue(), lu0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RU0(BaseActivity activity, RecyclerView recyclerView) {
        super(activity);
        List list;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f32087b = recyclerView;
        NU0 nu0 = new NU0(activity);
        this.f32088c = nu0;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        recyclerView.addItemDecoration(new FN5(activity, C37044Xf4.card_spacing));
        recyclerView.setAdapter(nu0);
        list = ArraysKt___ArraysKt.toList(LU0.values());
        nu0.m44896p(list);
    }

    /* renamed from: Pl */
    public void m86727Pl(OU0 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f32088c.m44888y(new C7178a(presenter));
    }
}
