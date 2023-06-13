package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: N3 */
/* loaded from: classes3.dex */
public final class C5470N3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24051a;

    /* renamed from: b */
    public final TextView f24052b;

    /* renamed from: c */
    public final TextView f24053c;

    /* renamed from: d */
    public final CheckBox f24054d;

    /* renamed from: e */
    public final CheckBox f24055e;

    /* renamed from: f */
    public final CheckBox f24056f;

    /* renamed from: g */
    public final CheckBox f24057g;

    /* renamed from: h */
    public final Button f24058h;

    /* renamed from: i */
    public final CardView f24059i;

    /* renamed from: j */
    public final Button f24060j;

    /* renamed from: k */
    public final LottieAnimationView f24061k;

    /* renamed from: l */
    public final ScrollView f24062l;

    /* renamed from: m */
    public final TextView f24063m;

    public C5470N3(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, Button button, CardView cardView, Button button2, LottieAnimationView lottieAnimationView, ScrollView scrollView, TextView textView3) {
        this.f24051a = constraintLayout;
        this.f24052b = textView;
        this.f24053c = textView2;
        this.f24054d = checkBox;
        this.f24055e = checkBox2;
        this.f24056f = checkBox3;
        this.f24057g = checkBox4;
        this.f24058h = button;
        this.f24059i = cardView;
        this.f24060j = button2;
        this.f24061k = lottieAnimationView;
        this.f24062l = scrollView;
        this.f24063m = textView3;
    }

    /* renamed from: a */
    public static C5470N3 m94410a(View view) {
        int i = C50573vh4.bluetoothUnavailableMessageText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C50573vh4.bluetoothUnavailableTitleText;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C50573vh4.checkbox1;
                CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
                if (checkBox != null) {
                    i = C50573vh4.checkbox2;
                    CheckBox checkBox2 = (CheckBox) C34328Lp6.m96312a(view, i);
                    if (checkBox2 != null) {
                        i = C50573vh4.checkbox3;
                        CheckBox checkBox3 = (CheckBox) C34328Lp6.m96312a(view, i);
                        if (checkBox3 != null) {
                            i = C50573vh4.checkbox4;
                            CheckBox checkBox4 = (CheckBox) C34328Lp6.m96312a(view, i);
                            if (checkBox4 != null) {
                                i = C50573vh4.continueButton;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    i = C50573vh4.ctaContainer;
                                    CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                                    if (cardView != null) {
                                        i = C50573vh4.helpButton;
                                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button2 != null) {
                                            i = C50573vh4.lottie;
                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                                            if (lottieAnimationView != null) {
                                                i = C50573vh4.scrollableContent;
                                                ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                                if (scrollView != null) {
                                                    i = C50573vh4.titleText;
                                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView3 != null) {
                                                        return new C5470N3((ConstraintLayout) view, textView, textView2, checkBox, checkBox2, checkBox3, checkBox4, button, cardView, button2, lottieAnimationView, scrollView, textView3);
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
    public static C5470N3 m94408c(LayoutInflater layoutInflater) {
        return m94407d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5470N3 m94407d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42886ij4.activity_helmet_lease_unlock_tutorial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94410a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24051a;
    }
}
