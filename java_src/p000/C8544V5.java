package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
/* renamed from: V5 */
/* loaded from: classes3.dex */
public final class C8544V5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f38581a;

    /* renamed from: b */
    public final BlockingEnterLocationView f38582b;

    /* renamed from: c */
    public final OperatorInfoCard f38583c;

    /* renamed from: d */
    public final RecyclerView f38584d;

    public C8544V5(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, OperatorInfoCard operatorInfoCard, RecyclerView recyclerView) {
        this.f38581a = constraintLayout;
        this.f38582b = blockingEnterLocationView;
        this.f38583c = operatorInfoCard;
        this.f38584d = recyclerView;
    }

    /* renamed from: a */
    public static C8544V5 m80434a(View view) {
        int i = C39912di4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            i = C39912di4.operatorInfoCard;
            OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
            if (operatorInfoCard != null) {
                i = C39912di4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C8544V5((ConstraintLayout) view, blockingEnterLocationView, operatorInfoCard, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C8544V5 m80432c(LayoutInflater layoutInflater) {
        return m80431d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8544V5 m80431d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_scrap_order_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80434a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f38581a;
    }
}
