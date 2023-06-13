package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
/* renamed from: I3 */
/* loaded from: classes3.dex */
public final class C3318I3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f14375a;

    /* renamed from: b */
    public final BlockingEnterLocationView f14376b;

    /* renamed from: c */
    public final TextView f14377c;

    /* renamed from: d */
    public final Button f14378d;

    /* renamed from: e */
    public final TextView f14379e;

    /* renamed from: f */
    public final TextView f14380f;

    /* renamed from: g */
    public final OperatorInfoCard f14381g;

    /* renamed from: h */
    public final TextView f14382h;

    /* renamed from: i */
    public final TextView f14383i;

    public C3318I3(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, TextView textView, Button button, TextView textView2, TextView textView3, OperatorInfoCard operatorInfoCard, TextView textView4, TextView textView5) {
        this.f14375a = constraintLayout;
        this.f14376b = blockingEnterLocationView;
        this.f14377c = textView;
        this.f14378d = button;
        this.f14379e = textView2;
        this.f14380f = textView3;
        this.f14381g = operatorInfoCard;
        this.f14382h = textView4;
        this.f14383i = textView5;
    }

    /* renamed from: a */
    public static C3318I3 m103038a(View view) {
        int i = C48203rh4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            i = C48203rh4.countLabel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C48203rh4.enterButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C48203rh4.expectedScans;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C48203rh4.instructions;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C48203rh4.operatorInfoCard;
                            OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                            if (operatorInfoCard != null) {
                                i = C48203rh4.slashLabel;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C48203rh4.uploadCount;
                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView5 != null) {
                                        return new C3318I3((ConstraintLayout) view, blockingEnterLocationView, textView, button, textView2, textView3, operatorInfoCard, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3318I3 m103036c(LayoutInflater layoutInflater) {
        return m103035d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3318I3 m103035d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40514ej4.activity_hard_count_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103038a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f14375a;
    }
}
