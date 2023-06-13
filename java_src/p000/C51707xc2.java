package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: xc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51707xc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117858a;

    /* renamed from: b */
    public final ImageView f117859b;

    /* renamed from: c */
    public final TextView f117860c;

    /* renamed from: d */
    public final TextView f117861d;

    /* renamed from: e */
    public final TextView f117862e;

    public C51707xc2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f117858a = constraintLayout;
        this.f117859b = imageView;
        this.f117860c = textView;
        this.f117861d = textView2;
        this.f117862e = textView3;
    }

    /* renamed from: a */
    public static C51707xc2 m4949a(View view) {
        int i = C51176wi4.image;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C51176wi4.issueName;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C51176wi4.repairName;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C51176wi4.status;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C51707xc2((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f117858a;
    }
}
