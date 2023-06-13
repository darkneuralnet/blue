package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: c6 */
/* loaded from: classes2.dex */
public final class C13392c6 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final TextView f60079A;

    /* renamed from: B */
    public final Button f60080B;

    /* renamed from: C */
    public final TextView f60081C;

    /* renamed from: D */
    public final TextView f60082D;

    /* renamed from: E */
    public final ShapeableImageView f60083E;

    /* renamed from: F */
    public final TextView f60084F;

    /* renamed from: G */
    public final TextView f60085G;

    /* renamed from: a */
    public final FrameLayout f60086a;

    /* renamed from: b */
    public final TextView f60087b;

    /* renamed from: c */
    public final FloatingActionButton f60088c;

    /* renamed from: d */
    public final TextView f60089d;

    /* renamed from: e */
    public final ImageView f60090e;

    /* renamed from: f */
    public final FrameLayout f60091f;

    /* renamed from: g */
    public final TextView f60092g;

    /* renamed from: h */
    public final Button f60093h;

    /* renamed from: i */
    public final TextView f60094i;

    /* renamed from: j */
    public final TextInputEditText f60095j;

    /* renamed from: k */
    public final TextInputLayout f60096k;

    /* renamed from: l */
    public final Button f60097l;

    /* renamed from: m */
    public final TextView f60098m;

    /* renamed from: n */
    public final TextInputEditText f60099n;

    /* renamed from: o */
    public final TextInputLayout f60100o;

    /* renamed from: p */
    public final TextView f60101p;

    /* renamed from: q */
    public final CheckBox f60102q;

    /* renamed from: r */
    public final TextInputEditText f60103r;

    /* renamed from: s */
    public final TextInputLayout f60104s;

    /* renamed from: t */
    public final TextView f60105t;

    /* renamed from: u */
    public final LinearProgressIndicator f60106u;

    /* renamed from: v */
    public final TextView f60107v;

    /* renamed from: w */
    public final TextView f60108w;

    /* renamed from: x */
    public final ConstraintLayout f60109x;

    /* renamed from: y */
    public final C32024Bt6 f60110y;

    /* renamed from: z */
    public final LinearLayout f60111z;

    public C13392c6(FrameLayout frameLayout, TextView textView, FloatingActionButton floatingActionButton, TextView textView2, ImageView imageView, FrameLayout frameLayout2, TextView textView3, Button button, TextView textView4, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Button button2, TextView textView5, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextView textView6, CheckBox checkBox, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextView textView7, LinearProgressIndicator linearProgressIndicator, TextView textView8, TextView textView9, ConstraintLayout constraintLayout, C32024Bt6 c32024Bt6, LinearLayout linearLayout, TextView textView10, Button button3, TextView textView11, TextView textView12, ShapeableImageView shapeableImageView, TextView textView13, TextView textView14) {
        this.f60086a = frameLayout;
        this.f60087b = textView;
        this.f60088c = floatingActionButton;
        this.f60089d = textView2;
        this.f60090e = imageView;
        this.f60091f = frameLayout2;
        this.f60092g = textView3;
        this.f60093h = button;
        this.f60094i = textView4;
        this.f60095j = textInputEditText;
        this.f60096k = textInputLayout;
        this.f60097l = button2;
        this.f60098m = textView5;
        this.f60099n = textInputEditText2;
        this.f60100o = textInputLayout2;
        this.f60101p = textView6;
        this.f60102q = checkBox;
        this.f60103r = textInputEditText3;
        this.f60104s = textInputLayout3;
        this.f60105t = textView7;
        this.f60106u = linearProgressIndicator;
        this.f60107v = textView8;
        this.f60108w = textView9;
        this.f60109x = constraintLayout;
        this.f60110y = c32024Bt6;
        this.f60111z = linearLayout;
        this.f60079A = textView10;
        this.f60080B = button3;
        this.f60081C = textView11;
        this.f60082D = textView12;
        this.f60083E = shapeableImageView;
        this.f60084F = textView13;
        this.f60085G = textView14;
    }

    /* renamed from: a */
    public static C13392c6 m61939a(View view) {
        View m96312a;
        int i = C36585Vg4.accelerationType;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.addPhotoButton;
            FloatingActionButton floatingActionButton = (FloatingActionButton) C34328Lp6.m96312a(view, i);
            if (floatingActionButton != null) {
                i = C36585Vg4.chargerAgreementLink;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.checkImage;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i = C36585Vg4.deleteUserButton;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C36585Vg4.editButton;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C36585Vg4.editServiceCenter;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C36585Vg4.email;
                                    TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
                                    if (textInputEditText != null) {
                                        i = C36585Vg4.emailLayout;
                                        TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                        if (textInputLayout != null) {
                                            i = C36585Vg4.environment;
                                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                            if (button2 != null) {
                                                i = C36585Vg4.idVerificationLink;
                                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView5 != null) {
                                                    i = C36585Vg4.name;
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                                                    if (textInputEditText2 != null) {
                                                        i = C36585Vg4.nameLayout;
                                                        TextInputLayout textInputLayout2 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                                        if (textInputLayout2 != null) {
                                                            i = C36585Vg4.operatorSettingsLink;
                                                            TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView6 != null) {
                                                                i = C36585Vg4.optIn;
                                                                CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
                                                                if (checkBox != null) {
                                                                    i = C36585Vg4.phone;
                                                                    TextInputEditText textInputEditText3 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                                                                    if (textInputEditText3 != null) {
                                                                        i = C36585Vg4.phoneLayout;
                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                                                                        if (textInputLayout3 != null) {
                                                                            i = C36585Vg4.privacyPolicyLink;
                                                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView7 != null) {
                                                                                i = C36585Vg4.progressBar;
                                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                                if (linearProgressIndicator != null) {
                                                                                    i = C36585Vg4.rentalAgreementLink;
                                                                                    TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                    if (textView8 != null) {
                                                                                        i = C36585Vg4.rideModeLabel;
                                                                                        TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView9 != null) {
                                                                                            i = C36585Vg4.riderModeContainer;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                                                            if (constraintLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.serviceCenter))) != null) {
                                                                                                C32024Bt6 m113398a = C32024Bt6.m113398a(m96312a);
                                                                                                i = C36585Vg4.serviceCenterContainer;
                                                                                                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                                                                if (linearLayout != null) {
                                                                                                    i = C36585Vg4.shareCode;
                                                                                                    TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                    if (textView10 != null) {
                                                                                                        i = C36585Vg4.signOutButton;
                                                                                                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                                                                        if (button3 != null) {
                                                                                                            i = C36585Vg4.taxInformationLink;
                                                                                                            TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                            if (textView11 != null) {
                                                                                                                i = C36585Vg4.termsOfServiceLink;
                                                                                                                TextView textView12 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = C36585Vg4.userPhoto;
                                                                                                                    ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
                                                                                                                    if (shapeableImageView != null) {
                                                                                                                        i = C36585Vg4.verifyEmailButton;
                                                                                                                        TextView textView13 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                        if (textView13 != null) {
                                                                                                                            i = C36585Vg4.version;
                                                                                                                            TextView textView14 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                            if (textView14 != null) {
                                                                                                                                return new C13392c6(frameLayout, textView, floatingActionButton, textView2, imageView, frameLayout, textView3, button, textView4, textInputEditText, textInputLayout, button2, textView5, textInputEditText2, textInputLayout2, textView6, checkBox, textInputEditText3, textInputLayout3, textView7, linearProgressIndicator, textView8, textView9, constraintLayout, m113398a, linearLayout, textView10, button3, textView11, textView12, shapeableImageView, textView13, textView14);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C13392c6 m61937c(LayoutInflater layoutInflater) {
        return m61936d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C13392c6 m61936d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m61939a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f60086a;
    }
}
