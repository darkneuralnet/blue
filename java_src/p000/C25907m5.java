package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
/* renamed from: m5 */
/* loaded from: classes3.dex */
public final class C25907m5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f97301a;

    /* renamed from: b */
    public final BlockingEnterLocationView f97302b;

    /* renamed from: c */
    public final Button f97303c;

    /* renamed from: d */
    public final ImageView f97304d;

    /* renamed from: e */
    public final TextView f97305e;

    /* renamed from: f */
    public final OperatorInfoCard f97306f;

    /* renamed from: g */
    public final View f97307g;

    /* renamed from: h */
    public final Button f97308h;

    /* renamed from: i */
    public final TextView f97309i;

    /* renamed from: j */
    public final Button f97310j;

    public C25907m5(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, Button button, ImageView imageView, TextView textView, OperatorInfoCard operatorInfoCard, View view, Button button2, TextView textView2, Button button3) {
        this.f97301a = constraintLayout;
        this.f97302b = blockingEnterLocationView;
        this.f97303c = button;
        this.f97304d = imageView;
        this.f97305e = textView;
        this.f97306f = operatorInfoCard;
        this.f97307g = view;
        this.f97308h = button2;
        this.f97309i = textView2;
        this.f97310j = button3;
    }

    /* renamed from: a */
    public static C25907m5 m26371a(View view) {
        View m96312a;
        int i = C38115ai4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            i = C38115ai4.enterCodeButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C38115ai4.icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C38115ai4.instructions;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C38115ai4.operatorInfoCard;
                        OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                        if (operatorInfoCard != null && (m96312a = C34328Lp6.m96312a(view, (i = C38115ai4.operatorInfoCardBottomDivider))) != null) {
                            i = C38115ai4.scanButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C38115ai4.title;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C38115ai4.useBluetoothButton;
                                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button3 != null) {
                                        return new C25907m5((ConstraintLayout) view, blockingEnterLocationView, button, imageView, textView, operatorInfoCard, m96312a, button2, textView2, button3);
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
    public static C25907m5 m26369c(LayoutInflater layoutInflater) {
        return m26368d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25907m5 m26368d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_repairs_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m26371a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f97301a;
    }
}
