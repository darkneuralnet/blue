package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.scan.GraphicOverlay;
import co.bird.android.widget.scan.IdentificationScanView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: S3 */
/* loaded from: classes3.dex */
public final class C7319S3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f33068a;

    /* renamed from: b */
    public final View f33069b;

    /* renamed from: c */
    public final View f33070c;

    /* renamed from: d */
    public final Group f33071d;

    /* renamed from: e */
    public final ImageView f33072e;

    /* renamed from: f */
    public final TextView f33073f;

    /* renamed from: g */
    public final View f33074g;

    /* renamed from: h */
    public final View f33075h;

    /* renamed from: i */
    public final TextView f33076i;

    /* renamed from: j */
    public final GraphicOverlay f33077j;

    /* renamed from: k */
    public final View f33078k;

    /* renamed from: l */
    public final TextView f33079l;

    /* renamed from: m */
    public final CircularProgressIndicator f33080m;

    /* renamed from: n */
    public final Button f33081n;

    /* renamed from: o */
    public final IdentificationScanView f33082o;

    /* renamed from: p */
    public final TextView f33083p;

    /* renamed from: q */
    public final View f33084q;

    /* renamed from: r */
    public final Button f33085r;

    /* renamed from: s */
    public final View f33086s;

    /* renamed from: t */
    public final Button f33087t;

    /* renamed from: u */
    public final View f33088u;

    /* renamed from: v */
    public final Group f33089v;

    public C7319S3(ConstraintLayout constraintLayout, View view, View view2, Group group, ImageView imageView, TextView textView, View view3, View view4, TextView textView2, GraphicOverlay graphicOverlay, View view5, TextView textView3, CircularProgressIndicator circularProgressIndicator, Button button, IdentificationScanView identificationScanView, TextView textView4, View view6, Button button2, View view7, Button button3, View view8, Group group2) {
        this.f33068a = constraintLayout;
        this.f33069b = view;
        this.f33070c = view2;
        this.f33071d = group;
        this.f33072e = imageView;
        this.f33073f = textView;
        this.f33074g = view3;
        this.f33075h = view4;
        this.f33076i = textView2;
        this.f33077j = graphicOverlay;
        this.f33078k = view5;
        this.f33079l = textView3;
        this.f33080m = circularProgressIndicator;
        this.f33081n = button;
        this.f33082o = identificationScanView;
        this.f33083p = textView4;
        this.f33084q = view6;
        this.f33085r = button2;
        this.f33086s = view7;
        this.f33087t = button3;
        this.f33088u = view8;
        this.f33089v = group2;
    }

    /* renamed from: a */
    public static C7319S3 m86066a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        View m96312a5;
        View m96312a6;
        View m96312a7;
        int i = C49981uh4.bottomGrayArea;
        View m96312a8 = C34328Lp6.m96312a(view, i);
        if (m96312a8 != null && (m96312a = C34328Lp6.m96312a(view, (i = C49981uh4.buttonsBg))) != null) {
            i = C49981uh4.confirmImageGroup;
            Group group = (Group) C34328Lp6.m96312a(view, i);
            if (group != null) {
                i = C49981uh4.confirmImageView;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C49981uh4.debugText;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C49981uh4.endGrayArea))) != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C49981uh4.footerBackground))) != null) {
                        i = C49981uh4.frameText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C49981uh4.graphicOverlay;
                            GraphicOverlay graphicOverlay = (GraphicOverlay) C34328Lp6.m96312a(view, i);
                            if (graphicOverlay != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C49981uh4.headerBackground))) != null) {
                                i = C49981uh4.headerText;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    i = C49981uh4.progressBar;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (circularProgressIndicator != null) {
                                        i = C49981uh4.retakeButton;
                                        Button button = (Button) C34328Lp6.m96312a(view, i);
                                        if (button != null) {
                                            i = C49981uh4.scanView;
                                            IdentificationScanView identificationScanView = (IdentificationScanView) C34328Lp6.m96312a(view, i);
                                            if (identificationScanView != null) {
                                                i = C49981uh4.secondaryText;
                                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView4 != null && (m96312a5 = C34328Lp6.m96312a(view, (i = C49981uh4.startGrayArea))) != null) {
                                                    i = C49981uh4.takePhotoButton;
                                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                    if (button2 != null && (m96312a6 = C34328Lp6.m96312a(view, (i = C49981uh4.topGrayArea))) != null) {
                                                        i = C49981uh4.usePhotoButton;
                                                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                        if (button3 != null && (m96312a7 = C34328Lp6.m96312a(view, (i = C49981uh4.viewfinderFrame))) != null) {
                                                            i = C49981uh4.viewfinderGroup;
                                                            Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                                            if (group2 != null) {
                                                                return new C7319S3((ConstraintLayout) view, m96312a8, m96312a, group, imageView, textView, m96312a2, m96312a3, textView2, graphicOverlay, m96312a4, textView3, circularProgressIndicator, button, identificationScanView, textView4, m96312a5, button2, m96312a6, button3, m96312a7, group2);
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
    public static C7319S3 m86064c(LayoutInflater layoutInflater) {
        return m86063d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7319S3 m86063d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42293hj4.activity_identification_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86066a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f33068a;
    }
}
