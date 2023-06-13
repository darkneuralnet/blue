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
/* renamed from: W4 */
/* loaded from: classes3.dex */
public final class C8929W4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f40359a;

    /* renamed from: b */
    public final BlockingEnterLocationView f40360b;

    /* renamed from: c */
    public final Button f40361c;

    /* renamed from: d */
    public final ImageView f40362d;

    /* renamed from: e */
    public final TextView f40363e;

    /* renamed from: f */
    public final OperatorInfoCard f40364f;

    /* renamed from: g */
    public final Button f40365g;

    /* renamed from: h */
    public final TextView f40366h;

    /* renamed from: i */
    public final Button f40367i;

    public C8929W4(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, Button button, ImageView imageView, TextView textView, OperatorInfoCard operatorInfoCard, Button button2, TextView textView2, Button button3) {
        this.f40359a = constraintLayout;
        this.f40360b = blockingEnterLocationView;
        this.f40361c = button;
        this.f40362d = imageView;
        this.f40363e = textView;
        this.f40364f = operatorInfoCard;
        this.f40365g = button2;
        this.f40366h = textView2;
        this.f40367i = button3;
    }

    /* renamed from: a */
    public static C8929W4 m78875a(View view) {
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
                        if (operatorInfoCard != null) {
                            i = C38115ai4.scanButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C38115ai4.title;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C38115ai4.useBluetoothButton;
                                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button3 != null) {
                                        return new C8929W4((ConstraintLayout) view, blockingEnterLocationView, button, imageView, textView, operatorInfoCard, button2, textView2, button3);
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
    public static C8929W4 m78873c(LayoutInflater layoutInflater) {
        return m78872d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8929W4 m78872d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_quality_control_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m78875a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f40359a;
    }
}
