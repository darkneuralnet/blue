package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: U5 */
/* loaded from: classes3.dex */
public final class C8191U5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f36810a;

    /* renamed from: b */
    public final ImageView f36811b;

    /* renamed from: c */
    public final View f36812c;

    /* renamed from: d */
    public final ImageView f36813d;

    /* renamed from: e */
    public final View f36814e;

    /* renamed from: f */
    public final ImageView f36815f;

    /* renamed from: g */
    public final TextView f36816g;

    /* renamed from: h */
    public final TextView f36817h;

    /* renamed from: i */
    public final ImageView f36818i;

    /* renamed from: j */
    public final OptionalImeEditText f36819j;

    /* renamed from: k */
    public final LinearProgressIndicator f36820k;

    /* renamed from: l */
    public final ImageView f36821l;

    /* renamed from: m */
    public final ConstraintLayout f36822m;

    /* renamed from: n */
    public final QrCodeZXingScannerView f36823n;

    /* renamed from: o */
    public final View f36824o;

    /* renamed from: p */
    public final View f36825p;

    /* renamed from: q */
    public final ImageView f36826q;

    public C8191U5(ConstraintLayout constraintLayout, ImageView imageView, View view, ImageView imageView2, View view2, ImageView imageView3, TextView textView, TextView textView2, ImageView imageView4, OptionalImeEditText optionalImeEditText, LinearProgressIndicator linearProgressIndicator, ImageView imageView5, ConstraintLayout constraintLayout2, QrCodeZXingScannerView qrCodeZXingScannerView, View view3, View view4, ImageView imageView6) {
        this.f36810a = constraintLayout;
        this.f36811b = imageView;
        this.f36812c = view;
        this.f36813d = imageView2;
        this.f36814e = view2;
        this.f36815f = imageView3;
        this.f36816g = textView;
        this.f36817h = textView2;
        this.f36818i = imageView4;
        this.f36819j = optionalImeEditText;
        this.f36820k = linearProgressIndicator;
        this.f36821l = imageView5;
        this.f36822m = constraintLayout2;
        this.f36823n = qrCodeZXingScannerView;
        this.f36824o = view3;
        this.f36825p = view4;
        this.f36826q = imageView6;
    }

    /* renamed from: a */
    public static C8191U5 m82001a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C42283hi4.barcodeScooter;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C42283hi4.bottomScrim))) != null) {
            i = C42283hi4.code;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C42283hi4.endScrim))) != null) {
                i = C42283hi4.flash;
                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView3 != null) {
                    i = C42283hi4.instructions;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C42283hi4.or;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C42283hi4.partIcon;
                            ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView4 != null) {
                                i = C42283hi4.peripheralEditText;
                                OptionalImeEditText optionalImeEditText = (OptionalImeEditText) C34328Lp6.m96312a(view, i);
                                if (optionalImeEditText != null) {
                                    i = C42283hi4.progressBar;
                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (linearProgressIndicator != null) {
                                        i = C42283hi4.qrScooter;
                                        ImageView imageView5 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView5 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            i = C42283hi4.scannerView;
                                            QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                                            if (qrCodeZXingScannerView != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C42283hi4.startScrim))) != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C42283hi4.topScrim))) != null) {
                                                i = C42283hi4.viewFinder;
                                                ImageView imageView6 = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView6 != null) {
                                                    return new C8191U5(constraintLayout, imageView, m96312a, imageView2, m96312a2, imageView3, textView, textView2, imageView4, optionalImeEditText, linearProgressIndicator, imageView5, constraintLayout, qrCodeZXingScannerView, m96312a3, m96312a4, imageView6);
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
    public static C8191U5 m81999c(LayoutInflater layoutInflater) {
        return m81998d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8191U5 m81998d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36144Tj4.activity_scan_qr_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m82001a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f36810a;
    }
}
