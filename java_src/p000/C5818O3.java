package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.scan.IdentificationScanView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: O3 */
/* loaded from: classes3.dex */
public final class C5818O3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f25576a;

    /* renamed from: b */
    public final View f25577b;

    /* renamed from: c */
    public final Barrier f25578c;

    /* renamed from: d */
    public final Group f25579d;

    /* renamed from: e */
    public final ImageView f25580e;

    /* renamed from: f */
    public final TextView f25581f;

    /* renamed from: g */
    public final CircularProgressIndicator f25582g;

    /* renamed from: h */
    public final Button f25583h;

    /* renamed from: i */
    public final IdentificationScanView f25584i;

    /* renamed from: j */
    public final Button f25585j;

    /* renamed from: k */
    public final Button f25586k;

    /* renamed from: l */
    public final Button f25587l;

    public C5818O3(ConstraintLayout constraintLayout, View view, Barrier barrier, Group group, ImageView imageView, TextView textView, CircularProgressIndicator circularProgressIndicator, Button button, IdentificationScanView identificationScanView, Button button2, Button button3, Button button4) {
        this.f25576a = constraintLayout;
        this.f25577b = view;
        this.f25578c = barrier;
        this.f25579d = group;
        this.f25580e = imageView;
        this.f25581f = textView;
        this.f25582g = circularProgressIndicator;
        this.f25583h = button;
        this.f25584i = identificationScanView;
        this.f25585j = button2;
        this.f25586k = button3;
        this.f25587l = button4;
    }

    /* renamed from: a */
    public static C5818O3 m92968a(View view) {
        int i = C50573vh4.bottomFrame;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C50573vh4.buttonBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C50573vh4.confirmGroup;
                Group group = (Group) C34328Lp6.m96312a(view, i);
                if (group != null) {
                    i = C50573vh4.confirmImageView;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C50573vh4.frameText;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C50573vh4.progressBar;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (circularProgressIndicator != null) {
                                i = C50573vh4.retakePhotoButton;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    i = C50573vh4.scanView;
                                    IdentificationScanView identificationScanView = (IdentificationScanView) C34328Lp6.m96312a(view, i);
                                    if (identificationScanView != null) {
                                        i = C50573vh4.skipPhotoButton;
                                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button2 != null) {
                                            i = C50573vh4.submitPhotoButton;
                                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                            if (button3 != null) {
                                                i = C50573vh4.takePhotoButton;
                                                Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                                if (button4 != null) {
                                                    return new C5818O3((ConstraintLayout) view, m96312a, barrier, group, imageView, textView, circularProgressIndicator, button, identificationScanView, button2, button3, button4);
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
    public static C5818O3 m92966c(LayoutInflater layoutInflater) {
        return m92965d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5818O3 m92965d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42886ij4.activity_helmet_selfie_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92968a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f25576a;
    }
}
