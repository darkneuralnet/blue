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
/* renamed from: g5 */
/* loaded from: classes3.dex */
public final class C20724g5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f81534a;

    /* renamed from: b */
    public final View f81535b;

    /* renamed from: c */
    public final BlockingEnterLocationView f81536c;

    /* renamed from: d */
    public final TextView f81537d;

    /* renamed from: e */
    public final OperatorInfoCard f81538e;

    /* renamed from: f */
    public final TextView f81539f;

    /* renamed from: g */
    public final Button f81540g;

    /* renamed from: h */
    public final ImageView f81541h;

    public C20724g5(ConstraintLayout constraintLayout, View view, BlockingEnterLocationView blockingEnterLocationView, TextView textView, OperatorInfoCard operatorInfoCard, TextView textView2, Button button, ImageView imageView) {
        this.f81534a = constraintLayout;
        this.f81535b = view;
        this.f81536c = blockingEnterLocationView;
        this.f81537d = textView;
        this.f81538e = operatorInfoCard;
        this.f81539f = textView2;
        this.f81540g = button;
        this.f81541h = imageView;
    }

    /* renamed from: a */
    public static C20724g5 m40143a(View view) {
        int i = C38115ai4.background;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C38115ai4.blockEnterLocationOverlay;
            BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
            if (blockingEnterLocationView != null) {
                i = C38115ai4.idBirdText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C38115ai4.operatorInfoCard;
                    OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                    if (operatorInfoCard != null) {
                        i = C38115ai4.scanBirdText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C38115ai4.scanButton;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C38115ai4.scan_icon;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    return new C20724g5((ConstraintLayout) view, m96312a, blockingEnterLocationView, textView, operatorInfoCard, textView2, button, imageView);
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
    public static C20724g5 m40141c(LayoutInflater layoutInflater) {
        return m40140d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20724g5 m40140d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_repair_logger_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40143a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f81534a;
    }
}
