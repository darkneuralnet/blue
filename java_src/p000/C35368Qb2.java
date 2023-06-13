package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Qb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35368Qb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30560a;

    /* renamed from: b */
    public final ImageView f30561b;

    /* renamed from: c */
    public final TextView f30562c;

    /* renamed from: d */
    public final ImageView f30563d;

    /* renamed from: e */
    public final TextView f30564e;

    public C35368Qb2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.f30560a = constraintLayout;
        this.f30561b = imageView;
        this.f30562c = textView;
        this.f30563d = imageView2;
        this.f30564e = textView2;
    }

    /* renamed from: a */
    public static C35368Qb2 m88381a(View view) {
        int i = C45831nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.icon;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C45831nh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C35368Qb2((ConstraintLayout) view, imageView, textView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30560a;
    }
}
