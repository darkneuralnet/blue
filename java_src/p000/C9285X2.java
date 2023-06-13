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
/* renamed from: X2 */
/* loaded from: classes3.dex */
public final class C9285X2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f42542a;

    /* renamed from: b */
    public final Button f42543b;

    /* renamed from: c */
    public final ImageView f42544c;

    /* renamed from: d */
    public final TextView f42545d;

    /* renamed from: e */
    public final BlockingEnterLocationView f42546e;

    /* renamed from: f */
    public final TextView f42547f;

    /* renamed from: g */
    public final OperatorInfoCard f42548g;

    /* renamed from: h */
    public final Button f42549h;

    public C9285X2(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, BlockingEnterLocationView blockingEnterLocationView, TextView textView2, OperatorInfoCard operatorInfoCard, Button button2) {
        this.f42542a = constraintLayout;
        this.f42543b = button;
        this.f42544c = imageView;
        this.f42545d = textView;
        this.f42546e = blockingEnterLocationView;
        this.f42547f = textView2;
        this.f42548g = operatorInfoCard;
        this.f42549h = button2;
    }

    /* renamed from: a */
    public static C9285X2 m77535a(View view) {
        int i = C38115ai4.addToBatchButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C38115ai4.batchIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C38115ai4.batchesText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C38115ai4.blockEnterLocationOverlay;
                    BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
                    if (blockingEnterLocationView != null) {
                        i = C38115ai4.introText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C38115ai4.operatorInfoCard;
                            OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                            if (operatorInfoCard != null) {
                                i = C38115ai4.searchAllBatchesButton;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    return new C9285X2((ConstraintLayout) view, button, imageView, textView, blockingEnterLocationView, textView2, operatorInfoCard, button2);
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
    public static C9285X2 m77533c(LayoutInflater layoutInflater) {
        return m77532d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9285X2 m77532d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_batch_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m77535a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f42542a;
    }
}
