package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import co.bird.android.widget.SelectableButtonV2;
import com.google.android.material.chip.ChipGroup;
/* renamed from: P5 */
/* loaded from: classes3.dex */
public final class C6237P5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f27855a;

    /* renamed from: b */
    public final LinearLayout f27856b;

    /* renamed from: c */
    public final EditText f27857c;

    /* renamed from: d */
    public final CardView f27858d;

    /* renamed from: e */
    public final SelectableButtonV2 f27859e;

    /* renamed from: f */
    public final TextView f27860f;

    /* renamed from: g */
    public final RatingBar f27861g;

    /* renamed from: h */
    public final FrameLayout f27862h;

    /* renamed from: i */
    public final TextView f27863i;

    /* renamed from: j */
    public final ChipGroup f27864j;

    /* renamed from: k */
    public final TextView f27865k;

    /* renamed from: l */
    public final Button f27866l;

    /* renamed from: m */
    public final SelectableButtonV2 f27867m;

    /* renamed from: n */
    public final TextView f27868n;

    public C6237P5(LinearLayout linearLayout, LinearLayout linearLayout2, EditText editText, CardView cardView, SelectableButtonV2 selectableButtonV2, TextView textView, RatingBar ratingBar, FrameLayout frameLayout, TextView textView2, ChipGroup chipGroup, TextView textView3, Button button, SelectableButtonV2 selectableButtonV22, TextView textView4) {
        this.f27855a = linearLayout;
        this.f27856b = linearLayout2;
        this.f27857c = editText;
        this.f27858d = cardView;
        this.f27859e = selectableButtonV2;
        this.f27860f = textView;
        this.f27861g = ratingBar;
        this.f27862h = frameLayout;
        this.f27863i = textView2;
        this.f27864j = chipGroup;
        this.f27865k = textView3;
        this.f27866l = button;
        this.f27867m = selectableButtonV22;
        this.f27868n = textView4;
    }

    /* renamed from: a */
    public static C6237P5 m90877a(View view) {
        int i = C35892Sh4.categoryContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C35892Sh4.feedback;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                i = C35892Sh4.footerContainer;
                CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                if (cardView != null) {
                    i = C35892Sh4.otherButton;
                    SelectableButtonV2 selectableButtonV2 = (SelectableButtonV2) C34328Lp6.m96312a(view, i);
                    if (selectableButtonV2 != null) {
                        i = C35892Sh4.otherTab;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C35892Sh4.rating;
                            RatingBar ratingBar = (RatingBar) C34328Lp6.m96312a(view, i);
                            if (ratingBar != null) {
                                i = C35892Sh4.ratingContainer;
                                FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                if (frameLayout != null) {
                                    i = C35892Sh4.ratingDescription;
                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView2 != null) {
                                        i = C35892Sh4.ratingSelectionsChipGroup;
                                        ChipGroup chipGroup = (ChipGroup) C34328Lp6.m96312a(view, i);
                                        if (chipGroup != null) {
                                            i = C35892Sh4.ratingTitle;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                i = C35892Sh4.submit;
                                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                                if (button != null) {
                                                    i = C35892Sh4.vehicleButton;
                                                    SelectableButtonV2 selectableButtonV22 = (SelectableButtonV2) C34328Lp6.m96312a(view, i);
                                                    if (selectableButtonV22 != null) {
                                                        i = C35892Sh4.vehicleTab;
                                                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView4 != null) {
                                                            return new C6237P5((LinearLayout) view, linearLayout, editText, cardView, selectableButtonV2, textView, ratingBar, frameLayout, textView2, chipGroup, textView3, button, selectableButtonV22, textView4);
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
    public static C6237P5 m90875c(LayoutInflater layoutInflater) {
        return m90874d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6237P5 m90874d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32868Fj4.activity_ride_rating, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90877a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f27855a;
    }
}
