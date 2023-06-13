package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.FleetStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LKZ3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "c", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KZ3 */
/* loaded from: classes3.dex */
public final class KZ3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public RecyclerView f19869c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKZ3$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "label", "Landroid/view/View;", "view", "<init>", "(LKZ3;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPredictionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/PredictionAdapter$PredictionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,55:1\n18#2:56\n9#3,4:57\n*S KotlinDebug\n*F\n+ 1 PredictionAdapter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/PredictionAdapter$PredictionViewHolder\n*L\n49#1:56\n49#1:57,4\n*E\n"})
    /* renamed from: KZ3$a */
    /* loaded from: classes3.dex */
    public final class C4491a extends C29735w1 {

        /* renamed from: b */
        public final TextView f19870b;

        /* renamed from: c */
        public final /* synthetic */ KZ3 f19871c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4491a(KZ3 kz3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19871c = kz3;
            TextView textView = (TextView) view;
            this.f19870b = textView;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            RecyclerView recyclerView = kz3.f19869c;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView = null;
            }
            layoutParams.width = recyclerView.getWidth() / 2;
            textView.setLayoutParams(layoutParams);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f19871c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetStatus)) {
                m105816c = null;
            }
            FleetStatus fleetStatus = (FleetStatus) m105816c;
            if (fleetStatus != null) {
                this.f19870b.setText(fleetStatus.getTitle());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f19869c = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new PZ3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new LZ3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C38125aj4.item_fleet_status_prediction ? new C4491a(this, m41761u) : new C29735w1(m41761u);
    }
}
