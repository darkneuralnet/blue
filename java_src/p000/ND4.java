package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LND4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "", "value", "c", "Z", "v", "()Z", "w", "(Z)V", "complete", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ND4 */
/* loaded from: classes3.dex */
public final class ND4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public boolean f24300c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LND4$a;", "LND4$b;", "LND4;", "Landroid/view/View;", "view", "<init>", "(LND4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSummarySectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummarySectionAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummarySectionAdapter$ItemDrawableViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    /* renamed from: ND4$a */
    /* loaded from: classes3.dex */
    public final class C5516a extends C5517b {

        /* renamed from: e */
        public final /* synthetic */ ND4 f24301e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5516a(ND4 nd4, View view) {
            super(nd4, view);
            Drawable m94299e;
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24301e = nd4;
            if (nd4.m94175v()) {
                m94299e = NA0.m94299e(this.itemView.getContext(), C41670gg4.ic_mini_check_circle);
            } else {
                m94299e = NA0.m94299e(this.itemView.getContext(), C41670gg4.ic_mini_x_circle);
            }
            TextView m94173a = m94173a();
            if (m94299e != null && (drawable = m94299e.mutate()) != null) {
                C42529i71.m34432a(drawable, m94172b());
            } else {
                drawable = null;
            }
            m94173a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0092\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LND4$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", C17296a.f69688o, "()Landroid/widget/TextView;", "item", "c", "I", "()I", "tint", "Landroid/view/View;", "view", "<init>", "(LND4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSummarySectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummarySectionAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummarySectionAdapter$ItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,72:1\n18#2:73\n9#3,4:74\n*S KotlinDebug\n*F\n+ 1 RepairSummarySectionAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummarySectionAdapter$ItemViewHolder\n*L\n52#1:73\n52#1:74,4\n*E\n"})
    /* renamed from: ND4$b */
    /* loaded from: classes3.dex */
    public class C5517b extends C29735w1 {

        /* renamed from: b */
        public final TextView f24302b;

        /* renamed from: c */
        public final int f24303c;

        /* renamed from: d */
        public final /* synthetic */ ND4 f24304d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5517b(ND4 nd4, View view) {
            super(view);
            int m94301c;
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24304d = nd4;
            TextView textView = (TextView) view;
            this.f24302b = textView;
            if (nd4.m94175v()) {
                m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.birdGreen);
            } else {
                m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.birdRed);
            }
            this.f24303c = m94301c;
            textView.setTextColor(m94301c);
        }

        /* renamed from: a */
        public final TextView m94173a() {
            return this.f24302b;
        }

        /* renamed from: b */
        public final int m94172b() {
            return this.f24303c;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f24302b;
            Object m105816c = this.f24304d.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new OD4());
        }
    }

    /* renamed from: v */
    public final boolean m94175v() {
        return this.f24300c;
    }

    /* renamed from: w */
    public final void m94174w(boolean z) {
        this.f24300c = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_summary_item ? new C5517b(this, m41761u) : i == C32634Ej4.item_repair_summary_subitem ? new C5516a(this, m41761u) : new C29735w1(m41761u);
    }
}
