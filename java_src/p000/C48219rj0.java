package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
/* renamed from: rj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48219rj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107522a;

    /* renamed from: b */
    public final TextView f107523b;

    /* renamed from: c */
    public final TextView f107524c;

    /* renamed from: d */
    public final ImageView f107525d;

    /* renamed from: e */
    public final TextView f107526e;

    /* renamed from: f */
    public final Guideline f107527f;

    /* renamed from: g */
    public final TextView f107528g;

    /* renamed from: h */
    public final TextView f107529h;

    /* renamed from: i */
    public final TextView f107530i;

    /* renamed from: j */
    public final ImageView f107531j;

    /* renamed from: k */
    public final TextView f107532k;

    public C48219rj0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, Guideline guideline, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, TextView textView7) {
        this.f107522a = constraintLayout;
        this.f107523b = textView;
        this.f107524c = textView2;
        this.f107525d = imageView;
        this.f107526e = textView3;
        this.f107527f = guideline;
        this.f107528g = textView4;
        this.f107529h = textView5;
        this.f107530i = textView6;
        this.f107531j = imageView2;
        this.f107532k = textView7;
    }

    /* renamed from: a */
    public static C48219rj0 m15547a(View view) {
        int i = C33093Gi4.code;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C33093Gi4.duration;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C33093Gi4.graphqlIcon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C33093Gi4.graphqlPath;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C33093Gi4.guideline;
                        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                        if (guideline != null) {
                            i = C33093Gi4.host;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C33093Gi4.path;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C33093Gi4.size;
                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView6 != null) {
                                        i = C33093Gi4.ssl;
                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView2 != null) {
                                            i = C33093Gi4.timeStart;
                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView7 != null) {
                                                return new C48219rj0((ConstraintLayout) view, textView, textView2, imageView, textView3, guideline, textView4, textView5, textView6, imageView2, textView7);
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
    public static C48219rj0 m15545c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_list_item_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m15547a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f107522a;
    }
}
