package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import co.bird.android.widget.CameraxView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: J5 */
/* loaded from: classes2.dex */
public final class C3883J5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f16758a;

    /* renamed from: b */
    public final ImageView f16759b;

    /* renamed from: c */
    public final Barrier f16760c;

    /* renamed from: d */
    public final View f16761d;

    /* renamed from: e */
    public final CameraxView f16762e;

    /* renamed from: f */
    public final Guideline f16763f;

    /* renamed from: g */
    public final Guideline f16764g;

    /* renamed from: h */
    public final LinearLayout f16765h;

    /* renamed from: i */
    public final ImageView f16766i;

    /* renamed from: j */
    public final FrameLayout f16767j;

    /* renamed from: k */
    public final RelativeLayout f16768k;

    /* renamed from: l */
    public final Button f16769l;

    /* renamed from: m */
    public final TextView f16770m;

    /* renamed from: n */
    public final ImageView f16771n;

    /* renamed from: o */
    public final TextView f16772o;

    /* renamed from: p */
    public final LinearProgressIndicator f16773p;

    /* renamed from: q */
    public final ImageView f16774q;

    /* renamed from: r */
    public final Button f16775r;

    /* renamed from: s */
    public final RelativeLayout f16776s;

    /* renamed from: t */
    public final Barrier f16777t;

    /* renamed from: u */
    public final View f16778u;

    /* renamed from: v */
    public final ImageView f16779v;

    /* renamed from: w */
    public final Button f16780w;

    public C3883J5(ConstraintLayout constraintLayout, ImageView imageView, Barrier barrier, View view, CameraxView cameraxView, Guideline guideline, Guideline guideline2, LinearLayout linearLayout, ImageView imageView2, FrameLayout frameLayout, RelativeLayout relativeLayout, Button button, TextView textView, ImageView imageView3, TextView textView2, LinearProgressIndicator linearProgressIndicator, ImageView imageView4, Button button2, RelativeLayout relativeLayout2, Barrier barrier2, View view2, ImageView imageView5, Button button3) {
        this.f16758a = constraintLayout;
        this.f16759b = imageView;
        this.f16760c = barrier;
        this.f16761d = view;
        this.f16762e = cameraxView;
        this.f16763f = guideline;
        this.f16764g = guideline2;
        this.f16765h = linearLayout;
        this.f16766i = imageView2;
        this.f16767j = frameLayout;
        this.f16768k = relativeLayout;
        this.f16769l = button;
        this.f16770m = textView;
        this.f16771n = imageView3;
        this.f16772o = textView2;
        this.f16773p = linearProgressIndicator;
        this.f16774q = imageView4;
        this.f16775r = button2;
        this.f16776s = relativeLayout2;
        this.f16777t = barrier2;
        this.f16778u = view2;
        this.f16779v = imageView5;
        this.f16780w = button3;
    }

    /* renamed from: a */
    public static C3883J5 m101196a(View view) {
        View m96312a;
        View m96312a2;
        int i = C36585Vg4.birdImageView;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.bottomBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.bottomOverlay))) != null) {
                i = C36585Vg4.camera;
                CameraxView cameraxView = (CameraxView) C34328Lp6.m96312a(view, i);
                if (cameraxView != null) {
                    i = C36585Vg4.centerHorizontalGuide;
                    Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                    if (guideline != null) {
                        i = C36585Vg4.centerVerticalGuide;
                        Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
                        if (guideline2 != null) {
                            i = C36585Vg4.confirmPhotoFooterContainer;
                            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                            if (linearLayout != null) {
                                i = C36585Vg4.flashImageView;
                                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView2 != null) {
                                    i = C36585Vg4.footerContainer;
                                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                    if (frameLayout != null) {
                                        i = C36585Vg4.instructionsLayout;
                                        RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                        if (relativeLayout != null) {
                                            i = C36585Vg4.noButton;
                                            Button button = (Button) C34328Lp6.m96312a(view, i);
                                            if (button != null) {
                                                i = C36585Vg4.parkingInstructions;
                                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView != null) {
                                                    i = C36585Vg4.parkingInstructionsImage;
                                                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                    if (imageView3 != null) {
                                                        i = C36585Vg4.parkingInstructionsTitle;
                                                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView2 != null) {
                                                            i = C36585Vg4.progressBar;
                                                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                            if (linearProgressIndicator != null) {
                                                                i = C36585Vg4.scooterIcon;
                                                                ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                if (imageView4 != null) {
                                                                    i = C36585Vg4.takePhotoButton;
                                                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                                    if (button2 != null) {
                                                                        i = C36585Vg4.takePhotoFooterContainer;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                                                        if (relativeLayout2 != null) {
                                                                            i = C36585Vg4.topBarrier;
                                                                            Barrier barrier2 = (Barrier) C34328Lp6.m96312a(view, i);
                                                                            if (barrier2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.topOverlay))) != null) {
                                                                                i = C36585Vg4.viewfinderFrame;
                                                                                ImageView imageView5 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                if (imageView5 != null) {
                                                                                    i = C36585Vg4.yesButton;
                                                                                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                                                    if (button3 != null) {
                                                                                        return new C3883J5((ConstraintLayout) view, imageView, barrier, m96312a, cameraxView, guideline, guideline2, linearLayout, imageView2, frameLayout, relativeLayout, button, textView, imageView3, textView2, linearProgressIndicator, imageView4, button2, relativeLayout2, barrier2, m96312a2, imageView5, button3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3883J5 m101194c(LayoutInflater layoutInflater) {
        return m101193d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3883J5 m101193d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_ride_lock_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m101196a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f16758a;
    }
}
