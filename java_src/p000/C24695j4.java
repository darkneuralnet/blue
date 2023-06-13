package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: j4 */
/* loaded from: classes2.dex */
public final class C24695j4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f92063a;

    /* renamed from: b */
    public final TextView f92064b;

    /* renamed from: c */
    public final AppBarLayout f92065c;

    /* renamed from: d */
    public final TextView f92066d;

    /* renamed from: e */
    public final TextInputEditText f92067e;

    /* renamed from: f */
    public final TextInputLayout f92068f;

    /* renamed from: g */
    public final LinearLayout f92069g;

    /* renamed from: h */
    public final CheckBox f92070h;

    /* renamed from: i */
    public final View f92071i;

    /* renamed from: j */
    public final Button f92072j;

    /* renamed from: k */
    public final Guideline f92073k;

    /* renamed from: l */
    public final ImageView f92074l;

    /* renamed from: m */
    public final CheckBox f92075m;

    /* renamed from: n */
    public final ConstraintLayout f92076n;

    /* renamed from: o */
    public final LinearProgressIndicator f92077o;

    /* renamed from: p */
    public final Button f92078p;

    /* renamed from: q */
    public final Button f92079q;

    /* renamed from: r */
    public final ScrollView f92080r;

    /* renamed from: s */
    public final LinearLayout f92081s;

    /* renamed from: t */
    public final Toolbar f92082t;

    public C24695j4(ConstraintLayout constraintLayout, TextView textView, AppBarLayout appBarLayout, TextView textView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout, CheckBox checkBox, View view, Button button, Guideline guideline, ImageView imageView, CheckBox checkBox2, ConstraintLayout constraintLayout2, LinearProgressIndicator linearProgressIndicator, Button button2, Button button3, ScrollView scrollView, LinearLayout linearLayout2, Toolbar toolbar) {
        this.f92063a = constraintLayout;
        this.f92064b = textView;
        this.f92065c = appBarLayout;
        this.f92066d = textView2;
        this.f92067e = textInputEditText;
        this.f92068f = textInputLayout;
        this.f92069g = linearLayout;
        this.f92070h = checkBox;
        this.f92071i = view;
        this.f92072j = button;
        this.f92073k = guideline;
        this.f92074l = imageView;
        this.f92075m = checkBox2;
        this.f92076n = constraintLayout2;
        this.f92077o = linearProgressIndicator;
        this.f92078p = button2;
        this.f92079q = button3;
        this.f92080r = scrollView;
        this.f92081s = linearLayout2;
        this.f92082t = toolbar;
    }

    /* renamed from: a */
    public static C24695j4 m31203a(View view) {
        View m96312a;
        int i = C36585Vg4.agreementText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.appBar;
            AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
            if (appBarLayout != null) {
                i = C36585Vg4.emailAgreementText;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.emailEditor;
                    TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
                    if (textInputEditText != null) {
                        i = C36585Vg4.emailEditorLayout;
                        TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
                        if (textInputLayout != null) {
                            i = C36585Vg4.emailLoginContainer;
                            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                            if (linearLayout != null) {
                                i = C36585Vg4.emailOptIn;
                                CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
                                if (checkBox != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.fadingEdge))) != null) {
                                    i = C36585Vg4.googleButton;
                                    Button button = (Button) C34328Lp6.m96312a(view, i);
                                    if (button != null) {
                                        i = C36585Vg4.guideline;
                                        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                                        if (guideline != null) {
                                            i = C36585Vg4.logoImage;
                                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView != null) {
                                                i = C36585Vg4.optIn;
                                                CheckBox checkBox2 = (CheckBox) C34328Lp6.m96312a(view, i);
                                                if (checkBox2 != null) {
                                                    i = C36585Vg4.parentLayout;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                    if (constraintLayout != null) {
                                                        i = C36585Vg4.progressBar;
                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                        if (linearProgressIndicator != null) {
                                                            i = C36585Vg4.reportButton;
                                                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                            if (button2 != null) {
                                                                i = C36585Vg4.rideButton;
                                                                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                                if (button3 != null) {
                                                                    i = C36585Vg4.scrollableContent;
                                                                    ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                                                    if (scrollView != null) {
                                                                        i = C36585Vg4.thirdPartyContainer;
                                                                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                                        if (linearLayout2 != null) {
                                                                            i = C36585Vg4.toolbar;
                                                                            Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                                            if (toolbar != null) {
                                                                                return new C24695j4((ConstraintLayout) view, textView, appBarLayout, textView2, textInputEditText, textInputLayout, linearLayout, checkBox, m96312a, button, guideline, imageView, checkBox2, constraintLayout, linearProgressIndicator, button2, button3, scrollView, linearLayout2, toolbar);
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
    public static C24695j4 m31201c(LayoutInflater layoutInflater) {
        return m31200d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C24695j4 m31200d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_magic_link_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m31203a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92063a;
    }
}
