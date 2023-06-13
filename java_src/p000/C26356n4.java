package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.QrCodeZXingScannerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: n4 */
/* loaded from: classes2.dex */
public final class C26356n4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f99281a;

    /* renamed from: b */
    public final View f99282b;

    /* renamed from: c */
    public final ConstraintLayout f99283c;

    /* renamed from: d */
    public final View f99284d;

    /* renamed from: e */
    public final ImageView f99285e;

    /* renamed from: f */
    public final TextView f99286f;

    /* renamed from: g */
    public final LinearProgressIndicator f99287g;

    /* renamed from: h */
    public final ImageView f99288h;

    /* renamed from: i */
    public final FrameLayout f99289i;

    /* renamed from: j */
    public final FrameLayout f99290j;

    /* renamed from: k */
    public final QrCodeZXingScannerView f99291k;

    /* renamed from: l */
    public final View f99292l;

    /* renamed from: m */
    public final View f99293m;

    /* renamed from: n */
    public final View f99294n;

    public C26356n4(FrameLayout frameLayout, View view, ConstraintLayout constraintLayout, View view2, ImageView imageView, TextView textView, LinearProgressIndicator linearProgressIndicator, ImageView imageView2, FrameLayout frameLayout2, FrameLayout frameLayout3, QrCodeZXingScannerView qrCodeZXingScannerView, View view3, View view4, View view5) {
        this.f99281a = frameLayout;
        this.f99282b = view;
        this.f99283c = constraintLayout;
        this.f99284d = view2;
        this.f99285e = imageView;
        this.f99286f = textView;
        this.f99287g = linearProgressIndicator;
        this.f99288h = imageView2;
        this.f99289i = frameLayout2;
        this.f99290j = frameLayout3;
        this.f99291k = qrCodeZXingScannerView;
        this.f99292l = view3;
        this.f99293m = view4;
        this.f99294n = view5;
    }

    /* renamed from: a */
    public static C26356n4 m24507a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C36585Vg4.bottomScrim;
        View m96312a5 = C34328Lp6.m96312a(view, i);
        if (m96312a5 != null) {
            i = C36585Vg4.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.endScrim))) != null) {
                i = C36585Vg4.flashButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C36585Vg4.infoText;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C36585Vg4.progressBar;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (linearProgressIndicator != null) {
                            i = C36585Vg4.qrIcon;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                i = C36585Vg4.scanEntryContainer;
                                FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                                if (frameLayout2 != null) {
                                    i = C36585Vg4.scannerView;
                                    QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                                    if (qrCodeZXingScannerView != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.startScrim))) != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C36585Vg4.topScrim))) != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C36585Vg4.viewFinder))) != null) {
                                        return new C26356n4(frameLayout, m96312a5, constraintLayout, m96312a, imageView, textView, linearProgressIndicator, imageView2, frameLayout, frameLayout2, qrCodeZXingScannerView, m96312a2, m96312a3, m96312a4);
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
    public static C26356n4 m24505c(LayoutInflater layoutInflater) {
        return m24504d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26356n4 m24504d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_merchant_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m24507a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f99281a;
    }
}
