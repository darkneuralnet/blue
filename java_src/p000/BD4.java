package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, m28432d2 = {"LBD4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BD4 */
/* loaded from: classes3.dex */
public final class BD4 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LBD4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "sectionTitle", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LND4;", DateTokenConverter.CONVERTER_KEY, "LND4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LBD4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSummaryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummaryAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummaryAdapter$SummarySectionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n18#2:53\n9#3,4:54\n1#4:58\n*S KotlinDebug\n*F\n+ 1 RepairSummaryAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummaryAdapter$SummarySectionViewHolder\n*L\n44#1:53\n44#1:54,4\n*E\n"})
    /* renamed from: BD4$a */
    /* loaded from: classes3.dex */
    public final class C0574a extends C29735w1 {

        /* renamed from: b */
        public final TextView f2096b;

        /* renamed from: c */
        public final RecyclerView f2097c;

        /* renamed from: d */
        public final ND4 f2098d;

        /* renamed from: e */
        public final /* synthetic */ BD4 f2099e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0574a(BD4 bd4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f2099e = bd4;
            View findViewById = view.findViewById(C35658Rh4.title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.title)");
            this.f2096b = (TextView) findViewById;
            View findViewById2 = view.findViewById(C35658Rh4.recyclerView);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.recyclerView)");
            RecyclerView recyclerView = (RecyclerView) findViewById2;
            this.f2097c = recyclerView;
            ND4 nd4 = new ND4();
            this.f2098d = nd4;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(nd4);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f2099e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof RD4)) {
                m105816c = null;
            }
            RD4 rd4 = (RD4) m105816c;
            if (rd4 != null) {
                String m87029a = rd4.m87029a();
                boolean m87028b = rd4.m87028b();
                List<C3023H6> m87027c = rd4.m87027c();
                this.f2096b.setText(m87029a);
                this.f2098d.m94174w(m87028b);
                this.f2098d.mo24871u(m87027c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new HD4());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_summary_section ? new C0574a(this, m41761u) : new C29735w1(m41761u);
    }
}
