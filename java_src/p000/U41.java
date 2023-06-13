package p000;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LU41;", "LMy;", "LeT0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "w", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "holder", "position", "v", "LF6;", "r", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "c", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "viewHolderSupplier", "<init>", "(Lco/bird/android/widget/adapter/ViewHolderSupplier;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisplayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayAdapter.kt\nco/bird/android/widget/adapter/DisplayAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* renamed from: U41 */
/* loaded from: classes4.dex */
public final class U41 extends AbstractC5440My<AbstractC40357eT0> {

    /* renamed from: c */
    public final ViewHolderSupplier<AbstractC40357eT0> f36798c;

    public U41(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
        this.f36798c = viewHolderSupplier;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.AbstractC11854o mo54244q3;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0 && (mo54244q3 = this.f36798c.mo54244q3()) != null) {
            recyclerView.addItemDecoration(mo54244q3);
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return this.f36798c.mo54243s2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: v */
    public void onBindViewHolder(AbstractC40357eT0 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.mo42868a(m94545o().m109394h().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: w */
    public AbstractC40357eT0 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return this.f36798c.getViewHolderForLayout(i, C40788fB0.m41761u(context, i, parent, false));
    }
}
