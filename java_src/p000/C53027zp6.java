package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: zp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C53027zp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f122281a;

    /* renamed from: b */
    public final RelativeLayout f122282b;

    /* renamed from: c */
    public final TextView f122283c;

    /* renamed from: d */
    public final TextView f122284d;

    /* renamed from: e */
    public final TextView f122285e;

    /* renamed from: f */
    public final RelativeLayout f122286f;

    /* renamed from: g */
    public final TextView f122287g;

    /* renamed from: h */
    public final TextView f122288h;

    /* renamed from: i */
    public final TextView f122289i;

    /* renamed from: j */
    public final RelativeLayout f122290j;

    /* renamed from: k */
    public final TextView f122291k;

    /* renamed from: l */
    public final TextView f122292l;

    public C53027zp6(View view, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, TextView textView4, TextView textView5, TextView textView6, RelativeLayout relativeLayout3, TextView textView7, TextView textView8) {
        this.f122281a = view;
        this.f122282b = relativeLayout;
        this.f122283c = textView;
        this.f122284d = textView2;
        this.f122285e = textView3;
        this.f122286f = relativeLayout2;
        this.f122287g = textView4;
        this.f122288h = textView5;
        this.f122289i = textView6;
        this.f122290j = relativeLayout3;
        this.f122291k = textView7;
        this.f122292l = textView8;
    }

    /* renamed from: a */
    public static C53027zp6 m399a(View view) {
        int i = C52955zi4.address;
        RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
        if (relativeLayout != null) {
            i = C52955zi4.addressMain;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.apt;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.city;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C52955zi4.cityStatePostal;
                        RelativeLayout relativeLayout2 = (RelativeLayout) C34328Lp6.m96312a(view, i);
                        if (relativeLayout2 != null) {
                            i = C52955zi4.country;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C52955zi4.firstName;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C52955zi4.lastName;
                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView6 != null) {
                                        i = C52955zi4.name;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                        if (relativeLayout3 != null) {
                                            i = C52955zi4.state;
                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView7 != null) {
                                                i = C52955zi4.zip;
                                                TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView8 != null) {
                                                    return new C53027zp6(view, relativeLayout, textView, textView2, textView3, relativeLayout2, textView4, textView5, textView6, relativeLayout3, textView7, textView8);
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

    /* renamed from: b */
    public static C53027zp6 m398b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_address, viewGroup);
            return m399a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f122281a;
    }
}
