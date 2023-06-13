package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
/* renamed from: XZ */
/* loaded from: classes4.dex */
public final class C9430XZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f43395a;

    /* renamed from: b */
    public final ImageView f43396b;

    /* renamed from: c */
    public final ImageView f43397c;

    /* renamed from: d */
    public final AppCompatTextView f43398d;

    /* renamed from: e */
    public final AppCompatTextView f43399e;

    public C9430XZ(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f43395a = relativeLayout;
        this.f43396b = imageView;
        this.f43397c = imageView2;
        this.f43398d = appCompatTextView;
        this.f43399e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9430XZ m76855a(View view) {
        int i = C52955zi4.endIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.icon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C52955zi4.secondaryText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView != null) {
                    i = C52955zi4.text;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C9430XZ((RelativeLayout) view, imageView, imageView2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9430XZ m76853c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.bottom_sheet_option_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m76855a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f43395a;
    }
}
