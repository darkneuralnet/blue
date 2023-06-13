package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: J3 */
/* loaded from: classes3.dex */
public final class C3874J3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f16703a;

    /* renamed from: b */
    public final TextView f16704b;

    /* renamed from: c */
    public final TextView f16705c;

    /* renamed from: d */
    public final TextView f16706d;

    /* renamed from: e */
    public final View f16707e;

    /* renamed from: f */
    public final Button f16708f;

    /* renamed from: g */
    public final TextView f16709g;

    /* renamed from: h */
    public final View f16710h;

    /* renamed from: i */
    public final Group f16711i;

    /* renamed from: j */
    public final Space f16712j;

    /* renamed from: k */
    public final View f16713k;

    /* renamed from: l */
    public final View f16714l;

    /* renamed from: m */
    public final TextView f16715m;

    /* renamed from: n */
    public final ImageView f16716n;

    /* renamed from: o */
    public final RecyclerView f16717o;

    /* renamed from: p */
    public final Space f16718p;

    /* renamed from: q */
    public final TextView f16719q;

    /* renamed from: r */
    public final ImageView f16720r;

    /* renamed from: s */
    public final CircularProgressIndicator f16721s;

    /* renamed from: t */
    public final View f16722t;

    /* renamed from: u */
    public final ImageView f16723u;

    public C3874J3(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, Button button, TextView textView4, View view2, Group group, Space space, View view3, View view4, TextView textView5, ImageView imageView, RecyclerView recyclerView, Space space2, TextView textView6, ImageView imageView2, CircularProgressIndicator circularProgressIndicator, View view5, ImageView imageView3) {
        this.f16703a = constraintLayout;
        this.f16704b = textView;
        this.f16705c = textView2;
        this.f16706d = textView3;
        this.f16707e = view;
        this.f16708f = button;
        this.f16709g = textView4;
        this.f16710h = view2;
        this.f16711i = group;
        this.f16712j = space;
        this.f16713k = view3;
        this.f16714l = view4;
        this.f16715m = textView5;
        this.f16716n = imageView;
        this.f16717o = recyclerView;
        this.f16718p = space2;
        this.f16719q = textView6;
        this.f16720r = imageView2;
        this.f16721s = circularProgressIndicator;
        this.f16722t = view5;
        this.f16723u = imageView3;
    }

    /* renamed from: a */
    public static C3874J3 m101252a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        View m96312a5;
        int i = C48795sh4.actionDescription;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C48795sh4.actionStatus;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C48795sh4.birdCode;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C48795sh4.footerBackground))) != null) {
                    i = C48795sh4.footerButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C48795sh4.footerDescription;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C48795sh4.footerDivider))) != null) {
                            i = C48795sh4.footerGroup;
                            Group group = (Group) C34328Lp6.m96312a(view, i);
                            if (group != null) {
                                i = C48795sh4.footerSpace;
                                Space space = (Space) C34328Lp6.m96312a(view, i);
                                if (space != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C48795sh4.iconInflectionPoint))) != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C48795sh4.issueContainer))) != null) {
                                    i = C48795sh4.issueCount;
                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView5 != null) {
                                        i = C48795sh4.issueFoundIcon;
                                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView != null) {
                                            i = C48795sh4.issueRecyclerView;
                                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                            if (recyclerView != null) {
                                                i = C48795sh4.issueSpace;
                                                Space space2 = (Space) C34328Lp6.m96312a(view, i);
                                                if (space2 != null) {
                                                    i = C48795sh4.noIssuesFoundLabel;
                                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView6 != null) {
                                                        i = C48795sh4.noIssuesIcon;
                                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                        if (imageView2 != null) {
                                                            i = C48795sh4.progress;
                                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                                                            if (circularProgressIndicator != null && (m96312a5 = C34328Lp6.m96312a(view, (i = C48795sh4.vehicleDivider))) != null) {
                                                                i = C48795sh4.vehicleImage;
                                                                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                if (imageView3 != null) {
                                                                    return new C3874J3((ConstraintLayout) view, textView, textView2, textView3, m96312a, button, textView4, m96312a2, group, space, m96312a3, m96312a4, textView5, imageView, recyclerView, space2, textView6, imageView2, circularProgressIndicator, m96312a5, imageView3);
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
    public static C3874J3 m101250c(LayoutInflater layoutInflater) {
        return m101249d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3874J3 m101249d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C41107fj4.activity_health_check, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m101252a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f16703a;
    }
}
