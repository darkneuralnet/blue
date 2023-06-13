package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import co.bird.android.widget.RibbonTextView;
/* renamed from: Le2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34225Le2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f21849a;

    /* renamed from: b */
    public final AppCompatTextView f21850b;

    /* renamed from: c */
    public final AppCompatTextView f21851c;

    /* renamed from: d */
    public final AppCompatTextView f21852d;

    /* renamed from: e */
    public final ImageView f21853e;

    /* renamed from: f */
    public final RibbonTextView f21854f;

    /* renamed from: g */
    public final AppCompatTextView f21855g;

    public C34225Le2(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ImageView imageView, RibbonTextView ribbonTextView, AppCompatTextView appCompatTextView4) {
        this.f21849a = relativeLayout;
        this.f21850b = appCompatTextView;
        this.f21851c = appCompatTextView2;
        this.f21852d = appCompatTextView3;
        this.f21853e = imageView;
        this.f21854f = ribbonTextView;
        this.f21855g = appCompatTextView4;
    }

    /* renamed from: a */
    public static C34225Le2 m96521a(View view) {
        int i = C35190Ph4.activateButton;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
        if (appCompatTextView != null) {
            i = C35190Ph4.description;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
            if (appCompatTextView2 != null) {
                i = C35190Ph4.expiration;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView3 != null) {
                    i = C35190Ph4.icon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C35190Ph4.ribbonTag;
                        RibbonTextView ribbonTextView = (RibbonTextView) C34328Lp6.m96312a(view, i);
                        if (ribbonTextView != null) {
                            i = C35190Ph4.title;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                            if (appCompatTextView4 != null) {
                                return new C34225Le2((RelativeLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, imageView, ribbonTextView, appCompatTextView4);
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
    public RelativeLayout getRoot() {
        return this.f21849a;
    }
}
