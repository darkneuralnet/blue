package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import co.bird.android.widget.QrCodeZXingScannerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: b4 */
/* loaded from: classes2.dex */
public final class C12284b4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f56847a;

    /* renamed from: b */
    public final BirdActionView f56848b;

    /* renamed from: c */
    public final Guideline f56849c;

    /* renamed from: d */
    public final FrameLayout f56850d;

    /* renamed from: e */
    public final ImageView f56851e;

    /* renamed from: f */
    public final AppCompatEditText f56852f;

    /* renamed from: g */
    public final Guideline f56853g;

    /* renamed from: h */
    public final View f56854h;

    /* renamed from: i */
    public final ImageView f56855i;

    /* renamed from: j */
    public final FrequentFlyerScannerView f56856j;

    /* renamed from: k */
    public final TextView f56857k;

    /* renamed from: l */
    public final TextView f56858l;

    /* renamed from: m */
    public final TextView f56859m;

    /* renamed from: n */
    public final LinearProgressIndicator f56860n;

    /* renamed from: o */
    public final ConstraintLayout f56861o;

    /* renamed from: p */
    public final QrCodeZXingScannerView f56862p;

    /* renamed from: q */
    public final ImageView f56863q;

    /* renamed from: r */
    public final Guideline f56864r;

    /* renamed from: s */
    public final View f56865s;

    /* renamed from: t */
    public final Guideline f56866t;

    /* renamed from: u */
    public final ImageView f56867u;

    public C12284b4(ConstraintLayout constraintLayout, BirdActionView birdActionView, Guideline guideline, FrameLayout frameLayout, ImageView imageView, AppCompatEditText appCompatEditText, Guideline guideline2, View view, ImageView imageView2, FrequentFlyerScannerView frequentFlyerScannerView, TextView textView, TextView textView2, TextView textView3, LinearProgressIndicator linearProgressIndicator, ConstraintLayout constraintLayout2, QrCodeZXingScannerView qrCodeZXingScannerView, ImageView imageView3, Guideline guideline3, View view2, Guideline guideline4, ImageView imageView4) {
        this.f56847a = constraintLayout;
        this.f56848b = birdActionView;
        this.f56849c = guideline;
        this.f56850d = frameLayout;
        this.f56851e = imageView;
        this.f56852f = appCompatEditText;
        this.f56853g = guideline2;
        this.f56854h = view;
        this.f56855i = imageView2;
        this.f56856j = frequentFlyerScannerView;
        this.f56857k = textView;
        this.f56858l = textView2;
        this.f56859m = textView3;
        this.f56860n = linearProgressIndicator;
        this.f56861o = constraintLayout2;
        this.f56862p = qrCodeZXingScannerView;
        this.f56863q = imageView3;
        this.f56864r = guideline3;
        this.f56865s = view2;
        this.f56866t = guideline4;
        this.f56867u = imageView4;
    }

    /* renamed from: a */
    public static C12284b4 m65045a(View view) {
        View m96312a;
        View m96312a2;
        int i = C36585Vg4.birdStatus;
        BirdActionView birdActionView = (BirdActionView) C34328Lp6.m96312a(view, i);
        if (birdActionView != null) {
            i = C36585Vg4.bottomGutter;
            Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
            if (guideline != null) {
                i = C36585Vg4.buttons;
                FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                if (frameLayout != null) {
                    i = C36585Vg4.codeButton;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C36585Vg4.codeEditor;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) C34328Lp6.m96312a(view, i);
                        if (appCompatEditText != null) {
                            i = C36585Vg4.endGutter;
                            Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
                            if (guideline2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.endScrim))) != null) {
                                i = C36585Vg4.flashButton;
                                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView2 != null) {
                                    i = C36585Vg4.frequentFlyerStatus;
                                    FrequentFlyerScannerView frequentFlyerScannerView = (FrequentFlyerScannerView) C34328Lp6.m96312a(view, i);
                                    if (frequentFlyerScannerView != null) {
                                        i = C36585Vg4.infoText;
                                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView != null) {
                                            i = C36585Vg4.peripheralKeyboardScanQrTextView;
                                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView2 != null) {
                                                i = C36585Vg4.pricing;
                                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView3 != null) {
                                                    i = C36585Vg4.progressBar;
                                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                    if (linearProgressIndicator != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                        i = C36585Vg4.scannerView;
                                                        QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                                                        if (qrCodeZXingScannerView != null) {
                                                            i = C36585Vg4.scooter;
                                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                            if (imageView3 != null) {
                                                                i = C36585Vg4.startGutter;
                                                                Guideline guideline3 = (Guideline) C34328Lp6.m96312a(view, i);
                                                                if (guideline3 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.startScrim))) != null) {
                                                                    i = C36585Vg4.topGutter;
                                                                    Guideline guideline4 = (Guideline) C34328Lp6.m96312a(view, i);
                                                                    if (guideline4 != null) {
                                                                        i = C36585Vg4.viewFinder;
                                                                        ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                        if (imageView4 != null) {
                                                                            return new C12284b4(constraintLayout, birdActionView, guideline, frameLayout, imageView, appCompatEditText, guideline2, m96312a, imageView2, frequentFlyerScannerView, textView, textView2, textView3, linearProgressIndicator, constraintLayout, qrCodeZXingScannerView, imageView3, guideline3, m96312a2, guideline4, imageView4);
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
    public static C12284b4 m65043c(LayoutInflater layoutInflater) {
        return m65042d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C12284b4 m65042d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_legacy_bird_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m65045a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f56847a;
    }
}
