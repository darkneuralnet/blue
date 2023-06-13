package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: a5 */
/* loaded from: classes3.dex */
public final class C10566a5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f49792a;

    /* renamed from: b */
    public final ConstraintLayout f49793b;

    /* renamed from: c */
    public final ConstraintLayout f49794c;

    /* renamed from: d */
    public final ConstraintLayout f49795d;

    /* renamed from: e */
    public final Button f49796e;

    /* renamed from: f */
    public final TextView f49797f;

    /* renamed from: g */
    public final TextView f49798g;

    /* renamed from: h */
    public final ImageButton f49799h;

    /* renamed from: i */
    public final Button f49800i;

    /* renamed from: j */
    public final ImageButton f49801j;

    /* renamed from: k */
    public final LinearProgressIndicator f49802k;

    /* renamed from: l */
    public final TextView f49803l;

    /* renamed from: m */
    public final ImageView f49804m;

    public C10566a5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, Button button, TextView textView, TextView textView2, ImageButton imageButton, Button button2, ImageButton imageButton2, LinearProgressIndicator linearProgressIndicator, TextView textView3, ImageView imageView) {
        this.f49792a = constraintLayout;
        this.f49793b = constraintLayout2;
        this.f49794c = constraintLayout3;
        this.f49795d = constraintLayout4;
        this.f49796e = button;
        this.f49797f = textView;
        this.f49798g = textView2;
        this.f49799h = imageButton;
        this.f49800i = button2;
        this.f49801j = imageButton2;
        this.f49802k = linearProgressIndicator;
        this.f49803l = textView3;
        this.f49804m = imageView;
    }

    /* renamed from: a */
    public static C10566a5 m71925a(View view) {
        int i = C34956Oh4.bottomGroup;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            i = C34956Oh4.centerGroup;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout2 != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                i = C34956Oh4.creditCardButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C34956Oh4.depositText;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C34956Oh4.disclaimerText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C34956Oh4.googlePayButton;
                            ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
                            if (imageButton != null) {
                                i = C34956Oh4.moreButton;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    i = C34956Oh4.paypalButton;
                                    ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
                                    if (imageButton2 != null) {
                                        i = C34956Oh4.progressBar;
                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                        if (linearProgressIndicator != null) {
                                            i = C34956Oh4.ridePriceText;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                i = C34956Oh4.vehicleIcon;
                                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView != null) {
                                                    return new C10566a5(constraintLayout3, constraintLayout, constraintLayout2, constraintLayout3, button, textView, textView2, imageButton, button2, imageButton2, linearProgressIndicator, textView3, imageView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10566a5 m71923c(LayoutInflater layoutInflater) {
        return m71922d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10566a5 m71922d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_quick_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m71925a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49792a;
    }
}
