package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: W2 */
/* loaded from: classes3.dex */
public final class C8919W2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f40290a;

    /* renamed from: b */
    public final Guideline f40291b;

    /* renamed from: c */
    public final Guideline f40292c;

    /* renamed from: d */
    public final View f40293d;

    /* renamed from: e */
    public final ImageView f40294e;

    /* renamed from: f */
    public final FrameLayout f40295f;

    /* renamed from: g */
    public final OptionalImeEditText f40296g;

    /* renamed from: h */
    public final TextView f40297h;

    /* renamed from: i */
    public final LinearProgressIndicator f40298i;

    /* renamed from: j */
    public final ImageView f40299j;

    /* renamed from: k */
    public final ConstraintLayout f40300k;

    /* renamed from: l */
    public final Guideline f40301l;

    /* renamed from: m */
    public final View f40302m;

    /* renamed from: n */
    public final Guideline f40303n;

    /* renamed from: o */
    public final ImageView f40304o;

    public C8919W2(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, View view, ImageView imageView, FrameLayout frameLayout, OptionalImeEditText optionalImeEditText, TextView textView, LinearProgressIndicator linearProgressIndicator, ImageView imageView2, ConstraintLayout constraintLayout2, Guideline guideline3, View view2, Guideline guideline4, ImageView imageView3) {
        this.f40290a = constraintLayout;
        this.f40291b = guideline;
        this.f40292c = guideline2;
        this.f40293d = view;
        this.f40294e = imageView;
        this.f40295f = frameLayout;
        this.f40296g = optionalImeEditText;
        this.f40297h = textView;
        this.f40298i = linearProgressIndicator;
        this.f40299j = imageView2;
        this.f40300k = constraintLayout2;
        this.f40301l = guideline3;
        this.f40302m = view2;
        this.f40303n = guideline4;
        this.f40304o = imageView3;
    }

    /* renamed from: a */
    public static C8919W2 m78907a(View view) {
        View m96312a;
        View m96312a2;
        int i = C38115ai4.bottomGutter;
        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
        if (guideline != null) {
            i = C38115ai4.endGutter;
            Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
            if (guideline2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C38115ai4.endScrim))) != null) {
                i = C38115ai4.flashButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C38115ai4.peripheralContainer;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null) {
                        i = C38115ai4.peripheralEditText;
                        OptionalImeEditText optionalImeEditText = (OptionalImeEditText) C34328Lp6.m96312a(view, i);
                        if (optionalImeEditText != null) {
                            i = C38115ai4.peripheralKeyboardScanQrTextView;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C38115ai4.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                if (linearProgressIndicator != null) {
                                    i = C38115ai4.qrImage;
                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = C38115ai4.startGutter;
                                        Guideline guideline3 = (Guideline) C34328Lp6.m96312a(view, i);
                                        if (guideline3 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C38115ai4.startScrim))) != null) {
                                            i = C38115ai4.topGutter;
                                            Guideline guideline4 = (Guideline) C34328Lp6.m96312a(view, i);
                                            if (guideline4 != null) {
                                                i = C38115ai4.viewFinder;
                                                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView3 != null) {
                                                    return new C8919W2(constraintLayout, guideline, guideline2, m96312a, imageView, frameLayout, optionalImeEditText, textView, linearProgressIndicator, imageView2, constraintLayout, guideline3, m96312a2, guideline4, imageView3);
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
    public static C8919W2 m78905c(LayoutInflater layoutInflater) {
        return m78904d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8919W2 m78904d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_barcode_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m78907a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f40290a;
    }
}
