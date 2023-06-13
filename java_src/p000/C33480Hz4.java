package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.Issue;
import co.bird.android.model.extension.IssueStatus_Kt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, m28432d2 = {"LHz4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33480Hz4 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHz4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/CheckBox;", "b", "Landroid/widget/CheckBox;", "checkbox", "Landroid/view/View;", "view", "<init>", "(LHz4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypeSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypeSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypeSubtypesAdapter$SubtypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n18#2:46\n9#3,4:47\n1#4:51\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypeSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypeSubtypesAdapter$SubtypeViewHolder\n*L\n38#1:46\n38#1:47,4\n*E\n"})
    /* renamed from: Hz4$a */
    /* loaded from: classes3.dex */
    public final class C3293a extends C29735w1 {

        /* renamed from: b */
        public final CheckBox f14273b;

        /* renamed from: c */
        public final /* synthetic */ C33480Hz4 f14274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3293a(C33480Hz4 c33480Hz4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f14274c = c33480Hz4;
            this.f14273b = (CheckBox) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f14274c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                this.f14273b.setText((String) pair.component2());
                this.f14273b.setChecked(IssueStatus_Kt.isPassedStatus(((Issue) pair.component1()).getStatus()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C33948Jz4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C33714Iz4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_v2_supertype_subtype ? new C3293a(this, m41761u) : new C29735w1(m41761u);
    }
}
