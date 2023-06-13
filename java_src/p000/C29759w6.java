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
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: w6 */
/* loaded from: classes3.dex */
public final class C29759w6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f115260a;

    /* renamed from: b */
    public final BlockingEnterLocationView f115261b;

    /* renamed from: c */
    public final Button f115262c;

    /* renamed from: d */
    public final TextView f115263d;

    /* renamed from: e */
    public final TextView f115264e;

    /* renamed from: f */
    public final ConstraintLayout f115265f;

    /* renamed from: g */
    public final OperatorInfoCard f115266g;

    /* renamed from: h */
    public final LinearProgressIndicator f115267h;

    /* renamed from: i */
    public final Button f115268i;

    /* renamed from: j */
    public final ImageView f115269j;

    /* renamed from: k */
    public final TextView f115270k;

    public C29759w6(ConstraintLayout constraintLayout, BlockingEnterLocationView blockingEnterLocationView, Button button, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, OperatorInfoCard operatorInfoCard, LinearProgressIndicator linearProgressIndicator, Button button2, ImageView imageView, TextView textView3) {
        this.f115260a = constraintLayout;
        this.f115261b = blockingEnterLocationView;
        this.f115262c = button;
        this.f115263d = textView;
        this.f115264e = textView2;
        this.f115265f = constraintLayout2;
        this.f115266g = operatorInfoCard;
        this.f115267h = linearProgressIndicator;
        this.f115268i = button2;
        this.f115269j = imageView;
        this.f115270k = textView3;
    }

    /* renamed from: a */
    public static C29759w6 m7445a(View view) {
        int i = C38115ai4.blockEnterLocationOverlay;
        BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
        if (blockingEnterLocationView != null) {
            i = C38115ai4.enterImeiButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C38115ai4.introText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C38115ai4.loadingOverlay;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C38115ai4.mainContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                        if (constraintLayout != null) {
                            i = C38115ai4.operatorInfoCard;
                            OperatorInfoCard operatorInfoCard = (OperatorInfoCard) C34328Lp6.m96312a(view, i);
                            if (operatorInfoCard != null) {
                                i = C38115ai4.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                if (linearProgressIndicator != null) {
                                    i = C38115ai4.scanButton;
                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button2 != null) {
                                        i = C38115ai4.whitelistIcon;
                                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView != null) {
                                            i = C38115ai4.whitelistText;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                return new C29759w6((ConstraintLayout) view, blockingEnterLocationView, button, textView, textView2, constraintLayout, operatorInfoCard, linearProgressIndicator, button2, imageView, textView3);
                                            }
                                        }
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
    public static C29759w6 m7443c(LayoutInflater layoutInflater) {
        return m7442d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29759w6 m7442d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_whitelist_imei_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m7445a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f115260a;
    }
}
