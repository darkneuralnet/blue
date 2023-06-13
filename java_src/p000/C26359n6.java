package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import co.bird.android.widget.OperatorMapFilterButtonView;
/* renamed from: n6 */
/* loaded from: classes3.dex */
public final class C26359n6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f99351a;

    /* renamed from: b */
    public final BlockingEnterLocationView f99352b;

    /* renamed from: c */
    public final Group f99353c;

    /* renamed from: d */
    public final View f99354d;

    /* renamed from: e */
    public final OperatorMapFilterButtonView f99355e;

    /* renamed from: f */
    public final Button f99356f;

    /* renamed from: g */
    public final View f99357g;

    /* renamed from: h */
    public final OperatorInfoCard f99358h;

    /* renamed from: i */
    public final RecyclerView f99359i;

    public C26359n6(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, Group group, View view, OperatorMapFilterButtonView operatorMapFilterButtonView, Button button, View view2, OperatorInfoCard operatorInfoCard, RecyclerView recyclerView) {
        this.f99351a = constraintLayout;
        this.f99352b = blockingEnterLocationView;
        this.f99353c = group;
        this.f99354d = view;
        this.f99355e = operatorMapFilterButtonView;
        this.f99356f = button;
        this.f99357g = view2;
        this.f99358h = operatorInfoCard;
        this.f99359i = recyclerView;
    }

    /* renamed from: a */
    public static C26359n6 m24477a(View view) {
        View m96312a;
        View m96312a2;
        int i = C39912di4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            i = C39912di4.containerOrderScanGroup;
            Group group = (Group) C34328Lp6.m96312a(view, i);
            if (group != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.divider))) != null) {
                i = C39912di4.filters;
                OperatorMapFilterButtonView operatorMapFilterButtonView = (OperatorMapFilterButtonView) C34328Lp6.m96312a(view, i);
                if (operatorMapFilterButtonView != null) {
                    i = C39912di4.footerButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C39912di4.footerDivider))) != null) {
                        i = C39912di4.operatorInfoCard;
                        OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                        if (operatorInfoCard != null) {
                            i = C39912di4.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                return new C26359n6((ConstraintLayout) view, blockingEnterLocationView, group, m96312a, operatorMapFilterButtonView, button, m96312a2, operatorInfoCard, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C26359n6 m24475c(LayoutInflater layoutInflater) {
        return m24474d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26359n6 m24474d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_transfer_order_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m24477a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99351a;
    }
}
