package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import co.bird.android.autopayv2plan.PlanLayout;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: T2 */
/* loaded from: classes2.dex */
public final class C7642T2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f34674a;

    /* renamed from: b */
    public final CallToActionLayout f34675b;

    /* renamed from: c */
    public final LinearLayout f34676c;

    /* renamed from: d */
    public final TextView f34677d;

    /* renamed from: e */
    public final TextView f34678e;

    /* renamed from: f */
    public final TextView f34679f;

    /* renamed from: g */
    public final TextView f34680g;

    /* renamed from: h */
    public final ImageView f34681h;

    /* renamed from: i */
    public final ImageView f34682i;

    /* renamed from: j */
    public final PlanLayout f34683j;

    /* renamed from: k */
    public final TextView f34684k;

    /* renamed from: l */
    public final Toolbar f34685l;

    public C7642T2(LinearLayout linearLayout, CallToActionLayout callToActionLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, ImageView imageView2, PlanLayout planLayout, TextView textView5, Toolbar toolbar) {
        this.f34674a = linearLayout;
        this.f34675b = callToActionLayout;
        this.f34676c = linearLayout2;
        this.f34677d = textView;
        this.f34678e = textView2;
        this.f34679f = textView3;
        this.f34680g = textView4;
        this.f34681h = imageView;
        this.f34682i = imageView2;
        this.f34683j = planLayout;
        this.f34684k = textView5;
        this.f34685l = toolbar;
    }

    /* renamed from: a */
    public static C7642T2 m84415a(View view) {
        int i = C36585Vg4.autoPayV2Root;
        CallToActionLayout callToActionLayout = (CallToActionLayout) C34328Lp6.m96312a(view, i);
        if (callToActionLayout != null) {
            i = C36585Vg4.bonusContainer;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C36585Vg4.bonusText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.currentBalance;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.currentBalanceLabel;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C36585Vg4.descriptionLabel;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C36585Vg4.gift;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    i = C36585Vg4.giftBlueDot;
                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView2 != null) {
                                        i = C36585Vg4.planContainer;
                                        PlanLayout planLayout = (PlanLayout) C34328Lp6.m96312a(view, i);
                                        if (planLayout != null) {
                                            i = C36585Vg4.plansHeader;
                                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView5 != null) {
                                                i = C36585Vg4.toolbar;
                                                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                if (toolbar != null) {
                                                    return new C7642T2((LinearLayout) view, callToActionLayout, linearLayout, textView, textView2, textView3, textView4, imageView, imageView2, planLayout, textView5, toolbar);
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
    public static C7642T2 m84413c(LayoutInflater layoutInflater) {
        return m84412d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7642T2 m84412d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_autopay_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84415a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f34674a;
    }
}
