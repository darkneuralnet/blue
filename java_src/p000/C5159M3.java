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
/* renamed from: M3 */
/* loaded from: classes3.dex */
public final class C5159M3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f22493a;

    /* renamed from: b */
    public final TextView f22494b;

    /* renamed from: c */
    public final TextView f22495c;

    /* renamed from: d */
    public final CheckBox f22496d;

    /* renamed from: e */
    public final CheckBox f22497e;

    /* renamed from: f */
    public final CheckBox f22498f;

    /* renamed from: g */
    public final CheckBox f22499g;

    /* renamed from: h */
    public final Button f22500h;

    /* renamed from: i */
    public final Button f22501i;

    /* renamed from: j */
    public final CardView f22502j;

    /* renamed from: k */
    public final Button f22503k;

    /* renamed from: l */
    public final LottieAnimationView f22504l;

    /* renamed from: m */
    public final ScrollView f22505m;

    /* renamed from: n */
    public final Button f22506n;

    public C5159M3(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, Button button, Button button2, CardView cardView, Button button3, LottieAnimationView lottieAnimationView, ScrollView scrollView, Button button4) {
        this.f22493a = constraintLayout;
        this.f22494b = textView;
        this.f22495c = textView2;
        this.f22496d = checkBox;
        this.f22497e = checkBox2;
        this.f22498f = checkBox3;
        this.f22499g = checkBox4;
        this.f22500h = button;
        this.f22501i = button2;
        this.f22502j = cardView;
        this.f22503k = button3;
        this.f22504l = lottieAnimationView;
        this.f22505m = scrollView;
        this.f22506n = button4;
    }

    /* renamed from: a */
    public static C5159M3 m95951a(View view) {
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
                                    i = C50573vh4.continueWithoutHelmetButton;
                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button2 != null) {
                                        i = C50573vh4.ctaContainer;
                                        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                                        if (cardView != null) {
                                            i = C50573vh4.helpButton;
                                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                            if (button3 != null) {
                                                i = C50573vh4.lottie;
                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                                                if (lottieAnimationView != null) {
                                                    i = C50573vh4.scrollableContent;
                                                    ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                                    if (scrollView != null) {
                                                        i = C50573vh4.tryAgainButton;
                                                        Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                                        if (button4 != null) {
                                                            return new C5159M3((ConstraintLayout) view, textView, textView2, checkBox, checkBox2, checkBox3, checkBox4, button, button2, cardView, button3, lottieAnimationView, scrollView, button4);
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
    public static C5159M3 m95949c(LayoutInflater layoutInflater) {
        return m95948d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5159M3 m95948d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42886ij4.activity_helmet_lease_solebe_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m95951a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f22493a;
    }
}
