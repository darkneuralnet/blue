package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import co.bird.android.widget.IssueFlowLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: H5 */
/* loaded from: classes3.dex */
public final class C3022H5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f12814a;

    /* renamed from: b */
    public final EditText f12815b;

    /* renamed from: c */
    public final CardView f12816c;

    /* renamed from: d */
    public final IssueFlowLayout f12817d;

    /* renamed from: e */
    public final TextView f12818e;

    /* renamed from: f */
    public final LinearProgressIndicator f12819f;

    /* renamed from: g */
    public final RatingBar f12820g;

    /* renamed from: h */
    public final Button f12821h;

    public C3022H5(RelativeLayout relativeLayout, EditText editText, CardView cardView, IssueFlowLayout issueFlowLayout, TextView textView, LinearProgressIndicator linearProgressIndicator, RatingBar ratingBar, Button button) {
        this.f12814a = relativeLayout;
        this.f12815b = editText;
        this.f12816c = cardView;
        this.f12817d = issueFlowLayout;
        this.f12818e = textView;
        this.f12819f = linearProgressIndicator;
        this.f12820g = ratingBar;
        this.f12821h = button;
    }

    /* renamed from: a */
    public static C3022H5 m104441a(View view) {
        int i = C35892Sh4.feedback;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            i = C35892Sh4.footerContainer;
            CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
            if (cardView != null) {
                i = C35892Sh4.issueContainer;
                IssueFlowLayout issueFlowLayout = (IssueFlowLayout) C34328Lp6.m96312a(view, i);
                if (issueFlowLayout != null) {
                    i = C35892Sh4.issueLabel;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C35892Sh4.progressBar;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (linearProgressIndicator != null) {
                            i = C35892Sh4.ratingBar;
                            RatingBar ratingBar = (RatingBar) C34328Lp6.m96312a(view, i);
                            if (ratingBar != null) {
                                i = C35892Sh4.submit;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    return new C3022H5((RelativeLayout) view, editText, cardView, issueFlowLayout, textView, linearProgressIndicator, ratingBar, button);
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
    public static C3022H5 m104439c(LayoutInflater layoutInflater) {
        return m104438d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3022H5 m104438d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32868Fj4.activity_ride_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m104441a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f12814a;
    }
}
