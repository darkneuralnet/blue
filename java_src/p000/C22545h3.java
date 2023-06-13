package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: h3 */
/* loaded from: classes2.dex */
public final class C22545h3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f84649a;

    /* renamed from: b */
    public final ImageView f84650b;

    /* renamed from: c */
    public final TextView f84651c;

    /* renamed from: d */
    public final TextView f84652d;

    /* renamed from: e */
    public final TextView f84653e;

    /* renamed from: f */
    public final LinearLayout f84654f;

    /* renamed from: g */
    public final ImageView f84655g;

    /* renamed from: h */
    public final Button f84656h;

    /* renamed from: i */
    public final TextView f84657i;

    /* renamed from: j */
    public final LinearLayout f84658j;

    /* renamed from: k */
    public final LinearProgressIndicator f84659k;

    /* renamed from: l */
    public final TextView f84660l;

    public C22545h3(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, ImageView imageView2, Button button, TextView textView4, LinearLayout linearLayout2, LinearProgressIndicator linearProgressIndicator, TextView textView5) {
        this.f84649a = relativeLayout;
        this.f84650b = imageView;
        this.f84651c = textView;
        this.f84652d = textView2;
        this.f84653e = textView3;
        this.f84654f = linearLayout;
        this.f84655g = imageView2;
        this.f84656h = button;
        this.f84657i = textView4;
        this.f84658j = linearLayout2;
        this.f84659k = linearProgressIndicator;
        this.f84660l = textView5;
    }

    /* renamed from: a */
    public static C22545h3 m36883a(View view) {
        int i = C36585Vg4.barcode;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.barcodeText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.bodyText1;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.bodyText2;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C36585Vg4.buttonContainer;
                        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout != null) {
                            i = C36585Vg4.cashpayVendorBadge;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C36585Vg4.findRetailers;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    i = C36585Vg4.headerText;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        i = C36585Vg4.mainContainer;
                                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                        if (linearLayout2 != null) {
                                            i = C36585Vg4.progressBar;
                                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                            if (linearProgressIndicator != null) {
                                                i = C36585Vg4.textOverlay;
                                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView5 != null) {
                                                    return new C22545h3((RelativeLayout) view, imageView, textView, textView2, textView3, linearLayout, imageView2, button, textView4, linearLayout2, linearProgressIndicator, textView5);
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
    public static C22545h3 m36881c(LayoutInflater layoutInflater) {
        return m36880d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C22545h3 m36880d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_cashpay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36883a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f84649a;
    }
}
