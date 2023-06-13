package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: R3 */
/* loaded from: classes3.dex */
public final class C7059R3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f31425a;

    /* renamed from: b */
    public final LinearLayout f31426b;

    /* renamed from: c */
    public final CardView f31427c;

    /* renamed from: d */
    public final TextView f31428d;

    /* renamed from: e */
    public final Button f31429e;

    /* renamed from: f */
    public final LottieAnimationView f31430f;

    /* renamed from: g */
    public final Button f31431g;

    /* renamed from: h */
    public final View f31432h;

    /* renamed from: i */
    public final Button f31433i;

    /* renamed from: j */
    public final CircularProgressIndicator f31434j;

    /* renamed from: k */
    public final RecyclerView f31435k;

    /* renamed from: l */
    public final ImageView f31436l;

    /* renamed from: m */
    public final TextView f31437m;

    /* renamed from: n */
    public final Group f31438n;

    /* renamed from: o */
    public final FrameLayout f31439o;

    /* renamed from: p */
    public final TextView f31440p;

    /* renamed from: q */
    public final TextView f31441q;

    /* renamed from: r */
    public final TextView f31442r;

    /* renamed from: s */
    public final Button f31443s;

    /* renamed from: t */
    public final Button f31444t;

    public C7059R3(ConstraintLayout constraintLayout, LinearLayout linearLayout, CardView cardView, TextView textView, Button button, LottieAnimationView lottieAnimationView, Button button2, View view, Button button3, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, ImageView imageView, TextView textView2, Group group, FrameLayout frameLayout, TextView textView3, TextView textView4, TextView textView5, Button button4, Button button5) {
        this.f31425a = constraintLayout;
        this.f31426b = linearLayout;
        this.f31427c = cardView;
        this.f31428d = textView;
        this.f31429e = button;
        this.f31430f = lottieAnimationView;
        this.f31431g = button2;
        this.f31432h = view;
        this.f31433i = button3;
        this.f31434j = circularProgressIndicator;
        this.f31435k = recyclerView;
        this.f31436l = imageView;
        this.f31437m = textView2;
        this.f31438n = group;
        this.f31439o = frameLayout;
        this.f31440p = textView3;
        this.f31441q = textView4;
        this.f31442r = textView5;
        this.f31443s = button4;
        this.f31444t = button5;
    }

    /* renamed from: a */
    public static C7059R3 m87384a(View view) {
        View m96312a;
        int i = C49981uh4.buttonContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C49981uh4.ctaContainer;
            CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
            if (cardView != null) {
                i = C49981uh4.descriptionText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C49981uh4.helpButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C49981uh4.heroImage;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                        if (lottieAnimationView != null) {
                            i = C49981uh4.manualEntryButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C49981uh4.pendingStateBackground))) != null) {
                                i = C49981uh4.primaryButton;
                                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                if (button3 != null) {
                                    i = C49981uh4.progressSpinner;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (circularProgressIndicator != null) {
                                        i = C49981uh4.recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                        if (recyclerView != null) {
                                            i = C49981uh4.rejectedIcon;
                                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView != null) {
                                                i = C49981uh4.statusBody;
                                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView2 != null) {
                                                    i = C49981uh4.statusGroup;
                                                    Group group = (Group) C34328Lp6.m96312a(view, i);
                                                    if (group != null) {
                                                        i = C49981uh4.statusIconGroup;
                                                        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                        if (frameLayout != null) {
                                                            i = C49981uh4.statusText;
                                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView3 != null) {
                                                                i = C49981uh4.statusTitle;
                                                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView4 != null) {
                                                                    i = C49981uh4.titleText;
                                                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView5 != null) {
                                                                        i = C49981uh4.tryAgainButton;
                                                                        Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                                                        if (button4 != null) {
                                                                            i = C49981uh4.verifyLaterButton;
                                                                            Button button5 = (Button) C34328Lp6.m96312a(view, i);
                                                                            if (button5 != null) {
                                                                                return new C7059R3((ConstraintLayout) view, linearLayout, cardView, textView, button, lottieAnimationView, button2, m96312a, button3, circularProgressIndicator, recyclerView, imageView, textView2, group, frameLayout, textView3, textView4, textView5, button4, button5);
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
    public static C7059R3 m87382c(LayoutInflater layoutInflater) {
        return m87381d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7059R3 m87381d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42293hj4.activity_identification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87384a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f31425a;
    }
}
