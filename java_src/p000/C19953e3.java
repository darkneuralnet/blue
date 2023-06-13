package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import co.bird.android.widget.QuickStartUnselectedBannerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: e3 */
/* loaded from: classes2.dex */
public final class C19953e3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f77622a;

    /* renamed from: b */
    public final BirdActionView f77623b;

    /* renamed from: c */
    public final View f77624c;

    /* renamed from: d */
    public final LinearLayout f77625d;

    /* renamed from: e */
    public final ImageView f77626e;

    /* renamed from: f */
    public final AppCompatEditText f77627f;

    /* renamed from: g */
    public final ConstraintLayout f77628g;

    /* renamed from: h */
    public final View f77629h;

    /* renamed from: i */
    public final ImageView f77630i;

    /* renamed from: j */
    public final FrequentFlyerScannerView f77631j;

    /* renamed from: k */
    public final Barrier f77632k;

    /* renamed from: l */
    public final RelativeLayout f77633l;

    /* renamed from: m */
    public final TextView f77634m;

    /* renamed from: n */
    public final TextView f77635n;

    /* renamed from: o */
    public final LinearProgressIndicator f77636o;

    /* renamed from: p */
    public final QuickStartUnselectedBannerView f77637p;

    /* renamed from: q */
    public final FrameLayout f77638q;

    /* renamed from: r */
    public final FrameLayout f77639r;

    /* renamed from: s */
    public final ViewStub f77640s;

    /* renamed from: t */
    public final ImageView f77641t;

    /* renamed from: u */
    public final View f77642u;

    /* renamed from: v */
    public final TextView f77643v;

    /* renamed from: w */
    public final View f77644w;

    /* renamed from: x */
    public final View f77645x;

    public C19953e3(FrameLayout frameLayout, BirdActionView birdActionView, View view, LinearLayout linearLayout, ImageView imageView, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout, View view2, ImageView imageView2, FrequentFlyerScannerView frequentFlyerScannerView, Barrier barrier, RelativeLayout relativeLayout, TextView textView, TextView textView2, LinearProgressIndicator linearProgressIndicator, QuickStartUnselectedBannerView quickStartUnselectedBannerView, FrameLayout frameLayout2, FrameLayout frameLayout3, ViewStub viewStub, ImageView imageView3, View view3, TextView textView3, View view4, View view5) {
        this.f77622a = frameLayout;
        this.f77623b = birdActionView;
        this.f77624c = view;
        this.f77625d = linearLayout;
        this.f77626e = imageView;
        this.f77627f = appCompatEditText;
        this.f77628g = constraintLayout;
        this.f77629h = view2;
        this.f77630i = imageView2;
        this.f77631j = frequentFlyerScannerView;
        this.f77632k = barrier;
        this.f77633l = relativeLayout;
        this.f77634m = textView;
        this.f77635n = textView2;
        this.f77636o = linearProgressIndicator;
        this.f77637p = quickStartUnselectedBannerView;
        this.f77638q = frameLayout2;
        this.f77639r = frameLayout3;
        this.f77640s = viewStub;
        this.f77641t = imageView3;
        this.f77642u = view3;
        this.f77643v = textView3;
        this.f77644w = view4;
        this.f77645x = view5;
    }

    /* renamed from: a */
    public static C19953e3 m43313a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        View m96312a5;
        int i = C36585Vg4.birdStatus;
        BirdActionView birdActionView = (BirdActionView) C34328Lp6.m96312a(view, i);
        if (birdActionView != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.bottomScrim))) != null) {
            i = C36585Vg4.buttons;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C36585Vg4.codeButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C36585Vg4.codeEditor;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) C34328Lp6.m96312a(view, i);
                    if (appCompatEditText != null) {
                        i = C36585Vg4.container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                        if (constraintLayout != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.endScrim))) != null) {
                            i = C36585Vg4.flashButton;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C36585Vg4.frequentFlyerStatus;
                                FrequentFlyerScannerView frequentFlyerScannerView = (FrequentFlyerScannerView) C34328Lp6.m96312a(view, i);
                                if (frequentFlyerScannerView != null) {
                                    i = C36585Vg4.infoBannerBarrier;
                                    Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                                    if (barrier != null) {
                                        i = C36585Vg4.infoContainer;
                                        RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                        if (relativeLayout != null) {
                                            i = C36585Vg4.infoText;
                                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView != null) {
                                                i = C36585Vg4.pricing;
                                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView2 != null) {
                                                    i = C36585Vg4.progressBar;
                                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                    if (linearProgressIndicator != null) {
                                                        i = C36585Vg4.quickStartUnselectedBannerView;
                                                        QuickStartUnselectedBannerView quickStartUnselectedBannerView = (QuickStartUnselectedBannerView) C34328Lp6.m96312a(view, i);
                                                        if (quickStartUnselectedBannerView != null) {
                                                            FrameLayout frameLayout = (FrameLayout) view;
                                                            i = C36585Vg4.scanEntryContainer;
                                                            FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                            if (frameLayout2 != null) {
                                                                i = C36585Vg4.scannerViewStub;
                                                                ViewStub viewStub = (ViewStub) C34328Lp6.m96312a(view, i);
                                                                if (viewStub != null) {
                                                                    i = C36585Vg4.scooter;
                                                                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                    if (imageView3 != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C36585Vg4.startScrim))) != null) {
                                                                        i = C36585Vg4.tapPaymentSeePricing;
                                                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView3 != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C36585Vg4.topScrim))) != null && (m96312a5 = C34328Lp6.m96312a(view, (i = C36585Vg4.viewFinder))) != null) {
                                                                            return new C19953e3(frameLayout, birdActionView, m96312a, linearLayout, imageView, appCompatEditText, constraintLayout, m96312a2, imageView2, frequentFlyerScannerView, barrier, relativeLayout, textView, textView2, linearProgressIndicator, quickStartUnselectedBannerView, frameLayout, frameLayout2, viewStub, imageView3, m96312a3, textView3, m96312a4, m96312a5);
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
    public static C19953e3 m43311c(LayoutInflater layoutInflater) {
        return m43310d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19953e3 m43310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_bird_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43313a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f77622a;
    }
}
