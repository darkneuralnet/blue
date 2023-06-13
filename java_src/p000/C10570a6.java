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
/* renamed from: a6 */
/* loaded from: classes3.dex */
public final class C10570a6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f49820a;

    /* renamed from: b */
    public final View f49821b;

    /* renamed from: c */
    public final BlockingEnterLocationView f49822c;

    /* renamed from: d */
    public final Button f49823d;

    /* renamed from: e */
    public final TextView f49824e;

    /* renamed from: f */
    public final OperatorInfoCard f49825f;

    /* renamed from: g */
    public final ImageView f49826g;

    /* renamed from: h */
    public final TextView f49827h;

    /* renamed from: i */
    public final Button f49828i;

    public C10570a6(ConstraintLayout constraintLayout, View view, BlockingEnterLocationView blockingEnterLocationView, Button button, TextView textView, OperatorInfoCard operatorInfoCard, ImageView imageView, TextView textView2, Button button2) {
        this.f49820a = constraintLayout;
        this.f49821b = view;
        this.f49822c = blockingEnterLocationView;
        this.f49823d = button;
        this.f49824e = textView;
        this.f49825f = operatorInfoCard;
        this.f49826g = imageView;
        this.f49827h = textView2;
        this.f49828i = button2;
    }

    /* renamed from: a */
    public static C10570a6 m71904a(View view) {
        int i = C38115ai4.background;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C38115ai4.blockEnterLocationOverlay;
            BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
            if (blockingEnterLocationView != null) {
                i = C38115ai4.enterCodeButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C38115ai4.idBirdText;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C38115ai4.operatorInfoCard;
                        OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                        if (operatorInfoCard != null) {
                            i = C38115ai4.progressIcon;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                i = C38115ai4.scanBirdText;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C38115ai4.scanButton;
                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button2 != null) {
                                        return new C10570a6((ConstraintLayout) view, m96312a, blockingEnterLocationView, button, textView, operatorInfoCard, imageView, textView2, button2);
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
    public static C10570a6 m71902c(LayoutInflater layoutInflater) {
        return m71901d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10570a6 m71901d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_service_progress_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m71904a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49820a;
    }
}
