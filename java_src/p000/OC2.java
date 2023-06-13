package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: OC2 */
/* loaded from: classes2.dex */
public final class OC2 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final FrameLayout f26165A;

    /* renamed from: B */
    public final TextView f26166B;

    /* renamed from: C */
    public final FrameLayout f26167C;

    /* renamed from: a */
    public final RelativeLayout f26168a;

    /* renamed from: b */
    public final TextView f26169b;

    /* renamed from: c */
    public final TextView f26170c;

    /* renamed from: d */
    public final LinearLayout f26171d;

    /* renamed from: e */
    public final TextView f26172e;

    /* renamed from: f */
    public final LinearLayout f26173f;

    /* renamed from: g */
    public final Button f26174g;

    /* renamed from: h */
    public final TextView f26175h;

    /* renamed from: i */
    public final TextView f26176i;

    /* renamed from: j */
    public final LinearLayout f26177j;

    /* renamed from: k */
    public final ED1 f26178k;

    /* renamed from: l */
    public final Button f26179l;

    /* renamed from: m */
    public final Button f26180m;

    /* renamed from: n */
    public final TextView f26181n;

    /* renamed from: o */
    public final LinearLayout f26182o;

    /* renamed from: p */
    public final TextView f26183p;

    /* renamed from: q */
    public final TextView f26184q;

    /* renamed from: r */
    public final LinearProgressIndicator f26185r;

    /* renamed from: s */
    public final TextView f26186s;

    /* renamed from: t */
    public final FrameLayout f26187t;

    /* renamed from: u */
    public final TextView f26188u;

    /* renamed from: v */
    public final TextView f26189v;

    /* renamed from: w */
    public final ScrollView f26190w;

    /* renamed from: x */
    public final TextView f26191x;

    /* renamed from: y */
    public final LinearLayout f26192y;

    /* renamed from: z */
    public final TextView f26193z;

    public OC2(RelativeLayout relativeLayout, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, LinearLayout linearLayout2, Button button, TextView textView4, TextView textView5, LinearLayout linearLayout3, ED1 ed1, Button button2, Button button3, TextView textView6, LinearLayout linearLayout4, TextView textView7, TextView textView8, LinearProgressIndicator linearProgressIndicator, TextView textView9, FrameLayout frameLayout, TextView textView10, TextView textView11, ScrollView scrollView, TextView textView12, LinearLayout linearLayout5, TextView textView13, FrameLayout frameLayout2, TextView textView14, FrameLayout frameLayout3) {
        this.f26168a = relativeLayout;
        this.f26169b = textView;
        this.f26170c = textView2;
        this.f26171d = linearLayout;
        this.f26172e = textView3;
        this.f26173f = linearLayout2;
        this.f26174g = button;
        this.f26175h = textView4;
        this.f26176i = textView5;
        this.f26177j = linearLayout3;
        this.f26178k = ed1;
        this.f26179l = button2;
        this.f26180m = button3;
        this.f26181n = textView6;
        this.f26182o = linearLayout4;
        this.f26183p = textView7;
        this.f26184q = textView8;
        this.f26185r = linearProgressIndicator;
        this.f26186s = textView9;
        this.f26187t = frameLayout;
        this.f26188u = textView10;
        this.f26189v = textView11;
        this.f26190w = scrollView;
        this.f26191x = textView12;
        this.f26192y = linearLayout5;
        this.f26193z = textView13;
        this.f26165A = frameLayout2;
        this.f26166B = textView14;
        this.f26167C = frameLayout3;
    }

    /* renamed from: a */
    public static OC2 m92627a(View view) {
        View m96312a;
        int i = C36585Vg4.address;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.addressLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.buttonContainerLinearLayout;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C36585Vg4.buttonsLabel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C36585Vg4.content;
                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout2 != null) {
                            i = C36585Vg4.continueWithCreditButton;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C36585Vg4.deliveryDate;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C36585Vg4.deliveryDateLabel;
                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView5 != null) {
                                        i = C36585Vg4.deliverySection;
                                        LinearLayout linearLayout3 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                        if (linearLayout3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.googlePayButton))) != null) {
                                            ED1 m109292a = ED1.m109292a(m96312a);
                                            i = C36585Vg4.hollowPrimary;
                                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                            if (button2 != null) {
                                                i = C36585Vg4.hollowSecondary;
                                                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                if (button3 != null) {
                                                    i = C36585Vg4.included;
                                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView6 != null) {
                                                        i = C36585Vg4.includedSection;
                                                        LinearLayout linearLayout4 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                        if (linearLayout4 != null) {
                                                            i = C36585Vg4.notes;
                                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView7 != null) {
                                                                i = C36585Vg4.notesLabel;
                                                                TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView8 != null) {
                                                                    i = C36585Vg4.progressBar;
                                                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                    if (linearProgressIndicator != null) {
                                                                        i = C36585Vg4.rentalCost;
                                                                        TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView9 != null) {
                                                                            i = C36585Vg4.rentalCostSection;
                                                                            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                                            if (frameLayout != null) {
                                                                                i = C36585Vg4.returnDate;
                                                                                TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                if (textView10 != null) {
                                                                                    i = C36585Vg4.returnDateLabel;
                                                                                    TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = C36585Vg4.scrollView;
                                                                                        ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                                                                        if (scrollView != null) {
                                                                                            i = C36585Vg4.status;
                                                                                            TextView textView12 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                            if (textView12 != null) {
                                                                                                i = C36585Vg4.statusSection;
                                                                                                LinearLayout linearLayout5 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                                                                if (linearLayout5 != null) {
                                                                                                    i = C36585Vg4.taxCost;
                                                                                                    TextView textView13 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                    if (textView13 != null) {
                                                                                                        i = C36585Vg4.taxCostSection;
                                                                                                        FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                                                                        if (frameLayout2 != null) {
                                                                                                            i = C36585Vg4.totalCost;
                                                                                                            TextView textView14 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                            if (textView14 != null) {
                                                                                                                i = C36585Vg4.totalCostSection;
                                                                                                                FrameLayout frameLayout3 = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                                                                                if (frameLayout3 != null) {
                                                                                                                    return new OC2((RelativeLayout) view, textView, textView2, linearLayout, textView3, linearLayout2, button, textView4, textView5, linearLayout3, m109292a, button2, button3, textView6, linearLayout4, textView7, textView8, linearProgressIndicator, textView9, frameLayout, textView10, textView11, scrollView, textView12, linearLayout5, textView13, frameLayout2, textView14, frameLayout3);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static OC2 m92625c(LayoutInflater layoutInflater) {
        return m92624d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static OC2 m92624d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92627a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f26168a;
    }
}
