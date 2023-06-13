package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.CallToActionLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: U4 */
/* loaded from: classes2.dex */
public final class C8187U4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f36778a;

    /* renamed from: b */
    public final RecyclerView f36779b;

    /* renamed from: c */
    public final EditText f36780c;

    /* renamed from: d */
    public final TextView f36781d;

    /* renamed from: e */
    public final RecyclerView f36782e;

    /* renamed from: f */
    public final TextView f36783f;

    /* renamed from: g */
    public final LinearLayout f36784g;

    /* renamed from: h */
    public final LinearLayout f36785h;

    /* renamed from: i */
    public final TextView f36786i;

    /* renamed from: j */
    public final TextView f36787j;

    /* renamed from: k */
    public final TextView f36788k;

    /* renamed from: l */
    public final TextView f36789l;

    /* renamed from: m */
    public final LinearLayout f36790m;

    /* renamed from: n */
    public final TextView f36791n;

    /* renamed from: o */
    public final LinearLayout f36792o;

    /* renamed from: p */
    public final TextView f36793p;

    /* renamed from: q */
    public final TextView f36794q;

    /* renamed from: r */
    public final LinearProgressIndicator f36795r;

    /* renamed from: s */
    public final CallToActionLayout f36796s;

    /* renamed from: t */
    public final TextView f36797t;

    public C8187U4(CallToActionLayout callToActionLayout, RecyclerView recyclerView, EditText editText, TextView textView, RecyclerView recyclerView2, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout3, TextView textView7, LinearLayout linearLayout4, TextView textView8, TextView textView9, LinearProgressIndicator linearProgressIndicator, CallToActionLayout callToActionLayout2, TextView textView10) {
        this.f36778a = callToActionLayout;
        this.f36779b = recyclerView;
        this.f36780c = editText;
        this.f36781d = textView;
        this.f36782e = recyclerView2;
        this.f36783f = textView2;
        this.f36784g = linearLayout;
        this.f36785h = linearLayout2;
        this.f36786i = textView3;
        this.f36787j = textView4;
        this.f36788k = textView5;
        this.f36789l = textView6;
        this.f36790m = linearLayout3;
        this.f36791n = textView7;
        this.f36792o = linearLayout4;
        this.f36793p = textView8;
        this.f36794q = textView9;
        this.f36795r = linearProgressIndicator;
        this.f36796s = callToActionLayout2;
        this.f36797t = textView10;
    }

    /* renamed from: a */
    public static C8187U4 m82022a(View view) {
        int i = C36585Vg4.actionsView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C36585Vg4.issueTextBox;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                i = C36585Vg4.nextStepTextView;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.nextStepView;
                    RecyclerView recyclerView2 = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView2 != null) {
                        i = C36585Vg4.notesTitle;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C36585Vg4.numBirdsDiscoveredContainer;
                            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                            if (linearLayout != null) {
                                i = C36585Vg4.numBirdsReportedContainer;
                                LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                if (linearLayout2 != null) {
                                    i = C36585Vg4.numberBirdsDiscoveredTextView;
                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView3 != null) {
                                        i = C36585Vg4.numberBirdsDiscoveredTitle;
                                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView4 != null) {
                                            i = C36585Vg4.numberBirdsReportedTextView;
                                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView5 != null) {
                                                i = C36585Vg4.numberBirdsReportedTitle;
                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView6 != null) {
                                                    i = C36585Vg4.photoContainer;
                                                    LinearLayout linearLayout3 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                    if (linearLayout3 != null) {
                                                        i = C36585Vg4.photosTextView;
                                                        TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView7 != null) {
                                                            i = C36585Vg4.previousNotesContainer;
                                                            LinearLayout linearLayout4 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                            if (linearLayout4 != null) {
                                                                i = C36585Vg4.previousNotesTextView;
                                                                TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView8 != null) {
                                                                    i = C36585Vg4.previousNotesTitle;
                                                                    TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView9 != null) {
                                                                        i = C36585Vg4.progressBar;
                                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                        if (linearProgressIndicator != null) {
                                                                            CallToActionLayout callToActionLayout = (CallToActionLayout) view;
                                                                            i = C36585Vg4.selectActionTextView;
                                                                            TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView10 != null) {
                                                                                return new C8187U4(callToActionLayout, recyclerView, editText, textView, recyclerView2, textView2, linearLayout, linearLayout2, textView3, textView4, textView5, textView6, linearLayout3, textView7, linearLayout4, textView8, textView9, linearProgressIndicator, callToActionLayout, textView10);
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
    public static C8187U4 m82020c(LayoutInflater layoutInflater) {
        return m82019d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8187U4 m82019d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_property_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m82022a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f36778a;
    }
}
