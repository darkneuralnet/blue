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
import co.bird.android.widget.scan.HelmetLeaseReturnScanView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: L3 */
/* loaded from: classes3.dex */
public final class C4694L3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f20627a;

    /* renamed from: b */
    public final View f20628b;

    /* renamed from: c */
    public final Group f20629c;

    /* renamed from: d */
    public final ImageView f20630d;

    /* renamed from: e */
    public final TextView f20631e;

    /* renamed from: f */
    public final View f20632f;

    /* renamed from: g */
    public final TextView f20633g;

    /* renamed from: h */
    public final GraphicOverlay f20634h;

    /* renamed from: i */
    public final View f20635i;

    /* renamed from: j */
    public final TextView f20636j;

    /* renamed from: k */
    public final CircularProgressIndicator f20637k;

    /* renamed from: l */
    public final ImageView f20638l;

    /* renamed from: m */
    public final ImageView f20639m;

    /* renamed from: n */
    public final Button f20640n;

    /* renamed from: o */
    public final HelmetLeaseReturnScanView f20641o;

    /* renamed from: p */
    public final TextView f20642p;

    /* renamed from: q */
    public final Button f20643q;

    /* renamed from: r */
    public final Button f20644r;

    public C4694L3(ConstraintLayout constraintLayout, View view, Group group, ImageView imageView, TextView textView, View view2, TextView textView2, GraphicOverlay graphicOverlay, View view3, TextView textView3, CircularProgressIndicator circularProgressIndicator, ImageView imageView2, ImageView imageView3, Button button, HelmetLeaseReturnScanView helmetLeaseReturnScanView, TextView textView4, Button button2, Button button3) {
        this.f20627a = constraintLayout;
        this.f20628b = view;
        this.f20629c = group;
        this.f20630d = imageView;
        this.f20631e = textView;
        this.f20632f = view2;
        this.f20633g = textView2;
        this.f20634h = graphicOverlay;
        this.f20635i = view3;
        this.f20636j = textView3;
        this.f20637k = circularProgressIndicator;
        this.f20638l = imageView2;
        this.f20639m = imageView3;
        this.f20640n = button;
        this.f20641o = helmetLeaseReturnScanView;
        this.f20642p = textView4;
        this.f20643q = button2;
        this.f20644r = button3;
    }

    /* renamed from: a */
    public static C4694L3 m97900a(View view) {
        View m96312a;
        View m96312a2;
        int i = C50573vh4.buttonsBg;
        View m96312a3 = C34328Lp6.m96312a(view, i);
        if (m96312a3 != null) {
            i = C50573vh4.confirmImageGroup;
            Group group = (Group) C34328Lp6.m96312a(view, i);
            if (group != null) {
                i = C50573vh4.confirmImageView;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C50573vh4.debugText;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null && (m96312a = C34328Lp6.m96312a(view, (i = C50573vh4.footerBackground))) != null) {
                        i = C50573vh4.frameText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C50573vh4.graphicOverlay;
                            GraphicOverlay graphicOverlay = (GraphicOverlay) C34328Lp6.m96312a(view, i);
                            if (graphicOverlay != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C50573vh4.headerBackground))) != null) {
                                i = C50573vh4.headerText;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    i = C50573vh4.progressBar;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (circularProgressIndicator != null) {
                                        i = C50573vh4.qrCodeOverlay1;
                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView2 != null) {
                                            i = C50573vh4.qrCodeOverlay2;
                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView3 != null) {
                                                i = C50573vh4.retakeButton;
                                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                                if (button != null) {
                                                    i = C50573vh4.scanView;
                                                    HelmetLeaseReturnScanView helmetLeaseReturnScanView = (HelmetLeaseReturnScanView) C34328Lp6.m96312a(view, i);
                                                    if (helmetLeaseReturnScanView != null) {
                                                        i = C50573vh4.secondaryText;
                                                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView4 != null) {
                                                            i = C50573vh4.takePhotoButton;
                                                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                            if (button2 != null) {
                                                                i = C50573vh4.usePhotoButton;
                                                                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                                if (button3 != null) {
                                                                    return new C4694L3((ConstraintLayout) view, m96312a3, group, imageView, textView, m96312a, textView2, graphicOverlay, m96312a2, textView3, circularProgressIndicator, imageView2, imageView3, button, helmetLeaseReturnScanView, textView4, button2, button3);
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
    public static C4694L3 m97898c(LayoutInflater layoutInflater) {
        return m97897d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4694L3 m97897d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42886ij4.activity_helmet_lease_return_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m97900a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f20627a;
    }
}
