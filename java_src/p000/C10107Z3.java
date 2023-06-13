package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
/* renamed from: Z3 */
/* loaded from: classes3.dex */
public final class C10107Z3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f47783a;

    /* renamed from: b */
    public final BlockingEnterLocationView f47784b;

    /* renamed from: c */
    public final ConstraintLayout f47785c;

    /* renamed from: d */
    public final OperatorInfoCard f47786d;

    public C10107Z3(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, ConstraintLayout constraintLayout2, OperatorInfoCard operatorInfoCard) {
        this.f47783a = constraintLayout;
        this.f47784b = blockingEnterLocationView;
        this.f47785c = constraintLayout2;
        this.f47786d = operatorInfoCard;
    }

    /* renamed from: a */
    public static C10107Z3 m73807a(View view) {
        int i = C38115ai4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C38115ai4.operatorInfoCard;
            OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i2);
            if (operatorInfoCard != null) {
                return new C10107Z3(constraintLayout, blockingEnterLocationView, constraintLayout, operatorInfoCard);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10107Z3 m73805c(LayoutInflater layoutInflater) {
        return m73804d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10107Z3 m73804d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_inventory_scan_proxy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m73807a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f47783a;
    }
}
