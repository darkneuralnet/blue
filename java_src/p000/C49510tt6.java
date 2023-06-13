package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import co.bird.android.feature.ridepass.p018v2.list.adapter.view.RidePassV2DetailsView;
import com.google.android.material.card.MaterialCardView;
/* renamed from: tt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49510tt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final MaterialCardView f111327a;

    /* renamed from: b */
    public final Button f111328b;

    /* renamed from: c */
    public final Barrier f111329c;

    /* renamed from: d */
    public final RidePassV2DetailsView f111330d;

    /* renamed from: e */
    public final Guideline f111331e;

    /* renamed from: f */
    public final ImageView f111332f;

    /* renamed from: g */
    public final ImageView f111333g;

    /* renamed from: h */
    public final TextView f111334h;

    /* renamed from: i */
    public final TextView f111335i;

    /* renamed from: j */
    public final Button f111336j;

    /* renamed from: k */
    public final TextView f111337k;

    /* renamed from: l */
    public final TextView f111338l;

    /* renamed from: m */
    public final TextView f111339m;

    /* renamed from: n */
    public final Guideline f111340n;

    /* renamed from: o */
    public final Button f111341o;

    /* renamed from: p */
    public final TextView f111342p;

    /* renamed from: q */
    public final Group f111343q;

    /* renamed from: r */
    public final TextView f111344r;

    public C49510tt6(MaterialCardView materialCardView, Button button, Barrier barrier, RidePassV2DetailsView ridePassV2DetailsView, Guideline guideline, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, Button button2, TextView textView3, TextView textView4, TextView textView5, Guideline guideline2, Button button3, TextView textView6, Group group, TextView textView7) {
        this.f111327a = materialCardView;
        this.f111328b = button;
        this.f111329c = barrier;
        this.f111330d = ridePassV2DetailsView;
        this.f111331e = guideline;
        this.f111332f = imageView;
        this.f111333g = imageView2;
        this.f111334h = textView;
        this.f111335i = textView2;
        this.f111336j = button2;
        this.f111337k = textView3;
        this.f111338l = textView4;
        this.f111339m = textView5;
        this.f111340n = guideline2;
        this.f111341o = button3;
        this.f111342p = textView6;
        this.f111343q = group;
        this.f111344r = textView7;
    }

    /* renamed from: a */
    public static C49510tt6 m11258a(View view) {
        int i = C36126Th4.cancelButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36126Th4.chevronBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C36126Th4.details;
                RidePassV2DetailsView ridePassV2DetailsView = (RidePassV2DetailsView) C34328Lp6.m96312a(view, i);
                if (ridePassV2DetailsView != null) {
                    i = C36126Th4.endGuide;
                    Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                    if (guideline != null) {
                        i = C36126Th4.expand;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C36126Th4.hide;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C36126Th4.label;
                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView != null) {
                                    i = C36126Th4.passBody;
                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView2 != null) {
                                        i = C36126Th4.passBuy;
                                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button2 != null) {
                                            i = C36126Th4.passTitle;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                i = C36126Th4.previousPrice;
                                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView4 != null) {
                                                    i = C36126Th4.price;
                                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView5 != null) {
                                                        i = C36126Th4.startGuide;
                                                        Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
                                                        if (guideline2 != null) {
                                                            i = C36126Th4.transferButton;
                                                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                            if (button3 != null) {
                                                                i = C36126Th4.transferDescription;
                                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView6 != null) {
                                                                    i = C36126Th4.transferGroup;
                                                                    Group group = (Group) C34328Lp6.m96312a(view, i);
                                                                    if (group != null) {
                                                                        i = C36126Th4.validityPeriod;
                                                                        TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView7 != null) {
                                                                            return new C49510tt6((MaterialCardView) view, button, barrier, ridePassV2DetailsView, guideline, imageView, imageView2, textView, textView2, button2, textView3, textView4, textView5, guideline2, button3, textView6, group, textView7);
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

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f111327a;
    }
}
